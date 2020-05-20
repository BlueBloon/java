
package comissao;


public class Comissao {

    private static Object entrada;


    public static void main(String[] args) {
    
    double peca, quant, comissao, result;
            
    System.out.println("digite o preço da peça");
    peca = entrada.nextdouble();
    
    System.out.println("digite a quantidades de peças");
    quant = entrada.nextdouble();
    
    result = (peca*quant);
    comissao = (result*0.05);
    
    System.out.println("a comissao do vendedor e R$"+comissao);
    }
    
}
