import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Classes.Recepcionista;

public class RecepcionistaUI extends JDialog{
    private Recepcionista recepcionista;
    //Componentes da interface
    private JTextField nomeField;
    private JTextField cpfField;
    private JTextField telefoneField;
    private JPasswordField senhaField;
    private JButton cadastrarButton;    

    public RecepcionistaUI(JFrame parent) {
        // Configurações da janela
        super(parent, true);
        setTitle("Cadastro de Recepcionista");
        setSize(300, 200);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel que irá conter todos os campos
        JPanel formRecepcionista = new JPanel(new GridLayout(4, 2));
        // Campos e botões
        nomeField = new JTextField();
        cpfField = new JTextField();
        telefoneField = new JTextField();
        senhaField = new JPasswordField();
        cadastrarButton = new JButton("Cadastrar");

        // Adicionando os componentes no painel
        formRecepcionista.add(new JLabel("Nome:"));
        formRecepcionista.add(nomeField);
        formRecepcionista.add(new JLabel("CPF:"));
        formRecepcionista.add(cpfField);
        formRecepcionista.add(new JLabel("Telefone:"));
        formRecepcionista.add(telefoneField);
        formRecepcionista.add(new JLabel("Senha:"));
        formRecepcionista.add(senhaField);

        // Alinhando o botão "Cadastrar"
        JPanel alignButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        alignButton.add(cadastrarButton);

        // Adicionando os painéis à janela
        add(formRecepcionista, BorderLayout.CENTER);
        add(alignButton, BorderLayout.SOUTH);

        // Função de cadastro
        cadastrarButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validação e armazenamento dos dados
                String nome = nomeField.getText();
                String cpf = cpfField.getText();
                String telefone = telefoneField.getText();
                char[] senhaArray = senhaField.getPassword();
                
                // Converte o array char em senha para mostrar
                String senha = new String(senhaArray);

                try{
                    recepcionista = new Recepcionista(nome, cpf, telefone, senha);
                    JOptionPane.showMessageDialog(RecepcionistaUI.this, "Médico cadastrado com sucesso!");
                    dispose();
                } catch(Exception exception){
                    // Trate qualquer exceção que possa ocorrer ao criar o médico
                    JOptionPane.showMessageDialog(RecepcionistaUI.this, "Erro ao cadastrar o médico: " + exception.getMessage());
                }
            }
        });
    }
    // Retorna recepcionista para main
    public Recepcionista getRecepcionista(){
        return recepcionista;
    }
}
