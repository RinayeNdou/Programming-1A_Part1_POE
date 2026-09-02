package com.st10470759.chatapp_part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rnndo
 */
public class LoginTest {

    // Test that a correctly formatted username returns true
    @Test
    public void testCheckUserName_ValidUsername() {
        System.out.println("checkUserName - valid");
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName("kyl_1");
        assertEquals(expResult, result);
    }

    // Test that an incorrectly formatted username returns false
    @Test
    public void testCheckUserName_InvalidUsername() {
        System.out.println("checkUserName - invalid");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName("kyle!!!!!!!");
        assertEquals(expResult, result);
    }

    // Test that a password meeting all complexity rules returns true
    @Test
    public void testCheckPasswordComplexity_ValidPassword() {
        System.out.println("checkPasswordComplexity - valid");
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity("Ch&&sec@ke99!");
        assertEquals(expResult, result);
    }

    // Test that a password failing complexity rules returns false
    @Test
    public void testCheckPasswordComplexity_InvalidPassword() {
        System.out.println("checkPasswordComplexity - invalid");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity("password");
        assertEquals(expResult, result);
    }

    // Test that a correctly formatted cell number returns true
    @Test
    public void testCheckCellPhoneNumber_ValidNumber() {
        System.out.println("checkCellPhoneNumber - valid");
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber("+27838968976");
        assertEquals(expResult, result);
    }

    // Test that an incorrectly formatted cell number returns false
    @Test
    public void testCheckCellPhoneNumber_InvalidNumber() {
        System.out.println("checkCellPhoneNumber - invalid");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber("08966553");
        assertEquals(expResult, result);
    }

    // Test that registering with a valid username and password succeeds
    @Test
    public void testRegisterUser_Success() {
        System.out.println("registerUser - success");
        Login instance = new Login();
        String expResult = "Username successfully captured.\nPassword successfully captured.\nRegistration successful.";
        String result = instance.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        assertEquals(expResult, result);
    }

    // Test that logging in with correct credentials returns true
    @Test
    public void testLoginUser_Success() {
        System.out.println("loginUser - success");
        Login instance = new Login();
        instance.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        boolean result = instance.loginUser("kyl_1", "Ch&&sec@ke99!");
        assertTrue(result);
    }

    // Test that logging in with incorrect credentials returns false
    @Test
    public void testLoginUser_Failure() {
        System.out.println("loginUser - failure");
        Login instance = new Login();
        instance.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        boolean result = instance.loginUser("wrong", "wrongpass");
        assertFalse(result);
    }

    // Test that a successful login returns the correct welcome message
    @Test
    public void testReturnLoginStatus_Success() {
        System.out.println("returnLoginStatus - success");
        Login instance = new Login();
        instance.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        String expResult = "Welcome Kyle, Smith it is great to see you again.";
        String result = instance.returnLoginStatus(true);
        assertEquals(expResult, result);
    }

    // Test that a failed login returns the correct failure message
    @Test
    public void testReturnLoginStatus_Failure() {
        System.out.println("returnLoginStatus - failure");
        Login instance = new Login();
        String expResult = "Username or password incorrect, please try again.";
        String result = instance.returnLoginStatus(false);
        assertEquals(expResult, result);
    }

}