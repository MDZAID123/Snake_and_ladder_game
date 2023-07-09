package com.example.apfi;


import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.io.IOException;
import java.util.*;

public class HelloController {

    @FXML
    private ImageView board;

    @FXML
    private Circle c1;

    @FXML
    private Circle c2;




    @FXML
    private Label re;


    @FXML
    private Pane cp10;

    @FXML
    private Pane cp100;

    @FXML
    private Pane cp11;

    @FXML
    private Pane cp12;

    @FXML
    private Pane cp13;

    @FXML
    private Pane cp14;

    @FXML
    private Pane cp15;

    @FXML
    private Pane cp16;

    @FXML
    private Pane cp17;

    @FXML
    private Pane cp18;

    @FXML
    private Pane cp19;

    @FXML
    private Pane cp2;

    @FXML
    private Pane cp20;

    @FXML
    private Pane cp21;

    @FXML
    private Pane cp22;

    @FXML
    private Pane cp23;

    @FXML
    private Pane cp24;



    @FXML
    private  Label turn;
    //check all these things after each move


    @FXML
    private Pane cp25;

    @FXML
    private Pane cp26;

    @FXML
    private Pane cp27;

    @FXML
    private Pane cp28;

    @FXML
    private Pane cp29;

    @FXML
    private Pane cp3;

    @FXML
    private Pane cp30;

    @FXML
    private Pane cp31;

    @FXML
    private Pane cp32;

    @FXML
    private Pane cp33;

    @FXML
    private Pane cp34;

    @FXML
    private Pane cp35;

    @FXML
    private Pane cp36;

    @FXML
    private Pane cp37;

    @FXML
    private Pane cp38;

    @FXML
    private Pane cp39;

    @FXML
    private Pane cp4;

    @FXML
    private Pane cp40;

    @FXML
    private Pane cp41;

    @FXML
    private Pane cp42;

    @FXML
    private Pane cp43;

    @FXML
    private Pane cp44;

    @FXML
    private Pane cp45;



    @FXML
    private  Pane cp1;
    private Pane cp46;

    @FXML
    private Pane cp47;

    @FXML
    private Pane cp48;

    @FXML
    private Pane cp49;

    @FXML
    private Pane cp5;

    @FXML
    private Pane cp50;

    @FXML
    private Pane cp51;

    @FXML
    private Pane cp52;

    @FXML
    private Pane cp53;

    @FXML
    private Pane cp54;

    @FXML
    private Pane cp55;

    @FXML
    private Pane cp56;

    @FXML
    private Pane cp57;

    @FXML
    private Pane cp58;

    @FXML
    private Pane cp59;

    @FXML
    private Pane cp6;

    @FXML
    private Pane cp60;

    @FXML
    private Pane cp61;

    @FXML
    private Pane cp62;

    @FXML
    private Pane cp63;

    @FXML
    private Pane cp64;

    @FXML
    private Pane cp65;

    @FXML
    private Pane cp66;

    @FXML
    private Pane cp67;

    @FXML
    private Pane cp68;

    @FXML
    private Pane cp69;

    @FXML
    private Pane cp7;

    @FXML
    private Pane cp70;

    @FXML
    private Pane cp71;

    @FXML
    private Pane cp72;

    @FXML
    private Pane cp73;

    @FXML
    private Pane cp74;

    @FXML
    private Pane cp75;

    @FXML
    private Pane cp76;

    @FXML
    private Pane cp77;

    @FXML
    private Pane cp78;

    @FXML
    private Pane cp79;

    @FXML
    private Pane cp8;

    @FXML
    private Pane cp80;

    @FXML
    private Pane cp81;

    @FXML
    private Pane cp82;
    //you can also hard code it to achive functionality
    //start early will always help


    @FXML
    private Pane cp83;

    @FXML
    private Pane cp84;

    @FXML
    private Pane cp85;

    @FXML
    private Pane cp86;

    @FXML
    private Pane cp87;

    @FXML
    private Pane cp88;

    @FXML
    private Pane cp89;

    @FXML
    private Pane cp9;

    @FXML
    private Pane cp90;

    @FXML
    private Pane cp91;

    @FXML
    private Pane cp92;

    @FXML
    private Pane cp93;

    @FXML
    private Pane cp94;

    @FXML
    private Pane cp95;

    @FXML
    private Pane cp96;

    @FXML
    private Pane cp97;

