package br.cesul.lista04.ex01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanTest {

    private Loan loan ;

    @Test
    @BeforeEach
    public void setup(){
        this.loan = new Loan(1000,2,12);
    }
    public void createsLoanWithCorrectAttibutes(){
        assertEquals(1000,loan.getAmount());
        assertEquals(2,loan.getInterest());
        assertEquals(12,loan.getInstallments());
    }
    @Test
    public void calcutatesLoanInstallmentValueCorretly(){

        double instalmentValue = loan.getInstallmentValue();

        assertEquals(103.33,instalmentValue,0.01);
    }
    @AfterEach
    public void tearDown(){
        this.loan =  null;
    }
}
