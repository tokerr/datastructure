package com.nyt.ds.binarysearch;

public class BinarySearch {


    /**
     * 1.注意循环退出条件
     * 2.中间元素的取值，使用位运算
     * 3.区间前后两个元素指针的取值
     *
     * 二分查找的特点：
     * 1.时间复杂度为O(logn)，在数据量大的情况下，查找速度优势非常明显
     *
     *
     * 二分查找的局限性：
     * 1.只能用在顺序表中（也就是数组），如果使用的是链表，查找时间复杂度则上升到O(nlogn)
     * 2.顺序表中的数据必须是有序的。
     * 3.也不能存放太大的数据，底层依赖的是数组结构，需要连续的内存空间。
     */
    public static int commBinarySearch(int[] arr,int value){
        if (arr==null) return -1;

        //初始化指针
        int low=0;
        int hight=arr.length-1;
        int mid;
        while (low<=hight){
            mid=low+((hight-low)/ 2);
            if(arr[mid]==value){
                return mid;
            }else if (value>arr[mid]){
                low=mid+1;
            }else {
                hight=mid-1;
            }
        }
        return -1;//没有找到返回-1
    }



    public static int recursiveBinarySearch(int[] arr ,int value){

        if (arr==null) return -1;

        int low=0;
        int hight=arr.length-1;

        return recursiveBinarySearch(arr, value,low,hight);
    }

    private static int recursiveBinarySearch(int[] arr, int value, int low, int hight){
        if(low>hight) return -1;
        int mid = low + ((hight - low) / 2);
         if(arr[mid]==value){
             return mid;
         }else if (arr[mid]>value){
             return recursiveBinarySearch(arr, value, low, mid -1);
        }else{
             return recursiveBinarySearch(arr, value, mid+1, hight);
         }
    }


    public static void main(String[] args) {
        int[] test=new int[]{1,2,3,4,5,6,7,8,9};


        System.out.println(commBinarySearch(null,1));
        System.out.println(commBinarySearch(new int[]{},1));
        System.out.println(commBinarySearch(test,1));
        System.out.println(commBinarySearch(test,2));
        System.out.println(commBinarySearch(test,3));
        System.out.println(commBinarySearch(test,4));
        System.out.println(commBinarySearch(test,5));
        System.out.println(commBinarySearch(test,6));
        System.out.println(commBinarySearch(test,7));
        System.out.println(commBinarySearch(test,8));
        System.out.println(commBinarySearch(test,9));






        System.out.println(recursiveBinarySearch(null,1));
        System.out.println(recursiveBinarySearch(new int[]{},1));
        System.out.println(recursiveBinarySearch(test,1));
        System.out.println(recursiveBinarySearch(test,2));
        System.out.println(recursiveBinarySearch(test,3));
        System.out.println(recursiveBinarySearch(test,4));
        System.out.println(recursiveBinarySearch(test,5));
        System.out.println(recursiveBinarySearch(test,6));
        System.out.println(recursiveBinarySearch(test,7));
        System.out.println(recursiveBinarySearch(test,8));
        System.out.println(recursiveBinarySearch(test,9));





    }
}
