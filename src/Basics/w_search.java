package Basics;

public class w_search {

    static int wsearch(int target, int [] arr){


        int start = 0;
        int end = arr.length-1;
        while(start<=end){

            int mid = start+ (end-start)/2;

            if(target>arr[mid]){

                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }

            else{
                return mid;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int target = 25;
        int arr[] = {1,15,16,19,20,23,25};
        System.out.println(wsearch(target, arr));


    }
}
