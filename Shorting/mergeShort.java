import java.util.*;

class mergeShort {

    public static void mergeshorting(int arr[], int si, int ei) {
        if (si >= ei) {
            // base case
            return;
        }
        int mid = (si + ei) / 2;

        mergeshorting(arr, si, mid);
        mergeshorting(arr, mid + 1, ei);

        mergeIt(arr, si, ei, mid);
    }

    public static void mergeIt(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int c = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[c] = arr[i];
                c++;
                i++;

            } else {
                temp[c] = arr[j];
                c++;
                j++;

            }
        }

        while (i <= mid) {
            temp[c] = arr[i];
            c++;
            i++;
        }
        i = si;
        for (int k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArray(int arr[], String msg) {
        System.out.println(msg);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Changed to print on the same line
        }
        System.out.println(); // Add a new line after printing the array
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        printArray(arr, "Before ");
        mergeshorting(arr, 0, arr.length - 1);
        printArray(arr, "After");
    }
}
