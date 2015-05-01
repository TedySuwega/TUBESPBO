
package tubes;
import java.io.EOFException;

public class TempatMakan {
    private String Nama_tempat;
    private MenuMakanan [] Kump_menu;
    private int nKump;
    private int maxKump;
    private String Alamat;
    
    public TempatMakan (String nama, int x){
        this.Nama_tempat = nama;
        this.maxKump =x;
        Kump_menu = new MenuMakanan[x];
    }
    
    public void setNamaTempat (String nama){
        this.Nama_tempat = nama;
    }
    
    public void addKumpMenu (MenuMakanan m){
        if (nKump<maxKump){
            Kump_menu[nKump] = m;
            nKump++;
        }
    }
    
    public void removeKumpMenu (int id){
        if (id>=0 && id<nKump){
            do{
                if(Kump_menu[id+1]!=null){
                    Kump_menu[id]=Kump_menu[id+1];
                    id++;
                }
                Kump_menu[id]=null;
            }while(Kump_menu[id]!=null);
            nKump--;
        }
    }
    
    public void setNKump (int a) throws Exception{
        try{
            this.nKump=a;
        }catch (Exception e){
            System.out.println(" Terjadi Kesalahan ");
        }
    }
    
    public void setMaxKump (int a) throws Exception{
        try{
            this.maxKump = a;
        }catch (Exception e){
            System.out.println(" Terjadi Kesalahan ");
        }
    }
    
    public void setAlamat (String alamat){
        this.Alamat = alamat;
    }
    
    public String getNamaTempat (){
        return Nama_tempat;
    }
    
    public MenuMakanan getKumpMenu(int id) throws Exception {
        try{
           // if (id>=0 && id<nKump){
            return Kump_menu[id];
      //  } else {
        //    return null;
        
    }catch (Exception e){
        System.out.println(" Terjadi Kesalahan ");
    }return Kump_menu[id];
    }
    
    public int getNKump () {
        return nKump;
    }
    
    public int getMaxKump (){
        return maxKump;
    }
    
    public String getAlamat (){
        return Alamat;
    }
}
