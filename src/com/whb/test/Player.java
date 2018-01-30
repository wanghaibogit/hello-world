package com.whb.test;

/**
 * Created by meishu02 on 2017/8/27.
 */
public class Player {
    int number=0;
    public void guss(){
        number=(int) (Math.random()*10);
        System.out.println("I am guessing "+number);
    }
}
