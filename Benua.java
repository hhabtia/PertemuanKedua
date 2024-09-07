/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankeduaa;

/**
 *
 * @author Habtia Humaira
 */
public class Benua {
    private String nama;
    private String bentukPemerintahan;

    public Benua() {
        System.out.println("Halo, ini Benua");
        this.setNama("Asia");
        this.setBentukPemerintahan("demokrasi dan monarki");
    }
    /**
     * @return the iklimDominan
     */

    /**
     * @return the bentukPemerintahan
     */
    public String getBentukPemerintahan() {
        return bentukPemerintahan;
    }

    /**
     * @param bentukPemerintahan the bentukPemerintahan to set
     */
    public void setBentukPemerintahan(String bentukPemerintahan) {
        this.bentukPemerintahan = bentukPemerintahan;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
}
