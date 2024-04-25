package br.cesul.lista04.ex02;

public class Salesman {

    private static final double CASH_SALES_COMISSION = 0.02;

    private static final double INSTALLMENT_SALES_COMISSION = 0.02;

    private static final double BONUS_SENIOR = 0.2;
    private static final double BONUS_MID = 0.15;

    private static final double BONUS_JUNIOR = 0.05;
    private final String name ;

    private final double salary;

    private double cashSales;

    private double installmentSales;

    private final double salesTarget;

    private SeriorityLevel seniority;

    public Salesman(String name, double salary, double salesTarget, SeriorityLevel seniority) {
        this.name = name;
        this.salary = salary;
        this.salesTarget = salesTarget;
        this.seniority = seniority;
    }

    public double getFinalSale(){
        double finalSalary = salary + (cashSales *CASH_SALES_COMISSION)
                + (installmentSales *INSTALLMENT_SALES_COMISSION);
        double totalSales = cashSales + installmentSales;
        if(totalSales < salesTarget){
            return finalSalary;
        }
        return finalSalary + getBonus();

    }

    private double getBonus(){
        if(seniority == SeriorityLevel.JUNIOR){
            return  (salary * BONUS_JUNIOR);
        }
        if(seniority == SeriorityLevel.MIDLEVEL){
            return(salary * BONUS_MID);
        }
        return  (salary * BONUS_SENIOR);
    }

    public double getCashSales() {
        return cashSales;
    }

    public void setCashSales(double cashSales) {
        this.cashSales = cashSales;
    }

    public double getInstallmentSales() {
        return installmentSales;
    }

    public void setInstallmentSales(double installmentSales) {
        this.installmentSales = installmentSales;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getSalesTarget() {
        return salesTarget;
    }

    public SeriorityLevel getSeniority() {
        return seniority;
    }



}
