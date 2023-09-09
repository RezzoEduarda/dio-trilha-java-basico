//escolha de um grupo de ações tendo em base condições, podendo ser simples ou composta

public class EstruturasCondicionais {
    public static void main(String[] args) {
        //condicionais simples possuem apenas duas condições e segue apenas um fluxo

        double saldo = 25;
        double valorSolicitado = 17;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        //caso aqui tivesse mais de um aonstrução, seria necessario criar um bloco de codigo com "{}"

        System.out.println(saldo);

        //condicionais composta possuem dois fluxos, um para verdadeiro e outro para falso

        int nota = 8;

        if(nota >= 6)
        System.out.println("Aprovado!");

        else
        System.out.println("Reprovado.");

        //condições encadeadas não se limitam a apenas um if ou else, você pode ter várias condições

        int nota2 = 8;

        if(nota2 >= 7)
        System.out.println("Aprovado!");

        else if(nota2 >= 5 && nota2 < 7)
        System.out.println("Recuperação.");

        else
        System.out.println("Reprovado.");

        //condições ternárias são basicamente abreviações de um algoritmo condicional

        int nota3 = 7;

        String resultado = nota3 >= 7 ? "Aprovado" : "Reprovado";
        System.out.print(resultado);

        //condções switche case compara o valor e um caso com o da variável e quando encontra um valor correspondente executa o código atribuido, utilizamos o break para que o código não fique sendo executado por muito tempo
        
        String sigla = "M";
        switch(sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
                break;
            }
        }
    }  
}
