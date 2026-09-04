/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.st10470759.chatapp_part1;

import java.util.Scanner;

/**
 *
 * @author rnndo
 */
public class Registration {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Login login = new Login();
        
        //Ask the user for their registration details
        System.out.println("Please enter a username:");
        String username = scan.nextLine();
        
        System.out.println("Please enter a password:");
        String password = scan.nextLine();
        
        System.out.println("Please enter a South African cell phone number (e.g. +27831234567):");
        String cellPhoneNumber = scan.nextLine();
        
        System.out.println("Please enter your first name:");
        String firstName = scan.nextLine();
        
        System.out.println("Please enter your last name:");
        String lastName = scan.nextLine();
        
        // Try to register the user with the details they entered above
        String registrationMessage = login.registerUser(username, password, cellPhoneNumber, firstName, lastName);
        System.out.println(registrationMessage);
        
        //Only continue if registration actually succeeded
        boolean registrationSuccessful = login.checkUserName(username) && login.checkPasswordComplexity(password) && login.checkCellPhoneNumber(cellPhoneNumber);
        
        if (registrationSuccessful){
            System.out.println("\n Now please log in.");
            
            System.out.println("Enter your username:");
            String loginUsername = scan.nextLine();
            
            System.out.println("Enter your password:");
            String loginPassword = scan.nextLine();
            
            boolean loginSuccess = login.loginUser(loginUsername, loginPassword);
            String loginStatusMessage = login.returnLoginStatus(loginSuccess);
            System.out.println(loginStatusMessage);
        }
        
        scan.close();
        
        
    }
}
