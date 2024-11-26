import java.util.*;
public class MaxSubArraySum2orPrefixArray {
    public static void MaxSubArray2orPrefixArray(int numbers[]) {
       
        int CurrSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
         
        //call prefix array;

         for(int i=0; i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
         }

        for(int i=0; i<numbers.length;i++){
         int start=numbers[i];

         for(int j=i;j<numbers.length;j++){
            int end =j;
          
            CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
        
            if(maxSum <CurrSum){
               maxSum=CurrSum; 
            }
          }
        }
        System.out.println("MaxSum=" +maxSum);
    }

    public static void main(String args[]) {
        int numbers[]={1,-2,6,-1,3};
        MaxSubArray2orPrefixArray(numbers);
    }
}
