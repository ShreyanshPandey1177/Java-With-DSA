import java.util.*;
public class syntaxwithparameter2 {
    public static void printhelloworld(){
            System.out.println("helloworld");
            System.out.println("hello world");
            System.out.println("hello world");
            //return 3;
        }

        public static int calculatesum(int a, int b){ //parameters or formal parameter//
            int sum =a+b;
            return sum;
    } 
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            int b=sc.nextInt();
            int sum =calculatesum(a, b);  // arguements or actual parameter//
            System.out.println("sum is : " +sum);
    }
}    

