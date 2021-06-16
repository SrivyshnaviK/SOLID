package com.vyshnavi.solidDemo.banks;

import com.vyshnavi.solidDemo.banknames.BankNames;

public class UnionBank extends Bank {
    @Override
    public void addBank(BankNames bankName) { System.out.println("Creating Account..."+bankName); }
}
