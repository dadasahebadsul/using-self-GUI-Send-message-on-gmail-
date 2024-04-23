import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Email_networking implements ActionListener {

	/**
	 * @param args
	 */
	JFrame f1;
	 JProgressBar br;
	 JLabel l1,l2,l3,l4,l5;
	 JTextField tf1,tf2,tf3;
	 JButton b1,b2,b3;
	 JTextArea ta;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email_networking obj=new Email_networking();

	}
	Email_networking(){
		  f1=new JFrame();
		    f1.setSize(600,750);
		    f1.setLocationRelativeTo(null);
		    f1.setLayout(null);
		    f1.getContentPane().setBackground(Color.pink);
		   
		    br=new JProgressBar();
		    br.setBounds(40,50,480,40);
		    br.setOrientation(0);
		    br.setBackground(Color.DARK_GRAY);
		    br.setFont(new Font("Times of Roman ",Font.BOLD,40));
		    br.setForeground(Color.blue);
		    br.setIndeterminate(true);
		    br.setString("   -: Email Networking :-   ");
		    br.setStringPainted(true);
		    f1.add(br);
		    
		    l1=new JLabel("   -: Email Networking :-   ");
		    l1.setBounds(40,50,480,40);
		    f1.add(l1);
		    
		    l2=new JLabel("Email To:-");
		    l2.setFont (new Font("Arial",Font.BOLD,23));
		    l2.setBounds(20,110,120,40);
		    f1.add(l2);
		    
		    l3=new JLabel("subject:-");
		    l3.setFont (new Font("Arial",Font.BOLD,23));
		    l3.setBounds(20,170,120,40);
		    f1.add(l3);
		    
		    l4=new JLabel("Message:-");
		    l4.setFont (new Font("Arial",Font.BOLD,23));
		    l4.setBounds(20,230,120,40);
		    f1.add(l4);
		    
		    l5=new JLabel("Attach:-");
		    l5.setFont (new Font("Arial",Font.BOLD,23));
		    l5.setBounds(20,290,120,40);
		    f1.add(l5);
		    
		    tf1 = new JTextField("");
	        tf1.setBounds(160,110,200,40);
	        tf1.setBackground(Color.cyan);
	        f1.add(tf1);
	        
	        tf2 = new JTextField("");
	        tf2.setBounds(160,170,200,40);
	        tf2.setBackground(Color.cyan);
	        f1.add(tf2);
	        
	        tf3 = new JTextField("");
	        tf3.setBounds(160,290,120,40);
	        tf3.setBackground(Color.cyan);
	        f1.add(tf3);
	        
	        ta=new JTextArea();
			ta.setBounds(160,230,200,40);
			ta.setBackground(Color.cyan);
			f1.add(ta);
			
			 b1=new JButton("send");
			    b1.setBounds(40,340,150,40);
				b1.setFont (new Font("Arial",Font.BOLD,25));
				
			    f1.add(b1);
			    
			    b2=new JButton("cancel");
			    b2.setBounds(210,340,150,40);
				b2.setFont (new Font("Arial",Font.BOLD,25));
				
			    f1.add(b2);
		    
			    
			    b3=new JButton("Browse");
			    b3.setBounds(290,290,150,40);
				b3.setFont (new Font("Arial",Font.BOLD,25));
				
			    f1.add(b3);
			    
			    b1.addActionListener(this);
			    b2.addActionListener(this);
			    b3.addActionListener(this);
			    
			/*    
			    tf2.addKeyListener(new KeyAdapter()
				{
					public void keyTyped(KeyEvent ke)
					{
						char ch=ke.getKeyChar();
					if(!((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z')||ch==KeyEvent.VK_BACK_SPACE))
					{
						f1.getToolkit().beep();
						ke.consume();
					}
					}
				});*/
		    
		    
		    
		    f1.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj=e.getSource();
		
		if(obj==b2)
		
		 System.exit(0);	
		 else
			if(obj==b3)
			{
				JFileChooser jfc= new JFileChooser();
				jfc.showOpenDialog(f1);
			}
				else
					if(obj==b1)
					{
						 String to=tf1.getText();
						 String subject=tf2.getText();
						 String msg=ta.getText();
						 First_SendEmail.sender( to, subject,  msg);
						 //Second_SendAttachmentEmail.sendattachment( to, subject,  msg);
					}
			}
	}

	
		
	
		

