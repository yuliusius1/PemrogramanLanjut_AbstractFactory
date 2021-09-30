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
public class Jeruk implements Minuman{
    private int jumlah,jumlahMinuman;
    private String Jenis;
    int harga = 5000;
    public Jeruk(int i,String jenis){
        if(jenis == " Es"){
            harga += 500;
        }
        jumlah=i*harga;

        Jenis = jenis;
        jumlahMinuman = i;
    }
    @Override
    public int getHargaMinuman(){
        return jumlah;
    }
    public String getNamaMinuman(){
        return "Jeruk";
    }
    public String getJenisMinuman(){
        return Jenis;
    }
    public int getJumlahMinuman(){
        return jumlahMinuman;
    }
}
