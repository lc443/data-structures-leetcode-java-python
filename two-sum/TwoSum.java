import java.util.HashMap;
import java.util.Map;

/* Given a target, we need to find two elements in an array nums such that when we aadd them together,
 the result is equal to target and return their indices 

 https://www.callicoder.com/two-sum-problem/

 */


public class TwoSum {
    //Naive approach: Use two for loops

    /* Not Very Effiecient since we have to iterate through the array twice: O(n^2)
         one with i and one over with j = i + 1
         */
    public int[] twoSumBruteForce(int[] nums, int target) {
    
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    /*

You can use a HashMap to solve the problem in O(n) time complexity. Here are the steps:

Initialize an empty HashMap.
Iterate over the elements of the array.
For every element in the array -
If the element exists in the Map, then check if it’s complement (target - element) also exists in the Map or not. 
    If the complement exists then return the indices of the current element and the complement.
Otherwise, put the element in the Map, and move to the next iteration.
Time complexity: O(n)
    */

    public int[] twoSum(int[] nums, int target) {
        // STEPS: create an empty map
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            //Iterate through the array and see if the map has the value wthat equals the target - an element in the array
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                // If so, get the index from the map using the value complement and return it, as well as the element
                return new int[] {map.get(complement), i};
            } else {
            // If the map does not, put the value to the map, and the index
                map.put(nums[i], i);
            }
            
            }
         return nums;
    }




    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] bruteForceresult = twoSum.twoSumBruteForce(nums, target);
        System.out.println("BRUTE FORCE SOLUTION O(n^2)");
        System.out.println("[" + bruteForceresult[0] + " ," + bruteForceresult[1] + "]");

        System.out.println("====================================");

        System.out.println("HASHMAP SOLUTION O(n)");
        int[] hasMapresult = twoSum.twoSumBruteForce(nums, target);
        System.out.println("[" + hasMapresult[0] + " ," + hasMapresult[1] + "]");

    }
}
