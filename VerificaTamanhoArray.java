/**
 *  Autor: robson magno
 *  E-mail: robson.magno2018@gmail.com
 *  Data: 08/04/2020
 *
 *  Executar a classe: java VerificaTamanhoArray.java N
 *  N = O tamanho do Array
 *  Versao do java: 11+
 */

public class VerificaTamanhoArray {
    public static void main(String[] args) {
        
        int[] ints;

        if (args.length > 0) {
            ints = new int[Integer.parseInt(args[0])];
        } else {
            ints = new int[10];
        }

        System.out.printf("Tamanho inicial do Array ints[%d]\n\n", ints.length);
        for (int i = 0; i <= ints.length - 1; i++) {
            ints[i] = i + 1;
            System.out.printf("Valor inserido = %d, " + 
                    "tamanho restante do array = %d\n", ints[i], ints.length - (i + 1)); 
        }
    }
}

