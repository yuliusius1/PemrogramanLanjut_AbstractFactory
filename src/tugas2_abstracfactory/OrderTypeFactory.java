/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_abstracfactory;

/**
 *
 * @author Ini Tylius ad
 */
public class OrderTypeFactory extends AbstractFactory{
    @Override
    public Makanan getMakanan(String namaMakanan, int jumlahMakanan) {
        
        return null;
    }
    
    @Override
    Minuman getMinuman(String namaMinuman, String jenisMinuman, int jumlahMinuman) {
        
        return null;
    }
    
    @Override
    Sambal getSambal(String namaSambal, int jumlahSambal) {
        
        return null;
    }
    
    @Override
    OrderType getOrderType (String OrderTypeName){
        if (OrderTypeName == null) {
            return null;
        }
        if (OrderTypeName.equalsIgnoreCase("Take Away")) {
            return new TakeAway();
        } else if (OrderTypeName.equalsIgnoreCase("Dine In")) {
            return new DineIn();
        } 
        return null;
    }
}
