/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import javax.swing.JOptionPane;

/**
 *
 * @author OWNER
 */
public class arraysatudimensi {
    public static void main(String[] args) {
        
    String bulanLhr[] = new String[7];    
    for(int i=0; i<bulanLhr.length;i++){  
        bulanLhr[i] = JOptionPane.showInputDialog(null, "Inputkan bulan lahir ke " + i);    
        System.out.println(bulanLhr[i]);
    }
     
  String cariBulan  = JOptionPane.showInputDialog(null, "Cari bulan lahir");

  for(int i=0; i<bulanLhr.length;i++){
    if(bulanLhr[i].equals(cariBulan)){
       JOptionPane.showMessageDialog(null, "Bulan yang anda cari adalah " +cariBulan + " terdeteksi pada indeks ke " + i); 
                 }
            }
      }   
}