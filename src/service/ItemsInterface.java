/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.SQLException;
import java.util.List;
import model.Items;

/**
 *
 * @author nooby
 */
public interface ItemsInterface {
    
    public int insert(Items items)
            throws SQLException;
    public Items getItem(int icode)
            throws SQLException;
    public List<Items> getItems()
            throws SQLException;
    public void delete(int icode)
            throws SQLException;
}
