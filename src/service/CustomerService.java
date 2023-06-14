/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author nooby
 */

import dbconnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Customer;

public class CustomerService implements CustomerInterface{
    
    static Connection conn = DatabaseConnection.getConnection();
    
    @Override
    public int insert(Customer c)
        throws SQLException{
        
        String query = "insert into customer(Customer_Name,Address,ContactNumber) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query , Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, c.getCustomerName());
        ps.setString(2, c.getCustomerAddress());
        ps.setInt(3, c.getCustomerContactNumber());
        int n = ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    c.setCustomerID(rs.getInt(1));
                }
        return n;
    }
    
    @Override
    public void delete(int cusid) throws SQLException {
        String query = "delete from customer where CustomerID =?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, cusid);
        ps.executeUpdate();
    }
    
    @Override
    public Customer getCustomer(int num) throws SQLException{
        String query = "select * from customer where ContactNumber = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, num);
        Customer customer = new Customer();
        ResultSet rs = ps.executeQuery();
        boolean check = false;
        
        while (rs.next()) {            
            check = true;
            customer.setCustomerID(rs.getInt("CustomerID"));
            customer.setCustomerName(rs.getString("Customer_Name"));
            customer.setCustomerAddress(rs.getString("Address"));
            customer.setCustomerContactNumber(rs.getInt("ContactNumber"));
        }
        
        if(check == true){
            return customer;
        }
        else{
            return null;
        }
    }
    
    @Override
    public Customer getCustomerViaID(int num) throws SQLException{
        String query = "select * from customer where CustomerID = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, num);
        Customer customer = new Customer();
        ResultSet rs = ps.executeQuery();
        boolean check = false;
        
        while (rs.next()) {            
            check = true;
            customer.setCustomerID(rs.getInt("CustomerID"));
            customer.setCustomerName(rs.getString("Customer_Name"));
            customer.setCustomerAddress(rs.getString("Address"));
            customer.setCustomerContactNumber(rs.getInt("ContactNumber"));
        }
        
        if(check == true){
            return customer;
        }
        else{
            return null;
        }
    }
}
