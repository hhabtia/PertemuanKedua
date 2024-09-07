/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankeduaa;

/**
 *
 * @author Habtia Humaira
 */
public class Kota extends Provinsi implements AlunAlun, Taman, Perpustakaan {
    private int populasi;
    private String kulinerKhas;
    
    public Kota() {
        this.setPopulasi(10000000);
        this.setKulinerKhas("ketoprak");
        super.setNama("jakarta");
        super.setMataUang("rupiah");
    }
    
    public void Iklim(){
        System.out.println("tropis");
    }
    
    public void MacamIklim(){
        this.Iklim();
        super.Iklim();
    }

    /**
     * @return the populasi
     */
    public int getPopulasi() {
        return populasi;
    }

    /**
     * @param populasi the populasi to set
     */
    public void setPopulasi(int populasi) {
        this.populasi = populasi;
    }

    /**
     * @return the kulinerKhas
     */
    public String getKulinerKhas() {
        return kulinerKhas;
    }

    /**
     * @param kulinerKhas the kulinerKhas to set
     */
    public void setKulinerKhas(String kulinerKhas) {
        this.kulinerKhas = kulinerKhas;
    }

    @Override
    public void diTengahKota() {
        System.out.println("Alun-Alun di tengah kota sangat bagus");
    }

    @Override
    public void indah() {
        System.out.println("Taman itu sejuk dan sangat indah");
    }

    @Override
    public void sangatLuas() {
        System.out.println("Perpustakaan itu sangat luas");
    }
}


