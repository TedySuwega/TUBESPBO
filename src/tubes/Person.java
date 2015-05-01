
package tubes;
import java.io.EOFException;
import static tubes.Group.Total_harga;



public class Person {
    private String Nama;
    private double Jml_bayar;
    private Makanan[] Pesan;
    private int nPesan;
    private int maxPesan;
    private boolean Bayar=false;
    
    public Person (String nama, int x){
        this.Nama = nama;
        this.maxPesan = x;
        Pesan = new Makanan[x];
    }
    
    public void setNama (String nama){    
        this.Nama = nama;    
    }
    public void setJmlBayar (double bayar) throws Exception{
        try{
            this.Jml_bayar = bayar;
        }catch (Exception e){
            System.out.println(" Terjadi Kesalahan ");
        }
    }
    
    public void addPesanMakan (Makanan M){
        if (nPesan<maxPesan){
            Pesan[nPesan]= M;
            nPesan++;
            this.Jml_bayar = Jml_bayar + M.getHarga() + M.getPajak();
        }
    }
    
    public void removePesanMakan (int id) throws Exception{
        try{
            if (id>=0 && id<nPesan){
            Total_harga=Total_harga-Pesan[id].getHarga()-Pesan[id].getPajak();
            do{
                if(Pesan[id+1]!=null){
                    Pesan[id]=Pesan[id+1];
                    id++;
                }
                Pesan[id]=null;
            }while(Pesan[id]!=null);
            nPesan--;
        }
    }catch(Exception e){
        System.out.println(" Terjadi Kesalahan ");
    }
    }
    
    public void setBayar (){
        this.Bayar = true;
    }
    
    public String getNama (){
        return Nama;
    }
    
    public double getJmlBayar(){
        return Jml_bayar;
    }
    
    public Makanan getPesan (int id) throws Exception{
        try{
            if (id>=0 && id<nPesan){
            return Pesan[id];
        } else {
            return null;
        }
    }catch (Exception e){
        System.out.println(" Terjadi Kesalahan ");
    }return Pesan[id];
    }
    
    public int getNPesan (){
        return nPesan;
    }
    
    public int getMaxPesan (){
        return maxPesan;
    }
    
    public boolean getBayar(){
        return Bayar;
    }
}
