package com.example.doctorapp.data.local;

@androidx.test.filters.SmallTest
@dagger.hilt.android.testing.HiltAndroidTest
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0018\u001a\u00060\u0019j\u0002`\u001aH\u0007J\f\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0007J\f\u0010\u001c\u001a\u00060\u0019j\u0002`\u001aH\u0007J\f\u0010\u001d\u001a\u00060\u0019j\u0002`\u001aH\u0007J\b\u0010\u001e\u001a\u00020\u0019H\u0007J\b\u0010\u001f\u001a\u00020\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u00020\r8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u00138GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006 "}, d2 = {"Lcom/example/doctorapp/data/local/DoctorDaoTest;", "", "()V", "dao", "Lcom/example/doctorapp/data/local/dao/DoctorDao;", "database", "Lcom/example/doctorapp/data/local/database/DoctorDatabase;", "getDatabase$annotations", "getDatabase", "()Lcom/example/doctorapp/data/local/database/DoctorDatabase;", "setDatabase", "(Lcom/example/doctorapp/data/local/database/DoctorDatabase;)V", "hiltRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getHiltRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "setHiltRule", "(Ldagger/hilt/android/testing/HiltAndroidRule;)V", "instantTaskExecutorRule", "Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "getInstantTaskExecutorRule", "()Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "setInstantTaskExecutorRule", "(Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;)V", "delete all doctors in database", "", "Lkotlinx/coroutines/test/TestResult;", "delete doctor in database", "get doctor by fiscal code", "insert doctor in database", "setup", "teardown", "app_debugAndroidTest"})
@kotlinx.coroutines.ExperimentalCoroutinesApi
public final class DoctorDaoTest {
    @org.jetbrains.annotations.NotNull
    private dagger.hilt.android.testing.HiltAndroidRule hiltRule;
    @org.jetbrains.annotations.NotNull
    private androidx.arch.core.executor.testing.InstantTaskExecutorRule instantTaskExecutorRule;
    @javax.inject.Inject
    public com.example.doctorapp.data.local.database.DoctorDatabase database;
    private com.example.doctorapp.data.local.dao.DoctorDao dao;
    
    public DoctorDaoTest() {
        super();
    }
    
    @org.junit.Rule
    @org.jetbrains.annotations.NotNull
    public final dagger.hilt.android.testing.HiltAndroidRule getHiltRule() {
        return null;
    }
    
    public final void setHiltRule(@org.jetbrains.annotations.NotNull
    dagger.hilt.android.testing.HiltAndroidRule p0) {
    }
    
    @org.junit.Rule
    @org.jetbrains.annotations.NotNull
    public final androidx.arch.core.executor.testing.InstantTaskExecutorRule getInstantTaskExecutorRule() {
        return null;
    }
    
    public final void setInstantTaskExecutorRule(@org.jetbrains.annotations.NotNull
    androidx.arch.core.executor.testing.InstantTaskExecutorRule p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.data.local.database.DoctorDatabase getDatabase() {
        return null;
    }
    
    @javax.inject.Named(value = "test_doctor_db")
    @java.lang.Deprecated
    public static void getDatabase$annotations() {
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.data.local.database.DoctorDatabase p0) {
    }
    
    @org.junit.Before
    public final void setup() {
    }
    
    @org.junit.After
    public final void teardown() {
    }
}