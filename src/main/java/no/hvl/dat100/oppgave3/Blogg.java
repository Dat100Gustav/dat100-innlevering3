package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggTabell;

    private int nesteLedig = 0;

	public Blogg() {
		innleggTabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggTabell = new Innlegg[lengde];
	}

	public int getAntall() {
		int antall = 0;

        for (Innlegg innlegg : innleggTabell){
            if (innlegg != null){
                antall++;
            }
        }

        return antall;
	}
	
	public Innlegg[] getSamling() {
        return innleggTabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
        int indeks = -1;

		for (int i = 0; i < innleggTabell.length; i++){
            if (innleggTabell[i] != null){
                if (innleggTabell[i].erLik(innlegg)){
                    indeks = i;
                }
            }
        }

        return indeks;
	}

	public boolean finnes(Innlegg innlegg) {
		return (finnInnlegg(innlegg) != -1);
	}

	public boolean ledigPlass() {
		return getAntall() != innleggTabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        boolean lagtTil = false;

        if (ledigPlass() && !finnes(innlegg)){
            innleggTabell[nesteLedig] = innlegg;
            nesteLedig++;
            lagtTil = true;
        }

        return lagtTil;
	}
	
	public String toString() {
		String resultatStr = getAntall() + "\n";

        for (Innlegg innlegg : innleggTabell){
            if (innlegg != null){
                resultatStr += innlegg.toString();
            }
        }

        return resultatStr;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}