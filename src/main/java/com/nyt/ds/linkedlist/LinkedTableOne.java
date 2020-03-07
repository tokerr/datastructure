package com.nyt.ds.linkedlist;

import java.util.HashMap;
import java.util.Stack;

public class LinkedTableOne {
    HashMap<Character,Character> cons=new HashMap<>();
    {
        cons.put('(',')');
        cons.put('[',']');
        cons.put('{','}');
    }

    public boolean isValid(String s){

        Stack stack =new Stack();

        if(s==null){
            return false;
        }
        int len=s.length();
        //字符串长度不是偶数
        if(len%2!=0){
            return false;
        }
        char[] chars = s.toCharArray();
        //注意边界条件，数组长度为偶数，检测到右括号开始
        for (int i = 0; i < len; i++) {
            //判断是否为右括号
            if(!cons.containsKey(chars[i])){
                //开始出栈配对
                if(stack.isEmpty() || !cons.get(stack.pop()).equals(chars[i])){
                    return false;
                }
                continue;//右括号不入栈
            }
            //左括号入栈
            stack.push(chars[i]);
        }

        if(stack.empty()) return true;
        //只要数组完全遍历，并且stack为空，才返回true
        return false;
    }


    public static void main(String[] args) {

        System.out.println(4%8);

        LinkedTableOne test = new LinkedTableOne();
        System.out.println(test.isValid("}["));
        System.out.println(test.isValid("()"));
        System.out.println(test.isValid("()[]{}"));
        System.out.println(test.isValid("(]"));
        System.out.println(test.isValid("([)]"));
        System.out.println(test.isValid("{[]}"));
        System.out.println(test.isValid("{[()]}"));
        System.out.println(test.isValid("{[()]}()"));
        System.out.println(test.isValid("([)}"));
        System.out.println(test.isValid("(]"));
        System.out.println(test.isValid("(){}{]"));
        System.out.println(test.isValid("(((((((("));
    }


}
