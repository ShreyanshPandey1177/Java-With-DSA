public class HollowRhombus {

public static void HollowRhombus(int n){
    for(int i= 1;i<=n;i++){
        //spaces
        for(int j=1;j<(n-1);j++){
            System.out.print(" ");
        }
        //hollow rectangle;
        for(int j=1; j<=n;j++){
             if(i==1|| i==n|| j==1||j==n){
                System.out.print("*");
             } 
             else{
                System.out.print(" ");
             }
        }
        System.out.println();
    }
}
    public static void main(String args[]) {
        HollowRhombus(7);
    }
}