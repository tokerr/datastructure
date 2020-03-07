package com.nyt.ds.binarysearch;

public class LessThenOrEqualBinarySearch {


    /**
     * 查找最后一个小于等于给定值的元素的位置
     *
     * 如： 3，4，5，6，6，6，7，8，9  ，最后一个小于等于 元素7的 元素是7，应返回下标为6。
     *
     * @param arr
     * @param value
     * @return
     */
    public static int search(int[] arr,int value){

        if (arr ==null) return  -1;

        int low =0;

        int hight= arr.length-1;

        while (low <= hight){
            int mid = low + (hight -low) /2 ;
            if ( arr[mid] >value){

                hight = mid -1;
            }else {
                if( mid == arr.length-1 || arr[mid+1] >value) return mid;
                else low = mid +1;
            }
        }


        return -1;
    }


    public static void main(String[] args) {
        int[] test=new int[]{3,4,5,6,6,6,8,9};
//        int[] test=new int[]{3,4,5,6,6,6,7,8,9};

        System.out.println(search(test,7));
        System.out.println(search(test,6));
    }
}
