public class LinearSearch {
    // Method to perform linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = { 10, 23, 45, 70, 11, 15 };
        int key = 70;

        int result = linearSearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
