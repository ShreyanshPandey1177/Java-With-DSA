import java.util.Scanner;

public class StringsBasics{

    public static void printletters(String str ){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str2= new String("xyz@1001");

        // //Strings are Immutable 
        // Scanner sc=new Scanner(System.in);
        // String name;
        // name= sc.nextLine();
        // System.out.println(name);   


        // String fulName="Tony stark";
        // System.out.println(fulName.length());

        //Concatination
        String firstName="shraddha";
        String lastName="khappara";
        String fullName=firstName+" "+lastName;
        // System.out.println(fullName.charAt(1));  //string charat method 
        printletters(fullName);
    }
}