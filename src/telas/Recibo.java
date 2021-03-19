package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.List;
import java.awt.event.ActionEvent;

public class Recibo extends JFrame {

	private JPanel contentPane;
	private JTextField tfRecibo1;
	private JTextField tfRecibo2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recibo frame = new Recibo();
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
	public Recibo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 800, 450);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(0, 0, 800, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbRecibo = new JLabel("Recibo");
		lbRecibo.setFont(new Font("Calibri", Font.PLAIN, 20));
		lbRecibo.setBounds(21, 9, 88, 33);
		panel_1.add(lbRecibo);
		
		JLabel lbRecibo1 = new JLabel("Recebi de");
		lbRecibo1.setFont(new Font("Century", Font.PLAIN, 16));
		lbRecibo1.setBounds(61, 135, 79, 20);
		panel.add(lbRecibo1);
		
		JLabel lbRecibo2 = new JLabel(", a quantia de R$");
		lbRecibo2.setFont(new Font("Century", Font.PLAIN, 16));
		lbRecibo2.setBounds(467, 135, 130, 20);
		panel.add(lbRecibo2);
		
		JLabel lbRecibo3 = new JLabel("(");
		lbRecibo3.setFont(new Font("Century", Font.PLAIN, 16));
		lbRecibo3.setBounds(61, 180, 14, 20);
		panel.add(lbRecibo3);
		
		JLabel lbRecibo4 = new JLabel(", reais)");
		lbRecibo4.setFont(new Font("Century", Font.PLAIN, 16));
		lbRecibo4.setBounds(696, 180, 58, 20);
		panel.add(lbRecibo4);
		
		JLabel lbRecibo5 = new JLabel("correspondente aos servi\u00E7os prestados pelo Auto Escola L\u00EDder, e para clareza firmo o presente");
		lbRecibo5.setFont(new Font("Century", Font.PLAIN, 16));
		lbRecibo5.setBounds(61, 221, 688, 20);
		panel.add(lbRecibo5);
		
		JLabel lbRecibo6 = new JLabel("na cidade de Indaiatuba na data,");
		lbRecibo6.setFont(new Font("Century", Font.PLAIN, 16));
		lbRecibo6.setBounds(61, 260, 255, 20);
		panel.add(lbRecibo6);
		
		JLabel lbRecibo7 = new JLabel("Assinatura: _______________________");
		lbRecibo7.setFont(new Font("Century", Font.PLAIN, 16));
		lbRecibo7.setBounds(61, 324, 288, 20);
		panel.add(lbRecibo7);
		
		JLabel lblNewLabel_7 = new JLabel("Nome por extenso: ________________________________________________");
		lblNewLabel_7.setFont(new Font("Century", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(61, 364, 532, 20);
		panel.add(lblNewLabel_7);
		
		tfRecibo1 = new JTextField();
		tfRecibo1.setFont(new Font("Century", Font.PLAIN, 16));
		tfRecibo1.setEditable(false);
		tfRecibo1.setBounds(603, 128, 151, 27);
		panel.add(tfRecibo1);
		tfRecibo1.setColumns(10);
		
		tfRecibo2 = new JTextField();
		tfRecibo2.setEditable(false);
		tfRecibo2.setFont(new Font("Century", Font.PLAIN, 16));
		tfRecibo2.setBounds(81, 173, 609, 27);
		panel.add(tfRecibo2);
		tfRecibo2.setColumns(10);
		
		JComboBox cbRecibo = new JComboBox();
		cbRecibo.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
				ClienteDAO daoC = new ClienteDAO();
				List<Cliente> listarNomes = daoC.listarNomeCliente();
				cbRecibo.removeAllItems();
				
				for(Cliente c: listarNomes) {
					cbRecibo.addItem(c.getNome());
					cbRecibo.addItemListener(new ItemListener() {
						public void itemStateChanged(ItemEvent arg0) {
							if(cbRecibo.getSelectedItem().equals(c.getNome())) {
								tfRecibo1.setText(String.valueOf(c.getValorParcela()));
								
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
		cbRecibo.setFont(new Font("Century", Font.PLAIN, 16));
		cbRecibo.setBounds(146, 127, 315, 28);
		panel.add(cbRecibo);
		
		JTextField tfDataRecibo = new JTextField();
		tfDataRecibo.setFont(new Font("Century", Font.PLAIN, 16));
		tfDataRecibo.setBounds(318, 255, 248, 27);
		panel.add(tfDataRecibo);
		
		JButton btImprimir = new JButton("Imprimir");
		btImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame yourComponent = new JFrame();
				PrinterJob pjob = PrinterJob.getPrinterJob();
				PageFormat preformat = pjob.defaultPage();
				preformat.setOrientation(PageFormat.LANDSCAPE);
				PageFormat postformat = pjob.pageDialog(preformat);
				//If user does not hit cancel then print.
				if (preformat != postformat) {
				    //Set print component
				    pjob.setPrintable(new Printer(yourComponent), postformat);
				    if (pjob.printDialog()) {
				        try {
							pjob.print();
						} catch (PrinterException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				    }
				}
			}
		});
		btImprimir.setBackground(Color.YELLOW);
		btImprimir.setFont(new Font("Century", Font.BOLD, 14));
		btImprimir.setBounds(665, 364, 109, 26);
		panel.add(btImprimir);
		
		JButton btFechar = new JButton("Fechar");
		btFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btFechar.setFont(new Font("Century", Font.BOLD, 14));
		btFechar.setBackground(Color.YELLOW);
		btFechar.setBounds(665, 412, 109, 26);
		panel.add(btFechar);
	}
}