    @FXML
    private Pane cp98;

    @FXML
    private Pane cp99;
    //diffrent  type of fxml injections are required

    @FXML
    private Button diceroll;

    @FXML
    private ImageView dieimage;

    @FXML
    private Pane pane;

    @FXML
    private Label score1;

    @FXML
    private Label score2;

    @FXML
    private Button start;


    @FXML
    private  Label top;
    @FXML
    private  Pane p11;


    @FXML
    private Circle player1;


    @FXML
    private  Circle player2;



    @FXML
    private  Label pehla;


    @FXML
    private  Label dosra;



    @FXML
    private  Button move;



    public  cell [][]brd;

    //object class is parent of all
    //you can typecast
    //concept of java are used here
    //we need to declare many global attributes here also

    int ROWS=10;

    int COLS=10;


    public    void turning(){
        if(p1.isChance()){
            turn.setText("turn for player 1");

        }else if(p2.isChance()){
            turn.setText("turn for player2");


        }

    }


    public  static  ArrayList<Pane> saripane=new ArrayList<>();

    public  static  HashMap<Integer ,cell> allcell =new HashMap<Integer,cell>();

    //harcode intial objects and add them to it

    //we just want a running  code
    Map<Integer,Integer> snakes = new HashMap<Integer,Integer>();
    Map<Integer,Integer> ladders = new HashMap<Integer,Integer>();




   public  static int currt;

   //pura hardcoding to achive functionality



    player p1=new player(true,123,223);

    player p2=new player(false,233,222);
   public int i=0;


    public  static  int fscore1=1;
    public static  int fscore2=1;
//    player p1=new player();
//        p1.setScore(0);
//        p1.setChance(false);
//
//    player p2=new player();
//        p2.setScore(0);
//        p2.setChance(false);
//
//        p1.setChance(true);
//


    public ArrayList<allpane> sarp=new ArrayList<allpane>();






    //first decide whether to code



    @FXML
    public  void change(ActionEvent e) throws IOException {



//
//        Parent root=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view-fxml")));
//        Scene sc=new Scene(root);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene sc = new Scene(fxmlLoader.load());


        Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();

        stage.setScene(sc);









        stage.show();

    }




    @FXML
    void moving(ActionEvent event){


        turning();
//        p1.setChance(!p1.isChance());
        System.out.println("hello we are int turn number");
        System.out.println(i++);


        TranslateTransition translate=new TranslateTransition();

        if(p1.isChance()){

            fscore1=fscore1+currt;
            translate.setToX(saripane.get(fscore1-1).getLayoutX());
            translate.setToY(saripane.get(fscore1-1).getLayoutY());
            p1.setScore(p1.getScore()+currt);

            translate.setDuration(Duration.millis(2000));
            translate.setNode(player1);
            translate.play();

            if(allcell.get(fscore1).isLadderstart()){
                //need to add further transtion

                TranslateTransition tr=new TranslateTransition();

                tr.setToX(saripane.get(ladders.get(fscore1)-1).getLayoutX());
                tr.setToY(saripane.get(ladders.get(fscore1)-1).getLayoutY());


                p1.setScore(ladders.get(fscore1));
                fscore1=ladders.get(fscore1);
                tr.setDuration(Duration.millis(2000));
                tr.setNode(player1);

                tr.play();

            }

            if(allcell.get(fscore1).isSnakestart()){
                TranslateTransition tr=new TranslateTransition();
                tr.setToX(saripane.get(snakes.get(fscore1)-1).getLayoutX());
                tr.setToY(saripane.get(snakes.get(fscore1)-1).getLayoutY());

                p1.setScore(snakes.get(fscore1));
                fscore1=snakes.get(fscore1);
                tr.setDuration(Duration.millis(2000));



                tr.setNode(player1);
                tr.play();


            }







        }else if(p2.isChance()){
            fscore2+=currt;
            translate.setToX(saripane.get(fscore2-1).getLayoutX());
            translate.setToY(saripane.get(fscore2-1).getLayoutY());
            p2.setScore(p2.getScore()+currt);

            //prev se prev +dice pe move karege


            translate.setDuration(Duration.millis(2000));
            translate.setNode(player2);
            translate.play();


            if(allcell.get(fscore2).isLadderstart()){
                //need to add further transtion

                TranslateTransition tr=new TranslateTransition();
                tr.setToX(saripane.get(ladders.get(fscore2)-1).getLayoutX());
                tr.setToY(saripane.get(ladders.get(fscore2)-1).getLayoutY());

                p2.setScore(ladders.get(fscore2));
                fscore2=ladders.get(fscore2);
                tr.setDuration(Duration.millis(2000));

                tr.setNode(player2);
                tr.play();

            }

            if(allcell.get(fscore2).isSnakestart()){
                TranslateTransition tr=new TranslateTransition();
                tr.setToX(saripane.get(snakes.get(fscore2)-1).getLayoutX());
                tr.setToY(saripane.get(snakes.get(fscore2)-1).getLayoutY());

                p2.setScore(snakes.get(fscore2));
                fscore2=snakes.get(fscore2);
                tr.setDuration(Duration.millis(2000));
                tr.setNode(player2);
                tr.play();


            }


        }

        p1.setChance(!p1.isChance());
        p2.setChance(!p2.isChance());

        pehla.setText(Integer.toString(fscore1));
        dosra.setText(Integer.toString(fscore2));


        check();
    }

