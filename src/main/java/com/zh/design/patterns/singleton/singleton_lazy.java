package com.zh.design.patterns.singleton;


/**
 * 懒汉式
 */
public class singleton_lazy {

    public static void main(String[] args) {

        Singleton1_L instance = Singleton1_L.getInstance();
        Singleton1_L instance2 = Singleton1_L.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        System.out.println("----------------------------");

    }
}


/**
 * 饿汉式1
 * 会造成内存浪费
 */
class Singleton1_L {
    //私有构造
    private Singleton1_L() {

    }

    private static Singleton1_L Singleton1_L;

    public static Singleton1_L getInstance() {
        if (Singleton1_L == null) {
            Singleton1_L = new Singleton1_L();
        }
        return Singleton1_L;
    }
}