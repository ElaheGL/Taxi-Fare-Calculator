import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GuiPart extends JFrame implements ActionListener{
	private JRadioButton blue ,black;
	private JTextField userDs ;
	private JPanel part1,part2 ;
	
	public GuiPart() {
		setTitle("taxi request");
		setSize(300,200);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/////////////////////////////////////
		part2 = new JPanel();
		part2.add(new JLabel ("enter kiloometer :"));
		userDs = new JTextField(10);
		part2.add(userDs);	
		blue = new JRadioButton("Blue");
		black = new JRadioButton("Black");
		ButtonGroup taxies = new ButtonGroup();
		taxies.add(black);
		taxies.add(blue);
		part1 = new JPanel();
		part1.add(black);
		part1.add(blue);
		blue.addActionListener(this);
		black.addActionListener(this);
		add(part2,BorderLayout.NORTH);
		add(part1,BorderLayout.CENTER);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GuiPart form = new GuiPart();

	}
	public void display(double a) {
		DecimalFormat df = new DecimalFormat("$####,##0.00");
		taxifee fee = new taxifee();
		double distance = Double.parseDouble(userDs.getText());
		double total = a*(fee.calfee(distance));
		String Ftotal = df.format(total);
		
		JOptionPane.showMessageDialog(null,Ftotal);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== blue) {
			display(1.5);
			
		}
		if(e.getSource()==black) {
			display(1);
			
		}
		

	}

}
