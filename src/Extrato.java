import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Extrato {

    private final List<Operacao> operacoes;

    public Extrato() {
        this.operacoes = new ArrayList<>();
    }

    public void registrar(Operacao operacao) {
        this.operacoes.add(operacao);
    }

    public List<Operacao> getOperacoes() {
        return Collections.unmodifiableList(this.operacoes);
    }

    public String formatar() {
        StringBuilder builder = new StringBuilder();
        for (Operacao operacao : this.operacoes) {
            builder.append(operacao).append(System.lineSeparator());
        }
        return builder.toString();
    }
}
