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
          Login login = new Login();

    // Register a user first so we have something to log in with
    System.out.println("Registering user:");
    System.out.println(login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith"));

    // Test loginUser with correct credentials
    System.out.println("Testing loginUser with correct details:");
    boolean loginResult1 = login.loginUser("kyl_1", "Ch&&sec@ke99!");
    System.out.println(loginResult1);  // should print true
    System.out.println(login.returnLoginStatus(loginResult1));  // should print welcome message

    // Test loginUser with incorrect credentials
    System.out.println("Testing loginUser with incorrect details:");
    boolean loginResult2 = login.loginUser("wrong", "wrongpass");
    System.out.println(loginResult2);  // should print false
    System.out.println(login.returnLoginStatus(loginResult2));  // should print failure message

}  
    }

