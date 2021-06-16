package com.vyshnavi.solidDemo.banks;
import com.vyshnavi.solidDemo.banknames.BankNames;
import com.vyshnavi.solidDemo.bankaccounts.MinorBankAccount;

public class MinorBank implements MinorBankAccount {
    public void addMinorBank(BankNames bankName){ System.out.println("Creating Minor Bank Account..."+bankName); }
}
