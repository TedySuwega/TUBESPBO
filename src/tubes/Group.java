
package tubes;
import java.io.EOFException;

public class Group {
    private String Nama_group;
    private Person [] Anggota;
    private int nAnggota;
    private int maxAnggota;
    static double Total_harga;
    private TempatMakan Tempat;
    
    public Group (String nama, int x){
        this.Nama_group=nama;
        this.maxAnggota=x;
        Anggota = new Person[x];
    }
    
    public void setNamaGroup (String nama){
        this.Nama_group=nama;
    }
    
    public void addAnggota (Person A){
        if (nAnggota<maxAnggota){
            Anggota[nAnggota]=A;
            nAnggota++;
            this.Total_harga = Total_harga + A.getJmlBayar();
        }
    }
    
    public void setTempat (TempatMakan T){
        this.Tempat=T;
    }
    
    public String getNamaGroup (){
        return Nama_group;
    }
    
    public Person getAnggota (int id) throws Exception{
        try{
            if (id>=0 && id<nAnggota){
            return Anggota[id];
        } else {
            return null;
        }
    }catch(Exception e){
        System.out.println(" Terjadi Kesalahan ");
    }return Anggota[id];
    }
    
    public double getTotalHarga (){
        return Total_harga;
    }
    
    public TempatMakan getTempat (){
        return Tempat;
    }
    
    public int getNAnggota(){
        return nAnggota;
    }
    
    public int getMaxAnggota(){
        return maxAnggota;
    }
}
