//Given an array of integers nums and a target value target, return the indices of the two numbers such that they add up to the target
//brute force and hash map way

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TargetIndicesArray{
    public static void main() {

int[] nums ={1,2,3,2};
int target =4;

int[] indices =TargetIndicesArray.usingHashMap(nums,target);

Arrays.stream(indices).asLongStream().forEach(System.out::println);

        }

        static int[] calculate(int[] nums,int target){
            for(int i = 0; i < nums.length; i++){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        return new int[]{i, j};
                    }
                }
            }

            return new int[]{};
        }

    static int[] usingHashMap(int[] nums,int target){

        Map<Integer,Integer> indicesMap =new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int compliment =target-nums[i];
            if(indicesMap.containsKey(compliment)){
                return new int[]{indicesMap.get(compliment),i};
            }
            indicesMap.put(nums[i],i);
        }

        return new int[]{};
    }
    }


