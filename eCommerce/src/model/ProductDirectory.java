/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jq
 */
public class ProductDirectory {
    ArrayList<Product> allProducts;
    
    public ProductDirectory() {
        this.allProducts = new ArrayList<>();
    }
    
    

    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(ArrayList<Product> allProducts) {
        this.allProducts = allProducts;
    }
    
      public void addProduct(Product newProduct){
        this.allProducts.add(newProduct);
    }
    
    public void removeUser(Product product){
        this.allProducts.remove(product);
    }

    @Override
    public String toString() {
        return "UserDirectory{" + "allUsers=" + allProducts + '}';
    }
}
