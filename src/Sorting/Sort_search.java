package Sorting;

public class Sort_search {
    public static void main(String[] args) {

        int arr[] = {12,54,1,245,76,89,66,35};
        //sort and search for elemnt 76 and return index of searched element if found

        int neo[]=sorter(arr);

        System.out.println(search(245, neo));

    }

    static int search(int target, int[] arr){

        int start =0 ;
        int end = arr.length-1;

        while(start<=end){

            int mid = start+ (end-start)/2;


             if(target>arr[mid]){

                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }


    static int[] sorter(int arr[]){


        for(int i=0; i<arr.length-1; i++){

            int Ix = i;
            for(int j= i+1; j<arr.length;j++){

                if(arr[j]< arr[Ix]){

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
