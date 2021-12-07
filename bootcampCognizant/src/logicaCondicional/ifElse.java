package logicaCondicional;

public class ifElse {
    public static void main(String[] args) {

        float media = 5.5F;

        if(media >= 7.0){
            System.out.println("Aprovado");
        }
        else if(media <= 6.9 && media >= 5.5){
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
