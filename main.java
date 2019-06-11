/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinee.commerce;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Taimoor
 */
public class OfflineECommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int userID;
        String password;
        String number;
        String name;

        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to log in");
        System.out.println("Press 2 to create account");
        System.out.println("Press 3 to exit");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Press 1 if you are Administrator");
            System.out.println("Press 2 if you are Customer");
            int user = input.nextInt();
            
            System.out.println(" ");
            
            System.out.println("Enter User ID");
            userID = input.nextInt();
            System.out.println("Enter Password");
            password = input.next();
            
            if (user == 1)
            {
                Administrator.LogIn(userID, password);
                while (Administrator.valid != true)
                {
                    System.out.println("Enter User ID");
                    userID = input.nextInt();
                    System.out.println("Enter Password");
                    password = input.next();
                    Administrator.LogIn(userID, password);
                }
                if (Administrator.valid == true)
                {
                    System.out.println("Press 1 to Add new Product");
                    System.out.println("Press 2 to View Inventory");
                    int adminChoice = input.nextInt();
                    
                    if (adminChoice == 1)
                    {
                        Inventory i = new Inventory();
                    }
                }
            }
            
            if (user == 2)
            {
                Customer.LogIn(userID, password);
                while (Customer.valid != true)
                {
                    System.out.println("Enter User ID");
                    userID = input.nextInt();
                    System.out.println("Enter Password");
                    password = input.next();
                    Customer.LogIn(userID, password);
                }
                if (Customer.valid == true)
                {
                    System.out.println("Welcome to Offline E-Commerce");
                    System.out.println("Enter Product ID to browse Products");
                    int ProductID = input.nextInt();
                    String s = String.valueOf(ProductID);
                    String c ="";
                    double d= 0;
                    try {
                        String content = new String(Files.readAllBytes(Paths.get("Products.txt")));
                        String a[] = content.split(s);
                        String b[] = a[1].split("\\;");

                        boolean found = true;


                        System.out.println("Product Name : " + b[1]);
                        c = b[1];
                        System.out.println("Price : " + b[2]);
                        d = Double.parseDouble(b[2]);
                        } 
                    catch (Exception e) 
                    {
                       e.getMessage();
                    }

             System.out.println("Press 1 to place Order");
             choice = input.nextInt();

             Product p = new Product(c,d);

             System.out.println("Enter product ID");
             ProductID = input.nextInt();
             System.out.println("Enter shipping address");
             String address = input.next();

             Order o = new Order("13", p, d, address);
             System.out.println(o.ViewOrder(o.OrderID));
             List<String> lines = Arrays.asList(o.ViewOrder(o.OrderID));
             Path file = Paths.get("Orders.txt");
             Files.write(file, lines, Charset.forName("UTF-8"));
         }
        }
     }
            
        if (choice == 2) {
            System.out.println("Enter Name");
            name = input.next();
            System.out.println("Enter Password");
            password = input.next();
            System.out.println("Enter Contact Number");
            number = input.next();
            System.out.println("");

            User u = new Customer(name, password, number);

             List<String> lines = Arrays.asList(u.UserID + u.Name + u.Password + u.ContactNumber);
             Path file = Paths.get("Customers.txt");
             Files.write(file, lines, Charset.forName("UTF-8"));

            
            Customer.LogIn(u.UserID, password);
            System.out.println("Welcome to Offline E-Commerce");
                    System.out.println("Enter Product ID to browse Products");
                    int ProductID = input.nextInt();
                    String s = String.valueOf(ProductID);
                    String c ="";
                    double d= 0;
                    try {
                        String content = new String(Files.readAllBytes(Paths.get("Products.txt")));
                        String a[] = content.split(s);
                        String b[] = a[1].split("\\;");

                        boolean found = true;


                        System.out.println("Product Name : " + b[1]);
                        c = b[1];
                        System.out.println("Price : " + b[2]);
                        d = Double.parseDouble(b[2]);
                        } 
                    catch (Exception e) 
                    {
                        System.out.println("Not found");
                    }

             System.out.println("Press 1 to place Order");
             choice = input.nextInt();

             Product p = new Product(c,d );

             System.out.println("Enter product ID");
             ProductID = input.nextInt();
             System.out.println("Enter shipping address");
             String address = input.next();

             Order o = new Order("13", p, d, address);
             System.out.println(o.ViewOrder(o.OrderID));
             List<String> sd = Arrays.asList(o.ViewOrder(o.OrderID));
             Path nh = Paths.get("Orders.txt");
             Files.write(file, lines, Charset.forName("UTF-8"));
        }

            if (choice == 3) 
            {
                System.exit(0);
            }
     
        }       
    }

