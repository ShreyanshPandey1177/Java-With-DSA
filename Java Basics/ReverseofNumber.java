import java.util.*;
   public class ReverseofNumber {

public static void main(String args[]){
    int n = 10899;

    while(n>10){
        int lastDigit = n%10;
        System.out.println(lastDigit + " ");
        n = n/10;

    }
    System.out.println();

    }
}