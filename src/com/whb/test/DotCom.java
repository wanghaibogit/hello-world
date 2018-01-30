package com.whb.test;

import java.util.ArrayList;

/**
 * Created by meishu02 on 2017/11/12.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    public void setLocationCells(ArrayList<String> lc){
        locationCells=lc;
    }
    public void setName(String n){
        name=n;
    }
    public String checkYourself(String userInput){
        String result="miss";
        int index=locationCells.indexOf(userInput);
        if(index>=0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result="hit";
                System.out.println("Ouch!You sunk " +name+" :(");
            }else {
                result="hit";
            }
        }
        return result;
    }
}
