package string;

public class BuilderDeString {

    public static void main(String[] args) {
        
        String nome = "Gustavo";

        final StringBuilder builder = new StringBuilder(nome);
        System.out.println(builder.append("Luis"));

        final StringBuilder reverse = builder.reverse();
        System.out.println(reverse);

        final StringBuilder insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        System.out.println(insert);
    }
    
}