    @FXML
     void gameplay(ActionEvent event){

//        p1.setScore(0);
//        p1.setChance(false);
//        p2.setScore(0);
//        p2.setChance(false);
//
//        p1.setChance(true);



        //first achive basic functionality



//        while(p1.getScore()<100 && p2.getScore()<100){


            System.out.println("hello we are int turn number");
            System.out.println(i++);



            //curr kitna h //aut turn kiski h





                //



            //after
            //that we have to change
            p1.setChance(!p1.isChance());
            p2.setChance(!p2.isChance());


            //game will run in a while loop

//        }


        System.out.println("game over");






    }

    //when we would be calling that function

    //check that function after each move calls
    public    void check(){
        if(fscore1>99){
            top.setText("game over player1 wins");

        }
        if(fscore2>99){
            top.setText("game over player 2 wins");

        }
    }

    //we will make functions for that
    public int[] getBoardCoordinates(int newIndex) {
        int row = newIndex / ROWS;	// ROWS - 1 - newIndex / ROWS if I don't send rows*cols - newIndex
        int column = newIndex % COLS;

        if (row % 2 == 1) {		// If I don't want to send ROW * COLS - newIndex, the condition will be row % 2 == 0
            column = COLS - 1 - column;
        }

        return new int[] {row, column};
    }
    public  void cellinit(){
        brd=new cell[10][10];
        //note that it should ultimately modify the global variable
        //we have used and overlapper the grid pane to overflow


        //phele object se intialise kardo
        int c=1;
        int rw=-5;
        int cl=0;


        for(int i=0;i<10;i++){
            rw+=5;


            for(int j=0;j<10;j++){
                brd[i][j]=new cell(c++,false,false,false,false);


//                sarp.add(new allpane((int)p11.getLayoutX()+cl,(int)p11.getLayoutY()+rw,c));
                //intially sab false honge;
            }
            cl+=5;





        }

        //set
        //now we have put all the panes with their id in the arraylist
        saripane.add(cp1);


        saripane.add(cp2);
        saripane.add(cp3);
        saripane.add(cp4);

        saripane.add(cp5);

        saripane.add(cp6);
        saripane.add(cp7);
        saripane.add(cp8);
        saripane.add(cp9);
        saripane.add(cp10);
        saripane.add(cp11);
        saripane.add(cp12);
        saripane.add(cp13);
        saripane.add(cp14);
        saripane.add(cp15);
        saripane.add(cp16);
        saripane.add(cp17);
        saripane.add(cp18);
        saripane.add(cp19);
        saripane.add(cp20);
        saripane.add(cp21);
        saripane.add(cp22);
        saripane.add(cp23);
        saripane.add(cp24);
        saripane.add(cp25);
        saripane.add(cp26);
        saripane.add(cp27);
        saripane.add(cp28);
        saripane.add(cp29);
        saripane.add(cp30);
        saripane.add(cp31);
        saripane.add(cp32);
        saripane.add(cp33);
        saripane.add(cp34);
        saripane.add(cp35);
        saripane.add(cp36);
        saripane.add(cp37);
        saripane.add(cp38);
        saripane.add(cp39);
        saripane.add(cp40);
        saripane.add(cp41);
        saripane.add(cp42);
        saripane.add(cp43);
        saripane.add(cp44);
        saripane.add(cp45);
        saripane.add(cp46);
        saripane.add(cp47);
        saripane.add(cp48);
        saripane.add(cp49);
        saripane.add(cp50);
        saripane.add(cp51);
        saripane.add(cp52);
        saripane.add(cp53);
        saripane.add(cp54);
        saripane.add(cp55);
        saripane.add(cp56);
        saripane.add(cp57);
        saripane.add(cp58);
        saripane.add(cp59);
        saripane.add(cp60);
        saripane.add(cp61);
        saripane.add(cp62);
        saripane.add(cp63);
        saripane.add(cp64);
        saripane.add(cp65);
        saripane.add(cp66);
        saripane.add(cp67);
        saripane.add(cp68);
        saripane.add(cp69);
        saripane.add(cp70);
        saripane.add(cp71);
        saripane.add(cp72);
        saripane.add(cp73);
        saripane.add(cp74);
        saripane.add(cp75);
        saripane.add(cp76);
        saripane.add(cp77);
        saripane.add(cp78);
        saripane.add(cp79);
        saripane.add(cp80);
        saripane.add(cp81);
        saripane.add(cp82);
        saripane.add(cp83);
        saripane.add(cp84);
        saripane.add(cp85);
        saripane.add(cp86);
        saripane.add(cp87);
        saripane.add(cp88);
        saripane.add(cp89);
        saripane.add(cp90);
        saripane.add(cp91);
        saripane.add(cp92);
        saripane.add(cp93);
        saripane.add(cp94);
        saripane.add(cp95);
        saripane.add(cp96);
        saripane.add(cp97);
        saripane.add(cp98);
        saripane.add(cp99);
        saripane.add(cp100);







        //intitalising this matrix
        //note that matrix will be cell objects


    }
    //and where to code

