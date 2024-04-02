// Program to rotate array elements left by 1 position
public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        int n = arr.length;
        
        System.out.println("Original Array:");
        printArray(arr);
        
        rotateLeft(arr, n);
        
        System.out.println("\nArray after rotating left by one position:");
        printArray(arr);
    }
        public static void rotateLeft(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
