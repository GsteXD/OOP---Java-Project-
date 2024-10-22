import java.util.concurrent.atomic.AtomicInteger;
import java.util.Scanner;

public class Paciente {
    //Criando um ID estático para Paciente
    public static AtomicInteger codigo = new AtomicInteger(0);
    public static Scanner scanner = new Scanner(System.in);
    private int pacienteCodigo;

    private String nome;
    private String genero;
    private String telefone;
    private String cpf;
    private int idade;

    public Paciente(String nome, String genero, String telefone, String cpf, int idade) throws Exception {
        this.pacienteCodigo = codigo.incrementAndGet();
        setNome(nome);
        setIdade(idade);
        setGenero(genero);
        setTelefone(telefone);
        setCpf(cpf);
    }
    public Paciente() throws Exception{

    }

    public int getCodigo() {
        return pacienteCodigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception{
        if(nome.isEmpty() || !nome.matches("^[a-zA-Z\\s]+$")) {
            throw new Exception("Nome inválido");
        }
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero)  throws Exception{
        //TODO
        if(!genero.matches("^(M|F|O)$")) {
            throw new Exception("Genero nulo");
        }
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception{
        //TODO
        if(!telefone.matches("^\\d{10,11}$")) {
            throw new Exception("Telefone inválido");
        }
        this.telefone = telefone;  
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
        }
        this.idade = idade;
    }
    //-----------------------------------------------------------------------//

    //Pega os inputs colocado pelo usuário de maneira menos repetitiva em "cadastrar"
    private String getInput(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
    private int getIntInput(String message){
        while (true) {
            System.out.println(message);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: por favor, insira um número válido.");
            }
        }
    }
    public void cadastrar() throws Exception{
        setNome(getInput("Informe o nome do paciente: "));
        setTelefone(getInput("Informe o telefone do paciente: "));
        setCpf(getInput("Informe o CPF do paciente: "));
        setIdade(getIntInput("Informe a idade do paciente(apenas números): "));
        setGenero(getInput("Informe o gênero do paciente(M/F/O): "));
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
