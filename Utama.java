/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuankeduaa;

/**
 *
 * @author Habtia Humaira
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kota jakarta = new Kota();
        System.out.println("Aku adalah kota "  +jakarta.getNama() + ", mata uangku " +jakarta.getMataUang());
        System.out.println("");
        jakarta.diTengahKota();
        jakarta.sangatLuas();
        jakarta.indah();
        
        Benua Asia = (Benua) jakarta;
        Asia.setNama("Asia");
        System.out.println("Benuaku adalah " +Asia.getNama() + ",  bentuk pemerintahannya " +Asia.getBentukPemerintahan());
    
        System.out.println("");
        
        Provinsi jawa_timur = new Provinsi();
        System.out.println("Nama provinsiku " + jawa_timur.getNama() + ", rumah adatnya adalah " +jawa_timur.getRumahAdat());
        System.out.println("Bahasa utamanya adalah bahasa " +jawa_timur.getBahasaUtama());
        
        System.out.println("");
        
    }
    
}
