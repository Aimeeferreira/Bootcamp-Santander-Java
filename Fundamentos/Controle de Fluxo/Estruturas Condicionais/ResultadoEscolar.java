public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 2;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        /* 
        if(nota >= 7)
            System.out.println("Aprovado");

        else if(nota >= 4 && nota <7)
            System.out.println("Prova de Recuperação");

        else
            System.out.println("Reprovado");
            */
    }
}
