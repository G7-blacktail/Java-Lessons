package types;

public class Types {

    public static void main(String[] args) {
        // Tipos primitivos

        byte bite = -128; // range (-128 até 127) -- 1 byte
        short longo = -32768; // range (-32.768 até 32.768) -- 2 byte
        int inteiro = 0; // números sem casa decimal - range (-2.147.483.648 até 2.147.483.647) -- 4
                         // bytes
        long numeroGrande = 35168431843148L; // range -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 -- 8
                                             // bytes
        float casaDecimal = 4.52f; // -3,4028E + 38 -- 4 bytes
        double variasCasasDecimais = 54.56835D; // -1,7976E + 308 -- 8 bytes
        boolean verdadeiroFalso = true; // verdadeiro (true) ou falso (false) --
        char letra = 'C';
        
        // tipos não primitivos
        String nome = "Gustavo";


        System.out.println(bite);
        System.out.println(longo);
        System.out.println(inteiro);
        System.out.println(numeroGrande);
        System.out.println(casaDecimal);
        System.out.println(variasCasasDecimais);;
        System.out.println(verdadeiroFalso);
        System.out.println(nome);
        System.out.println(letra);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting para um tipo mais especifico passando de um range maior para um menor

        System.out.print(numeroCurto2);

        // variavies vs constante
        int numero1 = 5;
        numero1 = 10;

        System.out.println(numero1);

        final double VALOR_PI = 3.14; // final não pode ser mudada

        System.out.println(VALOR_PI);

    }
}