/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package student.gunadarma.ac.id.pert2_50422657;

/**
 *
 * @author harry
 */
public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.logout();
        
        Buyer buyer = new Buyer();
        buyer.login();
        buyer.logout();
        
        Seller seller = new Seller();
        seller.addProduct("Nasi Goreng");
        
        Admin admin = new Admin();
        admin.login();
        admin.logout();
    }
}
