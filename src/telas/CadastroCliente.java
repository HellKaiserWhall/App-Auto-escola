package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.text.MaskFormatter;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomeCliente;
	private JTextField tfRG;
	private JTextField tfNomePai;
	private JTextField tfNomeMae;
	private JTextField tfNacionalidade;
	private JTextField tfProfissao;
	private JTextField tfEscolaridade;
	private JTextField tfEndereco;
	private JTextField tfBairro;
	private JTextField tfPGU;
	private JTextField tfEmail;
	private JTextField tfCategoria;
	private JTextField tfNaturalidade;
	private JTextField tfEstadoCivil;
	private JTextField tfCidade;
	private JTextField tfNumeroCasa;
	private JTextField tfValor;
	private JTextField tfValorpagar;
	private JTextField tfValorEntrada;
	private JTextField tfValorParcela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
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
	public CadastroCliente() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 0, 978, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(new Rectangle(0, 0, 978, 708));
		panel.setBounds(0, 0, 978, 708);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(0, 0, 978, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbCadastroCliente = new JLabel("Cadastro de Cliente");
		lbCadastroCliente.setForeground(Color.BLACK);
		lbCadastroCliente.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbCadastroCliente.setBounds(21, 9, 226, 33);
		panel_1.add(lbCadastroCliente);
		
		JLabel lbNomeMae = new JLabel("Nome da m\u00E3e: ");
		lbNomeMae.setFont(new Font("Century", Font.BOLD, 16));
		lbNomeMae.setBounds(57, 178, 126, 20);
		panel.add(lbNomeMae);
		
		JLabel lbNomeCliente = new JLabel("Nome completo:");
		lbNomeCliente.setFont(new Font("Century", Font.BOLD, 16));
		lbNomeCliente.setBounds(44, 79, 139, 20);
		panel.add(lbNomeCliente);
		
		JLabel lbRGcliente = new JLabel("RG:");
		lbRGcliente.setFont(new Font("Century", Font.BOLD, 15));
		lbRGcliente.setBounds(143, 114, 40, 20);
		panel.add(lbRGcliente);
		
		JLabel lbNomePai = new JLabel("Nome do pai:");
		lbNomePai.setFont(new Font("Century", Font.BOLD, 16));
		lbNomePai.setBounds(65, 145, 118, 20);
		panel.add(lbNomePai);
		
		JLabel lbNacionalidade = new JLabel("Nacionalidade:");
		lbNacionalidade.setFont(new Font("Century", Font.BOLD, 16));
		lbNacionalidade.setBounds(50, 211, 133, 20);
		panel.add(lbNacionalidade);
		
		JLabel lbProfissao = new JLabel("Profiss\u00E3o:");
		lbProfissao.setFont(new Font("Century", Font.BOLD, 16));
		lbProfissao.setBounds(93, 244, 90, 20);
		panel.add(lbProfissao);
		
		JLabel lbEscolaridade = new JLabel("Escolaridade:");
		lbEscolaridade.setFont(new Font("Century", Font.BOLD, 16));
		lbEscolaridade.setBounds(62, 277, 121, 20);
		panel.add(lbEscolaridade);
		
		JLabel lbBairro = new JLabel("Bairro:");
		lbBairro.setFont(new Font("Century", Font.BOLD, 16));
		lbBairro.setBounds(114, 343, 68, 20);
		panel.add(lbBairro);
		
		JLabel lbEndereco = new JLabel("Endere\u00E7o:");
		lbEndereco.setFont(new Font("Century", Font.BOLD, 16));
		lbEndereco.setBounds(91, 310, 91, 20);
		panel.add(lbEndereco);
		
		JLabel lbTelefone = new JLabel("Telefone:");
		lbTelefone.setFont(new Font("Century", Font.BOLD, 16));
		lbTelefone.setBounds(97, 376, 85, 20);
		panel.add(lbTelefone);
		
		JLabel lbEmail = new JLabel("Email:");
		lbEmail.setFont(new Font("Century", Font.BOLD, 16));
		lbEmail.setBounds(118, 409, 64, 20);
		panel.add(lbEmail);
		
		JLabel lbPGU = new JLabel("PGU:");
		lbPGU.setFont(new Font("Century", Font.BOLD, 16));
		lbPGU.setBounds(129, 442, 53, 20);
		panel.add(lbPGU);
		
		JLabel lbCategoria = new JLabel("Categoria:");
		lbCategoria.setFont(new Font("Century", Font.BOLD, 16));
		lbCategoria.setBounds(86, 475, 96, 20);
		panel.add(lbCategoria);
		
		JLabel lbCPF = new JLabel("CPF:");
		lbCPF.setFont(new Font("Century", Font.BOLD, 16));
		lbCPF.setBounds(620, 79, 51, 20);
		panel.add(lbCPF);
		
		JLabel lbDataNasc = new JLabel("Data de Nascimento:");
		lbDataNasc.setFont(new Font("Century", Font.BOLD, 16));
		lbDataNasc.setBounds(337, 114, 180, 20);
		panel.add(lbDataNasc);
		
		JLabel lbNaturalidade = new JLabel("Naturalidade:");
		lbNaturalidade.setFont(new Font("Century", Font.BOLD, 16));
		lbNaturalidade.setBounds(395, 211, 125, 20);
		panel.add(lbNaturalidade);
		
		JLabel lbEstadoCivil = new JLabel("Estado Civil:");
		lbEstadoCivil.setFont(new Font("Century", Font.BOLD, 16));
		lbEstadoCivil.setBounds(403, 244, 117, 20);
		panel.add(lbEstadoCivil);
		
		JLabel lbCidade = new JLabel("Cidade:");
		lbCidade.setFont(new Font("Century", Font.BOLD, 16));
		lbCidade.setBounds(354, 277, 72, 20);
		panel.add(lbCidade);
		
		JLabel lbNumeroCasa = new JLabel("N\u00FAmero da casa:");
		lbNumeroCasa.setFont(new Font("Century", Font.BOLD, 16));
		lbNumeroCasa.setBounds(394, 343, 151, 20);
		panel.add(lbNumeroCasa);
		
		tfNomeCliente = new JTextField();
		tfNomeCliente.setFont(new Font("Century", Font.PLAIN, 16));
		tfNomeCliente.setBounds(189, 76, 421, 27);
		panel.add(tfNomeCliente);
		tfNomeCliente.setColumns(10);
		
		tfRG = new JTextField();
		tfRG.setFont(new Font("Century", Font.PLAIN, 16));
		tfRG.setBounds(189, 109, 142, 27);
		panel.add(tfRG);
		tfRG.setColumns(10);
		
		tfNomePai = new JTextField();
		tfNomePai.setFont(new Font("Century", Font.PLAIN, 16));
		tfNomePai.setBounds(189, 142, 421, 27);
		panel.add(tfNomePai);
		tfNomePai.setColumns(10);
		
		tfNomeMae = new JTextField();
		tfNomeMae.setFont(new Font("Century", Font.PLAIN, 16));
		tfNomeMae.setBounds(189, 175, 421, 27);
		panel.add(tfNomeMae);
		tfNomeMae.setColumns(10);
		
		tfNacionalidade = new JTextField();
		tfNacionalidade.setFont(new Font("Century", Font.PLAIN, 16));
		tfNacionalidade.setBounds(189, 208, 200, 27);
		panel.add(tfNacionalidade);
		tfNacionalidade.setColumns(10);
		
		tfProfissao = new JTextField();
		tfProfissao.setFont(new Font("Century", Font.PLAIN, 16));
		tfProfissao.setBounds(188, 241, 200, 27);
		panel.add(tfProfissao);
		tfProfissao.setColumns(10);
		
		tfEscolaridade = new JTextField();
		tfEscolaridade.setFont(new Font("Century", Font.PLAIN, 16));
		tfEscolaridade.setBounds(188, 274, 160, 27);
		panel.add(tfEscolaridade);
		tfEscolaridade.setColumns(10);
		
		tfEndereco = new JTextField();
		tfEndereco.setFont(new Font("Century", Font.PLAIN, 16));
		tfEndereco.setBounds(188, 307, 421, 27);
		panel.add(tfEndereco);
		tfEndereco.setColumns(10);
		
		tfBairro = new JTextField();
		tfBairro.setFont(new Font("Century", Font.PLAIN, 16));
		tfBairro.setBounds(188, 340, 200, 27);
		panel.add(tfBairro);
		tfBairro.setColumns(10);
		
		tfPGU = new JTextField();
		tfPGU.setFont(new Font("Century", Font.PLAIN, 16));
		tfPGU.setBounds(188, 439, 200, 27);
		panel.add(tfPGU);
		tfPGU.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Century", Font.PLAIN, 16));
		tfEmail.setBounds(188, 406, 421, 27);
		panel.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfCategoria = new JTextField();
		tfCategoria.setFont(new Font("Century", Font.PLAIN, 16));
		tfCategoria.setBounds(188, 472, 48, 27);
		panel.add(tfCategoria);
		tfCategoria.setColumns(10);
		
		JFormattedTextField ftfCPF = new JFormattedTextField(Mascara("###.###.###-##"));
		ftfCPF.setFont(new Font("Century", Font.PLAIN, 16));
		ftfCPF.setBounds(677, 76, 126, 27);
		panel.add(ftfCPF);
		
		JFormattedTextField ftfTelefone = new JFormattedTextField(Mascara("(##) #####-####"));
		ftfTelefone.setFont(new Font("Century", Font.PLAIN, 16));
		ftfTelefone.setBounds(188, 373, 141, 27);
		panel.add(ftfTelefone);
		
		tfNaturalidade = new JTextField();
		tfNaturalidade.setFont(new Font("Century", Font.PLAIN, 16));
		tfNaturalidade.setBounds(526, 208, 160, 27);
		panel.add(tfNaturalidade);
		tfNaturalidade.setColumns(10);
		
		tfEstadoCivil = new JTextField();
		tfEstadoCivil.setFont(new Font("Century", Font.PLAIN, 16));
		tfEstadoCivil.setBounds(526, 241, 160, 27);
		panel.add(tfEstadoCivil);
		tfEstadoCivil.setColumns(10);
		
		tfCidade = new JTextField();
		tfCidade.setFont(new Font("Century", Font.PLAIN, 16));
		tfCidade.setBounds(432, 274, 200, 27);
		panel.add(tfCidade);
		tfCidade.setColumns(10);
		
		tfNumeroCasa = new JTextField();
		tfNumeroCasa.setFont(new Font("Century", Font.PLAIN, 16));
		tfNumeroCasa.setBounds(551, 340, 48, 27);
		panel.add(tfNumeroCasa);
		tfNumeroCasa.setColumns(10);
		
		JLabel lbInicioMatricula = new JLabel("In\u00EDcio da Matr\u00EDcula:");
		lbInicioMatricula.setFont(new Font("Century", Font.BOLD, 16));
		lbInicioMatricula.setBounds(9, 510, 173, 20);
		panel.add(lbInicioMatricula);
		
		JLabel lbFimMatricula = new JLabel("Fim da Matr\u00EDcula:");
		lbFimMatricula.setFont(new Font("Century", Font.BOLD, 16));
		lbFimMatricula.setBounds(23, 543, 158, 20);
		panel.add(lbFimMatricula);
		
		JLabel lbValorPagar = new JLabel("Valor a pagar:");
		lbValorPagar.setFont(new Font("Century", Font.BOLD, 16));
		lbValorPagar.setBounds(55, 574, 128, 20);
		panel.add(lbValorPagar);
		
		JLabel lbVencimento1 = new JLabel("1\u00B0 vencimento:");
		lbVencimento1.setFont(new Font("Century", Font.BOLD, 16));
		lbVencimento1.setBounds(52, 609, 130, 20);
		panel.add(lbVencimento1);
		
		JLabel lbVencimento2 = new JLabel("2\u00B0 vencimento:");
		lbVencimento2.setFont(new Font("Century", Font.BOLD, 16));
		lbVencimento2.setBounds(52, 642, 130, 20);
		panel.add(lbVencimento2);
		
		JLabel lbVencimento3 = new JLabel("3\u00B0 vencimento:");
		lbVencimento3.setFont(new Font("Century", Font.BOLD, 16));
		lbVencimento3.setBounds(53, 675, 130, 20);
		panel.add(lbVencimento3);
		
		JLabel lbValorEntrada = new JLabel("Valor de entrada:");
		lbValorEntrada.setFont(new Font("Century", Font.BOLD, 16));
		lbValorEntrada.setBounds(292, 574, 154, 20);
		panel.add(lbValorEntrada);
		
		JLabel lbValor = new JLabel("Valor:");
		lbValor.setFont(new Font("Century", Font.BOLD, 16));
		lbValor.setBounds(551, 510, 60, 20);
		panel.add(lbValor);
		
		JLabel lbFormaPagamento = new JLabel("Forma de pagamento:");
		lbFormaPagamento.setFont(new Font("Century", Font.BOLD, 16));
		lbFormaPagamento.setBounds(551, 543, 188, 20);
		panel.add(lbFormaPagamento);
		
		JLabel lbValorParcelas = new JLabel("Valor das parcelas:");
		lbValorParcelas.setFont(new Font("Century", Font.BOLD, 16));
		lbValorParcelas.setBounds(555, 574, 167, 20);
		panel.add(lbValorParcelas);
		
		JCheckBox chbStatus1 = new JCheckBox("Status de pagamento");
		chbStatus1.setFont(new Font("Century", Font.PLAIN, 16));
		chbStatus1.setBounds(579, 608, 183, 24);
		panel.add(chbStatus1);
		
		JCheckBox chbStatus2 = new JCheckBox("Status de pagamento");
		chbStatus2.setFont(new Font("Century", Font.PLAIN, 16));
		chbStatus2.setBounds(579, 641, 183, 24);
		panel.add(chbStatus2);
		
		JCheckBox chbStatus3 = new JCheckBox("Status de pagamento");
		chbStatus3.setFont(new Font("Century", Font.PLAIN, 16));
		chbStatus3.setBounds(580, 674, 183, 24);
		panel.add(chbStatus3);
		
		tfValor = new JTextField();
		tfValor.setFont(new Font("Century", Font.PLAIN, 16));
		tfValor.setBounds(617, 505, 97, 27);
		panel.add(tfValor);
		tfValor.setColumns(10);
		
		tfValorpagar = new JTextField();
		tfValorpagar.setEditable(true);
		tfValorpagar.setFont(new Font("Century", Font.PLAIN, 16));
		tfValorpagar.setBounds(189, 571, 97, 27);
		panel.add(tfValorpagar);
		tfValorpagar.setColumns(10);
				
		tfValorEntrada = new JTextField();
		tfValorEntrada.setFont(new Font("Century", Font.PLAIN, 16));
		tfValorEntrada.setBounds(448, 571, 97, 27);
		panel.add(tfValorEntrada);
		tfValorEntrada.setColumns(10);
		
		tfValorParcela = new JTextField();
		tfValorParcela.setFont(new Font("Century", Font.PLAIN, 16));
		tfValorParcela.setBounds(728, 571, 138, 27);
		panel.add(tfValorParcela);
		tfValorParcela.setColumns(10);
		
		JComboBox cbPagamento = new JComboBox();
		cbPagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbPagamento.getSelectedItem().toString() == "Credito") {
					double valor = Double.parseDouble(tfValor.getText());
					valor = valor*1.05;
					tfValorpagar.setText(Double.toString(valor));
				}
				else if(cbPagamento.getSelectedItem().toString() == "Debito") {
					double valor = Double.parseDouble(tfValor.getText());
					valor = valor*0.97;
					tfValorpagar.setText(Double.toString(valor));
				}
				else {
						double valor = Double.parseDouble(tfValor.getText());
						valor = valor*0.96;
						tfValorpagar.setText(Double.toString(valor));
				}
			}
		});
		cbPagamento.setModel(new DefaultComboBoxModel(new String[] {"Credito", "Debito", "Dinheiro"}));
		cbPagamento.setFont(new Font("Century", Font.PLAIN, 16));
		cbPagamento.setBounds(745, 537, 121, 28);
		panel.add(cbPagamento);		
		
		JFormattedTextField tftVencimento1 = new JFormattedTextField(Mascara("##/##/####"));
		tftVencimento1.setFont(new Font("Century", Font.PLAIN, 16));
		tftVencimento1.setBounds(188, 604, 357, 27);
		panel.add(tftVencimento1);
				
		JFormattedTextField tftVencimento2 = new JFormattedTextField(Mascara("##/##/####"));
		tftVencimento2.setFont(new Font("Century", Font.PLAIN, 16));
		tftVencimento2.setBounds(188, 637, 357, 27);
		panel.add(tftVencimento2);
				
		JFormattedTextField tftVencimento3 = new JFormattedTextField(Mascara("##/##/####"));
		tftVencimento3.setFont(new Font("Century", Font.PLAIN, 16));
		tftVencimento3.setBounds(188, 670, 357, 27);
		panel.add(tftVencimento3);
		
		JFormattedTextField ftfDataNasc = new JFormattedTextField(Mascara("##/##/####"));
		ftfDataNasc.setFont(new Font("Century", Font.PLAIN, 16));
		ftfDataNasc.setBounds(523, 109, 316, 27);
		panel.add(ftfDataNasc);
		
		JFormattedTextField ftfInicioMatricula = new JFormattedTextField(Mascara("##/##/####"));
		ftfInicioMatricula.setFont(new Font("Century", Font.PLAIN, 16));
		ftfInicioMatricula.setBounds(188, 505, 357, 27);
		panel.add(ftfInicioMatricula);
				
		JFormattedTextField tftFimMatricula = new JFormattedTextField(Mascara("##/##/####"));
		tftFimMatricula.setFont(new Font("Century", Font.PLAIN, 16));
		tftFimMatricula.setBounds(188, 538, 357, 27);
		panel.add(tftFimMatricula);	
				
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente c = new Cliente(tfNomeCliente.getText(), ftfCPF.getText(), tfRG.getText(), 
						ftfDataNasc.getText(), tfNomePai.getText(), tfNomeMae.getText(), 
						tfNacionalidade.getText(), tfNaturalidade.getText(), 
						tfEstadoCivil.getText(), tfEscolaridade.getText(), 
						tfCidade.getText(), tfBairro.getText(), 
						Integer.parseInt(tfNumeroCasa.getText()), tfEndereco.getText(),
						tfEmail.getText(), ftfTelefone.getText());
				Cliente c2 = new Cliente(tfProfissao.getText(), tfPGU.getText(),
						tfCategoria.getText(), ftfInicioMatricula.getText(), 
						tftFimMatricula.getText(), Double.parseDouble(tfValorpagar.getText()),
						Double.parseDouble(tfValorParcela.getText()),
						tftVencimento1.getText(), tftVencimento2.getText(),
						tftVencimento3.getText(), chbStatus1.isSelected(), 
						chbStatus2.isSelected(), chbStatus3.isSelected(), Double.parseDouble(tfValorEntrada.getText()));
				ClienteDAO daoC = new ClienteDAO();
				JOptionPane.showMessageDialog(null, (daoC.cadastrar(c, c2)));
				
				tfNomeCliente.setText("");
				ftfCPF.setText("");
				tfRG.setText("");
				ftfDataNasc.setText("");
				tfNomePai.setText("");
				tfNomeMae.setText("");
				tfNacionalidade.setText("");
				tfNaturalidade.setText("");
				tfEstadoCivil.setText("");
				tfEscolaridade.setText("");
				tfCidade.setText("");
				tfBairro.setText("");
				tfNumeroCasa.setText("");
				tfEndereco.setText("");
				tfEmail.setText("");
				ftfTelefone.setText("");
				tfProfissao.setText("");
				tfPGU.setText("");
				tfCategoria.setText("");
				ftfInicioMatricula.setText("");
				tftFimMatricula.setText("");
				tfValor.setText("");
				tfValorpagar.setText("");
				tfValorParcela.setText("");
				tftVencimento1.setText("");
				tftVencimento2.setText("");
				tftVencimento3.setText("");
				chbStatus1.setSelected(false);
				chbStatus2.setSelected(false);
				chbStatus3.setSelected(false);
				tfValorEntrada.setText("");
			}
		});
		btCadastrar.setBackground(Color.YELLOW);
		btCadastrar.setFont(new Font("Century", Font.BOLD, 14));
		btCadastrar.setBounds(743, 175, 162, 81);
		panel.add(btCadastrar);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btFechar.setBackground(Color.YELLOW);
		btFechar.setFont(new Font("Century", Font.BOLD, 14));
		btFechar.setBounds(743, 340, 162, 81);
		panel.add(btFechar);
		
		JButton btRecibo = new JButton("Recibo");
		btRecibo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Recibo recibo = new Recibo();
				recibo.setVisible(true);
			}
		});
		btRecibo.setFont(new Font("Century", Font.BOLD, 12));
		btRecibo.setBackground(Color.YELLOW);
		btRecibo.setBounds(785, 620, 112, 31);
		panel.add(btRecibo);
	}
}
