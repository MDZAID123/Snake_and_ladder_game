package com.example.apfi;

public class player    {
    private  boolean chance;
    private int score;


    public int getXcor() {
        return xcor;
    }

    public void setXcor(int xcor) {
        this.xcor = xcor;
    }

    public int getYcor() {
        return ycor;
    }

    public void setYcor(int ycor) {
        this.ycor = ycor;
    }

    private  int xcor;
    private  int ycor;

    public  player(boolean f,int x,int y){
        //we will set some values as default
        this.chance=f;
        this.score=0;
        this.xcor=x;
        this.ycor=y;

    }

    public boolean isChance() {
        return chance;
    }

    public void setChance(boolean chance) {
        this.chance = chance;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
