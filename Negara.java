/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankeduaa;

/**
 *
 * @author Habtia Humaira
 */
public class Negara extends Benua {
    private String mataUang;
    private String ibuKota;
    
    public Negara() {
        System.out.println("halo, ini Negara");
        super.setNama("indonesia");
        this.setMataUang("rupiah");
        this.setIbuKota("jakarta");
        super.setBentukPemerintahan("republik");

    }

    /**
     * @return the mataUang
     */
    public String getMataUang() {
        return mataUang;
    }

    /**
     * @param mataUang the mataUang to set
     */
    public void setMataUang(String mataUang) {
        this.mataUang = mataUang;
    }

    /**
     * @return the ibuKota
     */
    public String getIbuKota() {
        return ibuKota;
    }

    /**
     * @param ibuKota the ibuKota to set
     */
    public void setIbuKota(String ibuKota) {
        this.ibuKota = ibuKota;
    }
}
