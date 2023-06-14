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
import model.Payment;

/**
 *
 * @author nooby
 */
public class PaymentService implements PaymentInterface {
    
    static Connection conn = DatabaseConnection.getConnection();
    
    @Override
    public int insert(Payment p) throws SQLException{
        
        String query = "insert into payment(PaymentTime,Payment_Method,BillID) values (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query , Statement.RETURN_GENERATED_KEYS);
        ps.setTime(1, p.getPaymentTime());
        ps.setString(2, p.getPaymentMethod());
        ps.setInt(3, p.getBillID());
        int n = ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    p.setPaymentID(rs.getInt(1));
                }
        return n;
    }
    
}
