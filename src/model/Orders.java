/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author nooby
 */
public class Orders {
    
    private Integer BillID;
    private Integer CustomerID;
    private Double Total;
    private Date OrderDate;
    
    
    public Orders(){}

    public Orders(Integer BillID, Integer CustomerID, Double Total, Date OrderDate) {
        this.BillID = BillID;
        this.CustomerID = CustomerID;
        this.Total = Total;
        this.OrderDate = OrderDate;
    }

    public Integer getBillID() {
        return BillID;
    }

    public void setBillID(Integer BillID) {
        this.BillID = BillID;
    }

    public Integer getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Integer CustomerID) {
        this.CustomerID = CustomerID;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }
    
    
    
}
