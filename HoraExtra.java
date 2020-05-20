
package hora.extra;

import java.util.Scanner;


public class HoraExtra {
    public static void main(String[] args) {

    double hora, mes, result;
    
    Scanner entrada = new Scanner(System.in);
            
    System.out.println("Digite quantas horas ele trabalhou neste mes");
    mes = entrada.nextdouble();
    
    System.out.println("Digite quanto ele ganha por hora");
    hora = entrada.nextdouble();
    
    result = (mes*hora)*1,70;
    
    System.out.println("o pagamento dele e"+result);
        
    }
    
}
