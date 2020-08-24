package com.test;

import java.sql.SQLOutput;

/**
 * @Author: zzy
 * @Time: 8:11 2020/8/12
 * @Description:
 */
class HelloA{
    public HelloA(){
        System.out.println("HelloA");
    }
    {
        System.out.println("I`m A Class");
    }
    static {
        System.out.println("static A");
    }
}
public class Teacher extends HelloA{
    public Teacher(){
        System.out.println("HelloB");
    }
    {
        System.out.println("I`m B Class");
    }
    static {
        System.out.println("static B");
    }
    public static void main(String[] args) {
    new Teacher();
    }
}
