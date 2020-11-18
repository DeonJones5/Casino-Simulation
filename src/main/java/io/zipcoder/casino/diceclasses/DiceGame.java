package io.zipcoder.casino.diceclasses;
import io.zipcoder.casino.Interfaces.*;
import io.zipcoder.casino.Player;

import java.util.ArrayList;

public class DiceGame<Player> implements Game, GamblingGameInterface {

    private ArrayList<Die> gameDice;
    private ArrayList<Player> players;



    public DiceGame(Integer numOfDie, ArrayList<Player> players) {
        ArrayList<Die> gameDice = new ArrayList<Die>();
        for (int i = 0; i < numOfDie; i++) {
            gameDice.add(new Die(6));


        }
        this.players = players;
    }
    public void setNoOfDice(ArrayList<Die> noOfDice) {
        this.gameDice = noOfDice;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Die> getNoOfDice(){
        return gameDice;
    }
    public ArrayList<Player> getPlayers(){
        return players;
    }

    public void payout(Double amount, io.zipcoder.casino.Player player) {

    }

    public void takeBets(Double amount) {

    }

    public void handleTurns() {


    }


    public void addPlayer(Player player) {
        players.add(player);

    }

    public void removePlayer(Player player) {
        players.remove(player);




    }


    @Override
    public void addPlayer() {

    }

    @Override
    public void removePlayer() {

    }
}
