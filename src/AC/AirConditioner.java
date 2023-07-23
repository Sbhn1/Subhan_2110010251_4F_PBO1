package AC;


public class AirConditioner {
    //atribut dan encapsulation
    private String split;
    private String harga;
    
    //contructor
    public AirConditioner(String split, String harga){
        this.split = split;
        this.harga = harga;
    }
    //mutator(setter)

    public void setSplit(String split) {
        this.split = split;
    }

    public void setRilis(String harga) {
        this.harga = harga;
    }
    
    //accessor(getter)

    public String getSplit() {
        return split;
    }

    public String getHarga() {
        return harga;
    }
    
    public String displayInfo(){
        return "Split: "+ getSplit()+"\nHarga: "+ getHarga();
    }
    //polymorphism(overloading)
   public String displayInfo(String refrigent){
       return displayInfo() +"\nRefrigent: "+ refrigent;
   }   
}
