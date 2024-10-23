package Classes;
public class Receita extends Procedimento{

    public Receita() {

    }

    public Receita(int codigo, Consulta consulta, String data, String descritivo) throws Exception {
        setCodigo(codigo);
        setData(data);
        setDescritivo(descritivo);
    }

    //=======================================================
    public void preescrever(){
        //TODO
    }

    public void consultar(){
        //TODO
    }

    public void mostrar(){
        System.out.println("RECEITA====================================");
        System.out.println("Código: " + getCodigo());
        System.out.println("Data: " + getData());
        System.out.println("Descritivo" + getDescritivo());
    }
}
