package estruturaDeRepeticao;

public class ForEach {
    public static void main(String[] args) {

        int[] idade = {21, 33, 59, 74, 8, 30, 15, 18, 82, 36};
        System.out.println(idade[2]);

        for (int idades: idade) {
            System.out.println(idades + " ");
        }
    }
}
