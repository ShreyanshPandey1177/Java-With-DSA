 public class HollowRectangle{
    
    public static void HollowRectangle(int totRows ,int totCols){
        //outer loop;
        for(int i =1; i<totRows; i++){
            // inner - columns
            for(int j= 1; j<totCols; j++){
           // cell-(i,j)
           if (i==1 || i== totRows || j==1|| j==totCols) {
            //boundary cells
            System.out.println("*");
           }
           else{
            System.out.println(" ");
           }
            }
        }
        System.out.println();
    }
    
    public static void main (String args[]){
        HollowRectangle(4,5);
    }
 }