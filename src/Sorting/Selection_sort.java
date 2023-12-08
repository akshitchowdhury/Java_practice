package Sorting;

import java.util.Arrays;

public class Selection_sort {



static int[] s_sort(int arr[]){


    for(int i=0; i<arr.length-1; i++){

        int mIx = i;
        for(int j =i+1; j<arr.length; j++ ){

            if(arr[j]<arr[mIx]){

                mIx = j;
            }
        }

        int temp = arr[mIx];
        arr[mIx] = arr[i];
        arr[i] = temp;

    }


        return arr;
}
    public static void main(String[] args) {

    int arr[] = {10,7,3,2,6,4};
        System.out.println(Arrays.toString(s_sort(arr)));
    }
}
