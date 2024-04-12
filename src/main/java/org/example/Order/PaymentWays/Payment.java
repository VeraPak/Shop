package org.example.Order.PaymentWays;

import org.example.ClientService.Bonuses;
import org.example.ClientService.Wallet;

public class Payment implements PaymentByBonuses, PaymentByAppWallet {
    public void payByBonuses(Bonuses bonuses, int totalAmount){
        bonuses.spendBonuses(totalAmount);
    }

    public void payByAppWallet(Wallet wallet, int totalAmount){
        wallet.spendMoney(totalAmount);
    }

}
