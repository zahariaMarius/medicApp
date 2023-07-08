package com.example.doctorapp.presentation.home.profile;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.doctorapp.common.Resource;
import com.example.doctorapp.domain.model.Doctor;
import com.example.doctorapp.domain.model.Patient;
import com.example.doctorapp.domain.use_case.doctor.GetDoctorProfileUseCase;
import com.example.doctorapp.domain.use_case.patient.GetPatientProfileUseCase;
import com.example.doctorapp.session.SessionManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010,\u001a\u00020-H\u0002R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00188F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001e\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00188F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006."}, d2 = {"Lcom/example/doctorapp/presentation/home/profile/ProfileScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "sessionManager", "Lcom/example/doctorapp/session/SessionManager;", "getPatientProfileUseCase", "Lcom/example/doctorapp/domain/use_case/patient/GetPatientProfileUseCase;", "getDoctorProfileUseCase", "Lcom/example/doctorapp/domain/use_case/doctor/GetDoctorProfileUseCase;", "(Lcom/example/doctorapp/session/SessionManager;Lcom/example/doctorapp/domain/use_case/patient/GetPatientProfileUseCase;Lcom/example/doctorapp/domain/use_case/doctor/GetDoctorProfileUseCase;)V", "<set-?>", "", "currentTab", "getCurrentTab", "()I", "setCurrentTab", "(I)V", "currentTab$delegate", "Landroidx/compose/runtime/MutableState;", "doctor", "Lcom/example/doctorapp/domain/model/Doctor;", "getDoctor", "()Lcom/example/doctorapp/domain/model/Doctor;", "setDoctor", "(Lcom/example/doctorapp/domain/model/Doctor;)V", "", "isDoctorLoaded", "()Z", "setDoctorLoaded", "(Z)V", "isDoctorLoaded$delegate", "isPatientLoaded", "setPatientLoaded", "isPatientLoaded$delegate", "patient", "Lcom/example/doctorapp/domain/model/Patient;", "getPatient", "()Lcom/example/doctorapp/domain/model/Patient;", "setPatient", "(Lcom/example/doctorapp/domain/model/Patient;)V", "tabTitles", "", "", "getTabTitles", "()Ljava/util/List;", "getDoctorProfile", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ProfileScreenViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.session.SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.use_case.patient.GetPatientProfileUseCase getPatientProfileUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.use_case.doctor.GetDoctorProfileUseCase getDoctorProfileUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState currentTab$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> tabTitles = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState isPatientLoaded$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState isDoctorLoaded$delegate = null;
    public com.example.doctorapp.domain.model.Patient patient;
    public com.example.doctorapp.domain.model.Doctor doctor;
    
    @javax.inject.Inject
    public ProfileScreenViewModel(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.use_case.patient.GetPatientProfileUseCase getPatientProfileUseCase, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.use_case.doctor.GetDoctorProfileUseCase getDoctorProfileUseCase) {
        super();
    }
    
    public final int getCurrentTab() {
        return 0;
    }
    
    public final void setCurrentTab(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getTabTitles() {
        return null;
    }
    
    public final boolean isPatientLoaded() {
        return false;
    }
    
    public final void setPatientLoaded(boolean p0) {
    }
    
    public final boolean isDoctorLoaded() {
        return false;
    }
    
    public final void setDoctorLoaded(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.domain.model.Patient getPatient() {
        return null;
    }
    
    public final void setPatient(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.model.Patient p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.domain.model.Doctor getDoctor() {
        return null;
    }
    
    public final void setDoctor(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.model.Doctor p0) {
    }
    
    private final void getDoctorProfile() {
    }
}