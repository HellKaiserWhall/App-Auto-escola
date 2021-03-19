package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.toedter.calendar.JYearChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ConsultaVeiculo extends JFrame {

	private JPanel contentPane;
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
					ConsultaVeiculo frame = new ConsultaVeiculo();
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
	public ConsultaVeiculo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 813, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 813, 411);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(0, 0, 813, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbConsultaVeiculo = new JLabel("Consulta de Ve\u00EDculo");
		lbConsultaVeiculo.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbConsultaVeiculo.setBounds(12, 9, 229, 33);
		panel_1.add(lbConsultaVeiculo);
		
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
		
		JComboBox cbModelo = new JComboBox();
		cbModelo.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				VeiculoDAO daoV = new VeiculoDAO();
				List<Veiculo> listarModelos = daoV.listarModelo();
				cbModelo.removeAllItems();
				
				for(Veiculo v: listarModelos) {
					cbModelo.addItem(v.getModelo());
					cbModelo.addItemListener(new ItemListener() {
						public void itemStateChanged(ItemEvent arg0) {
							if(cbModelo.getSelectedItem().equals(v.getModelo())) {
								tfPlaca.setText(String.valueOf(v.getPlaca()));
								tfRenavan.setText(String.valueOf(v.getRenavan()));
								tfAnoFabricacao.setText(String.valueOf(v.getAnoFabricacao()));
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
		cbModelo.setFont(new Font("Century", Font.PLAIN, 16));
		cbModelo.setBounds(224, 159, 147, 27);
		panel.add(cbModelo);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Veiculo v = new Veiculo(cbModelo.getSelectedItem().toString(), tfPlaca.getText(), 
						tfRenavan.getText(), tfAnoFabricacao.getText());
				VeiculoDAO daoV = new VeiculoDAO();
				JOptionPane.showMessageDialog(null, daoV.alterar(v));
			}
		});
		btAtualizar.setFont(new Font("Century", Font.BOLD, 14));
		btAtualizar.setBackground(Color.YELLOW);
		btAtualizar.setBounds(607, 129, 162, 39);
		panel.add(btAtualizar);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Veiculo v = new Veiculo();
				VeiculoDAO daoV = new VeiculoDAO();
				JOptionPane.showMessageDialog(null, (daoV.excluir(cbModelo.getSelectedItem().toString(), tfPlaca.getText())));
			}
		});
		btExcluir.setFont(new Font("Century", Font.BOLD, 14));
		btExcluir.setBackground(Color.YELLOW);
		btExcluir.setBounds(607, 206, 162, 39);
		panel.add(btExcluir);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btFechar.setFont(new Font("Century", Font.BOLD, 14));
		btFechar.setBackground(Color.YELLOW);
		btFechar.setBounds(607, 285, 162, 39);
		panel.add(btFechar);		
	}
}
