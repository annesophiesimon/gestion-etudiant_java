package swingexemple;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class testsw extends JFrame {

	private JPanel contentPane;
	int counter = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testsw frame = new testsw();
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
	public testsw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("/home/anneso/Téléchargements/img1.jpg"));
		lblNewLabel_1.setBounds(47, 31, 317, 192);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSuivant = new JButton("suivant");
		btnSuivant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				Slide slider = new Slide();
				
				if (counter >= slider.tabImage.length-1)
					counter = 0;
				else
					counter++;
				
				lblNewLabel_1.setIcon(new ImageIcon(slider.slideImage(counter)));
				
				

			}
		});
		btnSuivant.setBounds(264, 235, 117, 25);
		contentPane.add(btnSuivant);
		
		JButton btnPrcedent = new JButton("Précedent");
		btnPrcedent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Slide slider = new Slide();
				
				if (counter <= 0) {
					counter = slider.tabImage.length-1;
					
				}

					else
					counter--;
				
				lblNewLabel_1.setIcon(new ImageIcon(slider.slideImage(counter)));
			
			
			}
		});
		btnPrcedent.setBounds(27, 235, 117, 25);
		contentPane.add(btnPrcedent);
		
		
	}
}
