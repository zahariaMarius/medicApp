package com.example.doctorapp.presentation.signin;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\"R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR+\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/doctorapp/presentation/signin/SignInScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "signInUseCase", "Lcom/example/doctorapp/domain/use_case/auth/SignInUseCase;", "sessionManager", "Lcom/example/doctorapp/session/SessionManager;", "(Lcom/example/doctorapp/domain/use_case/auth/SignInUseCase;Lcom/example/doctorapp/session/SessionManager;)V", "<set-?>", "", "email", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "email$delegate", "Landroidx/compose/runtime/MutableState;", "", "inLoading", "getInLoading", "()Z", "setInLoading", "(Z)V", "inLoading$delegate", "password", "getPassword", "setPassword", "password$delegate", "passwordHidden", "getPasswordHidden", "setPasswordHidden", "passwordHidden$delegate", "signIn", "", "onSuccessCallback", "Lkotlin/Function0;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SignInScreenViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.domain.use_case.auth.SignInUseCase signInUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.doctorapp.session.SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState email$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState password$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState passwordHidden$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState inLoading$delegate = null;
    
    @javax.inject.Inject
    public SignInScreenViewModel(@org.jetbrains.annotations.NotNull
    com.example.doctorapp.domain.use_case.auth.SignInUseCase signInUseCase, @org.jetbrains.annotations.NotNull
    com.example.doctorapp.session.SessionManager sessionManager) {
        super();
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
    
    public final boolean getPasswordHidden() {
        return false;
    }
    
    public final void setPasswordHidden(boolean p0) {
    }
    
    public final boolean getInLoading() {
        return false;
    }
    
    public final void setInLoading(boolean p0) {
    }
    
    public final void signIn(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccessCallback) {
    }
}