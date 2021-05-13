package com.zh.design.patterns.sevenprinciples;

/**
 * 里氏替换
 *
 */
public class LishiReplace {

    public static void main(String[] args) {
        Bu bu = new Bu();

        System.out.println(bu.func1(1, 2));

    }
}


class AU {
    public int func1(int a,int b){
        return a+b;
    }
}

//Bu 重写了Au的方法，这样不太好，实际工作中会导致继承链出问题
class Bu extends AU{
    public int func1(int a,int b){
        return a-b;
    }
}