    @FXML
     void startgame(ActionEvent event){

        System.out.println("game started egegrgr3h4th");
        //we will call some other functions here also


        cellinit();
//        Map<Integer,Integer> snakes = new HashMap<>();
//        Map<Integer,Integer> ladders = new HashMap<>();



        allcell.put(1,new cell(1,false,false,false,false));
        allcell.put(2,new cell(2,false,false,false,false));
        allcell.put(3,new cell(3,false,false,false,false));
        allcell.put(4,new cell(4,false,false,false,false));
        allcell.put(5,new cell(5,false,false,false,false));
        allcell.put(6,new cell(6,false,false,false,false));
        allcell.put(7,new cell(7,false,false,false,false));
        allcell.put(8,new cell(8,false,false,false,false));
        allcell.put(9,new cell(9,false,false,false,false));
        allcell.put(10,new cell(10,false,false,false,false));
        allcell.put(11,new cell(11,false,false,false,false));
        allcell.put(12,new cell(12,false,false,false,false));
        allcell.put(13,new cell(13,false,false,false,false));
        allcell.put(14,new cell(14,false,false,false,false));
        allcell.put(15,new cell(15,false,false,false,false));
        allcell.put(16,new cell(16,false,false,false,false));
        allcell.put(17,new cell(17,false,false,false,false));
        allcell.put(18,new cell(18,false,false,false,false));
        allcell.put(19,new cell(19,false,false,false,false));
        allcell.put(20,new cell(20,false,false,false,false));
        allcell.put(21,new cell(21,false,false,false,false));
        allcell.put(22,new cell(22,false,false,false,false));
        allcell.put(23,new cell(23,false,false,false,false));
        allcell.put(24,new cell(24,false,false,false,false));
        allcell.put(25,new cell(25,false,false,false,false));
        allcell.put(26,new cell(26,false,false,false,false));
        allcell.put(27,new cell(27,false,false,false,false));
        allcell.put(28,new cell(28,false,false,false,false));
        allcell.put(29,new cell(29,false,false,false,false));
        allcell.put(30,new cell(30,false,false,false,false));
        allcell.put(31,new cell(31,false,false,false,false));
        allcell.put(32,new cell(32,false,false,false,false));
        allcell.put(33,new cell(33,false,false,false,false));
        allcell.put(34,new cell(34,false,false,false,false));
        allcell.put(35,new cell(35,false,false,false,false));
        allcell.put(36,new cell(36,false,false,false,false));
        allcell.put(37,new cell(37,false,false,false,false));
        allcell.put(38,new cell(38,false,false,false,false));
        allcell.put(39,new cell(39,false,false,false,false));
        allcell.put(40,new cell(40,false,false,false,false));
        allcell.put(41,new cell(41,false,false,false,false));
        allcell.put(42,new cell(42,false,false,false,false));
        allcell.put(43,new cell(43,false,false,false,false));
        allcell.put(44,new cell(44,false,false,false,false));
        allcell.put(45,new cell(45,false,false,false,false));
        allcell.put(46,new cell(46,false,false,false,false));
        allcell.put(47,new cell(47,false,false,false,false));
        allcell.put(48,new cell(48,false,false,false,false));
        allcell.put(49,new cell(49,false,false,false,false));
        allcell.put(50,new cell(50,false,false,false,false));
        allcell.put(51,new cell(51,false,false,false,false));
        allcell.put(52,new cell(52,false,false,false,false));
        allcell.put(53,new cell(53,false,false,false,false));
        allcell.put(54,new cell(54,false,false,false,false));
        allcell.put(55,new cell(55,false,false,false,false));
        allcell.put(56,new cell(56,false,false,false,false));
        allcell.put(57,new cell(57,false,false,false,false));
        allcell.put(58,new cell(58,false,false,false,false));
        allcell.put(59,new cell(59,false,false,false,false));
        allcell.put(60,new cell(60,false,false,false,false));
        allcell.put(61,new cell(61,false,false,false,false));
        allcell.put(62,new cell(62,false,false,false,false));
        allcell.put(63,new cell(63,false,false,false,false));
        allcell.put(64,new cell(64,false,false,false,false));
        allcell.put(65,new cell(65,false,false,false,false));
        allcell.put(66,new cell(66,false,false,false,false));
        allcell.put(67,new cell(67,false,false,false,false));
        allcell.put(68,new cell(68,false,false,false,false));
        allcell.put(69,new cell(69,false,false,false,false));
        allcell.put(70,new cell(70,false,false,false,false));
        allcell.put(71,new cell(71,false,false,false,false));
        allcell.put(72,new cell(72,false,false,false,false));
        allcell.put(73,new cell(73,false,false,false,false));
        allcell.put(74,new cell(74,false,false,false,false));
        allcell.put(75,new cell(75,false,false,false,false));
        allcell.put(76,new cell(76,false,false,false,false));
        allcell.put(77,new cell(77,false,false,false,false));

        allcell.put(78,new cell(78,false,false,false,false));

        allcell.put(79,new cell(79,false,false,false,false));

        allcell.put(80,new cell(80,false,false,false,false));

        allcell.put(81,new cell(81,false,false,false,false));

        allcell.put(82,new cell(82,false,false,false,false));

        allcell.put(83,new cell(83,false,false,false,false));

        allcell.put(84,new cell(84,false,false,false,false));

        allcell.put(85,new cell(85,false,false,false,false));

        allcell.put(86,new cell(86,false,false,false,false));

        allcell.put(87,new cell(87,false,false,false,false));

        allcell.put(88,new cell(88,false,false,false,false));

        allcell.put(89,new cell(89,false,false,false,false));

        allcell.put(90,new cell(90,false,false,false,false));

        allcell.put(91,new cell(91,false,false,false,false));

        allcell.put(92,new cell(92,false,false,false,false));

        allcell.put(93,new cell(93,false,false,false,false));

        allcell.put(94,new cell(94,false,false,false,false));
        allcell.put(95,new cell(95,false,false,false,false));

        allcell.put(96,new cell(96,false,false,false,false));

        allcell.put(97,new cell(97,false,false,false,false));

        allcell.put(98,new cell(98,false,false,false,false));

        allcell.put(99,new cell(99,false,false,false,false));

        allcell.put(100,new cell(100,false,false,false,false));


        snakes.put(24, 5);
        allcell.get(24).setSnakestart(true);
        allcell.get(5).setSnakeend(true);
        //mouth to tail are matched inside this



        //note that here our game grid is not like th ordinary 2d amtric
        //matrix to show relation between cordinated of the gridpane and the
        //and the celll number of the board
        //after every row
        //directions of nodes are changing after each directions
        //
        //inside these maps endpoint of the tiles
        //these endpoints are mentioned as cell numbers


        snakes.put(43, 22);

        //mouth to end
        allcell.get(43).setSnakestart(true);
        allcell.get(22).setSnakeend(true);

        //snkestart-mouth
        //snakeend-m
        //to transtion randomly from one place to another we will require
        //amp

        int []t1=getBoardCoordinates(43);
        brd[t1[0]][t1[1]].setSnakeend(true);

        int []t2=getBoardCoordinates(22);
        brd[t2[0]][t2[1]].setSnakestart(true);
        //first we are tyring to hard code all the things
        //make your game dynamic


        snakes.put(56, 25);

        allcell.get(56).setSnakestart(true);
        allcell.get(25).setSnakeend(true);

        int []t3=getBoardCoordinates(56);
        brd[t3[0]][t3[1]].setSnakestart(true);

        int []t4=getBoardCoordinates(25);
        brd[t4[0]][t4[1]].setSnakeend(true);


        snakes.put(60, 42);
        allcell.get(60).setSnakestart(true);
        allcell.get(42).setSnakeend(true);

        int []t5=getBoardCoordinates(60);
        brd[t5[0]][t5[1]].setSnakestart(true);
        int []t6=getBoardCoordinates(42);
        brd[t6[0]][t6[1]].setSnakeend(true);



        //main some gap so that code can be readable

        snakes.put(69, 48);

        allcell.get(69).setSnakestart(true);
        allcell.get(48).setSnakeend(true);


        int []t7=getBoardCoordinates(69);
        brd[t7[0]][t7[1]].setSnakestart(true);
        int []t8=getBoardCoordinates(48);
        brd[t8[0]][t8[1]].setSnakeend(true);



        snakes.put(86, 53);

        allcell.get(86).setSnakestart(true);
        allcell.get(53).setSnakeend(true);
        int []t9=getBoardCoordinates(86);
        brd[t9[0]][t9[1]].setSnakestart(true);
        int []t10=getBoardCoordinates(53);
        brd[t10[0]][t10[1]].setSnakeend(true);



        snakes.put(90, 72);
        allcell.get(90).setSnakestart(true);
        allcell.get(72).setSnakeend(true);
        int []t11=getBoardCoordinates(90);
        brd[t11[0]][t11[1]].setSnakestart(true);
        int []t12=getBoardCoordinates(72);
        brd[t12[0]][t12[1]].setSnakeend(true);


        snakes.put(94, 73);

        allcell.get(94).setSnakestart(true);
        allcell.get(73).setSnakeend(true);

        int []t13=getBoardCoordinates(94);
        brd[t13[0]][t13[1]].setSnakestart(true);
        int []t14=getBoardCoordinates(73);
        brd[t14[0]][t14[1]].setSnakeend(true);



        snakes.put(96, 84);
        allcell.get(96).setSnakestart(true);
        allcell.get(84).setLadderend(true);
        int []t15=getBoardCoordinates(96);
        brd[t15[0]][t15[1]].setSnakestart(true);
        int []t16=getBoardCoordinates(84);
        brd[t16[0]][t16[1]].setSnakestart(true);




        snakes.put(98, 58);
        allcell.get(98).setLadderstart(true);
        allcell.get(58).setLadderend(true);
        int []t17=getBoardCoordinates(98);
        brd[t17[0]][t17[1]].setSnakestart(true);
        int []t18=getBoardCoordinates(58);
        brd[t18[0]][t18[1]].setSnakeend(true);



        ladders.put(3, 21);
        //ladder use karke transiton hoga then
        //we will send it from startto end

        allcell.get(3).setLadderstart(true);
        allcell.get(21).setLadderend(true);
        int []t19=getBoardCoordinates(3);
        brd[t19[0]][t19[1]].setLadderstart(true);
        int []t20=getBoardCoordinates(21);
        brd[t20[0]][t20[1]].setLadderend(true);


        ladders.put(8, 46);
        allcell.get(8).setLadderstart(true);
        allcell.get(46).setLadderend(true);
        int []t21=getBoardCoordinates(8);
        brd[t21[0]][t21[1]].setLadderstart(true);
        int []t22=getBoardCoordinates(46);
        brd[t22[0]][t22[1]].setLadderend(true);


        ladders.put(16, 26);

        allcell.get(16).setLadderstart(true);
        allcell.get(26).setLadderend(true);
        int []t23=getBoardCoordinates(16);
        brd[t23[0]][t23[1]].setLadderstart(true);
        int []t24=getBoardCoordinates(26);
        brd[t24[0]][t24[1]].setLadderend(true);




        ladders.put(29, 33);

        allcell.get(29).setLadderstart(true);
        allcell.get(33).setLadderend(true);
        int []t25=getBoardCoordinates(29);

        brd[t25[0]][t25[1]].setLadderstart(true);
        int []t26=getBoardCoordinates(23);

        brd[t26[0]][t26[1]].setLadderend(true);




        ladders.put(37, 65);
        allcell.get(37).setLadderstart(true);
        allcell.get(65).setLadderend(true);

        int []t27=getBoardCoordinates(37);
        brd[t27[0]][t27[1]].setLadderstart(true);
        int []t28=getBoardCoordinates(65);
        brd[t28[0]][t28[1]].setLadderend(true);



        ladders.put(50, 70);
        allcell.get(50).setLadderstart(true);
        allcell.get(70).setLadderend(true);

        int []t29=getBoardCoordinates(50);
        brd[t29[0]][t29[1]].setLadderstart(true);
        int []t30=getBoardCoordinates(70);
        brd[t30[0]][t30[1]].setLadderend(true);



        ladders.put(64, 77);
        allcell.get(64).setLadderstart(true);
        allcell.get(77).setSnakeend(true);

        int []t31=getBoardCoordinates(64);
        brd[t31[0]][t31[1]].setLadderstart(true);
        int []t32=getBoardCoordinates(77);
        brd[t32[0]][t32[1]].setLadderend(true);


        ladders.put(61, 82);
        allcell.get(61).setLadderstart(true);
        allcell.get(82).setLadderend(true);

        int []t33=getBoardCoordinates(61);
        brd[t33[0]][t33[1]].setLadderstart(true);
        int []t34=getBoardCoordinates(82);
        brd[t34[0]][t34[1]].setLadderend(true);


        ladders.put(76, 95);
        allcell.get(76).setLadderstart(true);
        allcell.get(95).setLadderend(true);

        int []t35=getBoardCoordinates(76);
        brd[t35[0]][t35[1]].setLadderstart(true);
        //you should know what is ladd
        //from where to where we have to do transition

        int []t36=getBoardCoordinates(95);
        brd[t36[0]][t36[1]].setLadderend(true);


        ladders.put(89, 91);
        allcell.get(89).setLadderstart(true);
        allcell.get(91).setLadderend(true);
        int []t37=getBoardCoordinates(89);
        brd[t37[0]][t37[1]].setLadderstart(true);
        int []t38=getBoardCoordinates(91);
        brd[t38[0]][t38[1]].setLadderend(true);
        //how the data struture is ther we should








//        player p1=new player();
//        p1.setScore(0);
//        p1.setChance(false);
//
//        player p2=new player();
//        p2.setScore(0);
//        p2.setChance(false);
//
//        p1.setChance(true);


        //note that the game will play in a while loop

        //which all access this functions
        //
        //by default p1 will play first
        //you need to resist and then







        //cell initial


        //snake and ladder
        //map
        //dono player 1 positon
        //p1
        //while(100)


        //ek button chalne pe game will start
        //game code will run in a while loop

    }




