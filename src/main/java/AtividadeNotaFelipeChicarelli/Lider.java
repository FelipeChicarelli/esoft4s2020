package AtividadeNotaFelipeChicarelli;

import javax.persistence.Entity;

@Entity
public class Lider extends Local {
    private String cargoLider;

    public Lider() {
        super();
    }

    public String getCargoLider() {
        return cargoLider;
    }

    public void setCargoLider(String cargoLider) {
        this.cargoLider = cargoLider;
    }
    
}
