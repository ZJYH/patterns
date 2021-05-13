package com.zh.design.patterns.sevenprinciples;

/**
 * 合成复用原则，
 * 尽量使用组合聚合，不使用继承
 * 就是如果想用某个类的方法之类的，用传参，加成员变量等方式实现
 */
public class Composite {

}



class Q {
    public void aVoid1(){}
}

/**
 * w想用Q的方法，不使用继承，使用组合聚合
 */
class W {
    private Q q;

    public void setQ(Q q) {
        this.q = q;
    }

    public void wVoid1(){
        q.aVoid1();
    }
}

/**
 *R想用Q的方法，不使用继承，使用组合聚合
 */
class R {
    //这个不需要set直接new出来了
    private Q q =new Q();

    public void wVoid1(){
        q.aVoid1();
    }

    /**
     * R想用Q的方法，这个不需要new，直接传参数进来调用
     * @param q
     */
    public void wVoid2(Q q){
        q.aVoid1();
    }
}