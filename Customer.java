/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinee.commerce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taimoor
 */
public class Customer extends User {
    
    protected int CustomerID = 20000;
    
    public Customer(String Name, String ContactNumber, String Password) 
    {
        CustomerID = CustomerID + 1;
        this.Password = Password;
        this.Name = Name;
        this.ContactNumber = ContactNumber;        
    }

    public static boolean LogIn(int UserID, String Password) 
    {
        File file2 = new File("Customers.txt");
        BufferedReader br = null;
        String customerID = String.valueOf(UserID);
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        String line = null;
        try {
            while( (line = br.readLine())!= null )
            {
                String [] tokens = line.split("\\;");
                if (customerID.equals(tokens[0]))
                {
                    if (Password.equals(tokens[1]))
                            {
                                System.out.println("Log In Successful");
                                System.out.println("");
                                valid = true;
                            }
                    else
                    {
                        System.out.println("Incorrect Password");
                        System.out.println("");
                        valid = false;
                    }
                }
                else
                {
                        System.out.println("Incorrect Customer ID");
                        System.out.println("");
                        valid = false;
                }
                
            }   } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valid;
    }
}

