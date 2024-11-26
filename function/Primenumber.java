/*public class Primenumber {

    public static boolean isPrime (int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){  // completely dividing
                isPrime =false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        System.out.println(isPrime(12));
    }
    
}    */



/* // optimized code for prime ;
public class Primenumber {
    public static boolean isprime(int n){

        if(n%2==0){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String args[]){
        System.out.println(isprime(2));
    }

}  */
// prime no of 1 to n;
   public class Primenumber {
   
    public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){ // TRUE
                System.out.println(i+ " ");
            }
        }
        System.out.println();
       }
    
       public static void main(String args[]){
        primesInRange(20);   // 2 TO 20
       }
    
   } 
   
   
    
   






    