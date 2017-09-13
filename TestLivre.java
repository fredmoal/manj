package tableaux.compilo1;

public class TestLivre {
    public static void main(String [] args) {
        Livre [] livres = {
            new Livre("bob", "The Grapes of Java"),
            new Livre("sue","The Java Gatsby"),
            new Livre("ian","The Java Cookbook")
        };

        for(Livre livre : livres) {
            System.out.println(livre);
        }
    }
}

