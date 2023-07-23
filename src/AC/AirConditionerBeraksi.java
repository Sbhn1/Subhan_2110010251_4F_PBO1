package AC;

import java.util.Scanner;

public class AirConditionerBeraksi {
    public static void main(String[] args) {
        //objek
        //AirConditioner ac = new AirConditioner("AC Daikin Inverter","191963201299");
        
        //System.out.println(ac.displayInfo());
        //System.out.println(ac.displayInfo("R32"));
        
        //error handling
        try{
        //io sederhana 
        Scanner scanner = new Scanner(System.in);
        
        //array
        AirConditionerDetail[] AC = new AirConditionerDetail[2];
        
        //perulangan
        for(int i=0; i<AC.length; i++){
        System.out.print("Masukkan Nama AC"+(i+1)+": ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Harga AC"+(i+1)+": ");
        String harga = scanner.nextLine(); 
        
        //objek
        AC[i] = new AirConditionerDetail(nama, harga);
        }
        
        //perulangan
        for(AirConditionerDetail data: AC){
            System.out.println("******************");
            System.out.println("Data AC");
            System.out.println(data.displayInfo());
                }
            } catch(NumberFormatException e){
                System.out.println("Kesalahan format nomor: "+e.getMessage());
            } catch(StringIndexOutOfBoundsException e){
                System.out.println("Kesalahan memasukkan harga: "+e.getMessage());   
            }catch(Exception e){
                System.out.println("Kesalahan umum: "+e.getMessage());
            }
        }
    }
