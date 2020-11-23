package AtividadeNotaFelipeChicarelli;

import javax.persistence.Entity;

@Entity

public class local {
    private String nomeLocal;
    private int numeroDoLocal;

    public String getNomeLocal() {
        return nomeLocal;
    }

    public int getNumeroDoLocal() {
        return numeroDoLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public void setNumeroDoLocal(int numeroDoLocal) {
        this.numeroDoLocal = numeroDoLocal;
    }

    public Local (String nomeLocal, int numeroDoLocal) {
        this.nomeLocal = nomeLocal;
        this.numeroDoLocal = numeroDoLocal;
    }

    public static void add(Ponto Ponto1);
    
    
}
