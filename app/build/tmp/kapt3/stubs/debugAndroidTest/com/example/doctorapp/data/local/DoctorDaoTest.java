package com.example.doctorapp.data.local;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SmallTest;
import com.example.doctorapp.data.local.dao.DoctorDao;
import com.example.doctorapp.data.local.database.DoctorDatabase;
import com.example.doctorapp.data.local.entity.DoctorEntity;
import com.example.doctorapp.domain.model.Gender;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.Date;

@org.junit.runner.RunWith(value = androidx.test.ext.junit.runners.AndroidJUnit4.class)
@androidx.test.filters.SmallTest
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/doctorapp/data/local/DoctorDaoTest;", "", "()V", "dao", "Lcom/example/doctorapp/data/local/dao/DoctorDao;", "database", "Lcom/example/doctorapp/data/local/database/DoctorDatabase;", "insertDoctor", "", "Lkotlinx/coroutines/test/TestResult;", "setup", "teardown", "app_debugAndroidTest"})
@kotlinx.coroutines.ExperimentalCoroutinesApi
public final class DoctorDaoTest {
    private com.example.doctorapp.data.local.database.DoctorDatabase database;
    private com.example.doctorapp.data.local.dao.DoctorDao dao;
    
    public DoctorDaoTest() {
        super();
    }
    
    @org.junit.Before
    public final void setup() {
    }
    
    @org.junit.After
    public final void teardown() {
    }
    
    @org.junit.Test
    public final void insertDoctor() {
    }
}