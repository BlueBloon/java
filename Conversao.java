
package conversao;


public class Conversao {

    private static Object entrada;


    public static void main(String[] args) {

    double hora, min, result;
    
    System.out.println("digite as horas");
    hora = entrada.nextdouble();
    
    System.out.println("digite os minutos");
    min = entrada.nextdouble();
    
    result =(min/60)+hora;
    
    System.out.println("serao"+result);
    }
    
}
