package interfacesGraphiques;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class InterfaceSI_Conteneur extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceSI_Conteneur frame = new InterfaceSI_Conteneur();
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
	public InterfaceSI_Conteneur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SYSTEMENT D'ENREGISTREMENT DES PRODUITS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(84, 47, 493, 39);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setBounds(310, 117, 216, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblProduits = new JLabel("PRODUITS:");
		lblProduits.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblProduits.setBounds(99, 119, 145, 39);
		contentPane.add(lblProduits);
		
		JLabel lblMarques = new JLabel("MARQUES:");
		lblMarques.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMarques.setBounds(99, 181, 126, 39);
		contentPane.add(lblMarques);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(310, 181, 216, 41);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(310, 250, 216, 41);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(310, 322, 216, 41);
		contentPane.add(textField_3);
		
		JLabel lblCouleur = new JLabel("COULEURS");
		lblCouleur.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCouleur.setBounds(99, 250, 126, 39);
		contentPane.add(lblCouleur);
		
		JLabel lblPrix = new JLabel("PRIX:");
		lblPrix.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPrix.setBounds(99, 322, 126, 39);
		contentPane.add(lblPrix);
		
		JButton btnNewButton = new JButton("ENREGISTRER");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(310, 409, 216, 29);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(94, 99, 469, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(99, 464, 469, 2);
		contentPane.add(separator_1);
	}

}
