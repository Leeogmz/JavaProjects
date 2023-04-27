package model;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    
    private Double limitOfCredit;
    private Double bankroll;
    private List<Purchases> purchases;
    
    public CreditCard (Double limitOfCredit) {
        
    this.limitOfCredit = limitOfCredit;
    this.bankroll = limitOfCredit;
    this.purchases = new ArrayList<>();

    }


    public boolean buy(Purchases p ) {
        if(this.bankroll > p.getValue()) {
            this.bankroll -= p.getValue();
            this.purchases.add(p);
            return true;
        }
        return false;
    }


    public Double getLimitOfCredit() {
        return limitOfCredit;
    }

    public Double getBankroll() {
        return bankroll;
    }

    public List<Purchases> getPurchases() {
        return purchases;
    }



}
