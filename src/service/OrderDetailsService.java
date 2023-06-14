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
import model.OrderDetails;

/**
 *
 * @author nooby
 */
public class OrderDetailsService implements OrderDetailsInterface{
    
    static Connection conn = DatabaseConnection.getConnection();
    
    @Override
    public int insert(OrderDetails od)throws SQLException{
        String query = "insert into order_details(Amount,Item_Code,BIllID) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query , Statement.RETURN_GENERATED_KEYS);
        ps.setDouble(1, od.getAmount());
        ps.setInt(2, od.getItemCode());
        ps.setInt(3, od.getBillID());
        int n = ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    od.setOrderID(rs.getInt(1));
                }
        return n;
    }
}
