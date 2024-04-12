package org.example.ClientService;

public class Bonuses {
    private int bonuses;
    public void addBonus(int newBonus) {
        bonuses += newBonus;
    }
    public void spendBonuses(int amount) {
        if((bonuses - amount) < 0) {
            throw new IllegalArgumentException("Недостаточно средств");
        }
        bonuses -= amount;
    }

    public int getBonusBallance() {
        return bonuses;
    }
}
