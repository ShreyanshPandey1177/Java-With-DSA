public class ButterflyPattern {

    public static void ButterflyPattern(int n){
        //1st half outer;
        for(int i =1; i<=n; i++){
           //Stars = i 
           for(int j=1; j<=i; j++){
            System.out.print("*");
           }
           
           //spaces= 2*(n-1)
           for(int j=1; j<= 2*(n-1); j++){
            System.out.print(" ");
           }


           //stars=i
           for(int j=1; j<=i; j++){
            System.out.print("*");
           }
           System.err.println();
        }
        //2nd half;
        for(int i=n; i>=1; i--){
          //Stars = i 
           for(int j=1; j<=i; j++){
            System.out.print("*");
           }
           
           //spaces= 2*(n-1)
           for(int j=1; j<= 2*(n-1); j++){
            System.out.print(" ");
           }


          //stars=i
           for(int j=1; j<=i; j++){
            System.out.print("*");
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        ButterflyPattern(5);
    }
}
