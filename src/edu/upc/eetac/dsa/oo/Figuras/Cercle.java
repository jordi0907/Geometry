package edu.upc.eetac.dsa.oo.Figuras;

public class Cercle extends Figura {
    private double r1;

    public Cercle(double r1) {
        this.r1 = r1;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.r1, 2);
    }

    public double getR1() {
        return r1;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "r1=" + r1 +
                '}';
    }
}
