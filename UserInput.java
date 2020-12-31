import java.io.BufferedReader;

import java.io.InputStreamReader;
public class UserInput {
    public static void main(String[] args) {
        int n= 0;
        System.out.println("Enter a number");

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            
            n = Integer.parseInt(br.readLine());

        }
        System.out.println(n);
    }
}
