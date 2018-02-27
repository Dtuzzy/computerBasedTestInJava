import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class LauncherClass extends JFrame{
	JPanel headerPane, loginPane;
	Container bodyPane;
	ImageIcon y, y2;
	JLabel wel, wel2, welz, studUsername , studClass;
	JTextField username, password;
	JButton login;
	Connection conn;
	InputStream fl;
	//constructor
	public LauncherClass(){
		
		conn = StudentData.dbConnector();
		headerPane = new JPanel();
		headerPane.setBounds(0,0,1350,100);
		ImageIcon yo = new ImageIcon(this.getClass().getResource("images/header.png"));
		wel = new JLabel(yo);
		wel.setBounds(0, 0, 1350, 100);
		headerPane.add(wel);
		
		bodyPane = new Container();
		bodyPane.setBounds(0,102,1350,600);
		
		ImageIcon you = new ImageIcon(this.getClass().getResource("images/schl_02.jpg"));
		wel2 = new JLabel(you);
		wel2.setBounds(0, 0, 1350, 600);
		bodyPane.add(wel2);
		
		loginPane = new JPanel();
		loginPane.setBorder(BorderFactory.createEtchedBorder());
		
		
		
		username = new JTextField();
		username.setFont(new Font("Italic", Font.BOLD | Font.ITALIC, 18));
		password = new JPasswordField();
		password.setFont(new Font("Italic", Font.BOLD | Font.ITALIC, 18));
		login = new JButton("Login");
		login.setFont(new Font("Italic", Font.BOLD | Font.ITALIC, 18));
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (username.getText().length() == 0)
					JOptionPane.showMessageDialog(null, "Empty fields detected! please fill up fields");

				else if (((JPasswordField) password).getPassword().length == 0)
					JOptionPane.showMessageDialog(null, "Empty fields detected! please fill up fields");

				else {
					String user = username.getText();
					char[] pass = ((JPasswordField) password).getPassword();

					String pwd = String.copyValueOf(pass);
					
					if (validate_login(user, pwd)){
						Class_Selection cs = new Class_Selection();
						cs.Class();
						cs.studUsername.setText(user);
						cs.studClass.setText("Identification Number "+ pwd);
						dispose();
						 System.out.println("Login Successfull!");
					}else{
						 System.out.println("Login Failed!");
				}
					
				}
			}

			private boolean validate_login(String username, String password) {

				try {
					conn = StudentData.dbConnector();
					PreparedStatement pst = conn
							.prepareStatement("SELECT * FROM students where username=? and Id=?");
					pst.setString(1, username);
					pst.setString(2, password);
					ResultSet rs = pst.executeQuery();
					if (rs.next())
						return true;
						else
							return false;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
				
			}
		});

		
		loginPane.add(username);
		loginPane.add(password);
		loginPane.add(login);
		loginPane.setLayout(new GridLayout(3,3));
		loginPane.setBounds(500,200,350,150);

		add(loginPane);
		add(bodyPane);
		add(headerPane);
		setSize(1400,750);
		setResizable(true);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				try {

					String ObjButtons[] = { "Yes", "No" };
					int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to exit Uzea?",
							"Uzea", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons,
							ObjButtons[1]);
					if (PromptResult == JOptionPane.YES_OPTION) {
						System.exit(0);
					}else if (PromptResult == JOptionPane.NO_OPTION) {
						
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	
	public void playSound(){
		BufferedInputStream bis;
		   Player player = null;
		try {
			InputStream fl = this.getClass().getClassLoader().getResourceAsStream("sounds/welcome.mp3");
			bis = new BufferedInputStream(fl);
			player = new Player(bis);
			 player.play();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}
	public static void main(String[] args) {
		try {
		
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
			LauncherClass lc = new LauncherClass();
			lc.playSound();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			}
	}
}

