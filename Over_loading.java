package OOPS;

public class Over_loading {
    public void m1()
    {
        System.out.println(" this is m1 method: null type ");
    }
     public void m1 ( int i)
     {
         System.out.println(" this is m1 method: int type ");
     }
     public void m1(double d)
        {
        System.out.println(" this is m1 method : double type ");
    }
    public void m1( float f){
        System.out.println(" this is m1 method : float type");
    }
    public void m1(String s) {
        System.out.println(" this is m1 method :  string type");
    } public void m1( int i , String s){
        System.out.println(" this is m1 method: int and string ");
    } public void m1 (int i, float f) {
        System.out.println( " this is m1 method : int  and float ");
    }
    public static void main(String[] args) {
         Over_loading o=new Over_loading();
         o.m1();
         o.m1(1);
         o.m1(1.5);
         o.m1(1.7f);
         o.m1( 'a');   // char --> int // automatic promotion ( 1 )
         o.m1( 10l);   // long --> float
        o. m1("s");
        o.m1( 1,"s");
        o.m1( 1,1f);


    }



}
