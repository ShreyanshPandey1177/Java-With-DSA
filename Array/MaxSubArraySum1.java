import java.util.*;
public class MaxSubArraySum1 {
    public static void MaxSubArraySum1(int numbers[]) {
        int CurrSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){
         int start=numbers[i];
         for(int j=i;j<numbers.length;j++){
            int end =j;
            CurrSum =0;
            for(int k =start;k<=end;k++){  //print 
                //Subarray sum;
               CurrSum +=numbers[k];
            }
            System.out.println(CurrSum);
            if(maxSum <CurrSum){
               maxSum=CurrSum; 
            }
         }
        }
        System.out.println("total subarrays="+maxSum);
    }

    public static void main(String args[]) {
        int numbers[]={1,-2,6,-1,3};
        MaxSubArraySum1(numbers);
    }
}
