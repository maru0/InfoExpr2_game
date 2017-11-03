package test1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Title extends JFrame{
	Dron dr = new Dron();
	static Title tl;
	JButton btn = new JButton("Start");
	JLabel title = new JLabel("Dron!");
	public Title(){
		this.setLayout(null);
		this.add(dr);
		this.setVisible(false);
		title.setBounds(0,0,400,40);
		this.add(title);
		btn.setBounds(50, 50, 200, 40);
		btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	
            	
            }
        });
		this.add(btn);
		this.setTitle("Dron!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 200);
	}
	
	public void start(){
		tl = new Title();
		tl.setVisible(true);
	}
}

