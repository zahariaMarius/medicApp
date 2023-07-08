package com.example.doctorapp.presentation.signup;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.doctorapp.common.Resource;
import com.example.doctorapp.data.remote.dto.request.PatientRequestDto;
import com.example.doctorapp.domain.model.Doctor;
import com.example.doctorapp.domain.model.Gender;
import com.example.doctorapp.domain.use_case.auth.SignUpUseCase;
import com.example.doctorapp.domain.use_case.doctor.GetDoctorListUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010[\u001a\u00020\\2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0^R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00128F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0!0 \u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R+\u0010$\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\'\u0010\u0011\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010\u000fR+\u0010(\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b+\u0010\u0011\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010\u000fR+\u0010-\u001a\u00020,2\u0006\u0010\u000b\u001a\u00020,8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b2\u0010\u0011\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010;\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b>\u0010\u0011\u001a\u0004\b<\u0010\n\"\u0004\b=\u0010\u000fR+\u0010?\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bB\u0010\u0011\u001a\u0004\b@\u0010\n\"\u0004\bA\u0010\u000fR+\u0010C\u001a\u00020,2\u0006\u0010\u000b\u001a\u00020,8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bF\u0010\u0011\u001a\u0004\bD\u0010/\"\u0004\bE\u00101R+\u0010G\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bJ\u0010\u0011\u001a\u0004\bH\u0010\n\"\u0004\bI\u0010\u000fR+\u0010K\u001a\u00020,2\u0006\u0010\u000b\u001a\u00020,8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bN\u0010\u0011\u001a\u0004\bL\u0010/\"\u0004\bM\u00101R+\u0010O\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bR\u0010\u0011\u001a\u0004\bP\u0010\n\"\u0004\bQ\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010S\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bV\u0010\u0011\u001a\u0004\bT\u0010\n\"\u0004\bU\u0010\u000fR\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\b0X\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010Z\u00a8\u0006_"}, d2 = {"Lcom/example/doctorapp/presentation/signup/SignUpScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "signUpUseCase", "Lcom/example/doctorapp/domain/use_case/auth/SignUpUseCase;", "getDoctorListUseCase", "Lcom/example/doctorapp/domain/use_case/doctor/GetDoctorListUseCase;", "(Lcom/example/doctorapp/domain/use_case/auth/SignUpUseCase;Lcom/example/doctorapp/domain/use_case/doctor/GetDoctorListUseCase;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "<set-?>", "birthdayDate", "getBirthdayDate", "setBirthdayDate", "(Ljava/lang/String;)V", "birthdayDate$delegate", "Landroidx/compose/runtime/MutableState;", "", "currentTab", "getCurrentTab", "()I", "setCurrentTab", "(I)V", "currentTab$delegate", "doctor", "Lcom/example/doctorapp/domain/model/Doctor;", "getDoctor", "()Lcom/example/doctorapp/domain/model/Doctor;", "setDoctor", "(Lcom/example/doctorapp/domain/model/Doctor;)V", "doctorPager", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getDoctorPager", "()Lkotlinx/coroutines/flow/Flow;", "email", "getEmail", "setEmail", "email$delegate", "fiscalCode", "getFiscalCode", "setFiscalCode", "fiscalCode$delegate", "", "genderMenuIsExpanded", "getGenderMenuIsExpanded", "()Z", "setGenderMenuIsExpanded", "(Z)V", "genderMenuIsExpanded$delegate", "genders", "", "Lcom/example/doctorapp/domain/model/Gender;", "getGenders", "()[Lcom/example/doctorapp/domain/model/Gender;", "setGenders", "([Lcom/example/doctorapp/domain/model/Gender;)V", "[Lcom/example/doctorapp/domain/model/Gender;", "name", "getName", "setName", "name$delegate", "password", "getPassword", "setPassword", "password$delegate", "passwordHidden", "getPasswordHidden", "setPasswordHidden", "passwordHidden$delegate", "repeatPassword", "getRepeatPassword", "setRepeatPassword", "repeatPassword$delegate", "repeatPasswordHidden", "getRepeatPasswordHidden", "setRepeatPasswordHidden", "repeatPasswordHidden$delegate", "selectedGender", "getSelectedGender", "setSelectedGender", "selectedGender$delegate", "surname", "getSurname", "setSurname", "surname$delegate", "tabTitles", "", "getTabTitles", "()Ljava/util/List;", "signUp", "", "onSuccessCallback", "Lkotlin/Function0;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SignUpScreenViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.use_case.auth.SignUpUseCase signUpUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.use_case.doctor.GetDoctorListUseCase getDoctorListUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = "SIGNUP";
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState email$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState password$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState repeatPassword$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState passwordHidden$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState repeatPasswordHidden$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState name$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState surname$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState fiscalCode$delegate = null;
    @org.jetbrains.annotations.NotNull
    private com.example.doctorapp.domain.model.Gender[] genders;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState genderMenuIsExpanded$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState selectedGender$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState birthdayDate$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.doctorapp.domain.model.Doctor>> doctorPager = null;
    @org.jetbrains.annotations.Nullable
    private com.example.doctorapp.domain.model.Doctor doctor;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState currentTab$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> tabTitles = null;
    
    @javax.inject.Inject
    public SignUpScreenViewModel(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.use_case.auth.SignUpUseCase signUpUseCase, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.use_case.doctor.GetDoctorListUseCase getDoctorListUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRepeatPassword() {
        return null;
    }
    
    public final void setRepeatPassword(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getPasswordHidden() {
        return false;
    }
    
    public final void setPasswordHidden(boolean p0) {
    }
    
    public final boolean getRepeatPasswordHidden() {
        return false;
    }
    
    public final void setRepeatPasswordHidden(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSurname() {
        return null;
    }
    
    public final void setSurname(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFiscalCode() {
        return null;
    }
    
    public final void setFiscalCode(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.doctorapp.domain.model.Gender[] getGenders() {
        return null;
    }
    
    public final void setGenders(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.model.Gender[] p0) {
    }
    
    public final boolean getGenderMenuIsExpanded() {
        return false;
    }
    
    public final void setGenderMenuIsExpanded(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedGender() {
        return null;
    }
    
    public final void setSelectedGender(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBirthdayDate() {
        return null;
    }
    
    public final void setBirthdayDate(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.doctorapp.domain.model.Doctor>> getDoctorPager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.doctorapp.domain.model.Doctor getDoctor() {
        return null;
    }
    
    public final void setDoctor(@org.jetbrains.annotations.Nullable
    com.example.doctorapp.domain.model.Doctor p0) {
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
    
    public final void signUp(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccessCallback) {
    }
}