/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankeduaa;

/**
 *
 * @author Habtia Humaira
 */
public class Provinsi extends Negara {
    private String bahasaUtama;
    private String rumahAdat;
    
    public Provinsi() {
        System.out.println("Halo, ini Provinsi");
        this.setBahasaUtama("jawa");
        this.setRumahAdat("rumah joglo");
        super.setNama("jawa_timur");
        super.setIbuKota("surabaya");
    }

    /**
     * @return the bahasaUtama
     */
    public String getBahasaUtama() {
        return bahasaUtama;
    }

    /**
     * @param bahasaUtama the bahasaUtama to set
     */
    public void setBahasaUtama(String bahasaUtama) {
        this.bahasaUtama = bahasaUtama;
    }

    /**
     * @return the rumahAdat
     */
    public String getRumahAdat() {
        return rumahAdat;
    }

    /**
     * @param rumahAdat the rumahAdat to set
     */
    public void setRumahAdat(String rumahAdat) {
        this.rumahAdat = rumahAdat;
    }

    void Iklim() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
