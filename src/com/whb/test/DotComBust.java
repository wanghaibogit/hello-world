package com.whb.test;

/**
 * Created by meishu02 on 2017/11/12.
 */
import java.util.*;
public class DotComBust {
    private GameHelper helper=new GameHelper();
    private ArrayList<DotCom> dotComList=new ArrayList<DotCom>();
    private int numOfGuesses=0;
    private void setUpGame(){
        DotCom one=new DotCom();
        one.setName("pets.con");
        DotCom tow=new DotCom();
        tow.setName("eToys.com");
        DotCom three=new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(tow);
        dotComList.add(three);

        System.out.println("Your goal is sank three dot com" +(int)(Math.random()*7));
        System.out.println("pets.con,eToys.com,Go2.com");
        System.out.println("Try to sank them all in the fewest num of guesses");
        for (DotCom dotComToSet : dotComList){
            ArrayList<String> newlocation=helper.placeDotCom(3);
            dotComToSet.setLocationCells(newlocation);
        }
    }
    private void startPlaying(){
        while(!dotComList.isEmpty()){
            String userGuess=helper.getUserInput("Enter a guess");
                checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result="miss";
        for (DotCom dotComToSet : dotComList){
            result=dotComToSet.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                dotComList.remove(dotComToSet);
                break;
            }
        }
        System.out.println(result);
    }
    public void finishGame(){
        System.out.println("All Dot Coms are dead !Your stocks are now useless");
        if(numOfGuesses<=18){
            System.out.println("It's only took you " + numOfGuesses + " guesses");
            System.out.println("You got out before your options sank.");
        }else {
            System.out.println("Took you long enouph " + numOfGuesses + " guesses");
            System.out.println("Fish are dancing with your options");
        }
    }
    public static void main(String[] args){
        DotComBust game=new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
