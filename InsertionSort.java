class InsertionSort {
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        // Start from second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Current element to be inserted
            int j = i - 1;     // Index of the last element in sorted portion
            
            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // Insert the key at correct position
            arr[j + 1] = key;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        
        System.out.println("Original array:");
        printArray(arr);
        
        insertionSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
}