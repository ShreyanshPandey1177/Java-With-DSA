import java.util.Scanner;

public class Displaynobyuserexpectmultipleoften {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
           System.out.println("Enter your no : ");
            int n = sc.nextInt();
            if (n%10 ==0) {
                continue;                
            }
            System.out.println("number was : " +n);
        }     while (true) ;
    
        

    }
}