/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dbconnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Orders;

/**
 *
 * @author nooby
 */
public class OrdersService implements OrdersInterface{
    
    static Connection conn = DatabaseConnection.getConnection();
    
    @Override
    public int insert(Orders o)throws SQLException{
        String query = "insert into orders(CustomerID,OrderDate,Total) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query , Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, o.getCustomerID());
        ps.setDate(2, o.getOrderDate());
        ps.setDouble(3, o.getTotal());
        int n = ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    o.setBillID(rs.getInt(1));
                }
        return n;
    }
    
}
