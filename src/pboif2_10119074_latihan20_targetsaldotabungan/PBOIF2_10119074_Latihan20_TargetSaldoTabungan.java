/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119074_latihan20_targetsaldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;


/**
 *
 * @author Acer
 */
public class PBOIF2_10119074_Latihan20_TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
        public static void tampilSaldo(double saldoAwal,int bunga,int lamaBulan){
        //init var & assign value
        int i = 1;
        double saldoSemt = saldoAwal;
        double targetSaldo = 6000000;
             
        // set money value
        DecimalFormat kursID = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursID.setDecimalFormatSymbols(formatRp);
        
        // logic        
        while(saldoSemt < targetSaldo){
            System.out.println("Saldo di bulan ke-" + i + kursID.format(saldoSemt = saldoSemt + (saldoSemt *bunga/100)));
            i++;
        }    
    } 
    public static void main(String[] args) {
        // init var
        double saldoAwal;
        int bunga, lamaBulan;
                   
        // assign var
        saldoAwal = 3500000;
        bunga = 8;
        lamaBulan = 6;
        
        // call procedure
        tampilSaldo(saldoAwal,bunga,lamaBulan);
    }
    
}
