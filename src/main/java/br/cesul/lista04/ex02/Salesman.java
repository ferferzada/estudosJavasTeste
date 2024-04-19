package br.cesul.lista04.ex02;

public class Salesman {

    private final String name ;

    private final double salary;

    private double cashSales;

    private double installmentSales;

    private final double salesTarget;

    private final String seniority;

    public Salesman(String name, double salary, double salesTarget, String seniority) {
        this.name = name;
        this.salary = salary;
        this.salesTarget = salesTarget;
        this.seniority = seniority;
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

    public String getSeniority() {
        return seniority;
    }



}
