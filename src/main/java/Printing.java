import java.util.Scanner;

public class Printing {
    public static void main(String[] args){
        System.out.print("What is the quote? ");
        Scanner qInput = new Scanner(System.in);
        String quote = qInput.nextLine();

        System.out.print("Who said it? ");
        Scanner aInput = new Scanner(System.in);
        String author = aInput.nextLine();

        System.out.printf("%s says, \"%s\"", author, quote);
    }
}
