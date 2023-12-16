package AList_problems;

import java.util.ArrayList;
import java.util.List;

public class E3 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(24);
        nums.add(20);
        nums.add(14);
        nums.add(54);
        nums.add(200);

        System.out.println(nums);
        System.out.println(nums.get(nums.size()-1));

    }
}
