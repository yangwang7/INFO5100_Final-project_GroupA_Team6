package FinalProject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AddButton extends JFrame{
	JButton addBtn;
	
	public AddButton(){
		addBtn = new JButton("Add");
		
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AddSpecialFrame().setVisible(true);
			}
		});

		getContentPane().add(addBtn);
		
		setSize(700, 500);
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  
        pack();
	}

	public static void main(String[] args) {
		AddButton f = new AddButton();
	}

}
