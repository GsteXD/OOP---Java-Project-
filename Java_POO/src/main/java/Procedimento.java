public abstract class Procedimento {
    private int codigo;
    private String data;
    private String descritivo;

    public Procedimento(){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws Exception {
        if(codigo<=0){
            throw new Exception("Informe o codigo da receita corretamente!");
        } else {
            this.codigo = codigo;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

}
