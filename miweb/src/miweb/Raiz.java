
package miweb;


public class Raiz {
   
      public static void main(String[] args) {
              int i = 2;
              double r = Math.sqrt(i);
              
              System.out.print("La raíz de ");
              System.out.print(i);
              System.out.print(" es ");     
              System.out.print(r);
              System.out.println(".");
              
              i = 5;
              r = Math.sqrt(i);
              System.out.println("La raiz cuadrada de " + i + " es " + r + ".");
              System.out.format("La raíz cuadrada de %d es %f.%n",i,r);
              //System.out.format("%f, %1$`+020.10f %n",Math.PI);
      }
}


