package Forme;

public class GruppoDiForme implements Forma {
	private final int MAX_NUMERO_FORME = 10;
	private int numeroForme = 0;
	private Forma[] gruppo;
	
	public GruppoDiForme(Forma ... gruppo) {
		this.gruppo = new Forma[MAX_NUMERO_FORME];
		this.numeroForme = gruppo.length;
		for (int i = 0; i < this.numeroForme; i++) {
			this.gruppo[i] = gruppo[i];
		}
	}
	
	public void aggiungiForma(Forma forma) {
		if (numeroForme < MAX_NUMERO_FORME)
			this.gruppo[numeroForme++] = forma;
	}
	
	@Override
	public void trasla(int deltaX, int deltaY) {
		for (int i = 0; i < this.numeroForme; i++) {
			this.gruppo[i].trasla(deltaX, deltaY);
		}
	}
	
	@Override
	public boolean equals(Object o) {
		final GruppoDiForme that = (GruppoDiForme) o;
		int trovato;
		for (int i = 0; i < numeroForme; i++) {
			trovato = 0;
			for (int j = 0; j < numeroForme && trovato != 1; j++) {
				if ((this.gruppo[i] instanceof Cerchio && that.gruppo[j] instanceof Cerchio) || 
					(this.gruppo[i] instanceof GruppoDiForme && that.gruppo[j] instanceof GruppoDiForme) ||
					(this.gruppo[i] instanceof Rettangolo && that.gruppo[j] instanceof Rettangolo))
					if (this.gruppo[i].equals(that.gruppo[j]))
						trovato = 1;
			}
			if (trovato == 0)
				return (false);
		}
		return (true);
	}
	
	public String toString() {
		StringBuilder risultato = new StringBuilder();
		risultato.append("Gruppo di forme:\n*******************\n");
    	for (int i = 0; i < this.numeroForme; i++)
    		risultato.append(gruppo[i].toString()+"\n");
    	risultato.append("*******************\n");
    	return risultato.toString();
	}
}
