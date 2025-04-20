public class ForArray {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Julia", "Lucas", "Amelia"};

        for(String aluno : alunos)
            System.out.println("Nome do aluno é: " + aluno);


        /* 
        // Em arrays, o índice inicia em zero
        for(int x=0; x < alunos.length; x++){
            System.out.println("O aluno no índice x= " + x + " é " + alunos[x]);
        }
            */
    }
}
