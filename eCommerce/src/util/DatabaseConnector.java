/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Customer;
import model.Product;

/**
 * Database Connector class for interacting with database
 * @author akshatr
 */
public class DatabaseConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/Ecommerce?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private DatabaseConnector() {
    }

    /**
     * Insert given user to database
     * @see User
     * @param user User object to be added
     */
    public static void addProduct(Product user) {
        //add to database
        String query = "INSERT INTO PRODUCT(PRODUCTID,NAME,PRICE, DESCRIPTION) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user.getProductId());
            stmt.setString(2, user.getProductName());
            stmt.setInt(3, user.getPrice());
            stmt.setString(4, user.getProductDescription());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
        /**
     * Insert given customer to database
     * @see User
     * @param customer User object to be added
     */
    public static void addUser(Customer customer) {
        //add to database
        String query = "INSERT INTO CUSTOMER(customerId,name,gender,age, email,telephone,password) VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, customer.getCustomerId());
            stmt.setString(2, customer.getName());
            stmt.setString(3,customer.getGender());
            stmt.setInt(4, customer.getAge());
            stmt.setString(5, customer.getEmail());
            stmt.setInt(6, customer.getTeleNo());
            stmt.setString(7, customer.getPassword());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Return lost of all users in database
     * @see User
     * @return list of users
     */
    public static ArrayList<Product> getAllusers() {
//        return list of users from db
        ArrayList<Product> products = new ArrayList<>();

        String query = "SELECT * FROM PRODUCT";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Product u = new Product();
                u.setProductId(rs.getString("productId"));
                u.setProductName(rs.getString("name"));
                u.setPrice(rs.getInt("price"));
                u.setProductDescription(rs.getString("description"));
                products.add(u);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }

    /**
     * Delete given user from database
     * @see User
     * @param u User to be deleted
     * 
     */
    public static void deleteUser(Product u) {
        String query = "delete from PRODUCT where productId = ?";
        System.out.print(query);

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, u.getProductId());
            System.out.print(stmt);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Edit given user details in the database
     * @param oldProd existing user in database
     * @param newProd modified user details to be added
     */
    public static void editUser(Product oldProd, Product newProd) {
        String query = "UPDATE PRODUCT SET name=?, price=?,description=? WHERE productId=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newProd.getProductName());
            stmt.setInt(2, newProd.getPrice());
            stmt.setString(3, newProd.getProductDescription());
            stmt.setString(4, oldProd.getProductId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
            /**
     * Insert given customer to database
     * @see User
     * @param customer User object to be added
     */
public static boolean containsUser(Customer customer) {
    String query = "SELECT EXISTS (SELECT 1 FROM CUSTOMER WHERE name = ?) AS user_exists";
    try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, customer.getName()); // Assuming getCustomerId() returns the username

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
          // return rs.getBoolean("user_exists");
         boolean userExists = rs.getBoolean("user_exists");
              if (userExists) {
                 //User exists, display login successful message
               JOptionPane.showMessageDialog(null, "Login successful");
           }
             return userExists;
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}


}
