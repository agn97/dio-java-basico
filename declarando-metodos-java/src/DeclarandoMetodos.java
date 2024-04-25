public class DeclarandoMetodos {// inicio da clase

    // corpo da classe

    public static void main(String[] args) { // inicio do metodo main
        String primeiroNome = "Alan";
        String segundoNome = "Gomes";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);


        // metodo Main *principal*
        //corpo metodo main


    }//fim do metodo main
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {// inicio do metodo nomeCompleto
        return "Resultado do metodo "  +  primeiroNome.concat(" ").concat(segundoNome
        );

        //corpo do metodo nomeCompleto

    }// fim do metodo nomeCompleto
}
