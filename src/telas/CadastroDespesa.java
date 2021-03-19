package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.text.MaskFormatter;
import javax.swing.event.AncestorEvent;

public class CadastroDespesa extends JFrame {

	private JPanel contentPane;
	private JTextField tfPlaca;
	private JTextField tfValor;
	private JTextField tfObservacao;
	private JTextField tfData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDespesa frame = new CadastroDespesa();
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
	public CadastroDespesa() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 813, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 813, 370);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(0, 0, 813, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbCadastroDespesa = new JLabel("Cadastro de Despesa");
		lbCadastroDespesa.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbCadastroDespesa.setBounds(12, 9, 243, 33);
		panel_1.add(lbCadastroDespesa);
		
		JLabel lbModelo = new JLabel("Modelo:");
		lbModelo.setFont(new Font("Century", Font.BOLD, 16));
		lbModelo.setBounds(136, 105, 73, 20);
		panel.add(lbModelo);
		
		JLabel lbPlaca = new JLabel("Placa:");
		lbPlaca.setFont(new Font("Century", Font.BOLD, 16));
		lbPlaca.setBounds(149, 139, 60, 20);
		panel.add(lbPlaca);
		
		JLabel lbValor = new JLabel("Valor:");
		lbValor.setFont(new Font("Century", Font.BOLD, 16));
		lbValor.setBounds(149, 173, 60, 20);
		panel.add(lbValor);
		
		JLabel lbObservacao = new JLabel("Observa\u00E7\u00E3o:");
		lbObservacao.setFont(new Font("Century", Font.BOLD, 16));
		lbObservacao.setBounds(100, 206, 109, 20);
		panel.add(lbObservacao);
		
		JLabel lbData = new JLabel("Data:");
		lbData.setFont(new Font("Century", Font.BOLD, 16));
		lbData.setBounds(155, 241, 54, 20);
		panel.add(lbData);
		
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
								}
							}
						});
				}
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		cbModelo.setEditable(true);
		cbModelo.setFont(new Font("Century", Font.PLAIN, 16));
		cbModelo.setBounds(215, 102, 147, 28);
		panel.add(cbModelo);
		
		tfPlaca = new JTextField();
		tfPlaca.setEditable(false);
		tfPlaca.setFont(new Font("Century", Font.PLAIN, 16));
		tfPlaca.setBounds(215, 136, 147, 27);
		panel.add(tfPlaca);
		tfPlaca.setColumns(10);
		
		tfValor = new JTextField();
		tfValor.setFont(new Font("Century", Font.PLAIN, 16));
		tfValor.setBounds(215, 170, 147, 27);
		panel.add(tfValor);
		tfValor.setColumns(10);
		
		tfObservacao = new JTextField();
		tfObservacao.setFont(new Font("Century", Font.PLAIN, 16));
		tfObservacao.setBounds(215, 203, 147, 27);
		panel.add(tfObservacao);
		tfObservacao.setColumns(10);
		
		JFormattedTextField ftfData = new JFormattedTextField(Mascara("##/##/####"));
		ftfData.setFont(new Font("Century", Font.PLAIN, 16));
		ftfData.setBounds(215, 236, 147, 27);
		panel.add(ftfData);	
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Veiculo veiculo = new Veiculo();
				veiculo.setPlaca(tfPlaca.getText());
				
				Despesa d = new Despesa(tfObservacao.getText(), ftfData.getText(), Double.parseDouble(tfValor.getText()), veiculo);
				DespesaDAO daoD = new DespesaDAO();
				JOptionPane.showMessageDialog(null, daoD.cadastrar(d));
				
				tfObservacao.setText("");
				ftfData.setText("");
				tfValor.setText("");
			}
		});
		btCadastrar.setForeground(Color.BLACK);
		btCadastrar.setFont(new Font("Century", Font.BOLD, 14));
		btCadastrar.setBackground(Color.YELLOW);
		btCadastrar.setBounds(602, 88, 162, 81);
		panel.add(btCadastrar);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btFechar.setBackground(Color.YELLOW);
		btFechar.setFont(new Font("Century", Font.BOLD, 14));
		btFechar.setBounds(602, 242, 162, 81);
		panel.add(btFechar);
	}
}
