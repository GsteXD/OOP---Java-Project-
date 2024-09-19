/*Atribuindo uma classe abstrata, logo só realiza get and set*/
public abstract class Funcionario {
    private int codigo;
    private String nome;
    private String telefone;
    private String senha;

    //Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return senha;
    }

    //Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /*----------------------*/
    public void acessar(Receita receita, Exame exame, Paciente paciente, Consulta consulta) {
        //TODO
        System.out.println(receita.getData());
        System.out.println(receita.getDescritivo());
        System.out.println(exame.getData());
        System.out.println(exame.getConsulta());
        System.out.println(exame.getDescritivo());
        /*---------------------*/
        paciente.getNome();
        paciente.getCpf();
        paciente.getGenero();
        paciente.getTelefone();
        consulta.getData();
        consulta.getHistorico();
        consulta.getHora();
        consulta.getMedico();
        consulta.getMotivo();
        consulta.getPaciente();
    }

}