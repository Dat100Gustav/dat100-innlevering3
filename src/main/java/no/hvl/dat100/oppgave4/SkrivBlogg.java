package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        boolean harSkrevet = false;
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(mappe + filnavn);
            writer.println(samling.toString());
            harSkrevet = true;

        }
        catch (FileNotFoundException e) {
            System.out.println("Kunne ikke skrive til filen: " + e.getMessage());
        }
        finally {
            if (writer != null){
                writer.close();
            }
        }

        return harSkrevet;

	}
}
