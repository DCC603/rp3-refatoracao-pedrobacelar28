public enum TipoOperacao {

    DEPOSITO("Deposito"),
    SAQUE("Saque");

    private final String descricao;

    TipoOperacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
