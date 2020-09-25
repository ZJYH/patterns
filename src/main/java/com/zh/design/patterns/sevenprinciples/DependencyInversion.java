package com.zh.design.patterns.sevenprinciples;

/**
 * 依赖倒置原则
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Email email = new Email();

        IOpenAndClose iOpenAndClose = new OpenClose();

        iOpenAndClose.send(email);

    }

}


interface IOpenAndClose {
    public void send(sendMessage sendMessage);
}

class OpenClose implements IOpenAndClose {

    @Override
    public void send(sendMessage sendMessage) {
        System.out.println(sendMessage.getMessage());
    }
}

/**
 * 发消息接口
 */
interface sendMessage {
    public String getMessage();
}


class Weixin  {

}

/**
 * 发消息的接口实现类
 */
class Email implements sendMessage {
    @Override
    public String getMessage() {
        return "Email message";
    }
}

