

public class ExceptionDemo {
    public static void main(String[] args) {
        try
        {
            int a[] = new int[6];
            a[6] = 8;
            int i =7;
            int k =2;
            int j = i/k;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e) //exception ""if any exception occures""  or we can write Arithmeticaxp singlly
        {
            System.out.println("errorfckib");
            // System.err.println("errorfckib");  //redcolour
        }
        // we can have multiple catches
        finally{
            System.out.println("bye");  // in both conditions whether were getting the exception or not well exceute the finaly block
        }
    }
}
