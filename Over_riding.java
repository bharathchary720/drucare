package OOPS;


class P {
    public void m1(){
        System.out.println("this is  m1 method");
    }
    public void m2(){
        System.out.println(" this is method m2 in class P");
    }

}
class  Q extends P{
    public void m2(){
        System.out.println(" this is method m2 in class Q");
    }
}

public class Over_riding {
    public static void main(String[] args) {
        Q q=new Q();
        q.m2();

        P p=new P ();
        p.m2();

        P p1=new Q();   // based on run time
        p1.m2();

    }


}
