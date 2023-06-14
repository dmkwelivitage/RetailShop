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
public class Items {
    private Integer ItemCode;
    private String ItemName;
    private Double ItemPrice;
    private Date ItemMFD;
    private Date ItemEXP;
    
    public Items(){}

    public Items(Integer ItemCode, String ItemName, Double ItemPrice, Date ItemMFD, Date ItemEXP) {
        this.ItemCode = ItemCode;
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemMFD = ItemMFD;
        this.ItemEXP = ItemEXP;
    }
    

    public Integer getItemCode() {
        return ItemCode;
    }

    public void setItemCode(Integer ItemCode) {
        this.ItemCode = ItemCode;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public Double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(Double ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public Date getItemMFD() {
        return ItemMFD;
    }

    public void setItemMFD(Date ItemMFD) {
        this.ItemMFD = ItemMFD;
    }

    public Date getItemEXP() {
        return ItemEXP;
    }

    public void setItemEXP(Date ItemEXP) {
        this.ItemEXP = ItemEXP;
    }
}
