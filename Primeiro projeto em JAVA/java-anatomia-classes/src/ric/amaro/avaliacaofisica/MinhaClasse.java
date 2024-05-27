package ric.amaro.avaliacaofisica;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Ricardo";
        String segundoNome = "Amaro de Oliveira";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    
    }

        public static String nomeCompleto (String primeiroNome, String segundoNome){

            return "PACIENTE: " + primeiroNome.concat(" ").concat(segundoNome);
        }


    
}
