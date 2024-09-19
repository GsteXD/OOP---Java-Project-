import java.util.List;

public class Consulta extends Agenda{
    private String motivo;
    private String historico;
    private List<Paciente> paciente;
    private List<Agenda> agenda;

    public Consulta(int codigo, int data, int hora, Medico medico, Paciente paciente, String motivo, String historico) throws Exception{
        super(codigo, hora, data, medico, paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) throws Exception{
        if(motivo == "") {
            throw new Exception("Motivo inválido");
        } else {
            this.motivo = motivo;
        }

    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) throws Exception{
        if(historico == ""){
            throw new Exception("Histórico nulo");
        } else {
            this.historico = historico;
        }
    }
    //------------------------//
    public void marcar(){
        //TODO
    }

    public void cancelar(){
        //TODO
    }

    public void consultar(){
        //TODO
    }

    public void realizar(){
        //TODO
    }

    public void atualizar(){
        //TODO
    }

    public void mostrar(){
        System.out.println("Consulta:" +
                "\n Motivo: " + motivo +
                "\n Histórico: " + historico
        );
        super.Mostrar();
    }
}
