package com.zh.design.patterns.singleton;


public class SingletonDoubleCheck {

}



class SingletonDC{
    //私有构造
    private SingletonDC() {
    }

    private static volatile SingletonDC singletonDC;

    /**
     * 双重检查单例
     * @return
     */
    public static SingletonDC getInstance() {
        if (singletonDC == null) {
            synchronized (SingletonDC.class){
                if(singletonDC == null){
                    singletonDC = new SingletonDC();
                }
            }
        }
        return singletonDC;
    }
}