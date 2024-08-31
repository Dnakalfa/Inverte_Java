package org.example;

public class Main {
        public static void main(String[] args) {
            String minhaString = "Programando em JAVA";

            char[] caracteres = minhaString.toCharArray();

            int inicio = 0;
            int fim = caracteres.length - 1;
            while (inicio < fim) {
                char temp = caracteres[inicio];
                caracteres[inicio] = caracteres[fim];
                caracteres[fim] = temp;
                inicio++;
                fim--;
            }

            String stringInvertida = new String(caracteres);

            System.out.println("String original: " + minhaString);
            System.out.println("String invertida: " + stringInvertida);
        }
}
