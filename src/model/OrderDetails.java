/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nooby
 */
public class OrderDetails {
    
    private Integer OrderID;
    private Double Amount;
    private Integer ItemCode;
    private Integer BillID;
    
    public OrderDetails(){}

    public OrderDetails(Integer OrderID, Double Amount, Integer ItemCode, Integer BillID) {
        this.OrderID = OrderID;
        this.Amount = Amount;
        this.ItemCode = ItemCode;
        this.BillID = BillID;
    }

    public Integer getOrderID() {
        return OrderID;
    }

    public void setOrderID(Integer OrderID) {
        this.OrderID = OrderID;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public Integer getItemCode() {
        return ItemCode;
    }

    public void setItemCode(Integer ItemCode) {
        this.ItemCode = ItemCode;
    }

    public Integer getBillID() {
        return BillID;
    }

    public void setBillID(Integer BillID) {
        this.BillID = BillID;
    }
    
    
    
}
