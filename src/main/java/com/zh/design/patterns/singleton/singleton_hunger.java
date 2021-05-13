package com.zh.design.patterns.singleton;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 单例模式八种
 * 1.饿汉式： A.静态常量 B.静态代码块
 * 2.懒汉式：A.线程不安全，B.线程安全（同步方法）和（同步代码块）
 * 3.双重检查
 * 4.静态内部类
 * 5.枚举
 */
public class singleton_hunger {
    /**
     * 饿汉式
     * 	构造器私有化
     * 	类内部创建对象
     * 	向外暴露一个静态公共方法，getInstance
     */

    public static void main(String[] args) {

        Singleton1_S instance = Singleton1_S.getInstance();
        Singleton1_S instance2 = Singleton1_S.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        System.out.println("----------------------------");

        Singleton2_S instance3 = Singleton2_S.getInstance();
        Singleton2_S instance4 = Singleton2_S.getInstance();
        System.out.println(instance3 == instance4);
        System.out.println(instance3.hashCode());
        System.out.println(instance4.hashCode());
    }

}

/**
 * 饿汉式1
 * 会造成内存浪费
 */
class Singleton1_S{
    //私有构造
    private Singleton1_S(){

    }

    private static final Singleton1_S singleton1_s =new Singleton1_S();

    public static Singleton1_S getInstance(){
        return singleton1_s;
    }
}

/**
 * 饿汉式2
 */
class Singleton2_S{
    //私有构造
    private Singleton2_S(){
    }

    private static Singleton2_S singleton2_s ;

    static {
        //在静态代码块里创建对象
        singleton2_s =new Singleton2_S();
    }

    public static Singleton2_S getInstance(){
        return singleton2_s;
    }
}