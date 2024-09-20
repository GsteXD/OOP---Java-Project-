public class Medico extends Funcionario{
    private String especialidade;
    private String crm;

    public Medico(int codigo, String nome, String crm, String telefone, String especialidade, String senha) throws Exception{
        setCodigo(codigo);
        setNome(nome);
        setTelefone(telefone);
        setCrm(crm);
        setEspecialidade(especialidade);
        setSenha(senha);
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
    public void receitar(Consulta obj) throws Exception{
        Receita novaReceita = new Receita(1, obj,"2024-10-09", "dipirona");
        obj.getReceitas().add(novaReceita);

        Exame novoExame = new Exame(1, obj,"2024-09-12", "Raio x torax");
        obj.getExames().add(novoExame);

    }

    public void acessar(Paciente paciente, Exame exame){
        super.acessar(paciente);
        System.out.println("INFO EXAME : ----------------------");
        System.out.println("Código " + exame.getCodigo());
        System.out.println("Data: " + exame.getData());
        System.out.println("Descritivo: " + exame.getDescritivo());
    }

    public void mostrar(){
        System.out.println("Médico:" +
                "\n Código: " + getCodigo() +
                "\n CRM: " + crm +
                "\n Nome: " + getNome() +
                "\n Especialidade: " + especialidade +
                "\n Telefone: " + getTelefone() +
                "\n Senha: " + getSenha()
        );
    }
}
