package AtividadeNotaFelipeChicarelli;


import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class participante {
    private String nomeParticipante;
    private String sexoParticipante;
    @OneToOne(mappedBy = "endereco")
    private Endereco endereco;

    public String getNomeParticipante() {
        return nomeParticipante;
    }

    public String getSexoParticipante() {
        return sexoParticipante;
    }

    public void setNomeParicipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }

    public void setSexoParticipante(String SexoParticipante) {
        this.sexoParticipante = sexoParticipante;
    }

}