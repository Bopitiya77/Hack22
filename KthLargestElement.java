import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int arr[] = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = sc.nextInt();
        }
        int kthLargest = sc.nextInt();
        KthLargestElement kthlargestelementobj = new KthLargestElement();
        kthlargestelementobj.sort(arr, arrayLength);
        System.out.println("The " + kthLargest + " largest number in the array is " + arr[kthLargest - 1]);
    }

    void sort(int arr[], int arrayLength) {
        for (int i = 1; i < arrayLength; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
