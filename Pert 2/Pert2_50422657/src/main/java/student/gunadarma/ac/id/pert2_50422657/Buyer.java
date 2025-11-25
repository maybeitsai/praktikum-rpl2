/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.gunadarma.ac.id.pert2_50422657;

/**
 *
 * @author harry
 */
public class Buyer extends User{
    
    @Override
    public void login(){
        System.out.println("Buyer melakukan login");
    }   
    
    @Override
    public void logout(){
        System.out.println("Buyer melakukan logout");
    }
}
