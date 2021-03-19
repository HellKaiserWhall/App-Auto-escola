package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.event.AncestorEvent;


public class CadastroAgenda extends JFrame {

	private JPanel contentPane;
	private JTextField tfObservacao;
	private JTextField tfPlaca;
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAgenda frame = new CadastroAgenda();
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
            F_Mascara.setMask(Mascara);
            F_Mascara.setPlaceholderCharacter(' ');
        }
        catch (Exception excecao) {
        excecao.printStackTrace();
        } 
        return F_Mascara;
	} 
	/**
	 * Create the frame.
	 */
	public CadastroAgenda() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 835, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 835, 551);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(0, 0, 835, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbCadastroAula = new JLabel("Cadastro de Aula");
		lbCadastroAula.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbCadastroAula.setBounds(12, 9, 200, 33);
		panel_1.add(lbCadastroAula);
		
		JLabel lbObservacao = new JLabel("Observa\u00E7\u00E3o:");
		lbObservacao.setFont(new Font("Century", Font.BOLD, 16));
		lbObservacao.setBounds(144, 95, 109, 20);
		panel.add(lbObservacao);
		
		JLabel lbCliente = new JLabel("Cliente:");
		lbCliente.setFont(new Font("Century", Font.BOLD, 16));
		lbCliente.setBounds(178, 128, 75, 20);
		panel.add(lbCliente);
		
		JLabel lbFuncionario = new JLabel("Funcion\u00E1rio:");
		lbFuncionario.setFont(new Font("Century", Font.BOLD, 16));
		lbFuncionario.setBounds(138, 162, 115, 20);
		panel.add(lbFuncionario);
		
		JLabel lbVeiculo = new JLabel("Ve\u00EDculo:");
		lbVeiculo.setFont(new Font("Century", Font.BOLD, 16));
		lbVeiculo.setBounds(177, 196, 76, 20);
		panel.add(lbVeiculo);
		
		JLabel lbPlaca = new JLabel("Placa:");
		lbPlaca.setFont(new Font("Century", Font.BOLD, 16));
		lbPlaca.setBounds(193, 230, 60, 20);
		panel.add(lbPlaca);
		
		JLabel lbData = new JLabel("Data:");
		lbData.setFont(new Font("Century", Font.BOLD, 16));
		lbData.setBounds(198, 263, 55, 20);
		panel.add(lbData);
				
		tfObservacao = new JTextField();
		tfObservacao.setFont(new Font("Century", Font.PLAIN, 16));
		tfObservacao.setBounds(259, 92, 373, 27);
		panel.add(tfObservacao);
		tfObservacao.setColumns(10);
		
		tfPlaca = new JTextField();
		tfPlaca.setEditable(false);
		tfPlaca.setFont(new Font("Century", Font.PLAIN, 16));
		tfPlaca.setBounds(259, 227, 200, 27);
		panel.add(tfPlaca);
		tfPlaca.setColumns(10);
		
		JLabel lbHora = new JLabel("Hora:");
		lbHora.setFont(new Font("Century", Font.BOLD, 16));
		lbHora.setBounds(370, 263, 55, 20);
		panel.add(lbHora);
		
		JFormattedTextField ftfHora = new JFormattedTextField(Mascara("##:##"));
		ftfHora.setFont(new Font("Century", Font.PLAIN, 16));
		ftfHora.setBounds(431, 260, 101, 27);
		panel.add(ftfHora);
		
		JComboBox cbCliente = new JComboBox();
		cbCliente.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				ClienteDAO daoC = new ClienteDAO();
				List<Cliente> listarNomes = daoC.listarNomeCliente();
				cbCliente.removeAllItems();
				
				for(Cliente c: listarNomes) {
					cbCliente.addItem(c.getNome());					
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		cbCliente.setEditable(true);
		cbCliente.setFont(new Font("Century", Font.PLAIN, 16));
		cbCliente.setBounds(259, 125, 373, 28);
		panel.add(cbCliente);
		
		JComboBox cbFuncionario = new JComboBox();
		cbFuncionario.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				InstrutorDAO daoF = new InstrutorDAO();
				List<Instrutor> listarNomes = daoF.listarNomeFuncionario();
				cbFuncionario.removeAllItems();
				
				for(Instrutor f: listarNomes) {
					cbFuncionario.addItem(f.getNome());
				}
				
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		cbFuncionario.setFont(new Font("Century", Font.PLAIN, 16));
		cbFuncionario.setEditable(true);
		cbFuncionario.setBounds(259, 159, 273, 28);
		panel.add(cbFuncionario);
		
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
		cbVeiculo.setFont(new Font("Century", Font.PLAIN, 16));
		cbVeiculo.setEditable(true);
		cbVeiculo.setBounds(259, 193, 200, 28);
		panel.add(cbVeiculo);
		
		JFormattedTextField ftfData = new JFormattedTextField(Mascara("##/##/####"));
		ftfData.setFont(new Font("Century", Font.PLAIN, 16));
		ftfData.setBounds(259, 260, 101, 27);
		panel.add(ftfData);	

		table = new JTable();
		atualizarTabela();
		table.setFont(new Font("Century", Font.PLAIN, 16));
		table.setBackground(SystemColor.menu);
		panel.add(table);
		
		JScrollPane scroller = new JScrollPane(table);
		scroller.setBounds(18, 309, 730, 230);
		panel.add(scroller);
		
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente = new Cliente();
				cliente.setNome(cbCliente.getSelectedItem().toString());
				Instrutor funcionario = new Instrutor();
				funcionario.setNome(cbFuncionario.getSelectedItem().toString());
				Veiculo veiculo = new Veiculo();
				veiculo.setPlaca(tfPlaca.getText());
				
				Agendamento a = new Agendamento(tfObservacao.getText(), ftfData.getText(), ftfHora.getText(), cliente, funcionario, veiculo);
				AgendaDAO daoA = new AgendaDAO();
				JOptionPane.showMessageDialog(null, daoA.cadastrar(a));
				atualizarTabela();
			}
		});
		btCadastrar.setBackground(Color.YELLOW);
		btCadastrar.setFont(new Font("Century", Font.BOLD, 14));
		btCadastrar.setBounds(677, 92, 127, 39);
		panel.add(btCadastrar);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btFechar.setFont(new Font("Century", Font.BOLD, 14));
		btFechar.setBackground(Color.YELLOW);
		btFechar.setBounds(677, 159, 127, 39);
		panel.add(btFechar);
		
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
	 * um metódo para definir o formato da tabela
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
		table.getColumnModel().getColumn(6).setPreferredWidth(20);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(6).setCellRenderer(centralizar);
		table.getTableHeader().setReorderingAllowed(false);
	
	}
}
