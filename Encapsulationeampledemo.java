package OOPS;

class  Registrations {
    private int ID;
    private String name ;
    private  double contact ;
    public void setA(int ID,String name,double contact){
        this.ID=ID;
        this.name=name;
        this.contact=contact;
    }
    public int getID(){
        return ID;
    }public String getname(){
        return name;}
    public double getContact(){
        return contact;}
}


public class Encapsulationeampledemo {
    public static void main(String[] args) {
        Registrations r=new Registrations();
        r.setA(1,"bharath",123456);
        System.out.println(r.getID());
        System.out.println(r.getname());
        System.out.println(r.getContact());
    }

}



