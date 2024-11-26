
public class LastOccurence {

    public static int LastOccurence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = LastOccurence(arr, i + 1, key);
        if (isFound != -1) {
            return isFound;
        }

        //check with your self
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(LastOccurence(arr, 0, 8));
    }
}
