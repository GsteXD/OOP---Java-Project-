public abstract class Procedimento {
    private int codigo;
    private String data;
    private String descritivo;

    public Procedimento(){}

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo) throws Exception {
        //TODO
        if(codigo < 0) {
            throw new Exception("Erro na implementação do código");
        } else {
            this.codigo = codigo;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        //TODO
        if(data == ""){
            throw new Exception("Data inválida");
        } else {
            this.data = data;
        }
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception{
        if(descritivo == ""){
            throw new Exception("Descritivo inválido");
        }
        this.descritivo = descritivo;
    }

    public void consultar(Consulta consulta) {
        System.out.println("CONSULTA A CONSULTA " + consulta.getCodigo());
        System.out.println("MOTIVO: " + consulta.getMotivo());
        System.out.println("HISTÓRICO " + consulta.getHistorico());
        System.out.println("EXAMES " + consulta.getExames());
        System.out.println("RECEITAS: " + consulta.getReceitas());
    }
}
