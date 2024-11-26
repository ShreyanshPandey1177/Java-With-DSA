import java.util.*;
//Reverse an array;

public class ReverseAnArray {
    public static void ReverseAnArray(int numbers[]){
        int first=0; int last=numbers.length-1;

        while (first<last) {
            //swap
            int temp =numbers[last];
            numbers[last]=numbers[first];
            numbers[first]= temp;
            

            first++;
            last--;

        }
    }
    public static void main(String args[]){
        int numbers[] ={2,4,6,8,10};
        ReverseAnArray(numbers);
//print
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] +" ");
        }
        System.out.println();
    }
    
}
