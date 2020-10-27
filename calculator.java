import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator   {
	JFrame f;
	JButton bdot,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bequal,bmul,bdiv,bsub,badd;
	JTextField tf,tfr;
	String s;
	char op=0;
	double sum;
	double ref=0;
	String d;
	calculator()
	{	f=new JFrame();
		s=new String();
		d=new String();
		
		b0=new JButton("0");
		b0.setBounds(00,300, 50, 50);
		bdot=new JButton(".");
		bdot.setBounds(50,300, 50, 50);
		bequal=new JButton("=");
		bequal.setBounds(100,300, 50, 50);
		bdiv=new JButton("/");
		bdiv.setBounds(150,300, 50, 50);
		b1=new JButton("1");
		b1.setBounds(0,250, 50, 50);
		b2=new JButton("2");
		b2.setBounds(50,250, 50, 50);
		b3=new JButton("3");
		b3.setBounds(100,250, 50, 50);
		bmul=new JButton("*");
		bmul.setBounds(150,250, 50, 50);
		b4=new JButton("4");
		b4.setBounds(0,200, 50, 50);
		b5=new JButton("5");
		b5.setBounds(50,200, 50, 50);
		b6=new JButton("6");
		b6.setBounds(100,200, 50, 50);
		bsub=new JButton("-");
		bsub.setBounds(150,200, 50, 50);
		b7=new JButton("7");
		b7.setBounds(0,150, 50, 50);
		b8=new JButton("8");
		b8.setBounds(50,150, 50, 50);
		b9=new JButton("9");
		b9.setBounds(100,150, 50, 50);
		badd=new JButton("+");
		badd.setBounds(150,150, 50, 50);
		tf=new JTextField();
		tf.setBounds(0, 100, 150 ,30);
		tfr=new JTextField();
		tfr.setBounds(150, 100, 50 ,30);
		
		f.add(bdot);
		f.add(b0);
		f.add(bequal);
		f.add(bdiv);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(bmul);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bsub);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(badd);
		f.add(tf);
		f.add(tfr);
		bdot.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+".";
		    	d=d+".";
		    	tf.setText(s);
//		            sum=Double.parseDouble(d);
//		            sum=sum+5.5;
//		            tf.setText(String.valueOf(sum));
		    }  
		    });
		b0.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"0";
		    	d=d+"0";
		           tf.setText(s);  
		    }  
		    });
		b1.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"1";
		    	d=d+"1";
		            tf.setText(s);  
		    }  
		    });
		b2.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"2";
		    	d=d+"2";
		            tf.setText(s);  
		    }  
		    });
		b3.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"3";
		    	d=d+"3";
		            tf.setText(s);  
		    }  
		    });
		b4.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"4";
		    	d=d+"4";
		            tf.setText(s);  
		    }  
		    });
		b5.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"5";
		    	d=d+"5";
		            tf.setText(s);  
		    }  
		    });
		b6.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"6";
		    	d=d+"6";
		            tf.setText(s);  
		    }  
		    });
		b7.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"7";
		    	d=d+"7";
		            tf.setText(s);  
		    }  
		    });
		b8.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"8";
		    	d=d+"8";
		            tf.setText(s);  
		    }  
		    });
		b9.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"9";
		    	d=d+"9";
		    	
		            tf.setText(s);  
		    }  
		    });
		bdiv.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"/";
		    	sum=Double.parseDouble(d);
		    	d="";
		    	op='/';
		            tf.setText(s);  
		    }  
		    });
		bmul.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"*";
		    	sum=Double.parseDouble(d);
		    	d="";
		    	op='*';
		            tf.setText(s);  
		    }  
		    });
		badd.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	s=s+"+";
		    	sum=Double.parseDouble(d);
		    	d="";
		    	op='+';
		            tf.setText(s);  
		    }  
		    });
		bsub.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){ 
		    	s=s+"-";
		    	sum=Double.parseDouble(d);
		    	d="";
		    	op='-';
		            tf.setText(s);  
		    }  
		    });
		bequal.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	switch(op) {
		    	case '+':
		    		sum=sum + Double.parseDouble(d);
		    		tfr.setText(String.valueOf(String.format("%.2f", sum)));
		    		s="";
		    		d="";
		    		sum=0;
		    		break;
		    	case '*':
		    		sum=sum * Double.parseDouble(d);
		    		tfr.setText(String.valueOf(sum));
		    		s="";
		    		d="";
		    		sum=0;
		    		break;
		    	case '-':
		    		sum=sum - Double.parseDouble(d);
		    		tfr.setText(String.valueOf(sum));
		    		s="";
		    		d="";
		    		sum=0;
		    		break;
		    	case '/':
		    		sum=sum / Double.parseDouble(d);
		    		tfr.setText(String.valueOf(sum));
		    		s="";
		    		d="";
		    		sum=0;
		    		break;
		    	
		    	}
//		    	tfr.setText(d);
//		    	sum=sum + Double.parseDouble(d);
//	    		tfr.setText(String.valueOf(sum));
		    }  
		    });
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(300,400);
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calculator();
//		System.out.println(d);
	}

}
