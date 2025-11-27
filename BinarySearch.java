public class BinarySearch {
    // Method to perform binary search
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // middle index

            if (arr[mid] == key) {
                return mid; // key found
            } else if (arr[mid] < key) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        return -1; // key not found
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 }; // sorted array
        int key = 40;

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
