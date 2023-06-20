import javax.swing.*;
import java.awt.event.*;
public class Swingdemo21 implements WindowListener{
	Swingdemo21(){
		JFrame f = new JFrame();
		JTextField tf = new JTextField();
		tf.setBounds(200,100,150,20);
		JButton b = new JButton("click");
		b.setBounds(130,300,100,40);
		JButton b1 = new JButton("click1");
		b1.setBounds(150,200,100,40);
		f.add(b);
		f.add(b1);
		
		f.add(tf);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true); 
		f.addWindowListener(this);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Button is clicked");
			}
		}
		);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("hello");
			}
		}
		);
	}
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
	public void windowActivated(WindowEvent e) {
		System.out.println("Activated");
	}
	public void windowDeactivated(WindowEvent e)
	{}
	public void windowOpened(WindowEvent e) {
		System.out.println("Opened");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("Closed");
	}
	public void windowIconified(WindowEvent e)
	{}
	public void windowDeiconified(WindowEvent e)
	{}
	public static void main(String args[]) {
		new Swingdemo21();
	}
}
