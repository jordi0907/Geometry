package edu.upc.eetac.dsa.oo.Figuras;

public class Cuadrado extends Rectangle {


    public Cuadrado(int lado) {
        super(lado, lado);

       /* this.lado=lado;*/
    }


    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + super.getL1()+
                '}';
    }
}
