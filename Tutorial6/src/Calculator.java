import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
	JTextField current_year = new JTextField(4);
	JTextField birth_date = new JTextField(4);
	JLabel age = new JLabel("Your age: ");
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.go();
	}

	public void  go() {
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelYear = new JPanel();
		JPanel panelDate = new JPanel();
		JPanel panelNorth = new JPanel();
		JPanel panelWest = new JPanel();
		JPanel panelEast = new JPanel();
		
		JLabel year = new JLabel("Please enter the current year: ");
		panelYear.add(year);
		panelYear.add(current_year);
		
		panelDate.add(new JLabel("Please enter the year of your birth date: "));
		panelDate.add(birth_date);
		
		panelNorth.setLayout(new BoxLayout(panelNorth, BoxLayout.Y_AXIS));
		panelNorth.add(panelYear);
		panelNorth.add(panelDate);
		
		panelWest.setLayout(new BoxLayout(panelWest, BoxLayout.Y_AXIS));
		panelWest.add(age);
		
		JButton button = new JButton("Confirm");
		button.addActionListener(this);
		
		panelEast.setLayout(new BoxLayout(panelEast, BoxLayout.Y_AXIS));
		panelEast.add(button);
		
		frame.add(panelNorth, BorderLayout.NORTH);
		frame.add(panelWest, BorderLayout.WEST);
		frame.add(panelEast, BorderLayout.EAST);
		
		frame.setSize(500,200);
		frame.setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent event) {
		int year = Integer.parseInt(current_year.getText());
		int date = Integer.parseInt(birth_date.getText());
		age.setText("Your age: " + (year - date) );
	}
}