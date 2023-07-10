package com.example.doctorapp.session
import android.content.SharedPreferences
import com.example.doctorapp.common.Constants
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class SessionManagerTest {

    // Mock the SharedPreferences dependency
    @Mock
    private lateinit var mockPreferences: SharedPreferences

    // Instance of the SessionManager
    private lateinit var sessionManager: SessionManager

    @Before
    fun setup() {
        // Initialize the mock objects
        MockitoAnnotations.openMocks(this)

        // Create an instance of SessionManager using the mock SharedPreferences
        sessionManager = SessionManager(mockPreferences)
    }

    @Test
    fun testIsLogged_WhenUserLoggedIn_ReturnsTrue() {
        // Set up mock behavior for the SharedPreferences
        `when`(mockPreferences.getString(Constants.LOGGED_USER_KEY, null)).thenReturn("mockedUser")

        // Call the method under test
        val result = sessionManager.isLogged()

        // Assert the result
        assert(result)
    }

    @Test
    fun testIsLogged_WhenUserNotLoggedIn_ReturnsFalse() {
        // Set up mock behavior for the SharedPreferences
        `when`(mockPreferences.getString(Constants.LOGGED_USER_KEY, null)).thenReturn(null)

        // Call the method under test
        val result = sessionManager.isLogged()

        // Assert the result
        assert(!result)
    }

}
