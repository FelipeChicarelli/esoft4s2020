package AtividadeNotaFelipeChicarelli;

import javax.persistence.Entity;

@Entity

public class Diretor {
    
    public class Tecnico extends Local {
        private String Diretor;
    
        public Diretor() {
            super();
        }
    
        public String getDiretor() {
            return Diretor;
        }
    
        public void setDiretor(String Diretor) {
            this.Diretor = Diretor;
        }
    
    }
}
