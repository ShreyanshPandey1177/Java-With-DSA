
public class MergeSort {

    public static void printSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.err.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void MergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //kaam
        int mid = si + (ei - si) / 2;  //(si+ei)/2
        MergeSort(arr, si, ei);   //left Part
        MergeSort(arr, si + 1, ei); //Right Part

        Merge(arr, si, mid, ei);
    }

    public static void Merge(int arr[], int si, int mid, int ei) {
        //left(0,3)=4 right(4,6)=3 ->6-0+1
        int temp[] = new int[ei - si + 1];
        int i = si; //iterator for left part
        int j = mid + 1;  //iterator for right part
        int k = 0;    //iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            temp[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        MergeSort(arr, 0, arr.length - 1);
        printSort(arr);
    }
}
