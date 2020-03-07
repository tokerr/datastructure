package com.nyt.ds.binarysearch;

public class LastAppearedBinarySearch {


    /**
     * 查找给定值最后一次出现的位置
     *
     * @return 位置的下标
     */
    public static int search(int[] arr ,int value){
        if (arr==null) return  -1;

        int low = 0;
        int hight= arr.length-1;

        while (low<=hight){
            int mid = low + (hight - low) / 2;
            if (arr[mid]>value){
                hight = mid -1;
            }else if(arr[mid] <value){
                low = mid +1;
            }else {
                if(mid == arr.length-1 || ( arr[ mid+1 ] != value)) return mid;
                else low = mid + 1;

            }

        }
        return -1;
    }


    public static void main(String[] args) {

        int[] test= new int[]{2,5,7,9,10,14,15,15,15,16};

        System.out.println(search(test,15));


    }
}
