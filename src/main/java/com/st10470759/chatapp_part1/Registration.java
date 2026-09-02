/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.st10470759.chatapp_part1;

/**
 *
 * @author rnndo
 */
public class Registration {

    public static void main(String[] args) {
        
    
    // Create a Login object so we can test its methods
    Login login = new Login();

    // Test checkUserName with a valid username
    System.out.println("Testing checkUserName with 'kyl_1':");
    System.out.println(login.checkUserName("kyl_1"));  // should print true

    // Test checkUserName with an invalid username
    System.out.println("Testing checkUserName with 'kyle!!!!!!!':");
    System.out.println(login.checkUserName("kyle!!!!!!!"));  // should print false

    // Test checkPasswordComplexity with a valid password
    System.out.println("Testing checkPasswordComplexity with 'Ch&&sec@ke99!':");
    System.out.println(login.checkPasswordComplexity("Ch&&sec@ke99!"));  // should print true

    // Test checkPasswordComplexity with an invalid password
    System.out.println("Testing checkPasswordComplexity with 'password':");
    System.out.println(login.checkPasswordComplexity("password"));  // should print false

    // Test checkCellPhoneNumber with a valid number
    System.out.println("Testing checkCellPhoneNumber with '+27838968976':");
    System.out.println(login.checkCellPhoneNumber("+27838968976"));  // should print true

    // Test checkCellPhoneNumber with an invalid number
    System.out.println("Testing checkCellPhoneNumber with '08966553':");
    System.out.println(login.checkCellPhoneNumber("08966553"));  // should print false

    // Test registerUser with valid details
    System.out.println("Testing registerUser:");
    System.out.println(login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith"));

}
    }

