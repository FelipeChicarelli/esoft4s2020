package AtividadeNotaFelipeChicarelli;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity

public class endereço {
    private String bairro;
    private String rua;
    private int numero;
    @JoinColumn(name = "Endereco")
    private Equipe Equipe;

    public String getBairro() {
        return bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
}
