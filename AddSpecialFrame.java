package FinalProject;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class AddSpecialFrame extends JFrame{
	
	JPanel p1, p2, p3, p4;
	JLabel titleLabel, descriptionLabel, disclaimerLabel, scopeLabel, dTypeLabel, startLabel, endLabel, l1, l2;
	JButton addSpecialBtn;
	JTextField titleText, descriptionText, disclaimerText, startText, endText;
	JComboBox scopeCB, scopeCB2, dTypeCB;
	ButtonGroup bg;
	JRadioButton yes, no;
	
	public AddSpecialFrame(){
		super("Add Special:");
		setLayout(new BorderLayout());
		
		p1 = new JPanel(new GridLayout(3, 2));
		p2 = new JPanel(new GridLayout(2, 3));
		p3 = new JPanel(new GridLayout(4, 2));
		p4 = new JPanel(new GridLayout(1, 2));
		
		titleLabel = new JLabel("* Title:");
		descriptionLabel = new JLabel("Description:");
		disclaimerLabel = new JLabel("Disclaimer:");
		scopeLabel = new JLabel("* Scope:");
		dTypeLabel = new JLabel("* Discount Type:");
		startLabel = new JLabel("Start Date:");
		endLabel = new JLabel("End Date:");
		l1 = new JLabel("* Can this special be used together with others?");
		l2 = new JLabel("* items are required fields.");
		
		addSpecialBtn = new JButton("Add New Special");
		
		titleText = new JTextField(10);
		descriptionText = new JTextField(10);
		disclaimerText = new JTextField(10);
		startText = new JTextField(10);
		endText = new JTextField(10);
		
		scopeCB = new JComboBox();
		scopeCB.addItem("Brand");
		// ...
		scopeCB2 = new JComboBox();
		scopeCB2.addItem("--");
		// ...
		dTypeCB = new JComboBox();
		dTypeCB.addItem("Percentage off");
		dTypeCB.addItem("One time cash back");
		
		bg= new ButtonGroup();
		yes = new JRadioButton("Yes");
		no = new JRadioButton("No");
		bg.add(yes);
		bg.add(no);
		
		p1.add(titleLabel);
		p1.add(titleText);
		p1.add(descriptionLabel);
		p1.add(descriptionText);
		p1.add(disclaimerLabel);
		p1.add(disclaimerText);
		
		p2.add(scopeLabel);
		p2.add(scopeCB);
		p2.add(scopeCB2);
		p2.add(dTypeLabel);
		p2.add(dTypeCB);
		
		p3.add(startLabel);
		p3.add(startText);
		p3.add(endLabel);
		p3.add(endText);
		p3.add(l1);
		p3.add(p4);
		p3.add(l2);
		p3.add(addSpecialBtn);
		
		p4.add(yes);
		p4.add(no);
		
		getContentPane().add(p1, BorderLayout.NORTH);
		getContentPane().add(p2, BorderLayout.CENTER);
		getContentPane().add(p3, BorderLayout.SOUTH);
		
		setSize(700, 500);
		setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  
        pack();
	}
}
