/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.gunadarma.ac.id.pert2_50422657;

/**
 *
 * @author harry
 */
public class Seller extends User {
    private String product;
    
    public void addProduct (String productName){
        System.out.println("Seller Menambahkan produk " + productName);
        this.product = productName;
    }
}
