package swingexemple;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class etudiant extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_name;
	private JTextField textField_firstname;
	private JTextField textField_age;
	private JTable studentsTable;
	DefaultTableModel dtm;
	String name;
	String fn;
	int age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					etudiant frame = new etudiant();
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
	public etudiant() {
		setTitle("Gestion des étudiants ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 472);
		contentPane = new JPanel();
	    contentPane.setName("Gestion des étudiants");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom : ");
		lblNom.setBounds(27, 12, 70, 15);
		contentPane.add(lblNom);
		
		JLabel lblPrnom = new JLabel("Prénom : ");
		lblPrnom.setBounds(27, 52, 70, 15);
		contentPane.add(lblPrnom);
		
		JLabel lblTel = new JLabel("Age :");
		lblTel.setBounds(27, 95, 70, 15);
		contentPane.add(lblTel);
		
		textField_name = new JTextField();
		textField_name.setBounds(137, 10, 114, 19);
		contentPane.add(textField_name);
		textField_name.setColumns(10);
		
		textField_firstname = new JTextField();
		
		textField_firstname.setBounds(137, 50, 114, 19);
		contentPane.add(textField_firstname);
		textField_firstname.setColumns(10);
		
		textField_age = new JTextField();

		textField_age.setBounds(137, 93, 114, 19);
		contentPane.add(textField_age);
		textField_age.setColumns(10);
		
		
		
		JButton btnAjouter = new JButton("ajouter");
		btnAjouter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				name = textField_name.getText();
				fn = textField_firstname.getText();
				age = Integer.parseInt(textField_age.getText());
				dtm.addRow(new Object[]{name, fn, age});
                  
		    
			
			}

			private int parseInt(String text) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		btnAjouter.setBounds(282, 85, 117, 25);
		contentPane.add(btnAjouter);
		
		        Object[][] data = new Object[][] {
	            {"SIMON", "Anne-So", 25 },
	        };
			String [] columnNames = {"Nom","Prénom","Age"};
			
			dtm = new DefaultTableModel(data,columnNames);
			studentsTable=new JTable(dtm);
			studentsTable.setBackground(Color.PINK);
			JScrollPane jsp2 = new JScrollPane();
			jsp2.setLocation(98, 148);
			jsp2.setSize(254, 113);
			jsp2.setViewportView(studentsTable);
			this.getContentPane().add(jsp2);
			studentsTable.setBounds(124, 144, 200, 100);
			
        
	}
}
