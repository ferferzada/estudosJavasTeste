package br.cesul.lista04.ex02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SalesmanTest {
     private Salesman salesmanSenior;
    private Salesman salesmanJunior;
    private Salesman salesmanMidLevel;
    @Test
    @BeforeEach
    public void setup(){
        this.salesmanMidLevel = new Salesman("Jose",1000,3,SeriorityLevel.MIDLEVEL);
        this.salesmanMidLevel.setCashSales(400.00);
        this.salesmanMidLevel.setInstallmentSales(100.00);
        this.salesmanJunior = new Salesman("Jose",1000,3,SeriorityLevel.JUNIOR);
        this.salesmanJunior.setCashSales(400.00);
        this.salesmanJunior.setInstallmentSales(100.00);
        this.salesmanSenior = new Salesman("Jose",1000,3,SeriorityLevel.SENIOR);
        this.salesmanSenior.setCashSales(400.00);
        this.salesmanSenior.setInstallmentSales(100.00);

    }

    @Test
    public void createsSalesmanWithCorrectAttibutes(){
        assertEquals("Jose",salesmanMidLevel.getName());
        assertEquals(1000,salesmanMidLevel.getSalary());
        assertEquals(3,salesmanMidLevel.getSalesTarget());
        assertEquals(SeriorityLevel.MIDLEVEL,salesmanMidLevel.getSeniority());
    }
    @Test
    public void getCorrects(){
        assertEquals(100.00,salesmanMidLevel.getInstallmentSales(),0.01);
        assertEquals(400.00,salesmanMidLevel.getCashSales(),0.01);
    }
    @Test
    public void getCorretFinalSalaryMidLevel(){
        assertEquals(1160.00,salesmanMidLevel.getFinalSale(),0.01);
    }
    @Test
    public void getCorrectFinalSalaryJunior(){
        assertEquals(1060.00,salesmanJunior.getFinalSale(),0.01);
    }
    @Test
    public void getCorrectFinalSalarySenior(){
        assertEquals(1210.00,salesmanSenior.getFinalSale(),0.01);
    }
    @Test
    public void getCorrectFinalSalaryNotMetaOver(){
        salesmanSenior.setCashSales(0);
        salesmanSenior.setInstallmentSales(0);
        assertEquals(1000.00,salesmanSenior.getFinalSale(),0.01);
    }

}
