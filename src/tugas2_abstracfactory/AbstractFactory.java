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
public abstract class AbstractFactory {
    
    abstract Makanan getMakanan(String NamaMakanan,int jumlahMakanan);
    abstract Minuman getMinuman(String NamaMinuman,String jenisMinuman, int jumlahMakanan);
    abstract Sambal getSambal(String namaSambal, int jumlahSambal);
    abstract OrderType getOrderType (String OrderTypeName);
}
