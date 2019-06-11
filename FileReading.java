/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinee.commerce;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Taimoor
**/

public class FileReading {
    
    private Scanner x;
    
    public void openFile(String filename)
    {
        try 
        {
            x = new Scanner(new File(filename));
        }
        catch (Exception e)
        {
            System.out.println("could not find file");
        }
    }
    
    public void readFile()
    {
        while(x.hasNext())
        {
            String a = x.next();
            String b = x.next();
            String c = x.next();
            
            System.out.printf("%s %s %s", a, b, c);
        }
    }
    
    public void closeFile()
    {
        x.close();
    }
}
    

