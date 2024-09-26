public class Agenda {
    private int codigo;
    private int hora;
    private int data;
    private Medico medico;
    private Paciente paciente;

    public Agenda() {

    }

    public Agenda(int codigo, int hora, int data, Medico medico, Paciente paciente) throws Exception {
        setCodigo(codigo);
        setHora(hora);
        setData(data);
        setMedico(medico);
        setPaciente(paciente);
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo) throws Exception {
        //TODO
        if(codigo == 0) {
            throw new Exception("Erro na implementação do código");
        } else {
            this.codigo = codigo;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) throws Exception {
        //TODO
        if(hora < 0 || hora > 25) {
            throw new Exception("Horário Inválido");
        } else {
            this.hora = hora;
        }

    }

    public int getData() {
        return data;
    }

    public void setData(int data) throws Exception {
        //TODO
        if(data < 0){
            throw new Exception("Data inválida");
        } else {
            this.data = data;
        }
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) throws NullPointerException{
        if(medico == null){
            throw new NullPointerException("Médico é nulo");
        } else {
            this.medico = medico;
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) throws NullPointerException {
        if(paciente == null) {
            throw new NullPointerException("Paciente é nulo.");
        }
        else{
            this.paciente = paciente;
        }
    }
    //-------------------------------//

    public void consultar() {
        //TODO
    }

    public void Mostrar() {
        System.out.println("Agenda:" +
                "\n Código: " + codigo +
                "\n Data: " + data +
                "\n Hora: " + hora
        );
        getPaciente().mostrar();
        getMedico().mostrar();
    }
}
