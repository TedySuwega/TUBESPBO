
package tubes;
import java.util.Scanner;

public class TubesMain {
   
    
    public static void main(String[] args) throws Exception {
        
        Makanan M1 = new Makanan("Batagor",7000,200);
        Makanan M2 = new Makanan("Bakso",12500,400);
        Makanan M3 = new Makanan("Sate",15000,500);
        M1.setRating(4);
        M2.setRating(5);
        M3.setRating(4);
        M1.setUlasan("Rasanya enak, cocok untuk yang suka gurih");
        M2.setUlasan("Enak  dimakan saat Hujan");
        M3.setUlasan("Cocok untuk makan besar");
        MenuMakanan menu1 = new MenuMakanan("Menu Gaul",3);
        menu1.addMenu(M1);
        menu1.addMenu(M2);
        menu1.addMenu(M3);
        TempatMakan warung1 = new TempatMakan("Warung Wow",1);
        warung1.addKumpMenu(menu1);
        Person p1= new Person ("Salim",2);
        p1.addPesanMakan(M3);
        Person p2= new Person ("Tedy",1);
        p2.addPesanMakan(M2);
        Person p3= new Person ("Fauzan",2);
        p3.addPesanMakan(M1);
        p3.addPesanMakan(M3);
        Group G1 = new Group("Yolo",5);
        G1.addAnggota(p3);
        G1.addAnggota(p2);
        G1.addAnggota(p1);
        G1.setTempat(warung1);
        int i=1;
        int j;
        System.out.println("Warung : "+G1.getTempat().getNamaTempat());
        System.out.println("Menu : ");
        while (i<=G1.getNAnggota()){
            System.out.println(i+". "+G1.getAnggota(i-1).getNama());
            j=1;
            while (j<=G1.getAnggota(i-1).getNPesan()){
                System.out.println("    "+G1.getAnggota(i-1).getPesan(j-1).getNamaMakanan()+"  ;Harga : Rp "+G1.getAnggota(i-1).getPesan(j-1).getHarga()+"  ;Pajak : Rp "+G1.getAnggota(i-1).getPesan(j-1).getPajak());
                j++;
            }
            i++;
        }
        System.out.println("Total yang harus dibayar : Rp "+G1.getTotalHarga());
        System.out.println();
        G1.getAnggota(0).removePesanMakan(0);
        i=1;
        while (i<=G1.getNAnggota()){
            System.out.println(i+". "+G1.getAnggota(i-1).getNama());
            j=1;
            while (j<=G1.getAnggota(i-1).getNPesan()){
                System.out.println("    "+G1.getAnggota(i-1).getPesan(j-1).getNamaMakanan()+"  ;Harga : Rp "+G1.getAnggota(i-1).getPesan(j-1).getHarga()+"  ;Pajak : Rp "+G1.getAnggota(i-1).getPesan(j-1).getPajak());
                j++;
            }
            i++;
        }
        System.out.println("Total yang harus dibayar : Rp "+G1.getTotalHarga());
        //System.out.println(""+G1.getTempat().getKumpMenu(0).getMakanan(1).getUlasan());
        
        System.out.println(""+G1.getTempat().getKumpMenu(4).getMakanan(1).getUlasan());
        
    }
    
}
