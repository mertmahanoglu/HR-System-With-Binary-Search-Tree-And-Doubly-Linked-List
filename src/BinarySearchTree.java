
import java.util.Scanner;


public class BinarySearchTree {
    
    Scanner scanner = new Scanner(System.in);
    
     //----------------- KİŞİ BİLGİLERİ --------------
    public  Node root; //KÖK
    public  Node head; //BAŞ
    
    
    String BSTad;
    String BSTadres;
    String BSTtelefonNo;
    String BSTemail;
    String BSTdogumTarihi;
    String BSTyabanciDil;
    int BSTyabanciDilSay;
    String BSTehliyet;
    
    //-----------------ÖNCEKİ İŞ YERİ BİLGİLERİ------------------
    
    String BSTisYeriAd;
    String BSTisYeriAdres;
    String BSTisYeriTelefon;
    String BSTpozisyon;
    int BSTcalismaSuresi;
    
    
    
    //---------------------- EĞİTİM BİLGİLERİ-----------------------
    
    String BSTokulAd;
    String BSTbolum;
    String BSTbaslangicTarih;
    String BSTbitisTarih;
    double BSTnotOrt;

    public BinarySearchTree() {
        root=null; //KÖK EN BAŞTA BOŞ NULL'A EŞİTLİYORUZ
    }
    
    
    
     void BstToLinked(Node root) 
    { 
        // Base cases 
        if (root == null) 
            return; 
  
        // Recursively convert right subtree 
        BstToLinked(root.sag); 
  
        // insert root into DLL 
        root.sag = head; 
  
        // Change left pointer of previous head 
        if (head != null) 
            head.sol = root; 
  
        // Change head of Doubly linked list 
        head = root; 
  
        // Recursively convert left subtree 
        BstToLinked(root.sol); 
    } 
    
    
      void listeyiYazdir(Node head) 
    { 
        System.out.println("Extracted Double Linked List is : "); 
        while (head != null) { 
           System.out.print(head.ad + " ");
             System.out.print(head.adres + " "); 
              System.out.print(head.baslangicTarih + " "); 
               System.out.print(head.bitisTarih + " "); 
                System.out.print(head.bolum + " "); 
                 System.out.print(head.calismaSuresi + " "); 
                  System.out.print(head.dogumTarihi+ " "); 
                   System.out.print(head.ehliyet + " "); 
                    System.out.print(head.email + " "); 
                     System.out.print(head.isYeriAd + " "); 
                      System.out.print(head.isYeriAdres + " "); 
                       System.out.print(head.isYeriTelefon + " "); 
                        System.out.print(head.notOrt + " "); 
                         System.out.print(head.okulAd + " "); 
                          System.out.print(head.pozisyon + " "); 
                           System.out.print(head.telefonNo + " "); 
                           System.out.print(head.yabanciDil + " ");
                           System.out.print(head.yabanciDilSay + " ");
                          
                
            head = head.sag; 
        } 
    } 
  
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
        BinarySearchTree bstTree = new BinarySearchTree();
        
     
        
              //----------------- KİŞİ BİLGİLERİ INPUT-------------- 
    System.out.println("Adınızı giriniz :");
    String ad = bstTree.BSTad = scanner.nextLine();
    
     System.out.println("Adresinizi giriniz :");
    String adres =bstTree.BSTadres = scanner.nextLine();
    
     System.out.println("Telefon numaranızı giriniz :");
    String telNo = bstTree.BSTtelefonNo = scanner.nextLine(); 
    
     System.out.println("E-mailinizi giriniz :");
    String mail = bstTree.BSTemail = scanner.nextLine();
    
     System.out.println("Doğum tarihinizi giriniz :");
   String dogTar =  bstTree.BSTdogumTarihi = scanner.nextLine();
    
     System.out.println("Bildiğiniz yabancı dilleri  giriniz :");
    String dil = bstTree.BSTyabanciDil = scanner.nextLine();
    
     System.out.println("Ehliyetiniz var mı? (VAR/YOK)");
    String ehliyet = bstTree.BSTehliyet = scanner.nextLine();
    
     //----------------- KİŞİ BİLGİLERİ INPUT BİTİŞ-------------- 
     
     
         //-----------------ÖNCEKİ İŞ YERİ BİLGİLERİ INPUT ------------------
    
     System.out.println("İş yeri adınız giriniz :");
    String isAd = bstTree.BSTisYeriAd = scanner.nextLine();
    
     System.out.println("İş yeri adresiniz giriniz :");
    String adresIs = bstTree.BSTisYeriAdres = scanner.nextLine();
    
     System.out.println("Pozisyon/göreviniz giriniz :");
    String gorev = bstTree.BSTpozisyon = scanner.nextLine();
    
     System.out.println("Çalışma süreniz giriniz :");
    int sure = bstTree.BSTcalismaSuresi = scanner.nextInt();
    
        //-----------------ÖNCEKİ İŞ YERİ BİLGİLERİ BİTİŞ------------------
    
        
        //---------------------- EĞİTİM BİLGİLERİ INPUT-----------------------
    
        
        System.out.println("Okul adınızı giriniz :");
   String adOkul = bstTree.BSTokulAd = scanner.nextLine();
    
     System.out.println("Bölümünüzü giriniz :");
    String bolum = bstTree.BSTbolum = scanner.nextLine();
    
     System.out.println("Okula giriş tarihiniz giriniz :");
   String basTar =  bstTree.BSTbaslangicTarih = scanner.nextLine();
    
     System.out.println("Mezuniyet tarihiniz giriniz :");
    String bitTar = bstTree.BSTbitisTarih = scanner.nextLine();
    
    System.out.println("Not ortalamanız giriniz :");
     double notOrt = bstTree.BSTnotOrt = scanner.nextDouble();
     
     bstTree.root = new Node( ad, adres, telNo, mail, dogTar, dil, sure, ehliyet, isAd, adres, telNo, isAd, sure, adOkul, bolum, basTar, bitTar, notOrt);
     
        if (ad.compareTo(bstTree.BSTad)==0) {
              bstTree.root.sol = new Node( ad, adres, telNo, mail, dogTar, dil, sure, ehliyet, isAd, adres, telNo, isAd, sure, adOkul, bolum, basTar, bitTar, notOrt);
              System.out.println("Çalıştı");
        }
        else
        {
         bstTree.root.sag = new Node( ad, adres, telNo, mail, dogTar, dil, sure, ehliyet, isAd, adres, telNo, isAd, sure, adOkul, bolum, basTar, bitTar, notOrt);
        }   
             
    
 bstTree.BstToLinked(bstTree.root);
 bstTree.listeyiYazdir(bstTree.head);
        System.out.println("Çalışıyor mu");
 
 
    }
    
    
    
    
}
