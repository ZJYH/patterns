package com.zh.design.patterns.sevenprinciples;

/**
 * 单一职责
 * 一个类只做一种事，一个方法只做一件事
 */
public class SingleResponsibilities {

    public static void main(String[] args) {
        trafficTool trafficTool = new trafficTool();
        trafficTool.car("汽车");
        trafficTool.airplane("飞机");
        trafficTool.ship("轮船");
    }


}


/**
 * 交通工具很多，此类描述交通工具房，一个方法只做一件事
 */
class trafficTool{

    /**
     * 只做关于地上的事
     * @param carName
     */
    public void car(String carName){
        System.out.println(carName +"在路上跑");
    }

    /**
     * 只做关于天的事
     * @param airName
     */
    public void airplane(String airName){
        System.out.println(airName +"在天上跑");
    }

    /**
     * 只做关于水里的事
     * @param shipName
     */
    public void ship(String shipName){
        System.out.println(shipName +"在水里跑");
    }
}
