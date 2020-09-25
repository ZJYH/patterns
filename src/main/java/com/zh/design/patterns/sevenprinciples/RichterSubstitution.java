package com.zh.design.patterns.sevenprinciples;

/**
 * 子类继承父类，尽量不要重写父类的方法，如果非得重写，就不要继承此类，
 * 把此类中公有的部分提出来做成一个基类，让A,B两类都去继承它，然后各自写自己的方法。
 */
public class RichterSubstitution {

}

/**
 * 汽车类
 */
class car {

    public int getSpeed(int brand){
        return brand+100;
    }

    public String getCarName(String brand){
        return brand+"car";
    }
}

class DaZhong extends car{
    public String kouHao(){
        return "大众汽车，天下第一";
    }
}

class BenTian extends car{
    public String kouHao(){
        return "本田汽车，天下第一";
    }
}
