package com.barangay.ui;

import com.barangay.models.Resident;
import com.barangay.services.ResidentService;

import java.util.Scanner;

public class BarangayApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ResidentService service = new ResidentService();

        while (true) {

            System.out.println("\n=== BARANGAY SYSTEM ===");
            System.out.println("1. Add Resident");
            System.out.println("2. View Residents");
            System.out.println("3. Search Resident");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    service.add(new Resident(id, name, age));
                    break;

                case 2:
                    service.getAll().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Keyword: ");
                    String key = sc.nextLine();
                    service.search(key).forEach(System.out::println);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}