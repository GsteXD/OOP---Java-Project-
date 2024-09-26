import java.util.concurrent.atomic.AtomicInteger;

public class Paciente {
    private static AtomicInteger codigo = new AtomicInteger();

    private String nome;
    private String genero;
    private String telefone;
    private String cpf;
    private int idade;

    public Paciente( String nome, String genero, String telefone, String cpf, int idade) throws Exception {
        setNome(nome);
        setIdade(idade);
        setGenero(genero);
        setTelefone(telefone);
        setCpf(cpf);
    }

    public AtomicInteger getCodigo() {
        codigo.getAndIncrement();
        return codigo;
    }

    public void setCodigo(AtomicInteger codigo) throws NullPointerException{
        //TODO
        codigo.getAndIncrement();
        if(codigo == null) {
            throw new NullPointerException("Erro na implementação do código");
        } else {
            this.codigo = codigo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception{
        //TODO
        if(nome == "") {
            throw new Exception("Nome nulo");
        } else {
            this.nome = nome;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero)  throws Exception{
        //TODO
        if(genero == "") {
            throw new Exception("Genero nulo");
        } else {
            this.genero = genero;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception{
        //TODO
        if(telefone == "") {
            throw new Exception("Telefone inválido");
        } else {
            this.telefone = telefone;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception{
        //TODO
        if(cpf == "") {
            throw new Exception("Erro na implementação do cpf");
        } else {
            this.cpf = cpf;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception{
        //TODO
        if(idade < 0) {
            throw new Exception("Idade inválida");
        } else {
            this.idade = idade;
        }
    }
    //-----------------------------------------------------------------------//
    public void cadastrar(){
        //TODO


    }

    public void consultar(){
        //TODO
    }

    public void mostrar(){
        System.out.println("PACIENTE=========================================");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Genero: " + getGenero());
        System.out.println("Idade: " + getIdade());
    }
}
