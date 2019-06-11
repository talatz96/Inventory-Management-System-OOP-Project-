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
public class Order {
    
    protected int OrderID = 000000;
    private String UserID;
    private double TotalAmount;
    private String ShippingAddress;
    private Product Ordered;
    
    
    public Order(String UserID, Product Ordered, double Amount, String Address)
    {
        OrderID = OrderID + 1;
        this.UserID = UserID;
        this.ShippingAddress = Address;
        this.TotalAmount = Amount;
        this.Ordered = Ordered;
    }
    
    public String ViewOrder(int OrderID) 
    {
/*        System.out.println("Order ID: " + OrderID);
        System.out.println("User ID: " + UserID);
        System.out.println(Ordered.GetID());
        System.out.println(Ordered.GetName());
        System.out.println(Ordered.GetPrice());
        System.out.println("Shipping Address: " + ShippingAddress);*/
        
        return "Order ID: " + OrderID +"User ID: " + UserID + "Product ID: " + Ordered.GetID() + "Product Name: " + Ordered.GetName() + "Product Price: " + Ordered.GetPrice() + "Address: " + ShippingAddress;
    }
}
