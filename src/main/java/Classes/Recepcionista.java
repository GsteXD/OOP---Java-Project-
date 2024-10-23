package Classes;
import java.util.concurrent.atomic.AtomicInteger;

public class Recepcionista extends Funcionario{
    private AtomicInteger codigo = new AtomicInteger(0);
    private String cpf;
    private int recepcionistaCodigo;

    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        setCodigo(recepcionistaCodigo);
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSenha(senha);
    }

    public int getCodigo(){
        return recepcionistaCodigo;
    }
    public String getCpf(){
        return cpf;
    }

    public void setCodigo(int recepcionistaCodigo) throws Exception{
        this.recepcionistaCodigo = codigo.getAndIncrement();
    }
    public void setCpf(String cpf) throws Exception{
        //TODO
        if(cpf == "") {
            throw new Exception("CPF da Recepcionista nulo");
        } else {
            this.cpf = cpf;
        }
    }

    //=================================================================

    public void mostrar(){
        System.out.println("RECEPCIONISTA>>>>>>>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("nome:"+ getNome());
        System.out.println("cpf:"+ getCpf());
        System.out.println("telefone:"+ getTelefone());
        System.out.println("senha:"+ getSenha());
    }

    public  void acessar(Paciente paciente, Consulta consulta){
        super.acessar(paciente);
        System.out.println("INFO CONSULTA : ----------------------");
        System.out.println("Data: " + consulta.getData());
        System.out.println("Histórico: " + consulta.getHistorico());
        System.out.println("Paciente: " + consulta.getPaciente());
        System.out.println("Médico " + consulta.getMedico());
        System.out.println("Exames: " + consulta.getExames());

    }

    public void consultar(Paciente obj) throws Exception {
        obj.mostrar();
    }
}
