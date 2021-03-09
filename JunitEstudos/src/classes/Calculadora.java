package classes;

public class Calculadora {
    private double n1, n2;

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getSoma() {
        return this.n1 + this.n2;
    }

    public double getSubtracao() {
        return this.n1 - this.n2;
    }
    public double getMultiplicacao() {
        return this.n1 * this.n2;
    }
    public double getDivisao() {
        return this.n1 / this.n2;
    }

    /*
    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    */

}
