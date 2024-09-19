public class Exame {
    private int codigo;
    private Consulta consulta;
    private int data;
    private String descritivo;

    public Exame(){

    }

    public Exame(int codigo, Consulta consulta, int data, String descritivo) throws Exception{
        setCodigo(codigo);
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    private int getCodigo(){
        return codigo;
    }

    private void setCodigo(int codigo) throws Exception {
        //TODO
        if(codigo < 0) {
            throw new Exception("Erro na implementação do código");
        } else {
            this.codigo = codigo;
        }
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) throws NullPointerException{
        if(consulta == null){
            throw new NullPointerException("Usuário não possui uma consulta");
        } else {
            this.consulta = consulta;
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) throws Exception {
        //TODO
        if(data < 0){
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
    //=======================================================
    public void solicitar(){
        //TODO
    }

    public void consultar(){
        //TODO
    }

    public void mostrar(){
        System.out.println("EXAME====================================");
        System.out.println("codigo: " + getCodigo());
        getConsulta().mostrar();
        System.out.println("Data: " + getData());
        System.out.println("Descritivo" + getDescritivo());
    }

}
