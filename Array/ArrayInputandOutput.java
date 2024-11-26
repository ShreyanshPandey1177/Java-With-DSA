import java.util.*;
public class ArrayInputandOutput {
    public static void main(String args[]){
        int marks[] =new int[100];

        Scanner sc = new Scanner(System.in);
        //int phy;
        //phy = sc.nextint();

        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//che
        marks[2]=sc.nextInt();//maths

        System.out.println("Physics :" + marks[0]);
        System.out.println("Chemistry :" + marks[1]);
        System.out.println("maths :" + marks[2]);

        marks[2]=marks[2]+1 ;
        System.out.println("maths :" + marks[2]);


        int percentage =(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage ="+ "%");
    }
    
}

    