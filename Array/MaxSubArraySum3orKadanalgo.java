import java.util.*;
public class MaxSubArraySum3orKadanalgo {

    //kadans algo;


    public static void kadanes(int numbers[]){
        int maxSum=Integer.MIN_VALUE;
        int CurrSum=0;
        for(int i=0;i<numbers.length;i++){
            CurrSum =CurrSum+numbers[i];
            if(CurrSum<0){
                CurrSum=0;
            }
            maxSum=Math.max(CurrSum,maxSum);
        }
        System.out.println(("our max  subarray is :" +maxSum));
    }


    public static void main(String  args[]){
       int numbers[]={-2,-3,-4,-1,-2,1,5,-3} ;
       kadanes(numbers);

    }
}