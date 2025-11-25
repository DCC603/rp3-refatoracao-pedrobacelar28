public class Operacao {

    private final TipoOperacao tipo;
    private final double valor;

    public Operacao(TipoOperacao tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public TipoOperacao getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.tipo.getDescricao() + ":\t" + this.valor;
    }
}
