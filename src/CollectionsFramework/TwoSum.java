package CollectionsFramework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 7, 11, 16, 6));
        int target = 13;
//        for(int i = 0; i < nums.length-1; i++){
//            for(int j = i + 1; j < nums.length; j++){
//                if(nums[i] + nums[j] == target)
//                    map.put(i, j);
//            }
//        }

        for(int num : nums){
            if(nums.contains(target - num)){
                if(!((map.containsKey(nums.indexOf(num)) && map.containsValue(nums.indexOf(target-num))) || (map.containsKey(nums.indexOf(target-num)) && map.containsValue(nums.indexOf(num)))))
                    map.put(nums.indexOf(num), nums.indexOf(target - num));
            }
        }
        System.out.println(map);
    }
}
