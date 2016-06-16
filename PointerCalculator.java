import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class PointerCalculator extends Frame implements ActionListener {
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
	float ptr=(float) 0.0;
	Button bc,bclr;
	int sum=0;
	public PointerCalculator() {
		// TODO Auto-generated constructor stub
		super("Pointer Calculator");
		l1=new Label("TOC");
		l2=new Label("CN");
		l3=new Label("OS");
		l4=new Label("DBE");
		l5=new Label("SFS");
		l6=new Label("CN LAB");
		l7=new Label("DB LAB");
		l8=new Label("JAVA LAB");
		l9=new Label("Pointer");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		t5=new TextField(10);
		t6=new TextField(10);
		t7=new TextField(10);
		t8=new TextField(10);
		t9=new TextField(10);
		t9.setEditable(false);
		bc=new Button("Calculate");
		bclr=new Button("Clear");
		bc.addActionListener(this);
		bclr.addActionListener(this);
		setLayout(new GridLayout(10,2,5,5));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(l6);
		add(t6);
		add(l7);
		add(t7);
		add(l8);
		add(t8);
		add(l9);
		add(t9);
		add(bc);
		add(bclr);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(b==bc)
		{
			String s1=t1.getText();
			int p1=calc(s1);
			sum+=4*p1;
			String s2=t2.getText();
			int p2=calc(s2);
			sum+=3*p2;
			String s3=t3.getText();
			int p3=calc(s3);
			sum+=4*p3;
			String s4=t4.getText();
			int p4=calc(s4);
			sum+=3*p4;
			String s5=t5.getText();
			int p5=calc(s5);
			sum+=3*p5;
			String s6=t6.getText();
			int p6=1*calc(s6);
			sum+=p6;
			String s7=t7.getText();
			int p7=calc(s7);
			sum+=1*p7;
			String s8=t8.getText();
			int p8=calc(s8);
			sum+=4*p8;
			ptr=(float)sum/23;
			t9.setText(""+ptr);
			try{
			JOptionPane.showMessageDialog(null,"The Pointer is: "+ptr);
			}
			catch(Exception e1){}
			ptr=(float)0.0;
			sum=0;
		}
		else
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			sum=0;
			ptr=(float)0.0;
		}
	}
	private int calc(String s1) {
		// TODO Auto-generated method stub
		if(s1.equalsIgnoreCase("AA"))
			return 10;
		if(s1.equalsIgnoreCase("AB"))
			return 9;
		if(s1.equalsIgnoreCase("BB"))
			return 8;
		if(s1.equalsIgnoreCase("BC"))
			return 7;
		if(s1.equalsIgnoreCase("CC"))
			return 6;
		if(s1.equalsIgnoreCase("CD"))
			return 5;
		if(s1.equalsIgnoreCase("DD"))
			return 4;
		if(s1.equalsIgnoreCase("FF")||s1.equalsIgnoreCase("XX"))
			return 0;
		return 0;
	}
	public static void main(String [] args)
	{
		PointerCalculator a=new PointerCalculator();
	}
}
