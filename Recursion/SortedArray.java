
public class SortedArray {

    public static boolean isSorted(int arr[], int i) {

        if (i == arr.length - 1) {      //base case
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(isSorted(arr, 0));
    }
}
