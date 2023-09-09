public class Escopo {

    int saldo = 10; //essa variavel é de escopo global (pode ser acessada por todos os metodos) pois foi declarada dentro da primeira classe 
    public void sacar(int valor){
        //aqui a variavel valor é de escopo local, só pode ser acessada por esse metodo
       int novoSaldo = saldo - valor;
       System.out.print(saldo); //eu não poderia criar um metodo apenas para imprimir o novoSaldo, já que só o metodo sacar conhece essa variavel
    }

        //abaixo temos um exemplo de uso de variavel de fluxo, dentro de um bloco de decisão
    public double calcularDividaExponencial(){
		//variável local de método
		double valorParcela = 50.0;
		double valorMontante = 0.0; // começando a variável com valor zero
		for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
			double valorCalculado = valorParcela * x;
			valorMontante = valorMontante + valorCalculado;
		}
		//escopo de fluxo
		//x e valorCalculado nunca estarão disponíveis fora do for
		
		return valorMontante;
	}

}
