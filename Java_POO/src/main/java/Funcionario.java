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
    public void acessar(Paciente paciente) {
        System.out.println("ACESSANDO INFO DO PACIENTE CÓDIGO " + paciente.getCodigo());
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Idade: " + paciente.getIdade());
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("Telefone: " + paciente.getTelefone());
    }

}