package com.redcarp.singleton;

public class HungrySingleton {
    public static void main(String[] args) {
        HungrySingle instance =  HungrySingle.getInstance();
        HungrySingle instance1 =  HungrySingle.getInstance();
        System.out.println(instance==instance1);

    }
}
class HungrySingle{
    private static  HungrySingle instance = new HungrySingle();
    private HungrySingle(){}

    public static HungrySingle getInstance() {
        return instance;
    }
}