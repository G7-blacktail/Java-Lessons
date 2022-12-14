package string;

public class Strings {
    public static void main(String[] args){

        String nome = "André";
        String sobreNome = "Gomes";
        final String nomeCompleto = nome + " " + sobreNome;

        System.out.println(nome);
        System.out.println(sobreNome);
        System.out.println(nomeCompleto);
        System.out.println("Seja muito bem vindo " + nomeCompleto);

        String string = new String(" Minha String ");

        System.out.println(" Char na posição : " + string.charAt(5));
        System.out.println(" Quantidade : " + string.length());
        System.out.println("Sem trim [" + string + "]");
        System.out.println("Com o Trim [" + string.trim() + "]");
        System.out.println(" Lower " + string.toLowerCase());
        System.out.println(" Upper : " + string.toUpperCase());
        System.out.println("Contém M : " + string.contains("M"));
        System.out.println("Contém X : " + string.contains("X"));
        System.out.println("Replace " + string.replace("n", "$"));
        System.out.println("Equals? " + string.equals(" Minha String "));
        System.out.println("EqualsIgnoreCase " + string.equalsIgnoreCase(" minha sTrinG "));
        System.out.println(" Substring(1, 6) = " + string.substring(1, 6));
    } 
}
