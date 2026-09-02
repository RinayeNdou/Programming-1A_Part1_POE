package com.st10470759.chatapp_part1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rnndo
 */
public class LoginTest {

    private Login instance;

    // This runs automatically before every single @Test method below,
    // so we always start with a fresh, already-registered Login object
    @BeforeEach
    public void setUp() {
        instance = new Login();
        instance.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
    }

    // Test that a correctly formatted username returns true
    @Test
    public void testCheckUserName_ValidUsername() {
        System.out.println("checkUserName - valid");
        assertTrue(instance.checkUserName("kyl_1"));
    }

    // Test that an incorrectly formatted username returns false
    @Test
    public void testCheckUserName_InvalidUsername() {
        System.out.println("checkUserName - invalid");
        assertFalse(instance.checkUserName("kyle!!!!!!!"));
    }

    // Test that a password meeting all complexity rules returns true
    @Test
    public void testCheckPasswordComplexity_ValidPassword() {
        System.out.println("checkPasswordComplexity - valid");
        assertTrue(instance.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    // Test that a password failing complexity rules returns false
    @Test
    public void testCheckPasswordComplexity_InvalidPassword() {
        System.out.println("checkPasswordComplexity - invalid");
        assertFalse(instance.checkPasswordComplexity("password"));
    }

    // Test that a correctly formatted cell number returns true
    @Test
    public void testCheckCellPhoneNumber_ValidNumber() {
        System.out.println("checkCellPhoneNumber - valid");
        assertTrue(instance.checkCellPhoneNumber("+27838968976"));
    }

    // Test that an incorrectly formatted cell number returns false
    @Test
    public void testCheckCellPhoneNumber_InvalidNumber() {
        System.out.println("checkCellPhoneNumber - invalid");
        assertFalse(instance.checkCellPhoneNumber("08966553"));
    }

    // Test that registering with a valid username and password succeeds
    @Test
    public void testRegisterUser_Success() {
        System.out.println("registerUser - success");
        String expResult = "Username successfully captured.\nPassword successfully captured.\nRegistration successful.";
        String result = instance.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        assertEquals(expResult, result);
    }

    // Test that logging in with correct credentials returns true
    @Test
    public void testLoginUser_Success() {
        System.out.println("loginUser - success");
        assertTrue(instance.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    // Test that logging in with incorrect credentials returns false
    @Test
    public void testLoginUser_Failure() {
        System.out.println("loginUser - failure");
        assertFalse(instance.loginUser("wrong", "wrongpass"));
    }

    // Test that a successful login returns the correct welcome message
    @Test
    public void testReturnLoginStatus_Success() {
        System.out.println("returnLoginStatus - success");
        String expResult = "Welcome Kyle, Smith it is great to see you again.";
        assertEquals(expResult, instance.returnLoginStatus(true));
    }

    // Test that a failed login returns the correct failure message
    @Test
    public void testReturnLoginStatus_Failure() {
        System.out.println("returnLoginStatus - failure");
        String expResult = "Username or password incorrect, please try again.";
        assertEquals(expResult, instance.returnLoginStatus(false));
    }

}