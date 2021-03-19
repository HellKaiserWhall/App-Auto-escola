package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.AncestorEvent;

public class ConsultaPagamento extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaPagamento frame = new ConsultaPagamento();
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
	public ConsultaPagamento() {
		SQL bd = new SQL();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1120, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 1110, 441);
		contentPane.add(panel);
		panel.setLayout(null);
		
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
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		
		cbCliente.setEditable(true);
		cbCliente.setFont(new Font("Century", Font.PLAIN, 16));
		cbCliente.setBounds(139, 111, 430, 28);
		panel.add(cbCliente);
		
		JLabel lbCliente = new JLabel("Cliente:");
		lbCliente.setFont(new Font("Century", Font.BOLD, 16));
		lbCliente.setBounds(58, 114, 75, 20);
		panel.add(lbCliente);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(0, 0, 1110, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblConsultaDePagamento = new JLabel("Consulta de Pagamento");
		lblConsultaDePagamento.setForeground(Color.BLACK);
		lblConsultaDePagamento.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblConsultaDePagamento.setBounds(12, 9, 272, 33);
		panel_1.add(lblConsultaDePagamento);
		
		table = new JTable();
		atualizarTabela();
		table.setFont(new Font("Century", Font.PLAIN, 16));
		table.setBackground(SystemColor.menu);
		
		
		JScrollPane scroller = new JScrollPane(table);
		scroller.setBounds(2, 208, 1100, 230);
		panel.add(scroller);
		
		JButton btPesquisar = new JButton("Pesquisar");
		btPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String sql = "select Nome, CPF, valor_parcela as 'Valor das parcelas'," 
							+ "vencimento1 as 'Vencimento 1', vencimento2 as 'Vencimento 2', "
							+ "vencimento3 as 'Vencimento 3' from cliente where Nome like'"+cbCliente.getSelectedItem().toString()+"%'";
					model = MyTableModel.getModel(bd, sql);
					table.setModel(model);
					formatoTabela();
				}
				catch(NullPointerException erro) {
					System.out.println(erro.getMessage());
				}
				catch(IllegalArgumentException erro) {
					JOptionPane.showMessageDialog(null, erro.getMessage());
				}
			}
		});
		btPesquisar.setBackground(Color.YELLOW);
		btPesquisar.setFont(new Font("Century", Font.BOLD, 14));
		btPesquisar.setBounds(626, 68, 127, 36);
		panel.add(btPesquisar);
		
		JButton btImprimir = new JButton("Imprimir");
		btImprimir.setBackground(Color.YELLOW);
		btImprimir.setFont(new Font("Century", Font.BOLD, 14));
		btImprimir.setBounds(626, 110, 127, 36);
		panel.add(btImprimir);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btFechar.setFont(new Font("Century", Font.BOLD, 14));
		btFechar.setBackground(Color.YELLOW);
		btFechar.setBounds(626, 152, 127, 36);
		panel.add(btFechar);
	}

	/**
	 * um método que define o conteúdo da tabela
	 */
	private void atualizarTabela() {
		SQL bd = new SQL();
		try{
			model = MyTableModel.getModel(bd, "select Nome, CPF, valor_parcela as 'Valor das parcelas',"
					+ " vencimento1 as 'Vencimento 1', vencimento2 as 'Vencimento 2', vencimento3 as 'Vencimento 3' from cliente");
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
		table.getColumnModel().getColumn(5).setPreferredWidth(20);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setCellRenderer(centralizar);
		table.getTableHeader().setReorderingAllowed(false);	
	}
}
