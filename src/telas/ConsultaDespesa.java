package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConsultaDespesa extends JFrame {

	private JPanel contentPane;
	private JTextField tfModelo;
	private JTextField tfObservacao;
	private JTextField tfPlaca;
	private JTextField tfValor;
	private JTable table;
	private DefaultTableModel model;
	private JTextField tfData;
	private JTextField tfFim;
	private JTextField tfInicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaDespesa frame = new ConsultaDespesa();
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
	public ConsultaDespesa() {
		SQL bd = new SQL();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 985, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 969, 524);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(0, 0, 969, 138);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(0, 0, 969, 53);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbConsultaDespesa = new JLabel("Consulta de Despesa");
		lbConsultaDespesa.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbConsultaDespesa.setBounds(12, 9, 241, 33);
		panel_2.add(lbConsultaDespesa);
		
		JLabel lbModelo = new JLabel("Modelo:");
		lbModelo.setFont(new Font("Century", Font.BOLD, 16));
		lbModelo.setBounds(53, 62, 73, 20);
		panel_1.add(lbModelo);
		
		JLabel lbInicio = new JLabel("In\u00EDcio:");
		lbInicio.setFont(new Font("Century", Font.BOLD, 16));
		lbInicio.setBounds(65, 98, 62, 20);
		panel_1.add(lbInicio);
		
		JLabel lbFim = new JLabel("Fim:");
		lbFim.setFont(new Font("Century", Font.BOLD, 16));
		lbFim.setBounds(465, 98, 47, 20);
		panel_1.add(lbFim);
		
		JComboBox cbModelo = new JComboBox();
		cbModelo.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				VeiculoDAO daoV = new VeiculoDAO();
				List<Veiculo> listarModelos = daoV.listarModelo();
				cbModelo.removeAllItems();
				
				for(Veiculo v: listarModelos) {
					cbModelo.addItem(v.getModelo());
				}
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		cbModelo.setEditable(true);
		cbModelo.setFont(new Font("Century", Font.PLAIN, 16));
		cbModelo.setBounds(132, 59, 326, 28);
		panel_1.add(cbModelo);
		
		JLabel lbModelo2 = new JLabel("Modelo:");
		lbModelo2.setFont(new Font("Century", Font.BOLD, 16));
		lbModelo2.setBounds(54, 159, 73, 20);
		panel.add(lbModelo2);
		
		JLabel lbObservacao = new JLabel("Observa\u00E7\u00E3o:");
		lbObservacao.setFont(new Font("Century", Font.BOLD, 16));
		lbObservacao.setBounds(18, 193, 109, 20);
		panel.add(lbObservacao);
		
		JLabel lbPlaca = new JLabel("Placa:");
		lbPlaca.setFont(new Font("Century", Font.BOLD, 16));
		lbPlaca.setBounds(286, 159, 60, 20);
		panel.add(lbPlaca);
		
		JLabel lbData = new JLabel("Data:");
		lbData.setFont(new Font("Century", Font.BOLD, 16));
		lbData.setBounds(292, 193, 54, 20);
		panel.add(lbData);
		
		JLabel lbValor = new JLabel("Valor:");
		lbValor.setFont(new Font("Century", Font.BOLD, 16));
		lbValor.setBounds(505, 159, 60, 20);
		panel.add(lbValor);
		
		tfModelo = new JTextField();
		tfModelo.setFont(new Font("Century", Font.PLAIN, 16));
		tfModelo.setBounds(133, 156, 147, 27);
		panel.add(tfModelo);
		tfModelo.setColumns(10);
		
		tfObservacao = new JTextField();
		tfObservacao.setFont(new Font("Century", Font.PLAIN, 16));
		tfObservacao.setBounds(133, 190, 147, 27);
		panel.add(tfObservacao);
		tfObservacao.setColumns(10);
		
		tfPlaca = new JTextField();
		tfPlaca.setFont(new Font("Century", Font.PLAIN, 16));
		tfPlaca.setBounds(352, 155, 147, 27);
		panel.add(tfPlaca);
		tfPlaca.setColumns(10);
		
		tfValor = new JTextField();
		tfValor.setFont(new Font("Century", Font.PLAIN, 16));
		tfValor.setBounds(571, 156, 147, 27);
		panel.add(tfValor);
		tfValor.setColumns(10);
				
		tfInicio = new JTextField();
		tfInicio.setFont(new Font("Century", Font.PLAIN, 16));
		tfInicio.setColumns(10);
		tfInicio.setBounds(132, 93, 326, 28);
		panel_1.add(tfInicio);
		
		tfFim = new JTextField();
		tfFim.setFont(new Font("Century", Font.PLAIN, 16));
		tfFim.setBounds(518, 93, 326, 28);
		panel_1.add(tfFim);
		tfFim.setColumns(10);
		
		tfData = new JTextField();
		tfData.setFont(new Font("Century", Font.PLAIN, 16));
		tfData.setBounds(352, 188, 147, 27);
		panel.add(tfData);
		tfData.setColumns(10);
		
		JButton btPesquisa = new JButton("Pesquisa");
		btPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String sql = "select Modelo, Placa, observacao as 'Observação', data_realizacao as 'Data', Valor from despesa, veiculo where despesa.id_veiculo = veiculo.id_veiculo and modelo like '"
							+cbModelo.getSelectedItem().toString()+"%' or (data_realizacao between '"+tfInicio.getText()+"' and '"
							+tfFim.getText()+"')";
					model = MyTableModel.getModel(bd, sql);
					table.setModel(model);
					formatoTabela();
				}
				catch(NullPointerException erro) {
					JOptionPane.showMessageDialog(null, erro.getMessage());
				}
				catch(IllegalArgumentException erro) {
					JOptionPane.showMessageDialog(null, erro.getMessage());
				}
			}
		});
		btPesquisa.setFont(new Font("Century", Font.BOLD, 14));
		btPesquisa.setBackground(Color.YELLOW);
		btPesquisa.setBounds(858, 58, 100, 31);
		panel_1.add(btPesquisa);
		
		JButton btTodos = new JButton("Todos");
		btTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizarTabela();
			}
		});
		btTodos.setBackground(Color.YELLOW);
		btTodos.setFont(new Font("Century", Font.BOLD, 14));
		btTodos.setBounds(858, 98, 100, 31);
		panel_1.add(btTodos);
		
		JButton btImprimir = new JButton("Imprimir");
		btImprimir.setFont(new Font("Century", Font.BOLD, 14));
		btImprimir.setBackground(Color.YELLOW);
		btImprimir.setBounds(858, 145, 100, 31);
		panel.add(btImprimir);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Veiculo veiculo = new Veiculo();
				veiculo.setPlaca(tfPlaca.getText());
				
				Despesa d = new Despesa(tfObservacao.getText(), tfData.getText(), Double.parseDouble(tfValor.getText()), veiculo);
				DespesaDAO daoD = new DespesaDAO();
				JOptionPane.showMessageDialog(null, daoD.alterar(d));
				atualizarTabela();
			}
		});
		btAtualizar.setBackground(Color.YELLOW);
		btAtualizar.setFont(new Font("Century", Font.BOLD, 14));
		btAtualizar.setBounds(858, 182, 100, 31);
		panel.add(btAtualizar);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Veiculo veiculo = new Veiculo();
				veiculo.setPlaca(tfPlaca.getText());
				
				Despesa d = new Despesa(tfObservacao.getText(), tfData.getText(), Double.parseDouble(tfValor.getText()), veiculo);
				DespesaDAO daoD = new DespesaDAO();
				JOptionPane.showMessageDialog(null, daoD.excluir(d));
				atualizarTabela();
			}
		});
		btExcluir.setFont(new Font("Century", Font.BOLD, 14));
		btExcluir.setBackground(Color.YELLOW);
		btExcluir.setBounds(858, 219, 100, 31);
		panel.add(btExcluir);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btFechar.setBackground(Color.YELLOW);
		btFechar.setFont(new Font("Century", Font.BOLD, 14));
		btFechar.setBounds(858, 256, 100, 31);
		panel.add(btFechar);
		
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tfData.setText((String)table.getValueAt(table.getSelectedRow(), 3));
				tfValor.setText((String)table.getValueAt(table.getSelectedRow(), 4));
				tfObservacao.setText((String)table.getValueAt(table.getSelectedRow(), 2));
				tfModelo.setText((String)table.getValueAt(table.getSelectedRow(), 0));				
				tfPlaca.setText((String)table.getValueAt(table.getSelectedRow(), 1));
				
			}
		});
		atualizarTabela();
		table.setFont(new Font("Century", Font.PLAIN, 16));
		table.setBackground(SystemColor.menu);
		panel.add(table);
		
		JScrollPane scroller = new JScrollPane(table);
		scroller.setBounds(120, 249, 710, 252);
		panel.add(scroller);		
	}
	
	/**
	 * um método que define o conteúdo da tabela
	 */
	private void atualizarTabela() {
		SQL bd = new SQL();
		try{
			model = MyTableModel.getModel(bd, "select Modelo, Placa, observacao as 'Observação', data_realizacao as 'Data', Valor from despesa, veiculo where veiculo.id_veiculo = despesa.id_veiculo");
			table.setModel(model);
			formatoTabela();
			}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage());
		}
		
	}
	
	/**
	 * um método que define o formato da tabela
	 */
	public void formatoTabela() {
		DefaultTableCellRenderer centralizar = new DefaultTableCellRenderer();
		centralizar.setHorizontalAlignment(SwingConstants.CENTER);
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(5);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(2).setPreferredWidth(20);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(3).setPreferredWidth(20);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(4).setPreferredWidth(20);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setCellRenderer(centralizar);
		table.getTableHeader().setReorderingAllowed(false);
	
	}
}
