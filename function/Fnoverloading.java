public class Fnoverloading {
  //  function to cal sum of 2 num ;
  /*  public static int sum(int a,int b){
    return a+b;
}*/

 //fn to cal sum of 3 num;
  public static int sum(int a, int b, int c){
    return a+b+c;
}

//fn to cal int sum;
public static int sum(int a, int b){
    return a+b;
}

//fn to cal float sum;
public static float sum(float a, float b){
    return a+b;
}
    public static void main(String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(5,2,1));
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f,4.8f));
    }
}


