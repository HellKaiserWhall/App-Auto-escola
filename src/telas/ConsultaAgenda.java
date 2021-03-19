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

import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.event.ActionEvent;

public class ConsultaAgenda extends JFrame {

	private JPanel contentPane;
	private JTextField tfObservacao;
	private JTextField tfPlaca;
	private JTable table;
	private DefaultTableModel model;
	private JTextField tfHora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaAgenda frame = new ConsultaAgenda();
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
	public ConsultaAgenda() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1252, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 1252, 551);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(0, 0, 1252, 146);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(0, 0, 1252, 53);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbConsultaAgenda = new JLabel("Consulta de Aulas");
		lbConsultaAgenda.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbConsultaAgenda.setBounds(12, 9, 232, 33);
		panel_2.add(lbConsultaAgenda);
		
		JLabel lbCliente = new JLabel("Cliente:");
		lbCliente.setFont(new Font("Century", Font.BOLD, 16));
		lbCliente.setBounds(33, 67, 75, 20);
		panel_1.add(lbCliente);
		
		JLabel lbInicio = new JLabel("In\u00EDcio:");
		lbInicio.setFont(new Font("Century", Font.BOLD, 16));
		lbInicio.setBounds(46, 112, 62, 20);
		panel_1.add(lbInicio);
		
		JLabel lbFuncionario = new JLabel("Funcion\u00E1rio:");
		lbFuncionario.setFont(new Font("Century", Font.BOLD, 16));
		lbFuncionario.setBounds(541, 67, 115, 20);
		panel_1.add(lbFuncionario);
		
		JLabel lbFim = new JLabel("Fim:");
		lbFim.setFont(new Font("Century", Font.BOLD, 16));
		lbFim.setBounds(609, 112, 47, 20);
		panel_1.add(lbFim);
		
		JTextField tfInicio = new JTextField();
		tfInicio.setFont(new Font("Century", Font.PLAIN, 16));
		tfInicio.setColumns(10);
		tfInicio.setBounds(112, 107, 340, 27);
		panel_1.add(tfInicio);
		
		JTextField tfFim = new JTextField();
		tfFim.setFont(new Font("Century", Font.PLAIN, 16));
		tfFim.setBounds(662, 107, 340, 27);
		panel_1.add(tfFim);
		tfFim.setColumns(10);
		
		JLabel lbObservacao = new JLabel("Observa\u00E7\u00E3o:");
		lbObservacao.setFont(new Font("Century", Font.BOLD, 16));
		lbObservacao.setBounds(6, 158, 109, 20);
		panel.add(lbObservacao);
		
		JLabel lbCliente2 = new JLabel("Cliente:");
		lbCliente2.setFont(new Font("Century", Font.BOLD, 16));
		lbCliente2.setBounds(40, 191, 75, 20);
		panel.add(lbCliente2);
		
		JLabel lbFuncionario2 = new JLabel("Funcion\u00E1rio:");
		lbFuncionario2.setFont(new Font("Century", Font.BOLD, 16));
		lbFuncionario2.setBounds(0, 225, 115, 20);
		panel.add(lbFuncionario2);
		
		JLabel lbVeiculo = new JLabel("Ve\u00EDculo:");
		lbVeiculo.setFont(new Font("Century", Font.BOLD, 16));
		lbVeiculo.setBounds(643, 158, 76, 20);
		panel.add(lbVeiculo);
		
		JLabel lbPlaca = new JLabel("Placa:");
		lbPlaca.setFont(new Font("Century", Font.BOLD, 16));
		lbPlaca.setBounds(659, 190, 60, 20);
		panel.add(lbPlaca);
		
		JLabel lbData = new JLabel("Data:");
		lbData.setFont(new Font("Century", Font.BOLD, 16));
		lbData.setBounds(665, 225, 54, 20);
		panel.add(lbData);
		
		tfObservacao = new JTextField();
		tfObservacao.setFont(new Font("Century", Font.PLAIN, 16));
		tfObservacao.setBounds(121, 155, 373, 27);
		panel.add(tfObservacao);
		tfObservacao.setColumns(10);
		
		tfPlaca = new JTextField();
		tfPlaca.setEditable(false);
		tfPlaca.setFont(new Font("Century", Font.PLAIN, 16));
		tfPlaca.setBounds(725, 188, 233, 27);
		panel.add(tfPlaca);
		tfPlaca.setColumns(10);
		
		JLabel lbHora = new JLabel("Hora:");
		lbHora.setFont(new Font("Century", Font.BOLD, 16));
		lbHora.setBounds(850, 225, 54, 20);
		panel.add(lbHora);
		
		tfHora = new JTextField();
		tfHora.setFont(new Font("Century", Font.PLAIN, 16));
		tfHora.setColumns(10);
		tfHora.setBounds(906, 220, 115, 27);
		panel.add(tfHora);
		
		JComboBox cbCliente = new JComboBox();
		cbCliente.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				ClienteDAO daoC = new ClienteDAO();
				List<Cliente> listarNomes = daoC.listarNomeCliente();
				cbCliente.removeAllItems();
				
				for(Cliente c: listarNomes) {
					cbCliente.addItem(c.getNome());
				}
			}

			@Override
			public void ancestorMoved(AncestorEvent event) {}

			@Override
			public void ancestorRemoved(AncestorEvent event) {}
		});
		cbCliente.setFont(new Font("Century", Font.PLAIN, 16));
		cbCliente.setEditable(true);
		cbCliente.setBounds(112, 64, 423, 28);
		panel_1.add(cbCliente);
		
		JComboBox cbFuncionario = new JComboBox();
		cbFuncionario.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				InstrutorDAO daoF = new InstrutorDAO();
				List<Instrutor> listarNomes = daoF.listarNomeFuncionario();
				cbFuncionario.removeAllItems();
				
				for(Instrutor f: listarNomes) {
					cbFuncionario.addItem(f.getNome());					
				}
			}

			@Override
			public void ancestorMoved(AncestorEvent event) {}

			@Override
			public void ancestorRemoved(AncestorEvent event) {}
		});
		cbFuncionario.setEditable(true);
		cbFuncionario.setFont(new Font("Century", Font.PLAIN, 16));
		cbFuncionario.setBounds(662, 64, 392, 28);
		panel_1.add(cbFuncionario);
		
		JComboBox cbCliente2 = new JComboBox();
		cbCliente2.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				ClienteDAO daoC = new ClienteDAO();
				List<Cliente> listarNomes = daoC.listarNomeCliente();
				cbCliente2.removeAllItems();
				
				for(Cliente c: listarNomes) {
					cbCliente2.addItem(c.getNome());
				}
			}

			@Override
			public void ancestorMoved(AncestorEvent event) {}

			@Override
			public void ancestorRemoved(AncestorEvent event) {}
		});
		cbCliente2.setFont(new Font("Century", Font.PLAIN, 16));
		cbCliente2.setEditable(true);
		cbCliente2.setBounds(121, 188, 492, 28);
		panel.add(cbCliente2);
		
		JComboBox cbFuncionario2 = new JComboBox();
		cbFuncionario2.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				InstrutorDAO daoF = new InstrutorDAO();
				List<Instrutor> listarNomes = daoF.listarNomeFuncionario();
				cbFuncionario2.removeAllItems();
				
				for(Instrutor f: listarNomes) {
					cbFuncionario2.addItem(f.getNome());					
				}
			}

			@Override
			public void ancestorMoved(AncestorEvent event) {}

			@Override
			public void ancestorRemoved(AncestorEvent event) {}
		});	
		cbFuncionario2.setFont(new Font("Century", Font.PLAIN, 16));
		cbFuncionario2.setEditable(true);
		cbFuncionario2.setBounds(121, 222, 492, 28);
		panel.add(cbFuncionario2);
		
		JComboBox cbVeiculo = new JComboBox();
		cbVeiculo.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				VeiculoDAO daoV = new VeiculoDAO();
				List<Veiculo> listarModelos = daoV.listarModelo();
				cbVeiculo.removeAllItems();
				
				for(Veiculo v: listarModelos) {
					cbVeiculo.addItem(v.getModelo());
					cbVeiculo.addItemListener(new ItemListener() {
						public void itemStateChanged(ItemEvent arg0) {
							if(cbVeiculo.getSelectedItem().equals(v.getModelo())) {
								tfPlaca.setText(String.valueOf(v.getPlaca()));
								}
							}
						});
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		cbVeiculo.setEditable(true);
		cbVeiculo.setFont(new Font("Century", Font.PLAIN, 16));
		cbVeiculo.setBounds(725, 155, 233, 28);
		panel.add(cbVeiculo);
		
		JTextField tfData = new JTextField();
		tfData.setFont(new Font("Century", Font.PLAIN, 16));
		tfData.setBounds(725, 220, 115, 27);
		panel.add(tfData);
		tfData.setColumns(10);
		
		JButton btImprimir = new JButton("Imprimir");
		btImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btImprimir.setBackground(Color.YELLOW);
		btImprimir.setFont(new Font("Century", Font.BOLD, 14));
		btImprimir.setBounds(1102, 158, 100, 31);
		panel.add(btImprimir);
		
		JButton btAtualizar = new JButton("Atualizar");
		btAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				cliente.setNome(cbCliente.getSelectedItem().toString());
				Instrutor funcionario = new Instrutor();
				funcionario.setNome(cbFuncionario.getSelectedItem().toString());
				Veiculo veiculo = new Veiculo();
				veiculo.setPlaca(tfPlaca.getText());
				
				Agendamento a = new Agendamento(tfObservacao.getText(), tfData.getText(), tfHora.getText(), cliente, funcionario, veiculo);
				AgendaDAO daoA = new AgendaDAO();
				JOptionPane.showMessageDialog(null, daoA.alterar(a));
				atualizarTabela();
			}
		});
		btAtualizar.setFont(new Font("Century", Font.BOLD, 14));
		btAtualizar.setBackground(Color.YELLOW);
		btAtualizar.setBounds(1102, 195, 100, 31);
		panel.add(btAtualizar);
		
		JButton btExcluir = new JButton("Excluir");
		btExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				cliente.setNome(cbCliente.getSelectedItem().toString());
				Instrutor funcionario = new Instrutor();
				funcionario.setNome(cbFuncionario.getSelectedItem().toString());
				Veiculo veiculo = new Veiculo();
				veiculo.setPlaca(tfPlaca.getText());
				
				Agendamento a = new Agendamento(tfObservacao.getText(), tfData.getText(), tfHora.getText(), cliente, funcionario, veiculo);
				AgendaDAO daoA = new AgendaDAO();
				JOptionPane.showMessageDialog(null, daoA.excluir(a));
				atualizarTabela();
			}
		});
		btExcluir.setFont(new Font("Century", Font.BOLD, 14));
		btExcluir.setBackground(Color.YELLOW);
		btExcluir.setBounds(1102, 232, 100, 31);
		panel.add(btExcluir);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btFechar.setBackground(Color.YELLOW);
		btFechar.setFont(new Font("Century", Font.BOLD, 14));
		btFechar.setBounds(1102, 269, 100, 31);
		panel.add(btFechar);
		
		JButton btPesquisa = new JButton("Pesquisa");
		btPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQL bd = new SQL();
				try {
					String sql = "select cliente.nome as 'Nome do Cliente', funcionario.nome as 'Nome do Funcionario', " 
							+"Modelo, Placa, observacao as 'Observação', data_aula as 'Data', hora_aula as 'Hora' from agenda, veiculo, cliente, funcionario "
							+"where(veiculo.id_veiculo = agenda.id_veiculo and cliente.id_cliente = agenda.id_cliente and funcionario.id_funcionario = agenda.id_funcionario)"
							+"and(cliente.nome like '"+cbCliente.getSelectedItem().toString()+"%' or funcionario.nome like '"+cbFuncionario.getSelectedItem().toString()+"%'"
							+"or(data_aula between '"+tfInicio.getText()+"' and '"	+tfFim.getText()+"'))";
					model = MyTableModel.getModel(bd, sql);
					table.setModel(model);
					formatoTabela();
				}
				catch(NullPointerException erro) {
					System.out.println(erro.getMessage());
				}
				catch(IllegalArgumentException erro) {
				}				
			}
		});
		btPesquisa.setFont(new Font("Century", Font.BOLD, 14));
		btPesquisa.setBackground(Color.YELLOW);
		btPesquisa.setBounds(1102, 63, 100, 31);
		panel_1.add(btPesquisa);
		
		JButton btTodos = new JButton("Todos");
		btTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizarTabela();
			}
		});
		btTodos.setBackground(Color.YELLOW);
		btTodos.setFont(new Font("Century", Font.BOLD, 14));
		btTodos.setBounds(1102, 103, 100, 31);
		panel_1.add(btTodos);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cbCliente2.setSelectedItem(((String)table.getValueAt(table.getSelectedRow(), 0)));
				cbFuncionario2.setSelectedItem(((String)table.getValueAt(table.getSelectedRow(), 1)));
				cbVeiculo.setSelectedItem(((String)table.getValueAt(table.getSelectedRow(), 2)));
				tfData.setText((String)table.getValueAt(table.getSelectedRow(), 5));
				tfObservacao.setText((String)table.getValueAt(table.getSelectedRow(), 4));						
				tfPlaca.setText((String)table.getValueAt(table.getSelectedRow(), 3));
				tfHora.setText((String)table.getValueAt(table.getSelectedRow(), 6));
				
			}
		});
		atualizarTabela();
		table.setBackground(SystemColor.menu);
		panel.add(table);
		
		JScrollPane scroller = new JScrollPane(table);
		scroller.setBounds(10, 309, 1200, 230);
		panel.add(scroller);		
	}
	
	/**
	 * um método que define o conteúdo da tabela
	 */
	private void atualizarTabela() {
		SQL bd = new SQL();
		try{
			model = MyTableModel.getModel(bd, "select cliente.nome as 'Nome do Cliente', funcionario.nome as 'Nome do Funcionario',"
					+ " Modelo, Placa, observacao as 'Observação', data_aula as 'Data', hora_aula as 'Hora' from cliente, funcionario, veiculo, agenda"
					+ " where veiculo.id_veiculo = agenda.id_veiculo and cliente.id_cliente = agenda.id_cliente and funcionario.id_funcionario = agenda.id_funcionario");
			table.setModel(model);
			formatoTabela();
			}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
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
		table.getColumnModel().getColumn(2).setPreferredWidth(10);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(3).setPreferredWidth(20);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(4).setPreferredWidth(20);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(5).setPreferredWidth(20);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setCellRenderer(centralizar);
		table.getColumnModel().getColumn(6).setPreferredWidth(20);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(6).setCellRenderer(centralizar);
		table.getTableHeader().setReorderingAllowed(false);
	
	}
}
