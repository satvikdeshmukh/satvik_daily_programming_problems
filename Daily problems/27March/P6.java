// program to print unique number in an array
import java.util.*;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 8, 9}; 
        System.out.println("Original Array:");
        printArray(arr);
        
        System.out.println("\nUnique Numbers:");
        printUniqueNumbers(arr);
    }
    
    
    public static void printUniqueNumbers(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
    
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
