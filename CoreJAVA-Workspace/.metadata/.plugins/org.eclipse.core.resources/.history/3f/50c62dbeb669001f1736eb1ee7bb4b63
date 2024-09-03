package com.evergent.corejava.application4;

import java.util.Scanner;

public class ExhibitionManagementSystem extends ExitClass implements ModulesInterface {
    static int menuItemCost;
    static int foodAmount;
    static int guestCount;
    static int additionalItemCost;
    static boolean cardPurchased = false;
    static final int CARD_COST = 800;
    static final int DISCOUNT_PERCENTAGE = 10;

    String module;

    public ExhibitionManagementSystem() {
        super();
    }

    public void orderModule() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Order Module");
        System.out.println("======================");
        System.out.println("F - Place orders for food");
        System.out.println("A - Register for activities");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Module code (F, A, M) : ");
        this.module = sc.nextLine().toUpperCase(); // Using 'this' to refer to the instance variable

        switch (this.module) {
            case "F":
                System.out.println("Menu \t Description \t Charge per head ");
                System.out.println("============================================");
                System.out.println("V \t Veg Thali \n \t salad \n\t Lassi \n\t Icecream \t RM200.00");
                System.out.println("N \t NonVeg Thali \n \t salad \n\t Soda \n\t Icecream \t RM300.00");
                System.out.println("============================================");
                System.out.println("Enter your Menu code (V, N) : ");
                
                this.module = sc.nextLine().toUpperCase(); // Using 'this' to refer to the instance variable

                switch (this.module) {
                    case "V":
                        menuItemCost = 200;
                        break;
                    case "N":
                        menuItemCost = 300;
                        break;
                }

                System.out.println("Enter the number of guests");
                guestCount = Integer.parseInt(sc.nextLine());
                foodAmount = menuItemCost * guestCount;
                System.out.println("Amount for ordered food is Rs " + foodAmount);
                break;

            case "A":
                System.out.println("Activity \t Description \t\t\t Charge ");
                System.out.println("=========================================================================");
                System.out.println("1 \t\t Photo/Video Booth \t\t RM100.00 per Photo/Video");
                System.out.println("2 \t\t Entertainment Shows \t\t RM500.00 per person");
                System.out.println("3 \t\t Health and Wellness Activities  RM300.00 per person");
                System.out.println("4 \t\t Product Demonstrations \t RM200.00 per person");
                System.out.println("=========================================================================");
                System.out.println("Enter your Activity code (1, 2, 3, 4) : ");
                
                int i = Integer.parseInt(sc.nextLine());

                switch (i) {
                    case 1:
                        additionalItemCost = 100;
                        break;
                    case 2:
                        additionalItemCost = 500;
                        break;
                    case 3:
                        additionalItemCost = 300;
                        break;
                    case 4:
                        additionalItemCost = 200;
                        break;
                }

                System.out.println("Your Additional Cost : Rs " + additionalItemCost);
                break;
                
            case "M":
                break;
        }
    }

    public void paymentModule() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Payment Module");
        System.out.println("======================");
        System.out.println("T - Display total amount to be paid");
        System.out.println("P - Make payment");
        System.out.println("C - Buy all activities card for Rs 800");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Module code (T, P, C, M) : ");
        this.module = sc.nextLine().toUpperCase(); // Using 'this' to refer to the instance variable

        switch (this.module) {
            case "T":
                int totalAmount = foodAmount + additionalItemCost;
                if (cardPurchased) {
                    totalAmount = CARD_COST + foodAmount;
                }
                System.out.println("Total Amount to be Paid : Rs " + totalAmount);
                break;

            case "P":
                if (cardPurchased) {
                    System.out.println("Payment of Rs " + (CARD_COST + foodAmount) + " completed.");
                } else {
                    int totalPayAmount = foodAmount + additionalItemCost;
                    System.out.println("To Make Payment : Rs " + totalPayAmount);
                }
                break;

            case "C":
                if (!cardPurchased) {
                    cardPurchased = true;
                    System.out.println("Card purchased for Rs " + CARD_COST + ". All activities available.");
                } else {
                    System.out.println("Card already purchased.");
                }
                break;

            case "M":
                break;
        }
    }

    public void reportModule() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Report Module");
        System.out.println("======================");
        System.out.println("I - Display invoice for order made");
        System.out.println("S - Display summary of orders and payments made");
        System.out.println("M - Return to Main Menu");
        System.out.println("======================");
        System.out.println("Enter your Module code (I, S, M) : ");
        this.module = sc.nextLine().toUpperCase(); // Using 'this' to refer to the instance variable

        switch (this.module) {
            case "I":
                System.out.println("Invoice Display");
                System.out.println("==================");
                System.out.println("Ordered Id : " + (Math.ceil(Math.random())));
                System.out.println("Number of guests: " + guestCount);
                int invoiceAmount = cardPurchased ? CARD_COST + foodAmount : foodAmount + additionalItemCost;
                System.out.println("Total Amount: Rs " + invoiceAmount);
                break;

            case "S":
                System.out.println("Summary Of Order");
                System.out.println("======================");
                System.out.println("Food item cost: Rs " + foodAmount);
                System.out.println("Number of guests: " + guestCount);
                if (!cardPurchased) {
                    System.out.println("Additional Cost: Rs " + additionalItemCost);
                } else {
                    System.out.println("Card worth Rs 800 is purchased");
                }
                int summaryTotal = cardPurchased ? CARD_COST + foodAmount : foodAmount + additionalItemCost;
                System.out.println("Total Amount to be Paid: Rs " + summaryTotal);
                break;

            case "M":
                break;
        }
    }

    public void exitModule() {
        System.out.println("Quit Module");
        System.exit(0);
    }

    public static void main(String[] args) {
        EntryClass ec = new EntryClass();
        
        ExhibitionManagementSystem system = new ExhibitionManagementSystem();
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======================");
            System.out.println("EMS Main Menu");
            System.out.println("======================");
            System.out.println("O - Order Module");
            System.out.println("P - Payment Module");
            System.out.println("R - Report Module");
            System.out.println("E - Quit Module");
            System.out.println("======================");
            System.out.println("Enter your Module code (O, P, R, E) : ");
            String module = sc.nextLine().toUpperCase();

            switch (module) {
                case "O":
                    system.orderModule();
                    break;
                case "P":
                    system.paymentModule();
                    break;
                case "R":
                    system.reportModule();
                    break;
                case "E":
                    system.exitModule();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
