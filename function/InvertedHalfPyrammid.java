public class InvertedHalfPyrammid {

    public static void InvertedHalfPyrammid(int n){
//outer;
    for( int i =1; i<=n; i++){
        //spaces;
        for(int j=1; j<=n-1; j++){
            System.out.println(" ");
        }
        //stars
        for(int j= 1; j<=1;j++){
            System.out.println("*");
        }


    }
}    
    public static void main (String args[]){
       InvertedHalfPyrammid(7);
}
}   