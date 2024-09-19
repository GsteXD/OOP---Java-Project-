import java.util.concurrent.atomic.AtomicInteger;

public class Funcionario {
    private int codigo;
    private String nome;
    private String telefone;
    private String senha;

    public Funcionario() {
    }

    public Funcionario(int codigo, String nome, String telefone, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
    }

    public void Mostrar() {
        System.out.println(
                "Funcionário:" +
                        "\n Código: " + codigo +
                        "\n Nome: " + nome +
                        "\n Telefone: " + telefone +
                        "\n Senha: " + senha
        );
    }

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
        receita.getData();
        receita.getConsulta();
        receita.getDescritivo();
        exame.getData();
        exame.getConsulta();
        exame.getDescritivo();
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