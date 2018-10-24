
package pbo3.pkg10117110.latihan55.handphone;


public class Handphone {
    protected String manufacture,operatingSystem,model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
        
    }
    
    public void displayProduct(){
        
        Android obj = new Android("Samsung","Android","Grand",3000000);
        System.out.println("Manufaktur : "+obj.manufacture);
        System.out.println("Os : "+obj.operatingSystem);
        System.out.println("Model : "+obj.model);
        System.out.println("Harga : "+obj.harga);
        obj.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store : "+obj.getKeyStore());
        
        System.out.println("");
        
        BlackBerry obj1 = new BlackBerry("blackB","RIM","Cruve",2000000);
        System.out.println("Manufaktur : "+obj1.manufacture);
        System.out.println("Os : "+obj1.operatingSystem);
        System.out.println("Model : "+obj1.model);
        System.out.println("Harga : "+obj1.harga);
        obj1.setPinBB("BHS249");
        System.out.println("Android Key Store : "+obj1.getPinBB());
        
        System.out.println("");
        
        WindowsPhone obj2 = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        System.out.println("Manufaktur : "+obj2.manufacture);
        System.out.println("Os : "+obj2.operatingSystem);
        System.out.println("Model : "+obj2.model);
        System.out.println("Harga : "+obj2.harga);
        obj2.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Android Key Store : "+obj2.getWpKeyStore());
        
        
        
        
        
    }
    
}
