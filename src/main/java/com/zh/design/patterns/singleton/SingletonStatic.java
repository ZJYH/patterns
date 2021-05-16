package com.zh.design.patterns.singleton;

/**
 * 静态内部类的方式
 */
public class SingletonStatic {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                String name = Thread.currentThread().getName();
                System.out.println(name);
                StaticSingleton instance = StaticSingleton.getInstance();
                StaticSingleton instance2 = StaticSingleton.getInstance();
                System.out.println(instance == instance2);
                System.out.println(instance.hashCode()+name);
                System.out.println(instance2.hashCode());
            }).start();
        }


    }

}


class StaticSingleton{
    //私有构造
    private StaticSingleton() {
    }

    private static volatile StaticSingleton StaticSingleton;

    /**
     * 静态内部类
     * @return SingletonInstance
     */
    public static class  SingletonInstance  {
        private static final StaticSingleton Instance =new StaticSingleton();
    }

    /**
     * 获取对象
     * @return StaticSingleton
     */
    public static StaticSingleton getInstance() {
        return SingletonInstance.Instance;
    }
}