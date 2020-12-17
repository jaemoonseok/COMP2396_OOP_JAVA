import javax.swing.*;
public class HelloWorld {

	public static void main(String[] args) {
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JButton button = new JButton("click me");
			frame.add(button);
			frame.setSize(1000,300);;
			frame.setVisible(true);
			frame.setTitle("sdsd");
		}
	}
