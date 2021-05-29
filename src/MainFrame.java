import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame implements Runnable {
	private JButton b1;
	public MainFrame(String title) {
		super(title);
		setSize(600,400);
		b1=new JButton("Przycisk 1");
		add(b1);
		b1.addActionListener(e->JOptionPane.showMessageDialog(null,"Kliknięto "+((JButton)e.getSource()).getText()));
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new MainFrame("Okno główne"));
	}

	@Override
	public void run() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
