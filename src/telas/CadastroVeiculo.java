package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JYearChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class CadastroVeiculo extends JFrame {

	private JPanel contentPane;
	private JTextField tfModelo;
	private JTextField tfPlaca;
	private JTextField tfRenavan;
	private JTextField tfAnoFabricacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVeiculo frame = new CadastroVeiculo();
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
	public CadastroVeiculo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 150, 813, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 813, 391);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(0, 0, 813, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbCadastroVeiculo = new JLabel("Cadastro de Ve\u00EDculo");
		lbCadastroVeiculo.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbCadastroVeiculo.setBounds(12, 9, 229, 33);
		panel_1.add(lbCadastroVeiculo);
		
		JLabel lbModelo = new JLabel("Modelo:");
		lbModelo.setFont(new Font("Century", Font.BOLD, 16));
		lbModelo.setBounds(145, 162, 73, 20);
		panel.add(lbModelo);
		
		JLabel lbPlaca = new JLabel("Placa:");
		lbPlaca.setFont(new Font("Century", Font.BOLD, 16));
		lbPlaca.setBounds(158, 195, 60, 20);
		panel.add(lbPlaca);
		
		JLabel lbRenavan = new JLabel("RENAVAN:");
		lbRenavan.setFont(new Font("Century", Font.BOLD, 16));
		lbRenavan.setBounds(114, 228, 107, 20);
		panel.add(lbRenavan);
		
		JLabel lbAnoFabricacao = new JLabel("Ano de fabrica\u00E7\u00E3o:");
		lbAnoFabricacao.setFont(new Font("Century", Font.BOLD, 16));
		lbAnoFabricacao.setBounds(57, 263, 161, 20);
		panel.add(lbAnoFabricacao);
		
		tfModelo = new JTextField();
		tfModelo.setFont(new Font("Century", Font.PLAIN, 16));
		tfModelo.setBounds(224, 159, 147, 27);
		panel.add(tfModelo);
		tfModelo.setColumns(10);
		
		tfPlaca = new JTextField();
		tfPlaca.setFont(new Font("Century", Font.PLAIN, 16));
		tfPlaca.setBounds(224, 192, 147, 27);
		panel.add(tfPlaca);
		tfPlaca.setColumns(10);
		
		tfRenavan = new JTextField();
		tfRenavan.setFont(new Font("Century", Font.PLAIN, 16));
		tfRenavan.setBounds(224, 225, 147, 27);
		panel.add(tfRenavan);
		tfRenavan.setColumns(10);
		
		tfAnoFabricacao = new JTextField();
		tfAnoFabricacao.setFont(new Font("Century", Font.PLAIN, 16));
		tfAnoFabricacao.setBounds(224, 256, 147, 27);
		panel.add(tfAnoFabricacao);
		tfAnoFabricacao.setColumns(10);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Veiculo v = new Veiculo(tfModelo.getText(), tfPlaca.getText(), tfRenavan.getText(),
						tfAnoFabricacao.getText());
				VeiculoDAO daoV = new VeiculoDAO();
				JOptionPane.showMessageDialog(null, daoV.cadastrar(v));
				
				tfModelo.setText("");
				tfPlaca.setText("");
				tfRenavan.setText("");
				tfAnoFabricacao.setText("");
			}
		});
		btCadastrar.setFont(new Font("Century", Font.BOLD, 14));
		btCadastrar.setBackground(Color.YELLOW);
		btCadastrar.setBounds(611, 110, 162, 81);
		panel.add(btCadastrar);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btFechar.setBackground(Color.YELLOW);
		btFechar.setFont(new Font("Century", Font.BOLD, 14));
		btFechar.setBounds(611, 264, 162, 81);
		panel.add(btFechar);
		
	}
}
