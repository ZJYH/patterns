package com.zh.design.patterns.sevenprinciples;

/**
 * 对扩展（提供方）开放，对修改（使用方）关闭
 * 增加新功能不影响使用方
 * 使用接口和抽象类来保证 提供方的扩展方便，但是使用方无需修改，也就是修改关闭
 */
public class Ocp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.show(new Circular());
    }

}

class Drawing {
    public void show (Shape shape){
        shape.draw();
    }
}

abstract class Shape{
    abstract void draw();
}


class Triangle extends Shape {

    @Override
    void draw() {
        System.out.println("绘制三角形");
    }
}

class Circular extends Shape {

    @Override
    void draw() {
        System.out.println("绘制圆形");
    }
}