public class Meja{ #judul atau name codiangan java yang ki buat ([)
pembukaan atau opening 
 public int kaki_meja(){ #ukuran panjang kaki yang akan kita hitung
 return 70;
 }

 public int alas_meja(){ #luas alas pada meja yang akan kita hitung
 return 120;
 }
 public static void main (String[]args){ #proses penjumblahan
     Meja a=new Meja();
     int kaki=a.kaki_meja();
     int alas_meja=a.alas_meja();
     System.out.println(kaki*alas_meja); #menghentikan system
     }
} #menutup codingan
