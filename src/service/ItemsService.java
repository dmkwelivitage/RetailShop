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
import java.util.ArrayList;
import java.util.List;
import model.Items;

/**
 *
 * @author nooby
 */
public class ItemsService implements ItemsInterface{
    
    static Connection conn = DatabaseConnection.getConnection();
    
    @Override
    public int insert(Items items)
        throws SQLException{
        
        String query = "insert into items(Item_Name,Price,MFD,EXPDate) values (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, items.getItemName());
        ps.setDouble(2, items.getItemPrice());
        ps.setDate(3, items.getItemMFD());
        ps.setDate(4, items.getItemEXP());
        int n = ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    items.setItemCode(rs.getInt(1));
                }
        return n;
    }
    
    @Override
    public Items getItem(int icode) throws SQLException{
        String query = "select * from items where Item_Code = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, icode);
        Items items = new Items();
        ResultSet rs = ps.executeQuery();
        boolean check = false;
        
        while (rs.next()) {            
            check = true;
            items.setItemCode(rs.getInt("Item_Code"));
            items.setItemName(rs.getString("Item_Name"));
            items.setItemPrice(rs.getDouble("Price"));
            items.setItemMFD(rs.getDate("MFD"));
            items.setItemEXP(rs.getDate("EXPDate"));
        }
        
        if(check == true){
            return items;
        }
        else{
            return null;
        }
    }
    
    @Override
    public List<Items> getItems()throws SQLException{
        String query = "select * from items where Item_Code = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Items> ls = new ArrayList();
        
        while (rs.next()) {
            Items items = new Items();
            items.setItemCode(rs.getInt("Item_Code"));
            items.setItemName(rs.getString("Item_Name"));
            items.setItemPrice(rs.getDouble("Price"));
            items.setItemMFD(rs.getDate("MFD"));
            items.setItemEXP(rs.getDate("EXPDate"));
            ls.add(items);
        }
        return ls;
    }
    
    @Override
    public void delete(int icode) throws SQLException {
        String query = "delete from items where Item_Code =?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, icode);
        ps.executeUpdate();
    }
    
}
