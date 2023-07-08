package com.example.doctorapp.data.local


import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.example.doctorapp.data.local.dao.DoctorDao
import com.example.doctorapp.data.local.database.DoctorDatabase
import com.example.doctorapp.data.local.entity.DoctorEntity
import com.example.doctorapp.domain.model.Gender
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.Date

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class) // Not working in JVM, only in Emulator
@SmallTest // Unit test (Medium is Integration test)
class DoctorDaoTest {

    private lateinit var database: DoctorDatabase
    private lateinit var dao: DoctorDao

    @Before
    fun setup(){
        // it's in RAM, fake db, not in persistent storage
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            DoctorDatabase::class.java
        ).allowMainThreadQueries().build() // for multiple access to same database
    }

    @After
    fun teardown(){
        database.close()
    }

    @Test
    fun insertDoctor() = runTest {// optimize coroutine handle

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

}