import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Test1pt2 {
    
    
    private static int[] findSum(int[] nums, int target) {
    
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
        
            int complement = target - nums[i];
            
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } 
            
            else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }


public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
        }
        
        int target = keyboard.nextInt();

        keyboard.close();

        int[] indices = findSum(nums, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } 
        else {
            System.out.println("no solution");
        }
    }
}