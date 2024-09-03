package com.evergent.corejava.casestudy;

import java.util.Scanner;

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

class BookTypeNotValidException extends Exception {
    public BookTypeNotValidException(String message) {
        super(message);
    }
}

public class LibraryInterfaceDemo {
    static {
        System.out.println("\n\t\t \t\t Welcome To E-Library\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("REGISTER\n");
                
                System.out.print("Name: ");
                String name = sc.nextLine();  

                System.out.print("Age: ");
                int age = sc.nextInt();
                sc.nextLine();  

                if (age < 0) {
                    throw new AgeNotValidException("Age cannot be negative.");
                }

                LibraryUser user;
                if (age < 12) {
                    user = new KidUsers();
                } else {
                    user = new AdultUser();
                }

                user.registerAccount(age);

                String bType = "";
                while (true) {
                    System.out.print("Book Type: ");
                    bType = sc.nextLine().trim();
                    
                    bType = bType.toLowerCase();

                    try {
                        if (!bType.equals("kids") && !bType.equals("fiction")) {
                            throw new BookTypeNotValidException("Invalid book type. Please enter 'Kids' or 'Fiction'.");
                        }
                        break;  
                    } catch (BookTypeNotValidException e) {
                        System.out.println(e.getMessage());
                    }
                }

                user.requestBook(bType);

                System.out.print("Do you want to register another user? (yes/no): ");
                String response = sc.nextLine().trim();
                if (response.equalsIgnoreCase("no")) {
                    break;
                }
            } catch (AgeNotValidException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}
