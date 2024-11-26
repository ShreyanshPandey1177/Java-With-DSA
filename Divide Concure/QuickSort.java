
public class QuickSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void QuickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        //last elemnt
        int pIdx = partition(arr, si, ei);
        QuickSort(arr, si, pIdx - 1); //left part
        QuickSort(arr, pIdx + 1, ei); //right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; //to make place for smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;

        //swap
        int temp = pivot;
        arr[ei] = arr[i]; //pivot =arr[i] nhi likhana 
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        QuickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
