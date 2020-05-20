
package pkg4numeros4numeros;


public class 4 numeros {



public static void main(String[] args) {
    
    double n1, n2, n3, n4, result;

    Scanner entrada = new Scanner(System.in);

    System.out.println("digite o primeiro numero");
    n1 = entrada.nextdouble();

    System.out.println("digite o segundo numero");
    n2 = entrada.nextdouble();
    
    System.out.println("digite o terceiro numero");
    n3 = entrada.nextdouble();

    System.out.println("digite o quarto numero");
    n4 = entrada.nextdouble();

    result = (n1*n2*n3*n4);
    
    System.out.println("a soma desses numeros e"+result);
    }
    
}
