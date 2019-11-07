package pbo1.pkg10118033.latihan51;

public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int kehadiran){
        return tunjanganKehadiran = kehadiran*10000;
    }
    
    public float tunjanganJabatan(String jabatan){
        if(jabatan.equalsIgnoreCase("Manager")){
            tunjanganJabatan = 2000000;
        } else if(jabatan.equalsIgnoreCase("Kabag")){
            tunjanganJabatan = 1000000;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        switch(golongan){
            case 1 :
                tunjanganGolongan = 500000;
                break;
            
            case 2 :
                tunjanganGolongan = 1000000;
                break;
                
            case 3 :
                tunjanganGolongan = 1500000;
                break;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
    
}