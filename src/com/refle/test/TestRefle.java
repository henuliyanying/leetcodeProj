package com.refle.test;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/18 10:19
 */
public class TestRefle {
    //基本反射技术，

    public static void testgetClass(){
        // 根据字符串得到一个类
//        String name = "Huanglinqing";
//        Class c1 = name.getClass();
//        System.out.println(c1.getName());
        //字符串合法命名是类的命名空间和类的名称组成
        String name = "com.test.reflection.Student";
        Class c1 = null;
        try {
            //Class.forName()获取类名
            c1 = Class.forName(name);
            System.out.println(c1.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }




    public static void main(String args[]){
        TestRefle.testgetClass();
    }
}
