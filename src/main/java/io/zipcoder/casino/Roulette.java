package io.zipcoder.casino;

import java.util.ArrayList;

public class Roulette {
    private Player player;
    private RouletteBoardAndWheel rouletteBoardAndWheel = new RouletteBoardAndWheel();;
    private RoulettePrompts prompts = new RoulettePrompts();;
    protected ArrayList<Integer> singleNumberChoiceList = new ArrayList<Integer>();
    protected ArrayList<Integer> doubleNumberChoiceList = new ArrayList<Integer>();
    protected ArrayList<Integer> cornerNumberChoiceList = new ArrayList<Integer>();
    protected ArrayList<Integer> sixNumberChoiceList = new ArrayList<Integer>();
    protected ArrayList<Integer> rowNumberChoiceList = new ArrayList<Integer>();
    /** operation path: Welcome -> Rules (if chosen) -> play -> pick bets -> win/loose (repeat til) -> welcome -> exit
     *
     * betting options: single number, double number, corner, row (Straight), basket (0,00,2), 5 number (0,00,1,2,3),
     *                  line (6 numbers/2 rows), column, 12 number (1st, 2nd, 3rd), 1-18, 19-36, even, odd, black, red
     */

    public Roulette(Player player){
        this.player = player;
    }

    public void play(Player player){

    }


}
