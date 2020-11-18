package io.zipcoder.casino;

public class HighRollerNpc {
   private Player player;
    private Double wallet;
    private Integer currentRoll;
    private Boolean activeRoller;


    public HighRollerNpc(Player player,Double startingMoney) {
        this.player = player;
        this.wallet = startingMoney;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    public Integer getCurrentRoll() {
        return currentRoll;
    }

    public void setCurrentRoll(Integer currentRoll) {
        this.currentRoll = currentRoll;
    }
}
