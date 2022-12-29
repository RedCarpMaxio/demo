package com.redcarp.singleton;

public class LazySingleton {
    //防止重排序导致空指针
    private volatile static LazySingleton instance;
    private LazySingleton(){}
    public  static LazySingleton getInstance(){
        if (instance==null){
            synchronized (LazySingleton.class){
                if (instance==null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
