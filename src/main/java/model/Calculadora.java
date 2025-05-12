package model;

public class Calculadora {
    private double Valor1;
    private double Valor2;

    public Calculadora() {
    }

    public Calculadora(double Valor1, double Valor2) {
        this.Valor1 = Valor1;
        this.Valor2 = Valor2;
    }

    public double getValor1() {
        return Valor1;
    }

    public void setValor1(double Valor1) {
        this.Valor1 = Valor1;
    }

    public double getValor2() {
        return Valor2;
    }

    public void setValor2(double Valor2) {
        this.Valor2 = Valor2;
    }
   
    public double getSoma(){
        return (getValor1() + getValor2());
    }
    public double getDiferenca(){
        return (getValor1() - getValor2());
    }
    public double getProduto(){
        return (getValor1() * getValor2());
    }
    public double getQuociente(){
        return (getValor1()/ getValor2());
    }
    
}
