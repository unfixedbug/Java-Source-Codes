import java.io.BufferedReader;
import java.io.*;
// import jdk.internal.org.jline.utils.InputStreamReader;

public class CheckedExp {
    public static void main(String[] args) throws Exception
    {

        System.out.println("enter a number");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //45

        System.out.println(n);


        // or we can have this checked_exception2



    }
}