    @FXML
    void roll(ActionEvent event) {

        Random r = new Random();
        // we will
        //how to listen diffrent events in java fx


//        int n=r.nextInt();
        int n = 1 + r.nextInt(6);

        switch (n) {
            case 1:
                //see the documentations
                //and then code accordingly


                //set the directory accorisngy
                //software enginerring accoridnlgy

//                InputStream stream = new FileInputStream("one.jpg");
//                dieimage.setImage(new Image(stream));
//                //you need to set the correct
                Image i1 = new Image("one.jpg");

                dieimage.setImage(i1);
                re.setText("1");
                currt=1;
                break;


            case 2:
                Image i2 = new Image("two.jpeg");

                dieimage.setImage(i2);
                re.setText("2");
                currt=2;
                break;


            case 3:
                Image i3 = new Image("three.jpeg");

                dieimage.setImage(i3);
                re.setText("3");
                currt=3;
                break;

            case 4:
                Image i4 = new Image("four.jpeg");

                dieimage.setImage(i4);
                re.setText("4");
                currt=4;
                break;

            case 5:
                Image i5 = new Image("five.jpeg");

                dieimage.setImage(i5);
                re.setText("5");
                currt=5;
                break;
            case 6:
                Image i6 = new Image("six.jpeg");

                dieimage.setImage(i6);
                re.setText("6");
                currt=6;
                //now expand the grid pane
                //step by step you should have the apporach

                break;


        }

    }}
