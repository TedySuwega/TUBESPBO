
package tubes;
import java.io.EOFException;

public class Makanan {
    private String Nama_makanan;
    private double Harga;
    private double Pajak;
    private int Rating;
    private String Ulasan;
    
    public Makanan (String Nama, double Harga, double Pajak) {
        this.Nama_makanan = Nama;
        this.Harga = Harga;
        this.Pajak = Pajak;
    }
    
    public void setNamaMakanan (String nama) {
        this.Nama_makanan = nama;
    }
    
    public void setHarga (double harga) throws Exception{
        try{
            this.Harga = harga;
        }catch(Exception e){
            System.out.println(" Terjadi Kesalahan ");
        }
    }
    
    public void setPajak (double pajak) throws Exception{
        try{
            this.Pajak = pajak;
        }catch(Exception e){
            System.out.println(" Terjadi Kesalahan ");
        }
    }
    
    public void setRating (int rating) throws Exception{
        try{
            this.Rating = rating;
        }catch(Exception e){
            System.out.println(" Terjadi Kesalahan ");
        }
    }
    
    public void setUlasan (String ulasan){
        this.Ulasan =ulasan;
    }
    
    public String getNamaMakanan (){
        return Nama_makanan;
    }
    
    public double getHarga(){
        return Harga;
    }
    
    public double getPajak (){
        return Pajak;
    }
    
    public int getRating (){
        return Rating;
    }
    
    public String getUlasan(){
        return Ulasan;
    }
}
