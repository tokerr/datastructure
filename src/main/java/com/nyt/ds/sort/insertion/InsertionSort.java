package com.nyt.ds.sort.insertion;

import java.util.Arrays;

public class InsertionSort {


    /**
     * 插入排序（升序）
     *
     * 交换测次数等于逆序度=满有序度-有序度
     */

    public static void insertionSort(int[] array){

        if(array==null) return;

        //依次遍历所有元素，然后在有序区间通过遍历做比较，找到合适的位置进行交换
        //有序区间的元素是有序的
        for (int i = 1; i < array.length; i++) {
            //需要比较的值
            int value=array[i];
            int j=i-1;
            for (; j>=0 ; j--) {
                if(array[j]>value){
//                if(array[j]<value){//会实现降序的效果
                    array[j+1]=array[j];//将元素向前移动

                }else {
                    break;
                }

            }
            array[j+1]=value;
        }
    }

    /**
     * 插入排序（降序）
     */
    public static void insertionSortDesc(int[] array){
        if(array==null) return;
        for (int i = 1; i < array.length; i++) {
            int value=array[i];
            int j=i-1;
            for (; j>=0 ; j--) {
                if(array[j]<value){
                    array[j+1]=array[j];
                }
                else {
                    break;
                }

            }
            array[j+1]=value;

        }


    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,3,8,6,4,1,3,5,7};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));

        insertionSortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

}
