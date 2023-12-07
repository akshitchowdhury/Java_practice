package Basics;

public class anime_search {

    static int a_search(String target, String [] arr){

        int start = 0;
        int end =arr.length-1;

        while(start<=end){

            int mid = (start+(end-start))/2;
            int comparision = target.compareTo(arr[mid]);

            String ix = Integer.toString(mid);


            if (comparision == 0) {
                return mid;
            }

            if (comparision > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }


        return -1;
    }

    public static void main(String[] args) {

        String anime = "AOT";
        String sarr[] = {"AOT", "Boruto","MHA", "Naruto", "One-piece"};

        System.out.println(a_search(anime,sarr));

    }
}
