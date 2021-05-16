package com.zh.design.patterns.singleton;

/**
 * 枚举形式的单例模式，在Runtime类中有用到。
 */
public enum  SingletonEnum {
    SINGLETONINSTANCE;

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                String name = Thread.currentThread().getName();
                SingletonEnum instance = SingletonEnum.SINGLETONINSTANCE;
                SingletonEnum instance2 = SingletonEnum.SINGLETONINSTANCE;
                System.out.println(instance == instance2);
                System.out.println(instance.hashCode()+name);
                System.out.println(instance2.hashCode());
            }).start();
        }
    }
    


}
