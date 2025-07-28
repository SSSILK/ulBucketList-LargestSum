
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jetty.server.RequestLog.Collection;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        
        if ( nums == null || nums.size() < 2){
            return 0;
        }
        Collections.sort(nums);
        int count = 0;
        int largest = nums.get(nums.size()-1);
        for( int num: nums){
            if (num == largest){
                count++;
            }
            
            if (count >= 2){
                return largest * 2;
            }
        }
        for ( int i = nums.size() - 2; i >=0; i--){
            int current = nums.get(i);
            if (current != largest){
                return current + largest;
            }
        }
        
       

        return  0;
    }
}