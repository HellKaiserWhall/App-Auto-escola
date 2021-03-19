package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfRG;
	private JTextField tfNomePai;
	private JTextField tfNomeMae;
	private JTextField tfCargo;
	private JTextField tfCredencial;
	private JTextField tfCNH;
	private JTextField tfNumeroFilhos;
	private JTextField tfCidade;
	private JTextField tfBairro;
	private JTextField tfNumeroCasa;
	private JTextField tfEndereco;
	private JTextField tfEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * um metódo para mascarar um text field
	 * @param recebe o formato da máscara
	 * @return retorna o formato da máscara
	 */
	public MaskFormatter Mascara(String Mascara){
        
        MaskFormatter F_Mascara = new MaskFormatter();
        try{
            F_Mascara.setMask(Mascara); //Atribui a mascara
            F_Mascara.setPlaceholderCharacter(' '); //Caracter para preencimento 
        }
        catch (Exception excecao) {
        excecao.printStackTrace();
        } 
        return F_Mascara;
 } 

	/**
	 * Create the frame.
	 */
	public CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 100, 1046, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 1046, 523);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Century", Font.BOLD, 16));
		lbNome.setBounds(80, 108, 61, 20);
		panel.add(lbNome);
		
		JLabel lbRG = new JLabel("RG:");
		lbRG.setFont(new Font("Century", Font.BOLD, 16));
		lbRG.setBounds(101, 141, 40, 20);
		panel.add(lbRG);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Century", Font.BOLD, 16));
		lblCpf.setBounds(295, 141, 51, 20);
		panel.add(lblCpf);
		
		JLabel lbTelefone = new JLabel("Telefone:");
		lbTelefone.setFont(new Font("Century", Font.BOLD, 16));
		lbTelefone.setBounds(56, 174, 85, 20);
		panel.add(lbTelefone);
		
		JLabel lbDataNasc = new JLabel("Data de Nascimento:");
		lbDataNasc.setFont(new Font("Century", Font.BOLD, 16));
		lbDataNasc.setBounds(318, 174, 180, 20);
		panel.add(lbDataNasc);
		
		JLabel lbNomePai = new JLabel("Nome do Pai:");
		lbNomePai.setFont(new Font("Century", Font.BOLD, 16));
		lbNomePai.setBounds(23, 207, 118, 20);
		panel.add(lbNomePai);
		
		JLabel lbNomeMae = new JLabel("Nome da M\u00E3e:");
		lbNomeMae.setFont(new Font("Century", Font.BOLD, 16));
		lbNomeMae.setBounds(15, 240, 126, 20);
		panel.add(lbNomeMae);
		
		JLabel lbCargo = new JLabel("Cargo:");
		lbCargo.setFont(new Font("Century", Font.BOLD, 16));
		lbCargo.setBounds(80, 273, 64, 20);
		panel.add(lbCargo);
		
		JLabel lbDataAdmissao = new JLabel("Data de Admiss\u00E3o:");
		lbDataAdmissao.setFont(new Font("Century", Font.BOLD, 16));
		lbDataAdmissao.setBounds(294, 273, 162, 20);
		panel.add(lbDataAdmissao);
		
		JLabel lbCredencial = new JLabel("N\u00B0 Credencial:");
		lbCredencial.setFont(new Font("Century", Font.BOLD, 16));
		lbCredencial.setBounds(12, 306, 129, 20);
		panel.add(lbCredencial);
		
		JLabel lbCNH = new JLabel("N\u00B0 CNH:");
		lbCNH.setFont(new Font("Century", Font.BOLD, 16));
		lbCNH.setBounds(294, 306, 80, 20);
		panel.add(lbCNH);
		
		JLabel lbNumeroFilhos = new JLabel("N\u00B0 de Filhos:");
		lbNumeroFilhos.setFont(new Font("Century", Font.BOLD, 16));
		lbNumeroFilhos.setBounds(527, 306, 115, 20);
		panel.add(lbNumeroFilhos);
		
		JLabel lbCidade = new JLabel("Cidade:");
		lbCidade.setFont(new Font("Century", Font.BOLD, 16));
		lbCidade.setBounds(69, 339, 72, 20);
		panel.add(lbCidade);
		
		JLabel lbBairro = new JLabel("Bairro:");
		lbBairro.setFont(new Font("Century", Font.BOLD, 16));
		lbBairro.setBounds(347, 339, 68, 20);
		panel.add(lbBairro);
		
		JLabel lbNumeroCasa = new JLabel("N\u00B0:");
		lbNumeroCasa.setFont(new Font("Century", Font.BOLD, 16));
		lbNumeroCasa.setBounds(625, 339, 34, 20);
		panel.add(lbNumeroCasa);
		
		JLabel lbEndereco = new JLabel("Endere\u00E7o:");
		lbEndereco.setFont(new Font("Century", Font.BOLD, 16));
		lbEndereco.setBounds(50, 372, 91, 20);
		panel.add(lbEndereco);
		
		JLabel lbEmail = new JLabel("Email:");
		lbEmail.setFont(new Font("Century", Font.BOLD, 16));
		lbEmail.setBounds(77, 405, 64, 20);
		panel.add(lbEmail);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Century", Font.PLAIN, 16));
		tfNome.setBounds(147, 105, 445, 27);
		panel.add(tfNome);
		tfNome.setColumns(10);
		
		tfRG = new JTextField();
		tfRG.setFont(new Font("Century", Font.PLAIN, 16));
		tfRG.setBounds(147, 138, 142, 27);
		panel.add(tfRG);
		tfRG.setColumns(10);
		
		tfNomePai = new JTextField();
		tfNomePai.setFont(new Font("Century", Font.PLAIN, 16));
		tfNomePai.setBounds(147, 204, 445, 27);
		panel.add(tfNomePai);
		tfNomePai.setColumns(10);
		
		tfNomeMae = new JTextField();
		tfNomeMae.setFont(new Font("Century", Font.PLAIN, 16));
		tfNomeMae.setBounds(147, 237, 445, 27);
		panel.add(tfNomeMae);
		tfNomeMae.setColumns(10);
		
		tfCargo = new JTextField();
		tfCargo.setFont(new Font("Century", Font.PLAIN, 16));
		tfCargo.setBounds(147, 270, 141, 27);
		panel.add(tfCargo);
		tfCargo.setColumns(10);
		
		tfCredencial = new JTextField();
		tfCredencial.setFont(new Font("Century", Font.PLAIN, 16));
		tfCredencial.setBounds(147, 303, 141, 27);
		panel.add(tfCredencial);
		tfCredencial.setColumns(10);
		
		tfCNH = new JTextField();
		tfCNH.setFont(new Font("Century", Font.PLAIN, 16));
		tfCNH.setBounds(380, 303, 141, 27);
		panel.add(tfCNH);
		tfCNH.setColumns(10);
		
		tfNumeroFilhos = new JTextField();
		tfNumeroFilhos.setFont(new Font("Century", Font.PLAIN, 16));
		tfNumeroFilhos.setBounds(648, 303, 60, 27);
		panel.add(tfNumeroFilhos);
		tfNumeroFilhos.setColumns(10);
		
		tfCidade = new JTextField();
		tfCidade.setFont(new Font("Century", Font.PLAIN, 16));
		tfCidade.setBounds(147, 336, 194, 27);
		panel.add(tfCidade);
		tfCidade.setColumns(10);
		
		tfBairro = new JTextField();
		tfBairro.setFont(new Font("Century", Font.PLAIN, 16));
		tfBairro.setBounds(421, 336, 198, 27);
		panel.add(tfBairro);
		tfBairro.setColumns(10);
		
		tfNumeroCasa = new JTextField();
		tfNumeroCasa.setFont(new Font("Century", Font.PLAIN, 16));
		tfNumeroCasa.setBounds(665, 336, 43, 27);
		panel.add(tfNumeroCasa);
		tfNumeroCasa.setColumns(10);
		
		tfEndereco = new JTextField();
		tfEndereco.setFont(new Font("Century", Font.PLAIN, 16));
		tfEndereco.setBounds(147, 369, 376, 27);
		panel.add(tfEndereco);
		tfEndereco.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Century", Font.PLAIN, 16));
		tfEmail.setBounds(147, 402, 283, 27);
		panel.add(tfEmail);
		tfEmail.setColumns(10);
		
		JFormattedTextField ftfCPF = new JFormattedTextField(Mascara("###.###.###-##"));
		ftfCPF.setFont(new Font("Century", Font.PLAIN, 16));
		ftfCPF.setBounds(352, 138, 126, 27);
		panel.add(ftfCPF);
		
		JFormattedTextField ftfTelefone = new JFormattedTextField(Mascara("(##) #####-####"));
		ftfTelefone.setFont(new Font("Century", Font.PLAIN, 16));
		ftfTelefone.setBounds(147, 171, 141, 27);
		panel.add(ftfTelefone);
		
		JFormattedTextField ftfDataNasc = new JFormattedTextField(Mascara("##/##/####"));
		ftfDataNasc.setFont(new Font("Century", Font.PLAIN, 16));
		ftfDataNasc.setBounds(504, 169, 162, 27);
		panel.add(ftfDataNasc);
				
		JFormattedTextField ftfDataAdmissao = new JFormattedTextField(Mascara("##/##/####"));
		ftfDataAdmissao.setFont(new Font("Century", Font.PLAIN, 16));
		ftfDataAdmissao.setBounds(457, 270, 209, 27);
		panel.add(ftfDataAdmissao);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(0, 0, 1046, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbCadastroFuncionario = new JLabel("Cadastro de Funcion\u00E1rio");
		lbCadastroFuncionario.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbCadastroFuncionario.setBounds(21, 9, 278, 33);
		panel_1.add(lbCadastroFuncionario);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrutor f = new Instrutor(tfNome.getText(), ftfCPF.getText(), tfRG.getText(), 
						ftfDataNasc.getText(), tfNomePai.getText(), tfNomeMae.getText(), tfCidade.getText(),
						tfBairro.getText(), Integer.parseInt(tfNumeroCasa.getText()), tfEndereco.getText(), tfEmail.getText(),
						ftfTelefone.getText());
				Instrutor f2 = new Instrutor(tfCargo.getText(), ftfDataAdmissao.getText(), 
						Integer.parseInt(tfCredencial.getText()), tfCNH.getText(), 
						Integer.parseInt(tfNumeroFilhos.getText()));
				InstrutorDAO daoF = new InstrutorDAO();
				JOptionPane.showMessageDialog(null, (daoF.cadastrar(f, f2)));
				
				tfNome.setText("");
				ftfCPF.setText("");
				tfRG.setText("");
				ftfDataNasc.setText("");
				tfNomePai.setText("");
				tfNomeMae.setText("");
				tfCidade.setText("");
				tfBairro.setText("");
				tfNumeroCasa.setText("");
				tfEndereco.setText("");
				tfEmail.setText("");
				ftfTelefone.setText("");
				tfCargo.setText("");
				ftfDataAdmissao.setText("");
				tfCredencial.setText("");
				tfCNH.setText("");
				tfNumeroFilhos.setText("");
			}
		});
		btCadastrar.setFont(new Font("Century", Font.BOLD, 14));
		btCadastrar.setBackground(Color.YELLOW);
		btCadastrar.setBounds(851, 128, 162, 81);
		panel.add(btCadastrar);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btFechar.setFont(new Font("Century", Font.BOLD, 14));
		btFechar.setBackground(Color.YELLOW);
		btFechar.setBounds(851, 315, 162, 81);
		panel.add(btFechar);
	}
}
