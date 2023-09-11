import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametro2 = terminal.nextInt();
        
        try {
            // chamando o método contendo a lógica de contagem
            contar(parametro1, parametro2);
        
        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        terminal.close();
    }
    
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametro2 - parametro1;
        // realizar o for para imprimir os números com base na variável contagem
        for (int x = 1; x <= contagem; x++) {
            System.out.println("Imprimindo o número " + x);
        }
    }
}