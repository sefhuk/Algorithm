import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        
        List<Integer> nums = Arrays.asList(s.split(" ")).stream()
            .map(num -> Integer.parseInt(num))
            .sorted()
            .collect(Collectors.toList());
        
        return Collections.min(nums) + " " + Collections.max(nums);
    }
}