package AtividadeNotaFelipeChicarelli;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import java.util.List;

@Entity

public class Eventos {
    public String nomeEvento;
    public String descricaoevento;
    @ManyToMany
    private List<Local> Local = new ArrayList<>();

    public Jogo(String nomeEvento, String descricaoevento) {
        this.nomeEvento = nomeEvento;
        this.descricaoevento = descricaoevento;
    }

    public void addLocal(Local novo) {
        this.Local.add(novo);
    }

    @Override
    public String toString() {
        return "Nome do Local: " + this.local;
    }
    
}
