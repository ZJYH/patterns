package com.zh.design.patterns.singleton;


/**
 * 懒汉式
 */
public class SingletonLazy {

    public static void main(String[] args) {

        Singleton1L instance = Singleton1L.getInstance();
        Singleton1L instance2 = Singleton1L.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        System.out.println("----------------------------");

    }
}


/**
 * 懒汉式1
 * 线程不安全
 */
class Singleton1L {
    //私有构造
    private Singleton1L() {

    }

    private static Singleton1L Singleton1L;

    public static Singleton1L getInstance() {
        if (Singleton1L == null) {
            Singleton1L = new Singleton1L();
        }
        return Singleton1L;
    }
}

/**
 * 大粒度锁
 */
class Singleton2L{
    private Singleton2L(){}

    private static Singleton2L Singleton2L;

    public static synchronized Singleton2L getSingleton2L(){
        if(Singleton2L == null){
            Singleton2L =new Singleton2L();
        }
        return Singleton2L;
    }

}