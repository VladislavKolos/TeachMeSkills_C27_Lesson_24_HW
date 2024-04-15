package org.example.runner;

import org.example.service.dom_parsing.DomParsing;
import org.example.service.sax_parsing.SaxParsing;

import java.util.Scanner;

/**
 * Class with method "main" to run the program
 * if the user enters 1 from the console, the "parseWithSax" method is called and parsed using SAX
 * if the user enters 2 from the console, the "parseWithDom" method is called and parsed using DOM.
 */
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to parse with SAX or 2 to parse with DOM: ");

        if (scanner.hasNextInt()) {
            int userDecision = scanner.nextInt();

            if (userDecision == 1) {
                SaxParsing.parseWithSax();
            } else if (userDecision == 2) {
                DomParsing.parseWithDom();
            } else {
                System.out.println("Invalid user decision. Please enter 1 for SAX or 2 for DOM.");
            }

        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }
}
