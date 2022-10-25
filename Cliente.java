package testes;

public abstract class Cliente {
    private long codigo;

    public Cliente(long codigo) {
        this.codigo = codigo;
    }
        public long getCodigo() {
            return codigo;
        }
        public void setCodigo(long codigo) {
            this.codigo = codigo;
        }
        public abstract String todosDados();
        
}
