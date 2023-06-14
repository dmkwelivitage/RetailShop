/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Time;

/**
 *
 * @author nooby
 */
public class Payment {
    private Integer PaymentID;
    private Time PaymentTime;
    private String PaymentMethod;
    private Integer BillID;
    
    public Payment(){}

    public Payment(Integer PaymentID, Time PaymentTime, String PaymentMethod, Integer BillID) {
        this.PaymentID = PaymentID;
        this.PaymentTime = PaymentTime;
        this.PaymentMethod = PaymentMethod;
        this.BillID = BillID;
    }

    public Integer getPaymentID() {
        return PaymentID;
    }

    public void setPaymentID(Integer PaymentID) {
        this.PaymentID = PaymentID;
    }

    public Time getPaymentTime() {
        return PaymentTime;
    }

    public void setPaymentTime(Time PaymentTime) {
        this.PaymentTime = PaymentTime;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public Integer getBillID() {
        return BillID;
    }

    public void setBillID(Integer BillID) {
        this.BillID = BillID;
    }
    
    
}
