/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.sql.SQLException;
import model.OrderDetails;

/**
 *
 * @author nooby
 */
public interface OrderDetailsInterface {
    public int insert(OrderDetails od)
            throws SQLException;
}
