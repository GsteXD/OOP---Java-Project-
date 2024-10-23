package Classes;
import java.util.List;

public class Consulta extends Agenda{
    private String motivo;
    private String historico;
    private List<Exame> exames;
    private List<Receita> receitas;

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public Consulta(int codigo, int data, int hora, Medico medico, Paciente paciente, String motivo, String historico) throws Exception{
        setCodigo(codigo);
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
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
        System.out.println("CONSULTA>>>>>>>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("data:"+ getData());
        System.out.println("hora:"+ getHora());
        getMedico().mostrar();
        getPaciente().mostrar();
        System.out.println("motivo:"+ getMotivo());
        System.out.println("historico:"+ getHistorico());
        for (Receita obj: getReceitas()) {
            obj.mostrar();
        }
        for(Exame obj: getExames()){
            obj.mostrar();
        }
    }
}
