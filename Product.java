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
public class Product {
    protected int ProductId;
    private String Name;
    public boolean Availability;
    private double price;
    protected int ProductQuantity = 0;
    
    public Product(String Name, double price)
    {
        this.price = price;
        this.Name = Name;
        ProductId = ProductId + 1;
        ProductQuantity = ProductQuantity + 1;
        Availability = true;
    }
    
    public String GetName()
    {
        return Name;
    }
    
    public double GetPrice()
    {
        return price;
    }
    
    public int GetID()
    {
        return ProductId;
    }
    
    public boolean GetAvailability()
    {
        return Availability;
    }
        
    
    public int getQuantity()
    {
        if (ProductQuantity ==0) {
            Availability = false;  
        }
        
            return ProductQuantity;
        }
    }