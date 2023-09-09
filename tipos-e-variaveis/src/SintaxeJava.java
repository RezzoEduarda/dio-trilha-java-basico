public class SintaxeJava {
    //primeiro metodo é o metodo principal (main)
    public static void main(String[] args) throws Exception {
        System.out.println("Olá! Esse é meu primeiro código em Java");
    }
    
    //criação de um metodo (deve sempre estar dentro de uma classe)
    public double somar(int num1, int num2){
        return num1 + num2;

    }
    public static void exemplificarVariaveis(){

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        //o short em parenteses foi usado para converter uma variavel "grande" em "pequena"

    }

    public static void dividir(int dividenvo, int divisor) throws Exception{
            //esse metodo possui uma excessão pois a divisão pode ser por zero, o que causaria um erro no código
    }

    private void metodoPrivado(){
            //esse metodo só pode ser visto pela classe que está inserido
    }

}
