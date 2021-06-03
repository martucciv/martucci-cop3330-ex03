package ex03;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class Printing {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Printing app = new Printing();
        String quote = app.readQuote();
        String author = app.readAuthor();
        String output = app.printOutput(author, quote);
        System.out.println(output);

    }
    public String readQuote(){
        System.out.print("What is the quote? ");
        return input.nextLine();
    }

    public String readAuthor(){
        System.out.print("Who said it? ");
        return input.nextLine();
    }

    public String printOutput(String author, String quote){
        return author+ " says, \"" +quote+ "\"";
    }
}
