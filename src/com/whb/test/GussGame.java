package com.whb.test;

/**
 * Created by meishu02 on 2017/8/27.
 */
public class GussGame {
    Player p1;
    Player p2;
    public void startGame(){
        p1=new Player();
        p2=new Player();
        int gussp1=0;
        int gussp2=0;
        boolean p1isRight=false;
        boolean p2isRight=false;
        int tgNumber=(int) (Math.random()*10);
        System.out.println("I am thinking a number between 0 and 9 ...");
        while(true) {
            System.out.println("Number to guss is "+tgNumber);
            p1.guss();
            p2.guss();
            gussp1=p1.number;
            System.out.println("Player one guss number is "+gussp1);
            gussp2=p2.number;
            System.out.println("Player tow guss number is "+gussp2);
            if (gussp1==tgNumber){
                p1isRight=true;
            }
            if (gussp2==tgNumber){
                p2isRight=true;
            }
            if (p1isRight||p2isRight){
                System.out.println("we have a winner");
                System.out.println("Player one is winner? "+p1isRight);
                System.out.println("Player tow is winner? "+p2isRight);
                System.out.println("game over");
                break;
            }else {
                System.out.println("no winner so new round begin");
            }
        }
    }
}
