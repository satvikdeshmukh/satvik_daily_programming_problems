// Program to rotate array elements by Kth position left
public class RotateArrayLeftByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        int k = 2; 
        int n = arr.length;
        
        System.out.println("Original Array:");
        printArray(arr);
        
        rotateLeftByK(arr, n, k);
        
        System.out.println("\nArray after rotating left by " + k + " positions:");
        printArray(arr);
    }
    
   
    public static void rotateLeftByK(int[] arr, int n, int k) {
        k = k % n; 
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
    
   
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
   
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
