package OOPS3;

import java.util.ArrayList;

public class Store implements Proto2 {

    @Override
    public ArrayList<Integer> records(int n1, int n2) {

        ArrayList <Integer> arr = new ArrayList<>();

          arr.add(n1);
           arr.add(n2);

           return arr;

    }

    public static int addelem(ArrayList <Integer> arr){

        int res  = arr.get(0)+ arr.get(1);
        return res;
    }


}
