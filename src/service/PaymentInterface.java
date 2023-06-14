/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.sql.SQLException;
import model.Payment;

/**
 *
 * @author nooby
 */
public interface PaymentInterface {
    public int insert(Payment p)
            throws SQLException;
}
