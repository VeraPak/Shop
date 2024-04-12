package org.example.ClientService;

public class Wallet {
    private int ballance;
    public void addMoney(int amount) {
        ballance += amount;
    }
    public void spendMoney(int amount) {
        if((ballance - amount) < 0) {
            throw new IllegalArgumentException("Недостаточно средств");
        }
        ballance -= amount;
    }

    public int getBallance() {
        return ballance;
    }
    @Override
    public String toString() {
        return "Wallet ballance: " + ballance;
    }
}
