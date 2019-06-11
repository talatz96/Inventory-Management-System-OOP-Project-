/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinee.commerce;

/**
 *
 * @author Taimoor
 */
public class Administrator extends User {
    
    protected static final int AdminID = 112233;
    protected static final String Password = "SAT";
    

    public static boolean LogIn(int UserID, String Password) 
    {
        if (UserID == AdminID)
        {
            if (Password.equals(Administrator.Password))
            {
                System.out.println("Log In Successful!");
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
            System.out.println("Incorrect User ID");
            System.out.println("");
            valid = false;
        }
        return valid;
    }
    
}
