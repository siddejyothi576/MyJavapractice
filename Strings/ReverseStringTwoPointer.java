//Given an array of integers nums and a target value target, return the indices of the two numbers such that they add up to the target
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReverseStringTwoPointer {

    public static void main() {

        String s="hello";


        String reverse =ReverseStringTwoPointer.reverseString(s);

        System.out.println(reverse);

    }

    static String reverseString(String s){

        char[] charArray =s.toCharArray();
        int left=0;
        int right =s.length-1;
        while(left<right){
            char temp =charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;

            left++;
            right--;

        }
        return new String(charArray);

    }
}
