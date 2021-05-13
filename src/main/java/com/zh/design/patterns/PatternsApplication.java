package com.zh.design.patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 设计模式分3种类型
 * 1. 创建型设计模式 单例，抽象工厂，原型，建造者，工厂
 * 2. 结构型设计模式 适配器，桥接，装饰，组合，外观，享元，代理
 * 3. 行为型设计模式 模板方法 命令，访问者，迭代器，观察者，中介者，备忘录，
 *    解释器，状态，策略，责任链
 */
@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);
    }

}
