package com.zh.design.patterns.factory.simplefactory.pizzastore;

public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name+"baking");
    }
}
