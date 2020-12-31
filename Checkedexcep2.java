import java.io.BufferedReader;
import java.io.InputStreamReader;

// import jdk.internal.org.jline.utils.InputStreamReader;

public class Checkedexcep2 {
    public static void main(String[] args) {
        int n =0;
        System.out.println("entert a number");
        BufferedReader br =null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(n);
    }
}
