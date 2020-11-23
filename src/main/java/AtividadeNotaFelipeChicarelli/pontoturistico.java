package AtividadeNotaFelipeChicarelli;


import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class pontoturistico {
 public static void main(String[] args) throws Exception {
        pontoturistico Ponto1 = new Ponto("Catedral", 1);
        pontoturistico Ponto2 = new Ponto("Bosque", 2);
        Ponto.add(Ponto1);
        Ponto.add(Ponto2);
    }
}