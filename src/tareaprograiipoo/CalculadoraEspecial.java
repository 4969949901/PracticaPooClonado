
package tareaprograiipoo;

import java.util.Scanner;

public class CalculadoraEspecial {
    //Atributo
    public String tipoCalculadora;
    private double numero;
    private double resultado;
    public  static double val;
    private double angulo;
    private double anguRadianes;
    
    //Constructor de la clase
    public CalculadoraEspecial(String tipoCalculadora, int numero) {
        this.tipoCalculadora = "CalculadoraEspcial";
        this.numero=numero;
        this.angulo=45;
        this.anguRadianes= Math.toRadians(angulo);
        this.val=val;
    }
    //Constructor vacio
    public CalculadoraEspecial(){
      
    }
    //Declaracion de metodos para calculadoraEspcial
    //1.Determinacion de factorial de un numero
    public double factorial(int numero){
    double factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    
    }
    //2.Determinacion de la potencia de un numero(base,exponente)
     public double potencia (double base, int exponente) {
        double potencia = 1;
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }

        return potencia;
    }
     public static void ingresoDato(){
      Scanner ls=new Scanner (System.in);
      System.out.println("Ingrese el valor");
      val=ls.nextDouble();
     }
     //3.Determinacion del seno de un angulo XD
      public  double seno (double x) {
          double seno;
          ingresoDato();
          double anguRadianes=Math.toRadians(val);
          seno=Math.sin(anguRadianes);
          return seno;
             
    }

      //4.Determinacion del coseno de un angulo
      public double coseno (double y) {
          double coseno;
          ingresoDato();
          double anguRadianes=Math.toRadians(val);
          coseno=Math.cos(anguRadianes);
          return coseno;
        
    }
      //5.Determinacion del tangente de un angulo
      public double tangente (double z) {
          double tangente;
          ingresoDato();
          double b=Math.toRadians(val);
          tangente=Math.tan(b);
          return tangente;
          
        
    }  
      //6.determinacion del contangeten de un angulo
      public double arcotangente (double p) {
          double cotangente;
          ingresoDato();
          cotangente=Math.atan(val);
          double c=Math.toDegrees(cotangente);
        return c;
    }

}
