/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nooby
 */
public class Customer {
    private Integer CustomerID;
    private String CustomerName;
    private String CustomerAddress;
    private Integer CustomerContactNumber;
    
    public Customer(){}
    
    public Customer(Integer CustomerID, String CustomerName, String CustomerAddress,Integer CustomerContactNumber){
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.CustomerAddress = CustomerAddress;
        this.CustomerContactNumber = CustomerContactNumber;
    }

    public Integer getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Integer CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    public Integer getCustomerContactNumber() {
        return CustomerContactNumber;
    }

    public void setCustomerContactNumber(Integer CustomerContactNumber) {
        this.CustomerContactNumber = CustomerContactNumber;
    }
}