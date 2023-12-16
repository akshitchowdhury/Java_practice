package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List <Integer> items = new ArrayList<>();

        items.add(10);
        items.add(12);
        items.add(24);

        int i = 0;
        int sum = 0;
        while(i< items.size()){


//            System.out.println(items.get(i));
            int temp = items.get(i);

            sum = temp+ sum;
            i++;
        }

        System.out.println(sum);

    }
}
