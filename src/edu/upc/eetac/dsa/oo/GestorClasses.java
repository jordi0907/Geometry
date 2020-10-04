package edu.upc.eetac.dsa.oo;

import edu.upc.eetac.dsa.oo.Figuras.*;

import java.util.Arrays;
import java.util.Comparator;

public class GestorClasses {

    public static double suma(Figura[] figuras){
        double areaFinal=0;
        for(Figura f: figuras){
            areaFinal+=f.area();
        }
        return  areaFinal;
    }

        public static void sort (Figura[] v)
        {
           //Arrays.sort(v);
            Arrays.sort(v, new Comparator<Figura>() {
                @Override
                public int compare(Figura o1, Figura o2) {
                   return (int)(o1.area()-o2.area());
                }
            });
        }

    public static void sortDesc (Figura[] v)
    {
        //Arrays.sort(v);
        Arrays.sort(v, new Comparator<Figura>() {
            @Override
            public int compare(Figura o1, Figura o2) {
                return (int)(-o1.area()+o2.area());
            }
        });
    }



    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,2);
        Rectangle r2 = new Rectangle (4,2);
        System.out.println(r1);
        System.out.println(r2);
        Cercle c1 = new Cercle(4);
        Cercle c2 = new Cercle(8);
        System.out.println(c1);
        System.out.println(c2);
        Cuadrado q1 = new Cuadrado(3);
        System.out.println(q1);

        Figura[] v = new Figura[7];
        v[0] = new Rectangle(1,4);
        v[1] = new Rectangle(1,3);
        v[2] = new Rectangle(1,2);
        v[3] = new Rectangle(1,1);
        v[4] = new Cercle(5 );
        v[5] = new Cuadrado(2);
        v[6] = new Triangulo(7,8);

        double r = GestorClasses.suma(v);
        System.out.println("Suma Area: "+r);

        System.out.println("sin ordenar: "+Arrays.asList(v));

        GestorClasses.sort(v);
        System.out.println("ordenado ascendente: " +Arrays.asList(v));
        GestorClasses.sortDesc(v);
        System.out.println("ordenado descendente: " +Arrays.asList(v));



    }
}
