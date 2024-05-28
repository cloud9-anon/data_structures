import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];

            int j = i - 1;

            while (j >= 0 && value < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }

    public static int[] mergeSort(int[] arr) {
        int start = 0;
        int end = arr.length;

        if (end - start <= 1) {
            return Arrays.copyOfRange(arr, start, end);
        }

        int mid = (start + end) / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, start, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, end));

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];

            } else {
                arr[k++] = right[j++];

            }

        }

        while (i < left.length) {
            arr[k++] = left[i++];

        }

        while (j < right.length) {
            arr[k++] = right[j++];

        }
        return arr;

    }

    public static Set<String> uniqueEmail(String[] arr) {

        Set<String> uniqueEmails = new HashSet();

        for (String email : arr) {
            String local_name = email.split("@")[0];
            String domain_name = email.split("@")[1];

            String local_rule = local_name.split("\\+")[0].replace(".", "");

            uniqueEmails.add(local_rule + "@" + domain_name);
        }

        return uniqueEmails;
    }

    public static int partition_algorithm(int[] arr, int low, int end) {
        int pivot = arr[low];
        int i = low;

        for (int j = low + 1; j <= end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp2 = arr[i]; // for swapping pivot element at its place ie at i ;
        arr[i] = arr[low];
        arr[low] = temp2;

        return i;
    }

    public static void quickSort(int[] arr, int low, int end) {
        if (low < end) {
            int m = partition_algorithm(arr, low, end);

            quickSort(arr, m + 1, end);
        }
    }

    public static void main(String[] args) throws Exception {

        // TODO:"Sorting"
        int[] array1 = { 4, 42, 21, 12, 97, 32, 1, 2 };
        try {
            quickSort(array1, 0, 7);

            System.out.println(Arrays.toString(array1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }

        // selectionSort(array1);

        // bubbleSort(array1);

        // insertionSort(array1);

        // for (int i : result) {
        // System.out.println(i + " ");
        // }

        // TODO:uniqueEmail;
        // String[] array2 = { "rohan.gajbhare@gmail.com", "anon+cloud@outlook.com" };

        // Set<String> result = uniqueEmail(array2);

        // for (String email : result) {
        // System.out.println(email + " ");
        // }

        // TODO: QuickSort
    }
}
