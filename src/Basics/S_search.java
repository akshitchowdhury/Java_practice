package Basics;

public class S_search {

    public static void main(String[] args) {

        String target = "kiwi";
        String [] arr = {"apple", "banana", "cherry", "date", "grape", "kiwi", "orange", "papaya"};

        System.out.println(search(target,arr));

    }


    static int search(String target, String[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            int compare =target.compareTo(arr[mid]);



                if(compare == 0){
                    return mid;
                }

                if(compare>0){
                    start = mid+1;
                }

                else {
                    end = mid-1;
                }

            }


        return -1;
    }
}
