package logicaCondicional;

public class Switch {
    public static void main(String[] args) {
       int menu = 4;

       switch (menu){
           case 1:
               System.out.println("Login");
               break;
           case 2:
               System.out.println("Esqueci minha senha");
               break;
           case 3:
               System.out.println("Sair");
               break;
           default:
               System.out.println("Opção inválida");
               break;
       }
    }
}
