package com.redcarp.singleton;

import org.w3c.dom.ls.LSOutput;

public enum  EnumsSingleton {
    INSTANCE;
    public void print(){
        System.out.println(this.hashCode());
    }
}
class EnumTest{
    public static void main(String[] args) {
        EnumsSingleton instance = EnumsSingleton.INSTANCE;
        EnumsSingleton instance1 = EnumsSingleton.INSTANCE;
        System.out.println(instance==instance1);
    }
}