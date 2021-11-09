/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fel.omo.cv7.ab;

import cz.cvut.fel.omo.cv7.AbstractBankFactory;
import cz.cvut.fel.omo.cv7.Account;
import cz.cvut.fel.omo.cv7.BankOffice;
import cz.cvut.fel.omo.cv7.Loan;


/**
 *
 * @author shorivar
 */
public class AbBankFactory extends AbstractBankFactory{
     private static AbBankFactory instance = null;

    @Override
    public BankOffice createBankOffice() {
        return new BankOffice() {
            @Override
            public String getAddress() {
                return "Ab Banka, Náměstí 2, Praha 1";
            }

            @Override
            public String getPhoneContact() {
                return "420-2-777-777-777";
            }
        };
    }

    @Override
    public Account createAccount() {
        return new Account() {
            @Override
            public Object getBalance() {
                return 
            }

            @Override
            public Object getWithdrawLimit() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object getMonthlyFee() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void withdraw(Object amount) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void deposit(Object amount) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    @Override
    public Loan createLoan(MonetaryAmount amount, int months, double recommendedInterestRate) {
        return new Loan(amount, months, recommendedInterestRate) {
            @Override
            public Object getBalance() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public double getInterestRate() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object getMonthlyPayment() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

}
