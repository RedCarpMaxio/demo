package com.redcarp.singleton;

import java.io.Serializable;

public class InnerClassSingletonTest {
    public static void main(String[] args) {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        System.out.println(instance==instance1);
    }
}
class InnerClassSingleton implements Serializable {
    private static final long serialVersionUID = -2675722058030676467L;

    private static class  InnerClassHolder{
        private static  InnerClassSingleton instance = new InnerClassSingleton();
    }
    private InnerClassSingleton(){
        if (InnerClassHolder.instance!=null){
            throw new RuntimeException("单例不允许多例！");
        }
    }
    public static  InnerClassSingleton getInstance(){
        return InnerClassHolder.instance;
    }
}