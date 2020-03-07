package com.nyt.ds.binarysearch;

public class GreaterOrEqualBinartSearch {


    /**
     * 查找第一个大于等于给定值的元素的下标
     * @param arr
     * @param value
     * @return
     */
    public static int search(int[] arr, int value){
        if (arr == null) return  -1;

        int low =0;
        int hignt = arr.length -1 ;

        while (low <= hignt){

            int mid = low + (hignt -low) /2;

            if( arr[mid] < value){
                low = mid +1;
            }else {
                if(mid == 0 || arr[mid-1] < value) return mid;
                else hignt= mid -1;
            }
        }



        return  -1;
    }


    public static void main(String[] args) {
        int[] test= new int[]{2,3,4,5,6,7,8,9,12,14,23,24,25,26,27};

        System.out.println(search(test,13));
        System.out.println(search(test,14));
    }
}
