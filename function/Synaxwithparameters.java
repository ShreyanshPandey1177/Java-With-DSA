import java.util.*;

public class Synaxwithparameters{
        public static void printhelloworld(){
            System.out.println("helloworld");
            System.out.println("hello world");
            System.out.println("hello world");
            //return 3;
        }

        public static void calculatesum(){
            Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            int b=sc.nextInt();
            int sum =a+b;
            System.out.println("sum is :" +sum);
    }
    
    public static void main(String args[]){
        calculatesum();
    }
}    