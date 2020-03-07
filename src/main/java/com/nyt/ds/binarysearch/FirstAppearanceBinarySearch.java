package com.nyt.ds.binarysearch;

public class FirstAppearanceBinarySearch {


    /**
     * 查找给定值在数组中第一次出现的位置
     *
     * @return 所求下标
     */
    public static int search(int[] arr, int value){

        if (arr==null) return -1;
        int low=0;
        int hight =arr.length -1;

        while (low <= hight){

            int mid=low + (hight - low ) / 2;

            if (arr[mid] >value){
                hight = mid -1;
            } else if(arr[mid] < value){
                low = mid + 1;
            }else {
                if(mid == 0 || arr[mid -1] != value) return  mid;
                else hight = mid -1;
            }
        }


        return  -1;
    }


    public static void main(String[] args) {
        int[] test = new int[]{3,5,5,6,7,8,8,8,8,8,9,12,13,15,18,19,20,25,27};
        System.out.println(search(test,8));
    }
}
