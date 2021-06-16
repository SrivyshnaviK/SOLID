package com.vyshnavi.solidDemo.banks;

import com.vyshnavi.solidDemo.banknames.BankNames;
import com.vyshnavi.solidDemo.bankaccounts.BankAccount;
public class Bank implements BankAccount {
    @Override
    public void addBank(BankNames bankName) { System.out.println("Creating Account..."+bankName); }
}
