
package tubes;
import java.io.EOFException;

public class MenuMakanan {
    private String Nama_menu;
    private Makanan [] Menu;
    private int nMenu=0;
    private int maxMenu;
    
    public MenuMakanan (String nama, int x){
        this.Nama_menu =  nama;
        this.maxMenu = x;
        Menu = new Makanan [x];
    }
    
    public void setNamaMenu (String nama){
        this.Nama_menu = nama;
    }
    
    public void addMenu (Makanan M){
        if (nMenu<maxMenu){
            Menu[nMenu] = M;
            nMenu++;
        }
    }
    
    public void removeMenu (int id) throws Exception{
        try{
            //if (id>=0 && id<nMenu){
            do{
                if(Menu[id+1]!=null){
                    Menu[id]=Menu[id+1];
                    id++;
                }
                Menu[id]=null;
            }while(Menu[id]!=null);
            nMenu--;
        //}
        }catch(Exception e){
            System.out.println(" Terjadi Kesalahan ");
        }
    }
    
    public void setNMenu (int a) throws Exception{
        try{
            this.nMenu = a;
        }catch(Exception e){
            System.out.println(" Terjadi Kesalahan ");
        }
    }
    
    public void setMaxMenu (int a) throws Exception{
        try{
            this.maxMenu = a;
        }catch(Exception e){
            System.out.println(" Terjadi Kesalahan ");
        }
    }
    
    public String getNamaMenu (){
        return Nama_menu;
    }
    
    public Makanan getMakanan (int id) throws Exception{
        try{
            if (id>=0 && id<nMenu){
            return Menu[id];
        } else {
            return null;
        }
        }catch(Exception e){
            System.out.println(" Terjadi Kesalahan ");
        }return Menu[id];
    }
    public int getNMenu (){
        return nMenu;
    }
    
    public int getMaxMenu (){
        return maxMenu;
    }
}
