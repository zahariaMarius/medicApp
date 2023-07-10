package com.example.doctorapp.data.local


import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.filters.SmallTest
import com.example.doctorapp.data.local.dao.DoctorDao
import com.example.doctorapp.data.local.database.DoctorDatabase
import com.example.doctorapp.data.local.entity.DoctorEntity
import com.example.doctorapp.domain.model.Gender
import com.google.common.truth.Truth.assertThat
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.util.Date
import javax.inject.Inject
import javax.inject.Named

@ExperimentalCoroutinesApi
//@RunWith(AndroidJUnit4::class) // Not working in JVM, only in Emulator
@SmallTest // Unit test (Medium is Integration test)
@HiltAndroidTest
class DoctorDaoTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Inject
    @Named("test_doctor_db")
    lateinit var database: DoctorDatabase
    private lateinit var dao: DoctorDao

    @Before
    fun setup(){
//        it's in RAM, fake db, not in persistent storage
//        database = Room.inMemoryDatabaseBuilder(
//            ApplicationProvider.getApplicationContext(),
//            DoctorDatabase::class.java
//        ).allowMainThreadQueries().build() // for multiple access to same database
        hiltRule.inject()
    }

    @After
    fun teardown(){
        database.close()
    }

    @Test
    fun `insert doctor in database`() = runTest {// optimize coroutine handle

        val doctor = DoctorEntity(
            id = "1",
            name = "Mario",
            surname = "Rossi",
            email = "mario.rossi@email.com",
            gender = Gender.MALE,
            fiscalCode = "JHVFDBSDJVG77",
            birthdayDate = Date(8,3,1987),
            regionalCode = "Calabria",
            ASL = "ASL1"
        )
        database.dao.insert(doctor)

        val allDoctors = database.dao.getAll()
        assertThat(allDoctors).contains(doctor)
    }

    @Test
    fun `delete doctor in database`() = runTest {// optimize coroutine handle
        val doctor1 = DoctorEntity(
            id = "1",
            name = "Maria",
            surname = "Bianchi",
            email = "maria.bianchi@email.com",
            gender = Gender.FEMALE,
            fiscalCode = "JHVFJBDJVG77",
            birthdayDate = Date(7,2,1986),
            regionalCode = "Piemonte",
            ASL = "ASL2"
        )

        database.dao.insert(doctor1)

        database.dao.delete(doctor1)

        val allDoctors = database.dao.getAll()
        assertThat(allDoctors).doesNotContain(doctor1)
    }

    @Test
    fun `delete all doctors in database`() = runTest {// optimize coroutine handle
        val doctor = DoctorEntity(
            id = "1",
            name = "Mario",
            surname = "Rossi",
            email = "mario.rossi@email.com",
            gender = Gender.MALE,
            fiscalCode = "JHVFDBSDJVG77",
            birthdayDate = Date(8,3,1987),
            regionalCode = "Calabria",
            ASL = "ASL1"
        )

        val doctor1 = DoctorEntity(
            id = "2",
            name = "Maria",
            surname = "Bianchi",
            email = "maria.bianchi@email.com",
            gender = Gender.FEMALE,
            fiscalCode = "JHVFJBDJVG77",
            birthdayDate = Date(7,2,1986),
            regionalCode = "Piemonte",
            ASL = "ASL2"
        )

        database.dao.insert(doctor)
        database.dao.insert(doctor1)

        database.dao.clearAll()

        val allDoctors = database.dao.getAll()
        assertThat(allDoctors).isEmpty()
    }

    @Test
    fun `get doctor by fiscal code` () = runTest {
        val fiscalCode = "JHVFDBSDJVG77"

        val doctor = DoctorEntity(
            id = "1",
            name = "Mario",
            surname = "Rossi",
            email = "mario.rossi@email.com",
            gender = Gender.MALE,
            fiscalCode = "JHVFDBSDJVG77",
            birthdayDate = Date(8,3,1987),
            regionalCode = "Calabria",
            ASL = "ASL1"
        )
        database.dao.insert(doctor)

        val doctorTestFromDB = database.dao.getDoctorByFiscalCode(fiscalCode)

        assertThat(doctorTestFromDB).isEqualTo(doctor)
    }

}