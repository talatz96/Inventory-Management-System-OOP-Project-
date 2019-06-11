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
    public abstract class User {
    
    protected String Name;
    protected String ContactNumber;
    protected int UserID;
    protected String Password;
    protected static boolean valid = false;
    
    public static boolean LogIn(int UserID, String password) 
    {
        return valid;   
    }
    
    }
