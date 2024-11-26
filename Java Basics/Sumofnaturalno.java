import java.util.Scanner;

public class Sumofnaturalno {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i<= n){
            sum = sum+1;
            i++;
        }
        System.out.println("print sum of n time : " );


    }
}