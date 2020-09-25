package com.zh.design.patterns.sevenprinciples;

/**
 * 接口隔离原则
 * 一个类应该只与它需要的最小接口建立联系，如果接口有多余方法，应该进行拆解
 * 接口A有5个方法，类B，C实现它，类D ，E分别通过接口A依赖B，C，但是D其实只需要1，3，4三个方法，
 * E只需要依赖1，2，5三个，这就导致了冗余，不需要的方法也被实现，所以接口A应该拆分
 */
public class InterfaceSegregation {



}


interface A {
    void moth1();
    void moth2();
    void moth3();
    void moth4();
    void moth5();
}

class B implements A{

    @Override
    public void moth1() {

    }

    @Override
    public void moth2() {

    }

    @Override
    public void moth3() {

    }

    @Override
    public void moth4() {

    }

    @Override
    public void moth5() {

    }
}

class C implements A{

    @Override
    public void moth1() {

    }

    @Override
    public void moth2() {

    }

    @Override
    public void moth3() {

    }

    @Override
    public void moth4() {

    }

    @Override
    public void moth5() {

    }
}

/**
 * D只需要1，3，4三个方法，
 */
class D {
    public void D1(A a){
        a.moth1();
    }
    public void D3(A a){
        a.moth3();
    }
    public void D4(A a){
        a.moth4();
    }
}

/**
 * E只要1，2，5三个接口
 */
class E{
    public void E1(A a){
        a.moth1();
    }
    public void E2(A a){
        a.moth2();
    }
    public void E5(A a){
        a.moth5();
    }
}


/**
 * A接口粒度太大，拆分成3个接口
 */

interface A1{
    void moth1();
}
interface A2{
    void moth3();
    void moth4();
}
interface A3{
    void moth2();
    void moth5();
}
//现在类B1只需要实现A1，A2接口即可
class B1 implements A1,A2{

    @Override
    public void moth1() {

    }

    @Override
    public void moth3() {

    }

    @Override
    public void moth4() {

    }
}
//现在类C1只需要实现A1，A3接口即可
class C1 implements A1,A2{

    @Override
    public void moth1() {

    }

    @Override
    public void moth3() {

    }

    @Override
    public void moth4() {

    }
}

/**
 * D1只需要根据自己的需要去依赖相应的接口即可
 */
class D1 {
    public void D11(A1 a1){
        a1.moth1();
    }
    public void D13(A2 a2){
        a2.moth3();
    }
    public void D14(A2 a2){
        a2.moth4();
    }
}

/**
 * E1也只需要依赖需要的A1和A3接口即可
 */
class E1{
    public void E11(A1 a1){
        a1.moth1();
    }
    public void E12(A3 a3){
        a3.moth2();
    }
    public void E15(A3 a3){
        a3.moth5();
    }
}
