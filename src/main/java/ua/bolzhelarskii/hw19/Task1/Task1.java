package ua.bolzhelarskii.hw19.Task1;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main ( String[] args ) throws IOException {
        File file = new File ( "test.csv" );
        Scanner scanner = new Scanner ( System.in );

        try (FileWriter writer = new FileWriter ( file )) {
            while ( scanner.hasNext ( ) ) {
                String line = scanner.nextLine ( );

                if (line.contentEquals ( "end" )) {
                    writer.flush ( );
                    scanner.close ( );
                } else if (line.contentEquals ( "next" )) {
                    writer.write ( "\n" );
                } else {
                    writer.write ( line );
                }
            }
        }
    }
}