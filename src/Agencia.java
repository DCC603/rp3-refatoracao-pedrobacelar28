public class Agencia {

    private final int numero;
    private final String gerente;

    public Agencia(int numero, String gerente) {
        this.numero = numero;
        this.gerente = gerente;
    }

    public int getNumero() {
        return numero;
    }

    public String getGerente() {
        return gerente;
    }

    @Override
    public String toString() {
        return String.format("Ag.: %d%nGerente: %s", this.numero, this.gerente);
    }
}
