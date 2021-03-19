package telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 530);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel menu1 = new Panel();
		menu1.setBounds(0, 0, 168, 491);
		menu1.setBackground(Color.DARK_GRAY);
		menu1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 9));
		menu1.setMinimumSize(new Dimension(0, 0));
		getContentPane().add(menu1);
		menu1.setLayout(null);
				
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setForeground(Color.RED);
		scrollPane.setBackground(Color.RED);
		scrollPane.setBounds(0, 139, 10, 51);
		menu1.add(scrollPane);
		
		JPanel menu2 = new JPanel();
		menu2.setBackground(Color.YELLOW);
		menu2.setBounds(168, 0, 763, 73);
		getContentPane().add(menu2);
		menu2.setLayout(null);
		
		JLabel lbAutoEscola = new JLabel("Auto Escola L\u00EDder");
		lbAutoEscola.setSize(new Dimension(262, 33));
		lbAutoEscola.setMinimumSize(new Dimension(0, 0));
		lbAutoEscola.setMaximumSize(new Dimension(0, 0));
		lbAutoEscola.setLocation(new Point(200, 20));
		lbAutoEscola.setFont(new Font("Century", Font.BOLD, 22));
		menu2.add(lbAutoEscola);
		
		layeredPanel = new JLayeredPane();
		layeredPanel.setSize(720, 418);
		layeredPanel.setLocation(168, 73);
		layeredPanel.setPreferredSize(new Dimension(595, 397));
		contentPane.add(layeredPanel);
		layeredPanel.setLayout(null);
		
		JPanel pCadastro = new JPanel();
		pCadastro.setBackground(SystemColor.menu);
		pCadastro.setBounds(0, 0, 720, 418);
		layeredPanel.add(pCadastro);
		pCadastro.setLayout(null);
		
		JButton btCadastroCliente = new JButton("Cliente");
		btCadastroCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCliente cadastroCl = new CadastroCliente();
				cadastroCl.setVisible(true);
			}
		});
		btCadastroCliente.setForeground(Color.BLACK);
		btCadastroCliente.setFont(new Font("Century", Font.PLAIN, 20));
		btCadastroCliente.setBackground(Color.YELLOW);
		btCadastroCliente.setBounds(56, 78, 179, 92);
		pCadastro.add(btCadastroCliente);
		
		JButton btCadastroDespesa = new JButton("Despesa");
		btCadastroDespesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroDespesa cadastroD = new CadastroDespesa();
				cadastroD.setVisible(true);
			}
		});
		btCadastroDespesa.setForeground(Color.BLACK);
		btCadastroDespesa.setFont(new Font("Century", Font.PLAIN, 20));
		btCadastroDespesa.setBackground(Color.YELLOW);
		btCadastroDespesa.setBounds(170, 241, 179, 92);
		pCadastro.add(btCadastroDespesa);
		
		JButton btCadastroFuncionario = new JButton("Funcion\u00E1rio");
		btCadastroFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroFuncionario cadastroF = new CadastroFuncionario();
				cadastroF.setVisible(true);
			}
		});
		btCadastroFuncionario.setForeground(Color.BLACK);
		btCadastroFuncionario.setFont(new Font("Century", Font.PLAIN, 20));
		btCadastroFuncionario.setBackground(Color.YELLOW);
		btCadastroFuncionario.setBounds(298, 78, 179, 92);
		pCadastro.add(btCadastroFuncionario);
		
		JButton btCadastroAgenda = new JButton("Agenda");
		btCadastroAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroAgenda cadastroA = new CadastroAgenda();
				cadastroA.setVisible(true);
			}
		});
		btCadastroAgenda.setForeground(Color.BLACK);
		btCadastroAgenda.setFont(new Font("Century", Font.PLAIN, 20));
		btCadastroAgenda.setBackground(Color.YELLOW);
		btCadastroAgenda.setBounds(421, 241, 179, 92);
		pCadastro.add(btCadastroAgenda);
		
		JButton btCadastroVeiculo = new JButton("Ve\u00EDculo");
		btCadastroVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroVeiculo cadastroV = new CadastroVeiculo();
				cadastroV.setVisible(true);
			}
		});
		btCadastroVeiculo.setForeground(Color.BLACK);
		btCadastroVeiculo.setFont(new Font("Century", Font.PLAIN, 20));
		btCadastroVeiculo.setBackground(Color.YELLOW);
		btCadastroVeiculo.setBounds(536, 78, 179, 92);
		pCadastro.add(btCadastroVeiculo);
		
		layeredPanel.setLayer(pCadastro, 1);
		
		JPanel pConsulta = new JPanel();
		pConsulta.setBackground(SystemColor.menu);
		pConsulta.setBounds(new Rectangle(0, 0, 763, 431));
		pConsulta.setBounds(0, 0, 720, 418);
		layeredPanel.add(pConsulta);
		pConsulta.setLayout(null);
		
		JButton btConsultaCliente = new JButton("Cliente");
		btConsultaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaCliente consultaCl = new ConsultaCliente();
				consultaCl.setVisible(true);
			}
		});
		btConsultaCliente.setMargin(new Insets(3, 3, 3, 3));
		btConsultaCliente.setBounds(new Rectangle(213, 23, 179, 92));
		btConsultaCliente.setForeground(Color.BLACK);
		btConsultaCliente.setFont(new Font("Century", Font.PLAIN, 20));
		btConsultaCliente.setBackground(Color.YELLOW);
		btConsultaCliente.setBounds(146, 31, 179, 92);
		pConsulta.add(btConsultaCliente);
		
		JButton btConsultaFuncionario = new JButton("Funcion\u00E1rio");
		btConsultaFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaFuncionario consultaF = new ConsultaFuncionario();
				consultaF.setVisible(true);
			}
		});
		btConsultaFuncionario.setFont(new Font("Century", Font.PLAIN, 20));
		btConsultaFuncionario.setBounds(146, 170, 179, 92);
		btConsultaFuncionario.setBackground(Color.YELLOW);
		btConsultaFuncionario.setForeground(Color.BLACK);
		pConsulta.add(btConsultaFuncionario);
		
		JButton btConsultaVeiculo = new JButton("Ve\u00EDculo");
		btConsultaVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaVeiculo consultaV = new ConsultaVeiculo();
				consultaV.setVisible(true);
			}
		});
		btConsultaVeiculo.setForeground(Color.BLACK);
		btConsultaVeiculo.setFont(new Font("Century", Font.PLAIN, 20));
		btConsultaVeiculo.setBackground(Color.YELLOW);
		btConsultaVeiculo.setBounds(146, 311, 179, 92);
		pConsulta.add(btConsultaVeiculo);
		
		JButton btConsultarAgenda = new JButton("Agenda");
		btConsultarAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaAgenda consultaA = new ConsultaAgenda();
				consultaA.setVisible(true);
			}
		});
		btConsultarAgenda.setBackground(Color.YELLOW);
		btConsultarAgenda.setForeground(Color.BLACK);
		btConsultarAgenda.setFont(new Font("Century", Font.PLAIN, 20));
		btConsultarAgenda.setBounds(428, 31, 179, 92);
		pConsulta.add(btConsultarAgenda);
		
		JButton btConsultaDespesa = new JButton("Despesa");
		btConsultaDespesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaDespesa consultaD = new ConsultaDespesa();
				consultaD.setVisible(true);
			}
		});
		btConsultaDespesa.setForeground(Color.BLACK);
		btConsultaDespesa.setFont(new Font("Century", Font.PLAIN, 20));
		btConsultaDespesa.setBackground(Color.YELLOW);
		btConsultaDespesa.setBounds(428, 170, 179, 92);
		pConsulta.add(btConsultaDespesa);
		
		JButton btConsultaPagamento = new JButton("Pagamento");
		btConsultaPagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaPagamento consultaP = new ConsultaPagamento();
				consultaP.setVisible(true);
			}
		});
		btConsultaPagamento.setBackground(Color.YELLOW);
		btConsultaPagamento.setFont(new Font("Century", Font.PLAIN, 20));
		btConsultaPagamento.setForeground(Color.BLACK);
		btConsultaPagamento.setBounds(428, 311, 179, 92);
		pConsulta.add(btConsultaPagamento);
		
		layeredPanel.setLayer(pConsulta, 0);
		
		JButton btCadastrar = new JButton("Cadastro");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pConsulta.setVisible(false);
				pCadastro.setVisible(true);
				scrollPane.setBounds(0, 139, 10, 51);;
			}
		});
		btCadastrar.setFont(new Font("Century", Font.PLAIN, 14));
		btCadastrar.setContentAreaFilled(false);
		btCadastrar.setBorder(null);
		btCadastrar.setPreferredSize(new Dimension(0, 0));
		btCadastrar.setMinimumSize(new Dimension(0, 0));
		btCadastrar.setMaximumSize(new Dimension(0, 0));
		btCadastrar.setLocation(new Point(12, 139));
		btCadastrar.setMargin(new Insets(3, 3, 3, 3));
		btCadastrar.setSize(new Dimension(156, 51));
		btCadastrar.setForeground(Color.WHITE);
		btCadastrar.setBackground(Color.DARK_GRAY);
		btCadastrar.setBounds(12, 139, 156, 51);
		menu1.add(btCadastrar);
		
		JButton btConsultar = new JButton("Consulta");
		btConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pCadastro.setVisible(false);
				pConsulta.setVisible(true);
				scrollPane.setBounds(0, 196, 10, 51);
			}
		});
		btConsultar.setBorder(null);
		btConsultar.setContentAreaFilled(false);
		btConsultar.setForeground(Color.WHITE);
		btConsultar.setFont(new Font("Century", Font.PLAIN, 14));
		btConsultar.setBounds(12, 196, 156, 51);
		menu1.add(btConsultar);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.setBorder(null);
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollPane.setBounds(0, 253, 10, 51);
				System.exit(0);
			}
		});
		btFechar.setForeground(Color.WHITE);
		btFechar.setFont(new Font("Century", Font.PLAIN, 14));
		btFechar.setContentAreaFilled(false);
		btFechar.setBounds(12, 253, 156, 51);
		menu1.add(btFechar);
		
	}
}
