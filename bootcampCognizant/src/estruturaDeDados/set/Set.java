package estruturaDeDados.set;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Pedro");
        conjunto.add(36);
        conjunto.add('x');

        System.out.println("Tamanho do conjunto " + conjunto.size());
        System.out.println(conjunto.remove("teste"));

        HashSet nums = new HashSet();

        nums.add(3);
        nums.add("Carlos");
        nums.add(8);
        nums.add(1.2);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // união de conjuntos
        System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);

    }
}
