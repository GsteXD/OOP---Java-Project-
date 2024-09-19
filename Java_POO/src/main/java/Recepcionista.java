import jdk.swing.interop.SwingInterOpUtils;

public class Recepcionista extends Funcionario{
    private String cpf;

    public Recepcionista(int codigo, String nome, String cpf, String telefone, String senha) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSenha(senha);
    }

    public String getCpf() {
        return cpf;
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
        System.out.println("Recepcionista:" +
                "\n Código" + getCodigo() +
                "\n Nome: " + getNome() +
                "\n Cpf: " + cpf +
                "z"
        );
    }
}
