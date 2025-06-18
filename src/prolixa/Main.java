package prolixa;

import prolixa.lexer.*;
import prolixa.node.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
        File testDir = new File("teste");
        File[] files = testDir.listFiles();
        if (files == null) {
            System.out.println("Directory 'teste/' not found or is empty.");
            return;
        }

        for (File file : files) {
            if (!file.isFile()) continue;
            System.out.println("\nFile: " + file.getName());
            try {
                Lexer lexer = new Lexer(new PushbackReader(new FileReader(file), 1024));
                Token token;
                while (!((token = lexer.next()) instanceof EOF)) {
                    System.out.print(token.getClass().getSimpleName()+" | "+token.toString()+"|\n");
                }
            } catch (Exception e) {
                System.out.println("Error in file " + file.getName() + ": " + e.getMessage());
            }
        }
    }
}