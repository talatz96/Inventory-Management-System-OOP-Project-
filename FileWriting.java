/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinee.commerce;
    import java.io.*;
    import java.lang.*;
    import java.util.*;
/**
 *
 * @author Taimoor
 */
public class FileWriting {
     
    private Formatter x;
    
    public void OpenFile(String filename)
    {
        try 
        {
            x = new Formatter(filename);
        }
        catch (Exception e)
        {
            System.out.println("you have an error");
        }      
    }
    
    public void addRecords(String data)
    {
        x.format("data");
    }
    
    public void closeFile()
    {
        x.close();
    }
}
