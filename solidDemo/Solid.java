package com.vyshnavi.solidDemo;
import com.vyshnavi.solidDemo.bankaccountdetails.BankDetails;
import com.vyshnavi.solidDemo.banknames.BankNames;
import com.vyshnavi.solidDemo.banks.Bank;
import com.vyshnavi.solidDemo.banks.HDFCBank;
import com.vyshnavi.solidDemo.banks.MinorBank;
import com.vyshnavi.solidDemo.banks.UnionBank;

public class Solid {
    public static void main(String[] args) {
        Bank bank=new Bank();
        MinorBank minorBank=new MinorBank();
        Bank unionBank=new UnionBank();
        HDFCBank hdfcBank=new HDFCBank();
        BankDetails bankDetails=new BankDetails();
        bank.addBank(BankNames.BANK);
        minorBank.addMinorBank(BankNames.BANK);
        unionBank.addBank(BankNames.UNION);
        bankDetails.printBankDetails(BankNames.BANK);
        hdfcBank.addBank(BankNames.HDFC);
        hdfcBank.addHDFCCredentials();
        bankDetails.printBankDetails(BankNames.HDFC);
    }
}
