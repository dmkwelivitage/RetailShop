/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author nooby
 */

import java.sql.SQLException;
import model.Customer;

public interface CustomerInterface {
    
    public int insert(Customer c)
            throws  SQLException;
    public void delete(int cusid)
            throws SQLException;
    public Customer getCustomer(int num)
            throws SQLException;
    public Customer getCustomerViaID(int num)
            throws SQLException;
    
}
