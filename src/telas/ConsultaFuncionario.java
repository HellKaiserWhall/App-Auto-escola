package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ConsultaFuncionario extends JFrame {

	private JPanel contentPane;
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
					ConsultaFuncionario frame = new ConsultaFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultaFuncionario() {
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
		
		JFormattedTextField ftfCPF = new JFormattedTextField();
		ftfCPF.setFont(new Font("Century", Font.PLAIN, 16));
		ftfCPF.setBounds(352, 138, 126, 27);
		panel.add(ftfCPF);
		
		JFormattedTextField ftfTelefone = new JFormattedTextField();
		ftfTelefone.setFont(new Font("Century", Font.PLAIN, 16));
		ftfTelefone.setBounds(147, 171, 141, 27);
		panel.add(ftfTelefone);
		
		JFormattedTextField ftfDataNasc = new JFormattedTextField();
		ftfDataNasc.setFont(new Font("Century", Font.PLAIN, 16));
		ftfDataNasc.setBounds(504, 169, 162, 27);
		panel.add(ftfDataNasc);
				
		JFormattedTextField ftfDataAdmissao = new JFormattedTextField();
		ftfDataAdmissao.setFont(new Font("Century", Font.PLAIN, 16));
		ftfDataAdmissao.setBounds(457, 270, 209, 27);
		panel.add(ftfDataAdmissao);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(0, 0, 1046, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbConsultaFuncionario = new JLabel("Consulta de Funcion\u00E1rio");
		lbConsultaFuncionario.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbConsultaFuncionario.setBounds(21, 9, 278, 33);
		panel_1.add(lbConsultaFuncionario);
		
		JComboBox cbNome = new JComboBox();
		cbNome.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				InstrutorDAO daoF = new InstrutorDAO();
				List<Instrutor> listarNomes = daoF.listarNomeFuncionario();
				cbNome.removeAllItems();
				
				for(Instrutor f: listarNomes) {
					cbNome.addItem(f.getNome());
					cbNome.addItemListener(new ItemListener() {
						public void itemStateChanged(ItemEvent arg0) {
							if(cbNome.getSelectedItem().equals(f.getNome())) {
								tfRG.setText(String.valueOf(f.getRg()));
								ftfCPF.setText(String.valueOf(f.getCpf()));
								ftfDataNasc.setText(String.valueOf(f.getDataNasc()));
								tfNomePai.setText(String.valueOf(f.getNomePai()));
								tfNomeMae.setText(String.valueOf(f.getNomeMae()));			
								tfCidade.setText(String.valueOf(f.getCidade()));
								tfBairro.setText(String.valueOf(f.getBairro()));
								tfNumeroCasa.setText(String.valueOf(f.getNumeroCasa()));
								tfEndereco.setText(String.valueOf(f.getEndereco()));
								tfEmail.setText(String.valueOf(f.getEmail()));
								ftfTelefone.setText(String.valueOf(f.getTelefone()));
								tfCargo.setText(String.valueOf(f.getCargo()));
								ftfDataAdmissao.setText(String.valueOf(f.getDataAdmissao()));
								tfCredencial.setText(String.valueOf(f.getNumeroCredencial()));
								tfCNH.setText(String.valueOf(f.getNumeroCNH()));
								tfNumeroFilhos.setText(String.valueOf(f.getNumeroFilhos()));
								
							}
						}
					});
				}
			}

			@Override
			public void ancestorMoved(AncestorEvent event) {}

			@Override
			public void ancestorRemoved(AncestorEvent event) {}
		});		
		cbNome.setFont(new Font("Century", Font.PLAIN, 16));
		cbNome.setEditable(true);
		cbNome.setBounds(147, 105, 445, 28);
		panel.add(cbNome);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrutor f = new Instrutor();
				InstrutorDAO daoF = new InstrutorDAO();
				JOptionPane.showMessageDialog(null, (daoF.excluir(cbNome.getSelectedItem().toString())));
			}
		});
		btExcluir.setFont(new Font("Century", Font.BOLD, 14));
		btExcluir.setBackground(Color.YELLOW);
		btExcluir.setBounds(846, 272, 162, 39);
		panel.add(btExcluir);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrutor f = new Instrutor(cbNome.getSelectedItem().toString(), ftfCPF.getText(), tfRG.getText(), 
						ftfDataNasc.getText(), tfNomePai.getText(), tfNomeMae.getText(), tfCidade.getText(),
						tfBairro.getText(), Integer.parseInt(tfNumeroCasa.getText()), tfEndereco.getText(), tfEmail.getText(),
						ftfTelefone.getText());
				Instrutor f2 = new Instrutor(tfCargo.getText(), ftfDataAdmissao.getText(), 
						Integer.parseInt(tfCredencial.getText()), tfCNH.getText(), 
						Integer.parseInt(tfNumeroFilhos.getText()));
				InstrutorDAO daoF = new InstrutorDAO();
				JOptionPane.showMessageDialog(null, (daoF.alterar(f, f2)));
			}
		});
		btAtualizar.setFont(new Font("Century", Font.BOLD, 14));
		btAtualizar.setBackground(Color.YELLOW);
		btAtualizar.setBounds(846, 209, 162, 39);
		panel.add(btAtualizar);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btFechar.setFont(new Font("Century", Font.BOLD, 14));
		btFechar.setBackground(Color.YELLOW);
		btFechar.setBounds(846, 331, 162, 39);
		panel.add(btFechar);
	}
}
