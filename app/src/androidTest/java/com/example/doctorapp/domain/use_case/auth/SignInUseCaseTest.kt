package com.example.doctorapp.domain.use_case.auth
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.room.withTransaction
import com.example.doctorapp.common.Resource
import com.example.doctorapp.data.local.dao.DoctorDao
import com.example.doctorapp.data.local.dao.PatientDao
import com.example.doctorapp.data.local.database.DoctorDatabase
import com.example.doctorapp.data.local.database.PatientDatabase
import com.example.doctorapp.data.remote.dto.PatientDto
import com.example.doctorapp.data.remote.dto.request.AuthRequestDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import com.example.doctorapp.data.remote.dto.response.ResultDto
import com.example.doctorapp.data.remote.mappers.toPatientEntity
import com.example.doctorapp.domain.model.Gender
import com.example.doctorapp.domain.model.Patient
import com.example.doctorapp.domain.repository.AuthRepository
import com.example.doctorapp.domain.use_case.auth.SignInUseCase
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.single
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import java.util.Date
import javax.inject.Inject
import javax.inject.Named

@ExperimentalCoroutinesApi
class SignInUseCaseTest {

    // Execute tasks synchronously
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    // Mock the dependencies
    @Mock
    private lateinit var mockAuthRepository: AuthRepository
    @Mock
    private lateinit var mockPatientDatabase: PatientDatabase
    // Instance of the SignInUseCase
    private lateinit var signInUseCase: SignInUseCase

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        signInUseCase = SignInUseCase(mockAuthRepository, mockPatientDatabase)
    }

    @Test
    fun `successful sign-in`() = runTest {
        // Define test data and mock behavior
        val authRequestDto = AuthRequestDto("test@example.com", "password")
        val mockPatientDto = PatientDto(
            id = "1",
            name="John",
            surname = "Doe",
            email = "test@example.com",
            fiscalCode = "afsbhede23534",
            gender = Gender.MALE,
            birthdayDate = Date(1999,9,9),
            doctorFiscalCode = "dbgbfb7f8b"
        )

        val mockRemoteResponse = RemoteResponseDto(
            ResultDto(listOf(mockPatientDto),"", "", null, null, null))

        `when`(mockAuthRepository.signIn(authRequestDto)).thenReturn(mockRemoteResponse)
        `when`(mockPatientDatabase.withTransaction<Unit>(block = Mockito.any())).thenAnswer {
            val block: () -> Unit = it.getArgument(0)
            block.invoke()
        }
        `when`(authRequestDto.email?.let { mockPatientDatabase.dao.getByEmail(it) }).thenReturn(mockPatientDto.toPatientEntity())

        // Call the method under test
        val resultFlow = signInUseCase(authRequestDto)

        // Collect and assert the result
        resultFlow.collect { result ->
            assertEquals(Resource.Success(mockPatientDto), result)
        }
    }

//    @Test
//    fun `sign-in error`() = runBlockingTest {
//        // Define test data and mock behavior
//        val authRequestDto = AuthRequestDto("test@example.com", "password")
//        val error = Exception("Sign-in error")
//
//        `when`(mockAuthRepository.signIn(authRequestDto)).thenReturn(RemoteResponseDto(ResultDto<PatientDto>(emptyList(), "An unexpected error occurred", "", null, null, null)))
//        // Call the method under test
//        val resultFlow = signInUseCase(authRequestDto)
//
//        // Collect the result
//        val resultList = mutableListOf<Resource<Patient>>()
//        resultFlow.collect { result ->
//            resultList.add(result)
//        }
//        // Collect and assert the result
//        val result = resultList.firstOrNull()
//        assertEquals(Resource.Loading<Patient>(), result)
//    }
}
