public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;
        if(mediaFinal<6)
            System.out.println("Você foi Reprovado!");
        else if(mediaFinal==6)
            System.out.println("Você está na média.");
        else
            System.out.println("Parabéns. Você foi Aprovado!");
    }
}
