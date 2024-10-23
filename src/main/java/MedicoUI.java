import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Classes.Medico;

public class MedicoUI extends JDialog{
    private Medico medico;
    //Componentes da interface
    private JTextField nomeField;
    private JTextField crmField;
    private JTextField especialidadeField;
    private JTextField telefoneField;
    private JPasswordField senhaField;
    private JButton cadastrarButton;    

    public MedicoUI(JFrame parent) {
        // Configurações da janela
        super(parent, true);
        setTitle("Cadastro de Médico");
        setSize(300, 200);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel que irá conter todos os campos
        JPanel formMedico = new JPanel(new GridLayout(5, 2));
        // Campos e botões
        nomeField = new JTextField();
        crmField = new JTextField();
        especialidadeField = new JTextField();
        telefoneField = new JTextField();
        senhaField = new JPasswordField();
        cadastrarButton = new JButton("Cadastrar");

        // Adicionando os componentes no painel
        formMedico.add(new JLabel("Nome:"));
        formMedico.add(nomeField);
        formMedico.add(new JLabel("CRM:"));
        formMedico.add(crmField);
        formMedico.add(new JLabel("Especialidade:"));
        formMedico.add(especialidadeField);
        formMedico.add(new JLabel("Telefone:"));
        formMedico.add(telefoneField);
        formMedico.add(new JLabel("Senha:"));
        formMedico.add(senhaField);

        // Alinhando o botão "Cadastrar"
        JPanel alignButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        alignButton.add(cadastrarButton);

        // Adicionando os painéis à janela
        add(formMedico, BorderLayout.CENTER);
        add(alignButton, BorderLayout.SOUTH);

        // Função de cadastro
        cadastrarButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validação e armazenamento dos dados
                String nome = nomeField.getText();
                String crm = crmField.getText();
                String especialidade = especialidadeField.getText();
                String telefone = telefoneField.getText();
                char[] senhaArray = senhaField.getPassword();
                
                //Converte o array char em senha para mostrar
                String senha = new String(senhaArray);

                try{
                    medico = new Medico(nome, crm, telefone, especialidade, senha);
                    JOptionPane.showMessageDialog(MedicoUI.this, "Médico cadastrado com sucesso!");
                    dispose();
                } catch(Exception exception){
                    // Trate qualquer exceção que possa ocorrer ao criar o médico
                    JOptionPane.showMessageDialog(MedicoUI.this, "Erro ao cadastrar o médico: " + exception.getMessage());
                }
            }
        });
    }
    // Retorna Médico para a main
    public Medico getMedico(){
        return medico;
    }
}
