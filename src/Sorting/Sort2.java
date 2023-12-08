package Sorting;

import java.util.Arrays;

public class Sort2 {
    //sort a list of numbers in ascending order

    public static void main(String[] args) {

        int arr[] = {3,54,1220,45,2,10,809};
        System.out.println(Arrays.toString(sorter(arr)));

    }


    static int[] sorter(int[] arr){

        for(int i =0; i<arr.length-1;i++){
            int Ix = i;

            for(int j= i+1; j<arr.length;j++){

                if(arr[j]<arr[Ix]){
                    Ix=j;
                }
            }

            int temp = arr[Ix];
            arr[Ix] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
