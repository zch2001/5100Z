/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shakt
 */
public class CustomerDirectory {
    ArrayList<Customer> allUsers;

    public CustomerDirectory() {
        this.allUsers = new ArrayList<>();
    }
    
    

    public ArrayList<Customer> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<Customer> allUsers) {
        this.allUsers = allUsers;
    }
    
      public void addUser(Customer newUser){
        this.allUsers.add(newUser);
    }
    
    public void removeUser(Customer user){
        this.allUsers.remove(user);
    }
    
    public Customer loginUser(String username, String password) {
        for (Customer user : allUsers) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    
    public boolean UserExists(ArrayList<Customer> allUsers, Customer customer){
        return allUsers.contains(customer);
    }

    @Override
    public String toString() {
        return "UserDirectory{" + "allUsers=" + allUsers + '}';
    }
    
    
}
