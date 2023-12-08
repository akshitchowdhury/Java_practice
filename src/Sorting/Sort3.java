package Sorting;

import java.util.Arrays;

public class Sort3 {
    public static void main(String[] args) {
        int [] brr = {32,10,42,64,1,908,27,143};
        System.out.println(Arrays.toString(sort3(brr)));

    }

    static int [] sort3(int [] arr){

        for(int i=0; i<arr.length-1; i++){

            int Ix = i;

            for(int j = i+1; j<arr.length; j++){

                if(arr[j]<arr[Ix]){

                    Ix = j;
                }
            }

            int temp = arr[Ix];
            arr[Ix] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
