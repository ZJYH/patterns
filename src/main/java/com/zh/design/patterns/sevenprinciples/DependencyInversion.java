package com.zh.design.patterns.sevenprinciples;

/**
 * 依赖倒置原则
 * <p>
 * 1. 接口传递
 * 2.构造方法传递
 * 3. setter传递 : 就是把一个接口在外部实现一个new 出来，然后set进去
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Weixin weixin = new Weixin();

        IOpenAndClose iOpenAndClose = new OpenClose(weixin);

        iOpenAndClose.send();

    }

}


/**
 * 发消息接口
 */
interface SendMessage {
    void getMessage();
}


//---------------------------------第一种---------------------------
//interface IOpenAndClose {
//    void send(SendMessage sendMessage);
//}


//class Weixin implements SendMessage {
//
//    @Override
//    public void getMessage() {
//        System.out.println("微信发的消息");
//    }
//}

//class OpenClose implements IOpenAndClose {
//
//    @Override
//    public void send(SendMessage sendMessage) {
//        sendMessage.getMessage();
//    }
//}

//---------------------------------第二种---------------------------


interface IOpenAndClose {
    void send();
}

class OpenClose implements IOpenAndClose {

    private SendMessage sendMessage;

    /**
     * 构造方法
     *
     * @param sendMessage 发送消息的接口
     */
    public OpenClose(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    @Override
    public void send() {
        sendMessage.getMessage();
    }
}


class Weixin implements SendMessage {

    @Override
    public void getMessage() {
        System.out.println("微信发的消息");
    }
}


