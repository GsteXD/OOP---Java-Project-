package Classes;
public class Exame extends Procedimento{

    public Exame(){

    }

    public Exame(int codigo, Consulta consulta, String data, String descritivo) throws Exception{
        setCodigo(codigo);
        setData(data);
        setDescritivo(descritivo);
    }

    //=======================================================
    public void solicitar(){
        //TODO
    }

    public void consultar(Consulta consulta, Medico medico) {
        super.consultar(consulta);
        System.out.println("MÉDICO: " + medico.getNome());
        System.out.println("CRM: " + medico.getCrm());
        System.out.println("TELEFONE: " + medico.getTelefone());
    }

    public void mostrar(){
        System.out.println("EXAME====================================");
        System.out.println("codigo: " + getCodigo());
        System.out.println("Data: " + getData());
        System.out.println("Descritivo" + getDescritivo());
    }

}
