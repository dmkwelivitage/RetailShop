/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.sql.SQLException;
import model.Orders;

/**
 *
 * @author nooby
 */
public interface OrdersInterface {
    
    public int insert(Orders o)
            throws SQLException;
    
}
