/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr.java.b.tiga.pr.praktikum.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.alam.ServiceProcess;

/**
 *
 * @author alamnurcahaya
 */

@Controller
@ResponseBody
public class projectController {
    
    logicalProcess hitung = new logicalProcess(); //Memanggil kelas logicalProces di file logicalProcess.java
    
    @RequestMapping("/konversiusdtoidr") //Link
    public String tampilusdtoidr(){ //Method untuk konversi mata uang
        
        double idr = hitung.getUSDIDR(5); //Masukkan nominal USD
        
        String view = "Hasil konversi 5 USD ke IDR = " + idr + " Rupiah."; //Membuat kalimat
        
        return view; //Menampilkan hasil konversi
    }
        
    @RequestMapping("/konversimyrtoidr") //Link
    public String tampilmyrtoidr(){ //Method untuk konversi mata uang
        
        double idr = hitung.getMYRIDR(5); //Masukkan nominal MYR
        
        String view = "Hasil konversi 5 MYR ke IDR = " + idr + " Rupiah."; //Membuat kalimat
        
        return view; //Menampilkan hasil konversi
    }
    
    @RequestMapping("/konversiusdtomyr") //Link
    public String tampilusdtomyr(){ //Method untuk konversi mata uang
        
        double myr = hitung.getUSDMYR(5); //Masukkan nominal USD
        
        String view = "Hasil konversi 5 USD ke MYR = " + myr + " Ringgit."; //Membuat kalimat
        
        return view; //Menampilkan hasil konversi
    }
    
    @RequestMapping("/konversisgdtoidr") //Link
    public String tampilsgdtoidr(){ //Method untuk konversi mata uang
        
        double sgd = hitung.getSGDIDR(5); //Masukkan nominal USD
        
        String view = "Hasil konversi 5 SGD ke IDR = " + sgd + " Rupiah."; //Membuat kalimat
        
        return view; //Menampilkan hasil konversi
    }
    @RequestMapping("/konversisemuakurs") //Link
    public String konversisemuakurs(){ //Method untuk konversi mata uang
        String tampilkan;
        tampilkan = hitung.tampilsemuakonversi();
        
        return tampilkan;
    }
    
    ServiceProcess alam = new ServiceProcess(); //inisialisasi class serviceprocess
    
    @RequestMapping("/tampiluser")
    public String viewUser(){
        String nama, nim, angkatan, validasi, jenisangka, tampilkan;
        
        nama = alam.tampilNama(); //nama = "Alam"
        nim = alam.tampilNIM();
        angkatan = alam.tampilAngkatan();
        validasi = alam.cekNama();
        
        jenisangka = alam.cekAngka(20);
        
        //pr konversi mata uang //tampilkan = nama + " " + nim + " " + angkatan + ", " + validasi;
        tampilkan = nama + " " + nim + " " + angkatan + ", " + validasi + jenisangka;
        
        return tampilkan;
    }
    
    @RequestMapping("/tampilusersimpel")
    public String viewUserSimpel(){
        String tampilkan;
        tampilkan = alam.viewUserSedikit();
        
        return tampilkan;
    }
}