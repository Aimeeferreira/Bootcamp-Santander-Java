public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        // Colocando em hierarquia, não precisa ficar repetitivo como no outro exemplo
        
        switch (plano) {
            case "T":{
                System.out.println("5GB de YouTube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }   
            default:
            System.out.println("Opção inválida. Tente novamente");
        }
    }
}

        /* 
        if(plano == "B"){
            System.out.println("100 minutos de ligação");

        }else if(plano == "M"){
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
        }else if(plano == "T"){
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("5GB de YouTube");
        }
            PARTES REPETITIVAS */

