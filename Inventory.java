/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinee.commerce;

import java.io.BufferedWriter;
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
public class Inventory {
    private int ProductId = 0;
    private String ProductName;
    private int ProductQuantity;
    
    
    public Inventory() throws IOException
    {   
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product name");
        String name = input.next();
        ProductName = name;
        System.out.println("Enter price");
        int price = input.nextInt();
        Product p = new Product(ProductName, price);
        System.out.println("New Product Added");
        
        List<String> lines = Arrays.asList(p.ProductId+";"+ p.GetName()+";" + p.GetPrice()+";" + p.Availability+";");
        Path file = Paths.get("Products.txt");
        Files.write(file, lines, Charset.forName("UTF-8"));
    }
    
    
    public String viewReport(int id)
       {
            return "report";
       }
    
    
}

