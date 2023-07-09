package com.example.apfi;

public class cell {


    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public boolean isSnakestart() {
        return snakestart;
    }

    public void setSnakestart(boolean snakestart) {
        this.snakestart = snakestart;
    }

    public boolean isSnakeend() {
        return snakeend;
    }

    public void setSnakeend(boolean snakeend) {
        this.snakeend = snakeend;
    }

    public boolean isLadderstart() {
        return ladderstart;
    }

    public void setLadderstart(boolean ladderstart) {
        this.ladderstart = ladderstart;
    }

    public boolean isLadderend() {
        return ladderend;
    }

    public void setLadderend(boolean ladderend) {
        this.ladderend = ladderend;
    }

    //basically we are putting all the files inside the main files
    private  int cell;
    private boolean snakestart;
    private  boolean snakeend;
    private  boolean ladderstart;
    private  boolean ladderend;
    private int [] cor;


    public  cell(int cell,boolean snakestart,boolean snakeend,boolean laddstart,boolean ladderend){
        this.cell=cell;
        this.snakestart=snakestart;
        this.ladderstart=laddstart;
        this.ladderend=ladderend;
        this.snakeend=snakeend;

        //note we need to change these atrbutes also
        //so we will use getters and setter fotthe given variables


    }




}
