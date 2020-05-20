
package gasolina;


public class Gasolina {

    private static Object entrada;


    public static void main(String[] args) {

    double km, carro, preco, result;
    
    System.out.println("quantos km ira percorrer na sua viagem");
    km = entrada.nextdouble();
    
    System.out.println("Quanto seu carro consome de gasolina");
    carro = entrada.nextdouble();
    
    result = (km/carro)*preco;
            
    System.out.println("voce gastaria em media na sua viagem"+result);
    }
    
}
