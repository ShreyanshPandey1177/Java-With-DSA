public class NumberPyrammid {

    public static void NumberPyrammid (int n){
        //ouer loop;
        for (int i=1; i<=n;i++){
            //spaces;
            for(int j=1;j<+n-i; j++){
                System.out.print(" ");
            }
            //number;
            for(int j=1;j<=i; j++){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        NumberPyrammid(5);
    }
}