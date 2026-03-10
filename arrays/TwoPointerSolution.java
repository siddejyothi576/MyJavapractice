//Given an array of integers nums and a target value target, return the indices of the two numbers such that they add up to the target
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoPointerSolution1 {

    public static void main() {

        int[] nums ={1,2,3,4};
        int target =4;

        int[] indices =TwoPointerSolution1.twoPointerSolution(nums,target);

        Arrays.stream(indices).asLongStream().forEach(System.out::println);

    }

    static int[] twoPointerSolution(int[] nums,int target){
        int left =nums[0];
        int right =nums.length-1;

        for(int i=0;i<nums.length;i++){
            int sum=left+right;

            if(sum == target)
                return new int[]{left,right};
            if(sum <target)
                left++;
            else
                right--;

        }

        return new int[]{};
    }
}
