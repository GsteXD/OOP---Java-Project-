public class Medico extends Funcionario{
    private String especialidade;
    private String crm;

    public Medico(int codigo, String nome, String crm, String telefone, String especialidade, String senha) throws Exception{
        super(codigo, nome, telefone, senha);
        setCrm(crm);
        setEspecialidade(especialidade);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception{
        if(crm == ""){
            throw new Exception("CRM nulo");
        } else {
            this.crm = crm;
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) throws Exception{
        if(especialidade == ""){
            throw new Exception("Especialidade inválida");
        } else {
            this.especialidade = especialidade;
        }
    }

    //----------------------------------------------------------------------

    public void mostrar(){
        System.out.println("Médico:" +
                "\n CRM: " + crm +
                "\n Especialidade: " + especialidade
        );

        super.Mostrar();
    }

}
