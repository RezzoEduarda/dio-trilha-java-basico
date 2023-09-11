public class ProcessoSeletivo{
    public static void main(String[] args) {
       
    }

    static void selecionarCandidatos(){
        String [] candidatos = {"FELIPE","CATARINA", "ISADORA", "MARCIA", "SUELLEN", "DUDA", "CLAUDIO", "ANDRE", "LUIS"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");

        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRAPROPOSTA");

        }else
            System.out.println("AGUARDANDO RESULTADO DOS OUTROS CANDIDATOS");
    }
}