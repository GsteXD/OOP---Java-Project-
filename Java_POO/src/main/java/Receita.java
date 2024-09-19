public class Receita {
    private int codigo;
    private int data;
    private Consulta consulta;
    private String descritivo;


    public Receita() {

    }

    public Receita(int codigo, Consulta consulta, int data, String descritivo) throws Exception {
        setCodigo(codigo);
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) throws NullPointerException {
        if (consulta == null) {
            throw new NullPointerException("Campo consulta da Receita é nulo.");
        }
        else {
            this.consulta = consulta;
        }
    }

    private int getCodigo(){
        return codigo;
    }

    private void setCodigo(int codigo) throws Exception{
        //TODO
        if(codigo < 0) {
            throw new Exception("Erro na implementação do código da Receita");
        } else {
            this.codigo = codigo;
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) throws Exception{
        //TODO
        if(data < 0) {
            throw new Exception("Data da Receita inválida");
        } else {
            this.data = data;
        }
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception{
        //TODO
        if(descritivo == "") {
            throw new Exception("Descritivo da Receita nulo");
        } else {
            this.descritivo = descritivo;
        }
    }
    //=======================================================
    public void preescrever(){
        //TODO
    }

    public void consultar(){
        //TODO
    }

    public void mostrar(){
        System.out.println("RECEITA====================================");
        getConsulta().mostrar();
        System.out.println("Data: " + getData());
        System.out.println("Descritivo" + getDescritivo());
    }
}
