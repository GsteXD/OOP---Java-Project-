import javax.swing.JFrame;
import Classes.Medico;
import Classes.Recepcionista;

public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        MedicoUI medico_dialog = new MedicoUI(frame);
        RecepcionistaUI recepcionista_dialog = new RecepcionistaUI(frame);

        medico_dialog.setVisible(true);
        Medico m1 = medico_dialog.getMedico();
        if (m1 != null) {
            m1.mostrar();
        }

        recepcionista_dialog.setVisible(true);
        Recepcionista r1 = recepcionista_dialog.getRecepcionista();
        if (r1 != null){
            r1.mostrar();
        }

    }
}
