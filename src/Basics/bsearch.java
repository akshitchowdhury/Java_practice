package Basics;

public class bsearch {


    public static int target(int num, int arr[]){


        int start = 0;
        int end = arr.length-1;


        while(start<=end){
            int mid = start+(end-start)/2;

            if(num<arr[mid]){

                end = mid-1;
            }

            else if(num>arr[mid]){
                start= mid+1;
            }

            else{
                return mid;
            }

                    }
        return -1;


    }
    public static void main(String[] args) {

        int num = 569;
        int arr[] = {10,12,35,43,50,100,500,569};

        System.out.println(target(num, arr));

    }
}
