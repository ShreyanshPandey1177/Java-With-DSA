
public class BinaryStringProblem {

    public static void PrintBinaryString(int n, int lastPlace, String str) {

        //base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // //kaam
        // if(lastPlace==0){
        //     //sit o on chair n
        //     PrintBinaryString(n-1, lastPlace, str.append("0"));
        //     PrintBinaryString(n-1, 1, str.append("1"));
        // }
        // else{
        //     PrintBinaryString(n-1, 0, str.append("0"));
        // }

        //kaam
        PrintBinaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            PrintBinaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        PrintBinaryString(3, 0, "");
    }
}
