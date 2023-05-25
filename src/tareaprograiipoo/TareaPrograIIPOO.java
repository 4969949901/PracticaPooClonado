
package tareaprograiipoo;

import java.util.Scanner;
import static tareaprograiipoo.CalculadoraEspecial.val;

public class TareaPrograIIPOO {

    private static double anguRadianes;
    private static double x;
    private static double z;
    private static double y;
    private static double p;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       Scanner opt=new Scanner (System.in);
       Calculadora calculadora = new Calculadora("JP");
       CalculadoraEspecial especial =new CalculadoraEspecial ();
       boolean salir = false;
       int opcion; 
       
       do{
           System.out.println("");
           System.out.println("=======================");
           System.out.println("       Calculadora      ");
           System.out.println("=======================");
           System.out.println("Selecciona una opcion");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Verificar numero Primo");
           System.out.println("=======================");
           System.out.println("   Calculadora Especial    ");
           System.out.println("=======================");
           System.out.println("Selecciona una opcion");
           System.out.println("7.Factorial");
           System.out.println("8.Potencia");
           System.out.println("9.Seno");
           System.out.println("10.coseno");
           System.out.println("11.Tangente");
           System.out.println("12.Contangente");
           System.out.println("13. Salir");
           System.out.println("=======================");
           opcion = sn.nextInt();
            switch(opcion){
                case 1:
                   System.out.println("El resultado de la suma es = " + calculadora.sumar(10, 5));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calculadora.restar(10, 5));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calculadora.multiplicar(10, 5));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calculadora.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadora.raizCuadrada(16));
                    break;
                case 6:
                    System.out.println("Es primo? = " +calculadora.esPrimo(11));
                    break;
                case 7:
                    System.out.println("El resultado del factorial es= " + especial.factorial(25));
                    break;
                case 8:
                    System.out.println("El resultado de la potencia es= " + especial.potencia(5, 3));
                    break;
                case 9:
                    System.out.println("El resultado del seno es = " + especial.seno(anguRadianes));
                    break;
                case 10:
                    System.out.println("El resultado del coseno es = " + especial.coseno(y));
                    break;
                case 11:
                    System.out.println("El resultado de la tangente es = "+ especial.tangente(z));
                    break;
                case 12:
                    System.out.println("El resultado de la arcotangente es = "+ especial.arcotangente(p));
                    break;
                    
                case 13:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 13");
            }
       }
        while(!salir);   
        
    }
}
