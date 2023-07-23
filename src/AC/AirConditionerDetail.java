package AC;

//inheritance
public class AirConditionerDetail extends AirConditioner {
//overriding
    public AirConditionerDetail(String split, String berdiri) {
        super(split, berdiri);
    }
    public int getTahunBerdiri(){
        return Integer.parseInt(getHarga().substring(0, 2)) + 1909;
    }
    public String getGantiNama(){
        String kodeGan = getHarga().substring(2, 6);
        //seleksi if
        if(kodeGan.equals("1963")){
         return "Ganti Nama Perusahaan";   
        } else {
            return "Merk Lain";
        }
    }
    
    public String getMasukIndonesia(){
        String kodeMasuk = getHarga().substring(6, 10);
        //seleksi switch
        switch(kodeMasuk){
            case "2012" :
                return "Daikin Biasa";
            case "2013" :
                return "Daikin Inverter";
            default:
                return "Merk Lain";
        }
    }
    public int getPenjualan(){
        return Integer.parseInt(getHarga().substring(10));
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahunBerdiri: "+getTahunBerdiri()+
                "\nGantiNama: " +getGantiNama()+
                "\nnMasukIndonesia: "+getMasukIndonesia()+
                "\nPenjualan:"+getPenjualan();
    }
}
