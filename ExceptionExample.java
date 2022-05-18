package OOPS;

public class ExceptionExample {
    public static void main(String[] args) {

        try {
            int data =123/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);

        }
        System.out.println(" code will continue");
    }

}

