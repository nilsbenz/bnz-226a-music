package music;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {
    Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public int getInput() {
        System.out.println();
        System.out.println("Sie haben folgende Möglichkeiten:");
        System.out.println("1 : Einen Song hinzufügen");
        System.out.println("2 : Einen Song abspielen");
        System.out.println("3 : Samples aller Songs abspielen");
        System.out.println("4 : Einen zufälligen Song abspielen");
        System.out.println("5 : Song stoppen");
        System.out.println("6 : Programm beenden");

        try {
            return scanner.nextInt();
        } catch(InputMismatchException e) {
            scanner.nextLine();
            return 0;
        }
    }

    public String getFilename(MusicOrganizer organizer) {
        System.out.println();
        System.out.println("Geben Sie den Namen der mp3-Datei an. Folgende Tracks sind erfasst:");
        organizer.listAllFiles();
        return scanner.next();
    }
}
