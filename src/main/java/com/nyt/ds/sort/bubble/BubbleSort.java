package com.nyt.ds.sort.bubble;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {


    public static void bubbleSort(int[] array){
        if (array==null) return ;

        for (int i = 0; i < array.length; i++) {
            //提前结束标志，如果交换，证明数组已经有序
            boolean isEnd=true;
            for (int j = 0; j < array.length-i-1; j++) {
//                if(array[j]>array[j+1]){//完成升序的效果
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    isEnd=false;
                }
            }
            if (isEnd) break;
        }
    }

    public static void main(String[] args) {

        int[] arr=new int[]{3,5,1,9,5,2,34,2,25,12,9,0};
//        int[] arr=new int[]{3,5,4,1,2,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
