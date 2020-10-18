import java.util.Date; 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class Node {
    
    
    //----------------- KİŞİ BİLGİLERİ --------------
    Node sol;
    Node sag;
    String ad;
    String adres;
    String telefonNo;
    String email;
    String dogumTarihi;
    String yabanciDil;
    int yabanciDilSay;
    String ehliyet;
    
    //-----------------ÖNCEKİ İŞ YERİ BİLGİLERİ------------------
    
    String isYeriAd;
    String isYeriAdres;
    String isYeriTelefon;
    String pozisyon;
    int calismaSuresi;
    
    
    
    //---------------------- EĞİTİM BİLGİLERİ-----------------------
    
    String okulAd;
    String bolum;
    String baslangicTarih;
    String bitisTarih;
    double notOrt;

    public Node( String ad, String adres, String telefonNo, String email, String dogumTarihi, String yabanciDil, int yabanciDilSay, String ehliyet, String isYeriAd, String isYeriAdres, String isYeriTelefon, String pozisyon, int calismaSuresi, String okulAd, String bolum, String baslangicTarih, String bitisTarih, double notOrt) {
       
        this.ad = ad;
        this.adres = adres;
        this.telefonNo = telefonNo;
        this.email = email;
        this.dogumTarihi = dogumTarihi;
        this.yabanciDil = yabanciDil;
        this.yabanciDilSay = yabanciDilSay;
        this.ehliyet = ehliyet;
        this.isYeriAd = isYeriAd;
        this.isYeriAdres = isYeriAdres;
        this.isYeriTelefon = isYeriTelefon;
        this.pozisyon = pozisyon;
        this.calismaSuresi = calismaSuresi;
        this.okulAd = okulAd;
        this.bolum = bolum;
        this.baslangicTarih = baslangicTarih;
        this.bitisTarih = bitisTarih;
        this.notOrt = notOrt;
        
        sol=sag=null;
    }
     
    
    
    
    
    
    
}
