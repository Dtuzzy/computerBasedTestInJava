
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class seniorSec_02 {
	DefaultTableModel model02;
	JTable table02;
	ImageIcon y, y2;
	JLabel wel, wel2, welz, studUsername02;
	JTextArea dialog;
	private JTabbedPane mainpane;
	private JFrame frame;
	Container panel;
	JPanel pane2, pane3, pane4, pane5, pane6;
	JEditorPane servicePane;
	JButton previous, next, results;
	RadioButtonHandler handler;
	int count = 0;
	int score = 0;
	int scoreM = 0;
	int scoreE = 0;
	int scoreP = 0;
	int scoreC = 0;
	int scoreB = 0;
	Timer timer;
	int counter = 0;
	JLabel label;
	// Maths
	JPanel qOne, qtwo, qthree, qfour, qfive;
	JLabel que_01, que_02, que_03, que_04, que_05;
	JRadioButton que01_opt_01, que01_opt_02, que01_opt_03, que01_opt_04, que02_opt_01, que02_opt_02, que02_opt_03,
			que02_opt_04, que03_opt_01, que03_opt_02, que03_opt_03, que03_opt_04, que04_opt_01, que04_opt_02,
			que04_opt_03, que04_opt_04, que05_opt_01, que05_opt_02, que05_opt_03, que05_opt_04;

	// English
	JPanel qOne2, qtwo2, qthree2, qfour2, qfive2;
	JLabel que_012, que_022, que_032, que_042, que_052;
	JRadioButton que01_opt_012, que01_opt_022, que01_opt_032, que01_opt_042, que02_opt_012, que02_opt_022,
			que02_opt_032, que02_opt_042, que03_opt_012, que03_opt_022, que03_opt_032, que03_opt_042, que04_opt_012,
			que04_opt_022, que04_opt_032, que04_opt_042, que05_opt_012, que05_opt_022, que05_opt_032, que05_opt_042;

	// Physics
	JPanel qOne23, qtwo23, qthree23, qfour23, qfive23;
	JLabel que_0123, que_0223, que_0323, que_0423, que_0523;
	JRadioButton que01_opt_0123, que01_opt_0223, que01_opt_0323, que01_opt_0423, que02_opt_0123, que02_opt_0223,
			que02_opt_0323, que02_opt_0423, que03_opt_0123, que03_opt_0223, que03_opt_0323, que03_opt_0423,
			que04_opt_0123, que04_opt_0223, que04_opt_0323, que04_opt_0423, que05_opt_0123, que05_opt_0223,
			que05_opt_0323, que05_opt_0423;

	// Chemistry
	JPanel qOne234, qtwo234, qthree234, qfour234, qfive234;
	JLabel que_01234, que_02234, que_03234, que_04234, que_05234;
	JRadioButton que01_opt_01234, que01_opt_02234, que01_opt_03234, que01_opt_04234, que02_opt_01234, que02_opt_02234,
			que02_opt_03234, que02_opt_04234, que03_opt_01234, que03_opt_02234, que03_opt_03234, que03_opt_04234,
			que04_opt_01234, que04_opt_02234, que04_opt_03234, que04_opt_04234, que05_opt_01234, que05_opt_02234,
			que05_opt_03234, que05_opt_04234;

	// Biology
	JPanel qOne2345, qtwo2345, qthree2345, qfour2345, qfive2345;
	JLabel que_012345, que_022345, que_032345, que_042345, que_052345;
	JRadioButton que01_opt_012345, que01_opt_022345, que01_opt_032345, que01_opt_042345, que02_opt_012345,
			que02_opt_022345, que02_opt_032345, que02_opt_042345, que03_opt_012345, que03_opt_022345, que03_opt_032345,
			que03_opt_042345, que04_opt_012345, que04_opt_022345, que04_opt_032345, que04_opt_042345, que05_opt_012345,
			que05_opt_022345, que05_opt_032345, que05_opt_042345;

	public void playSound() {
		BufferedInputStream bis;
		Player player = null;
		try {
			InputStream fl = this.getClass().getClassLoader().getResourceAsStream("sounds/startTest.mp3");
			bis = new BufferedInputStream(fl);
			player = new Player(bis);
			player.play();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	


	public void Class_01() {

		frame = new JFrame("Page One");
		// pane1.setLayout(new GridLayout());
		// DialogHandler handler = new DialogHandler();
		JPanel headerPane = new JPanel();
		headerPane.setBounds(0, 0, 1350, 100);

		
		label = new JLabel("0");
		label.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 18));
		JPanel timep = new JPanel();
		timep.setBackground(Color.pink);
		timep.add(label, BorderLayout.LINE_START);
		timep.setBounds(1108, 430, 200, 40);

		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				counter++;
				label.setText(String.valueOf(counter) + " Seconds");
				if (counter == 900) {
					fiveMin();
					results.setToolTipText("Click here to finsh test and view SCORE!!");
					label.setForeground(Color.blue);
					results.setForeground(Color.red);
				} else if (counter == 1200) {
					label.setForeground(Color.black);
					servicePane.setBackground(Color.red);
					testComplete();
					timer.stop();
					
				}
			}
		});
		timer.start();
		frame.add(timep);

		studUsername02 = new JLabel();
		studUsername02.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 20));
		studUsername02.setBounds(10, 20, 200, 30);

		servicePane = new JEditorPane();
		servicePane.setBorder(BorderFactory.createEtchedBorder());
		servicePane.setBounds(1003, 105, 340, 520);
		servicePane.setBackground(Color.pink);
		servicePane.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 20));
		servicePane.setText(
				"Mathematics: \n\nEnglish: \n\nPhysics: \n\nChemistry: \n\nBiology: \n\nTotal Score: \n\nTime Used: \n\nTotal Time");

		previous = new JButton("<< Previous Page");
		previous.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		previous.setBounds(1018, 625, 150, 40);
		previous.setEnabled(false);
		previous.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				count--;
				if (count <= 1)
					mainpane.setSelectedIndex(count);

			}
		});

		next = new JButton("Next Page >>");
		next.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		next.setBounds(1172, 625, 150, 40);
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				count++;
				if (count >= 1)
					mainpane.setSelectedIndex(count);
				previous.setEnabled(true);

				if (count >= 4)
					next.setEnabled(false);

			}
		});

		BHandler hnd = new BHandler();
		results = new JButton("Check Results");
		results.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		results.setBounds(1108, 580, 150, 40);
		results.addActionListener(hnd);
		frame.add(results);
		
		JPanel topPane = new JPanel();
		pane2 = new JPanel();
		pane2.setLayout(new GridLayout(0, 1));

		topPane.setBounds(0, 105, 1000, 590);
		// pane2.setBounds(0,110,1100,750);

		qOne = new JPanel();
		qOne.setBorder(BorderFactory.createEtchedBorder());
		qOne.setBackground(Color.cyan);

		qtwo = new JPanel();
		qtwo.setLayout(new GridLayout(0, 1));
		qtwo.setBorder(BorderFactory.createEtchedBorder());
		qtwo.setBackground(Color.cyan);

		qthree = new JPanel();
		qthree.setLayout(new GridLayout(0, 1));
		qthree.setBorder(BorderFactory.createEtchedBorder());
		qthree.setBackground(Color.cyan);

		qfour = new JPanel();
		qfour.setLayout(new GridLayout(0, 1));
		qfour.setBorder(BorderFactory.createEtchedBorder());
		qfour.setBackground(Color.cyan);

		qfive = new JPanel();
		qfive.setLayout(new GridLayout(0, 1));
		qfive.setBorder(BorderFactory.createEtchedBorder());
		qfive.setBackground(Color.cyan);

		// RadioButtons For Questions

		que_02 = new JLabel("1. Roundoff 827,502 to 3 significant figures ");
		que_02.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qtwo.add(que_02);

		// Radio Question One
		que02_opt_01 = new JRadioButton("828,000");
		que02_opt_01.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_02 = new JRadioButton("830,000");
		que02_opt_02.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_03 = new JRadioButton("800,000");
		que02_opt_03.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_04 = new JRadioButton("82.8");
		que02_opt_04.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_01_grp = new ButtonGroup();
		que_01_grp.add(que02_opt_01);
		que_01_grp.add(que02_opt_02);
		que_01_grp.add(que02_opt_03);
		que_01_grp.add(que02_opt_04);

		qtwo.add(que02_opt_01);
		qtwo.add(que02_opt_02);
		qtwo.add(que02_opt_03);
		qtwo.add(que02_opt_04);

		// End of Question One

		que_03 = new JLabel("2. Roundoff 0.08921 to 2 decimal places");
		que_03.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qthree.add(que_03);

		// Radio Question two
		que03_opt_01 = new JRadioButton("0.1");
		que03_opt_01.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_02 = new JRadioButton("0.082");
		que03_opt_02.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_03 = new JRadioButton("0.089");
		que03_opt_03.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_04 = new JRadioButton("0.09");
		que03_opt_04.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_02_grp = new ButtonGroup();
		que_02_grp.add(que03_opt_01);
		que_02_grp.add(que03_opt_02);
		que_02_grp.add(que03_opt_03);
		que_02_grp.add(que03_opt_04);

		qthree.add(que03_opt_01);
		qthree.add(que03_opt_02);
		qthree.add(que03_opt_03);
		qthree.add(que03_opt_04);
		// End of Question two

		que_04 = new JLabel("3. Find The 20th term of the sequence whose nth term is 4n + 3");
		que_04.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qfour.add(que_04);

		// Radio Question three
		que04_opt_01 = new JRadioButton("73");
		que04_opt_01.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_02 = new JRadioButton("93");
		que04_opt_02.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_03 = new JRadioButton("83");
		que04_opt_03.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_04 = new JRadioButton("63");
		que04_opt_04.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_03_grp = new ButtonGroup();
		que_03_grp.add(que04_opt_01);
		que_03_grp.add(que04_opt_02);
		que_03_grp.add(que04_opt_03);
		que_03_grp.add(que04_opt_04);

		qfour.add(que04_opt_01);
		qfour.add(que04_opt_02);
		qfour.add(que04_opt_03);
		qfour.add(que04_opt_04);
		// End of Question three

		que_05 = new JLabel("4. If a = 2 and b = 6 , find a(a+b)/a");
		que_05.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qfive.add(que_05);

		// Radio Question four
		que05_opt_01 = new JRadioButton("35");
		que05_opt_01.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_02 = new JRadioButton("8");
		que05_opt_02.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_03 = new JRadioButton("14");
		que05_opt_03.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_04 = new JRadioButton("90");
		que05_opt_04.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_04_grp = new ButtonGroup();
		que_04_grp.add(que05_opt_01);
		que_04_grp.add(que05_opt_02);
		que_04_grp.add(que05_opt_03);
		que_04_grp.add(que05_opt_04);

		qfive.add(que05_opt_01);
		qfive.add(que05_opt_02);
		qfive.add(que05_opt_03);
		qfive.add(que05_opt_04);
		// End of Question four

		handler = new RadioButtonHandler();
		que02_opt_01.addItemListener(handler);
		que02_opt_02.addItemListener(handler);
		que02_opt_03.addItemListener(handler);
		que02_opt_04.addItemListener(handler);

		// 2nd
		que03_opt_01.addItemListener(handler);
		que03_opt_02.addItemListener(handler);
		que03_opt_03.addItemListener(handler);
		que03_opt_04.addItemListener(handler);

		// 3rd
		que04_opt_01.addItemListener(handler);
		que04_opt_02.addItemListener(handler);
		que04_opt_03.addItemListener(handler);
		que04_opt_04.addItemListener(handler);

		// 4th
		que05_opt_01.addItemListener(handler);
		que05_opt_02.addItemListener(handler);
		que05_opt_03.addItemListener(handler);
		que05_opt_04.addItemListener(handler);

		pane2.add(qtwo);
		pane2.add(qthree);
		pane2.add(qfour);
		pane2.add(qfive);
		// pane2.add(qOne);

		english();
		physics();
		chemistry();
		biology();

		mainpane = new JTabbedPane();
		mainpane.addTab("Mathematics", pane2);
		mainpane.addTab("English", pane3);
		mainpane.addTab("Physics", pane4);
		mainpane.addTab("Chemistry", pane5);
		mainpane.addTab("Biology", pane6);

		ImageIcon yo = new ImageIcon(this.getClass().getResource("images/header.png"));
		wel = new JLabel(yo);
		wel.setBounds(0, 0, 1350, 100);
		headerPane.add(wel);

		frame.add(studUsername02);
		frame.add(next);
		frame.add(previous);
		frame.add(servicePane);
		topPane.setLayout(new BorderLayout());
		topPane.add(mainpane);
		frame.add(topPane);
		frame.add(headerPane);
		frame.setSize(1400,750);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				try {

					String ObjButtons[] = { "Yes", "No" };
					int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to exit Uzea?", "Uzea",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
					if (PromptResult == JOptionPane.YES_OPTION) {
						testComplete();
						System.exit(0);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected void testComplete() {
			complete();
			createScoreData();
			inputScoreData();
			int HEIGHT = 500;
			int WIDTH = 500;
			JEditorPane me = new JEditorPane();

			me.setSize(500, 500);
			me.setText("Mathematics:"+scoreM+" Out Of 4marks \n\nEnglish:"+scoreE+" Out Of 4marks \n\nPhysics:"+scoreP+" Out Of 4marks \n\nChemistry:"+scoreC+" Out Of 4marks \n\nBiology:"+scoreB+" Out Of 4marks \n\nTotal Score: "
					+ score + " out of 20marks");
			me.setFont(new Font("Italic", Font.BOLD | Font.ITALIC, 14));
			me.setEditable(false);
			me.setSize(HEIGHT, WIDTH);
			Component seniorSec_01 = null;
			try {

				String ObjButtons[] = { "Yes", "No" };
				int PromptResult = JOptionPane.showOptionDialog(null, me, "Uzea",
						JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
				if (PromptResult == JOptionPane.YES_OPTION) {
							
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	servicePane.setText("Mathematics:"+scoreM+" Out Of 4marks \n\nEnglish:"+scoreE+" Out Of 4marks \n\nPhysics:"+scoreP+" Out Of 4marks \n\nChemistry:"+scoreC+" Out Of 4marks \n\nBiology:"+scoreB+" Out Of 4marks \n\nTotal Score: "
							+ score + " \n\nTime Used: \n\nTotal Time: 1200seconds (20 Minutes)");
		}
	

	private void inputScoreData() {
		PreparedStatement psts = null;
		
		 try {
			 Class.forName("org.sqlite.JDBC");
				// instantiate connection variable and use deriver manager
				Connection c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Public\\StudentScore.db");
				
				String sql = "INSERT INTO "+studUsername02.getText()+""
						+ "(Maths,English,Physics,Chemistry,Biology,Total) VALUES"
						+ "(?,?,?,?,?,?)";
			psts = c.prepareStatement(sql);
	
			psts.setLong(1, scoreM);
			psts.setLong(2, scoreE);
			psts.setLong(3, scoreP);
			psts.setLong(4, scoreC);
			psts.setLong(5, scoreB);
			psts.setLong(6, score);
			psts.executeUpdate();
			
			
			
			psts.close();
			c.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	private void createScoreData() {
		try {
			// call JDBC connection class
			// call JDBC connection class
			Class.forName("org.sqlite.JDBC");
			// instantiate connection variable and use deriver manager
			Connection c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Public\\StudentScore.db");
			System.out.println("Opened Database successfully!!");


			Statement stmt = c.createStatement();
			String sql = "CREATE TABLE "+studUsername02.getText()+ "(Maths TEXT NOT NULL, " + "English TEXT NOT NULL, "+ "Physics TEXT NOT NULL, "+ "Chemistry TEXT NOT NULL, "+ "Biology TEXT NOT NULL, "+ "Total TEXT NOT NULL)";
			
			stmt.executeUpdate(sql);

			stmt.close();
			// close connection
			c.close();
		} catch (Exception ex) {
			// error handlers

			System.err.println(ex.getClass().getName() + ": " + ex.getMessage());
			System.exit(0);
		}
		System.out.println("Records Created successfully!!");

		
	}


	private void complete() {
			BufferedInputStream bis;
			Player player = null;
			try {
				InputStream fl = this.getClass().getClassLoader().getResourceAsStream("sounds/testComplete.mp3");
				bis = new BufferedInputStream(fl);
				player = new Player(bis);
				player.play();
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	protected void fiveMin() {
			BufferedInputStream bis;
			Player player = null;
			try {
				InputStream fl = this.getClass().getClassLoader().getResourceAsStream("sounds/fivemins.mp3");
				bis = new BufferedInputStream(fl);
				player = new Player(bis);
				player.play();
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		

	// English Panel
	public void english() {

		pane3 = new JPanel();
		pane3.setLayout(new GridLayout(0, 1));

		qtwo2 = new JPanel();
		qtwo2.setLayout(new GridLayout(0, 1));
		qtwo2.setBorder(BorderFactory.createEtchedBorder());
		qtwo2.setBackground(Color.cyan);

		qthree2 = new JPanel();
		qthree2.setLayout(new GridLayout(0, 1));
		qthree2.setBorder(BorderFactory.createEtchedBorder());
		qthree2.setBackground(Color.cyan);

		qfour2 = new JPanel();
		qfour2.setLayout(new GridLayout(0, 1));
		qfour2.setBorder(BorderFactory.createEtchedBorder());
		qfour2.setBackground(Color.cyan);

		qfive2 = new JPanel();
		qfive2.setLayout(new GridLayout(0, 1));
		qfive2.setBorder(BorderFactory.createEtchedBorder());
		qfive2.setBackground(Color.cyan);

		// RadioButtons For Questions

		que_022 = new JLabel("1. Which of these is not a noun?");
		que_022.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));

		// Radio Question One
		que02_opt_012 = new JRadioButton("Uzea");
		que02_opt_012.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_022 = new JRadioButton("Nigeria");
		que02_opt_022.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_032 = new JRadioButton("Go");
		que02_opt_032.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_042 = new JRadioButton("Benin");
		que02_opt_042.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_01_grp2 = new ButtonGroup();
		que_01_grp2.add(que02_opt_012);
		que_01_grp2.add(que02_opt_022);
		que_01_grp2.add(que02_opt_032);
		que_01_grp2.add(que02_opt_042);

		qtwo2.add(que_022);
		qtwo2.add(que02_opt_012);
		qtwo2.add(que02_opt_022);
		qtwo2.add(que02_opt_032);
		qtwo2.add(que02_opt_042);

		// End of Question One

		// English
		que_032 = new JLabel("2. Which of these sentences is correct?");
		que_032.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qthree2.add(que_032);

		// Radio Question two
		que03_opt_012 = new JRadioButton("I am done the job");
		que03_opt_012.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_022 = new JRadioButton("She was a boy");
		que03_opt_022.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_032 = new JRadioButton("Let's going home right now");
		que03_opt_032.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_042 = new JRadioButton("Gift is a brilliant girl");
		que03_opt_042.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		
		ButtonGroup que_02_grp2 = new ButtonGroup();
		que_02_grp2.add(que03_opt_012);
		que_02_grp2.add(que03_opt_022);
		que_02_grp2.add(que03_opt_032);
		que_02_grp2.add(que03_opt_042);

		qthree2.add(que03_opt_012);
		qthree2.add(que03_opt_022);
		qthree2.add(que03_opt_032);
		qthree2.add(que03_opt_042);
		// End of Question two

		que_042 = new JLabel("3. Mr Osas ___________ to America to meet his daughter.");
		que_042.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qfour2.add(que_042);

		// Radio Question three
		que04_opt_012 = new JRadioButton("is travel");
		que04_opt_012.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_022 = new JRadioButton("was travelled");
		que04_opt_022.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_032 = new JRadioButton("travelled");
		que04_opt_032.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_042 = new JRadioButton("is gone");
		que04_opt_042.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		
		ButtonGroup que_03_grp2 = new ButtonGroup();
		que_03_grp2.add(que04_opt_012);
		que_03_grp2.add(que04_opt_022);
		que_03_grp2.add(que04_opt_032);
		que_03_grp2.add(que04_opt_042);

		qfour2.add(que_042);
		qfour2.add(que04_opt_012);
		qfour2.add(que04_opt_022);
		qfour2.add(que04_opt_032);
		qfour2.add(que04_opt_042);
		// End of Question three

		que_052 = new JLabel("4. What is an Adjective?");
		que_052.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qfive2.add(que_052);

		// Radio Question four
		que05_opt_012 = new JRadioButton("qualifies a verb");
		que05_opt_012.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_022 = new JRadioButton("assists a preposition");
		que05_opt_022.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_032 = new JRadioButton("defines an adverb");
		que05_opt_032.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_042 = new JRadioButton("qualifies a noun");
		que05_opt_042.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_04_grp2 = new ButtonGroup();
		que_04_grp2.add(que05_opt_012);
		que_04_grp2.add(que05_opt_022);
		que_04_grp2.add(que05_opt_032);
		que_04_grp2.add(que05_opt_042);

		qfive2.add(que_052);
		qfive2.add(que05_opt_012);
		qfive2.add(que05_opt_022);
		qfive2.add(que05_opt_032);
		qfive2.add(que05_opt_042);
		// End of Question four

		que02_opt_012.addItemListener(handler);
		que02_opt_022.addItemListener(handler);
		que02_opt_032.addItemListener(handler);
		que02_opt_042.addItemListener(handler);

		// 2nd
		que03_opt_012.addItemListener(handler);
		que03_opt_022.addItemListener(handler);
		que03_opt_032.addItemListener(handler);
		que03_opt_042.addItemListener(handler);

		// 3rd
		que04_opt_012.addItemListener(handler);
		que04_opt_022.addItemListener(handler);
		que04_opt_032.addItemListener(handler);
		que04_opt_042.addItemListener(handler);

		// 4th
		que05_opt_012.addItemListener(handler);
		que05_opt_022.addItemListener(handler);
		que05_opt_032.addItemListener(handler);
		que05_opt_042.addItemListener(handler);

		pane3.add(qtwo2);
		pane3.add(qthree2);
		pane3.add(qfour2);
		pane3.add(qfive2);

	}

	// Physics Panel
	public void physics() {
		pane4 = new JPanel();
		pane4.setLayout(new GridLayout(0, 1));

		qtwo23 = new JPanel();
		qtwo23.setLayout(new GridLayout(0, 1));
		qtwo23.setBorder(BorderFactory.createEtchedBorder());
		qtwo23.setBackground(Color.cyan);

		qthree23 = new JPanel();
		qthree23.setLayout(new GridLayout(0, 1));
		qthree23.setBorder(BorderFactory.createEtchedBorder());
		qthree23.setBackground(Color.cyan);

		qfour23 = new JPanel();
		qfour23.setLayout(new GridLayout(0, 1));
		qfour23.setBorder(BorderFactory.createEtchedBorder());
		qfour23.setBackground(Color.cyan);

		qfive23 = new JPanel();
		qfive23.setLayout(new GridLayout(0, 1));
		qfive23.setBorder(BorderFactory.createEtchedBorder());
		qfive23.setBackground(Color.cyan);

		// RadioButtons For Questions

		que_0223 = new JLabel("1. ______ is said to be done when a force move a body in a certain distance in the direction of force");
		que_0223.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));

		// Radio Question One
		que02_opt_0123 = new JRadioButton("Pressure");
		que02_opt_0123.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_0223 = new JRadioButton("Workdone");
		que02_opt_0223.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_0323 = new JRadioButton("Force");
		que02_opt_0323.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_0423 = new JRadioButton("Distance");
		que02_opt_0423.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_01_grp23 = new ButtonGroup();
		que_01_grp23.add(que02_opt_0123);
		que_01_grp23.add(que02_opt_0223);
		que_01_grp23.add(que02_opt_0323);
		que_01_grp23.add(que02_opt_0423);

		qtwo23.add(que_0223);
		qtwo23.add(que02_opt_0123);
		qtwo23.add(que02_opt_0223);
		qtwo23.add(que02_opt_0323);
		qtwo23.add(que02_opt_0423);

		// End of Question One

		que_0323 = new JLabel("2. The formula for Work is?");
		que_0323.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qthree23.add(que_0323);

		// Radio Question two
		que03_opt_0123 = new JRadioButton("f x d");
		que03_opt_0123.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_0223 = new JRadioButton("f x p");
		que03_opt_0223.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_0323 = new JRadioButton("f / p");
		que03_opt_0323.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_0423 = new JRadioButton("f / a");
		que03_opt_0423.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_02_grp23 = new ButtonGroup();
		que_02_grp23.add(que03_opt_0123);
		que_02_grp23.add(que03_opt_0223);
		que_02_grp23.add(que03_opt_0323);
		que_02_grp23.add(que03_opt_0423);

		qthree23.add(que03_opt_0123);
		qthree23.add(que03_opt_0223);
		qthree23.add(que03_opt_0323);
		qthree23.add(que03_opt_0423);
		// End of Question two

		que_0423 = new JLabel("3. Energy on a steady state is called?");
		que_0423.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qfour2.add(que_0423);

		// Radio Question three
		que04_opt_0123 = new JRadioButton("Solar energy");
		que04_opt_0123.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_0223 = new JRadioButton("Magnetic energy");
		que04_opt_0223.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_0323 = new JRadioButton("Potential energy");
		que04_opt_0323.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_0423 = new JRadioButton("Kinetic energy");
		que04_opt_0423.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_03_grp23 = new ButtonGroup();
		que_03_grp23.add(que04_opt_0123);
		que_03_grp23.add(que04_opt_0223);
		que_03_grp23.add(que04_opt_0323);
		que_03_grp23.add(que04_opt_0423);

		qfour23.add(que_0423);
		qfour23.add(que04_opt_0123);
		qfour23.add(que04_opt_0223);
		qfour23.add(que04_opt_0323);
		qfour23.add(que04_opt_0423);
		// End of Question three

		que_0523 = new JLabel("4. Energy on a motion is called");
		que_0523.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qfive23.add(que_0523);

		// Radio Question four
		que05_opt_0123 = new JRadioButton("Rotatry energy");
		que05_opt_0123.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_0223 = new JRadioButton("Kinetic energy");
		que05_opt_0223.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_0323 = new JRadioButton("Electrical energy");
		que05_opt_0323.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_0423 = new JRadioButton("None ofthe above");
		que05_opt_0423.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_04_grp23 = new ButtonGroup();
		que_04_grp23.add(que05_opt_0123);
		que_04_grp23.add(que05_opt_0223);
		que_04_grp23.add(que05_opt_0323);
		que_04_grp23.add(que05_opt_0423);

		qfive23.add(que_0523);
		qfive23.add(que05_opt_0123);
		qfive23.add(que05_opt_0223);
		qfive23.add(que05_opt_0323);
		qfive23.add(que05_opt_0423);
		// End of Question four

		que02_opt_0123.addItemListener(handler);
		que02_opt_0223.addItemListener(handler);
		que02_opt_0323.addItemListener(handler);
		que02_opt_0423.addItemListener(handler);

		// 2nd
		que03_opt_0123.addItemListener(handler);
		que03_opt_0223.addItemListener(handler);
		que03_opt_0323.addItemListener(handler);
		que03_opt_0423.addItemListener(handler);

		// 3rd
		que04_opt_0123.addItemListener(handler);
		que04_opt_0223.addItemListener(handler);
		que04_opt_0323.addItemListener(handler);
		que04_opt_0423.addItemListener(handler);

		// 4th
		que05_opt_0123.addItemListener(handler);
		que05_opt_0223.addItemListener(handler);
		que05_opt_0323.addItemListener(handler);
		que05_opt_0423.addItemListener(handler);

		pane4.add(qtwo23);
		pane4.add(qthree23);
		pane4.add(qfour23);
		pane4.add(qfive23);

	}

	// Chemistry Panel
	public void chemistry() {
		pane5 = new JPanel();
		pane5.setLayout(new GridLayout(0, 1));

		qtwo234 = new JPanel();
		qtwo234.setLayout(new GridLayout(0, 1));
		qtwo234.setBorder(BorderFactory.createEtchedBorder());
		qtwo234.setBackground(Color.cyan);

		qthree234 = new JPanel();
		qthree234.setLayout(new GridLayout(0, 1));
		qthree234.setBorder(BorderFactory.createEtchedBorder());
		qthree234.setBackground(Color.cyan);

		qfour234 = new JPanel();
		qfour234.setLayout(new GridLayout(0, 1));
		qfour234.setBorder(BorderFactory.createEtchedBorder());
		qfour234.setBackground(Color.cyan);

		qfive234 = new JPanel();
		qfive234.setLayout(new GridLayout(0, 1));
		qfive234.setBorder(BorderFactory.createEtchedBorder());
		qfive234.setBackground(Color.cyan);

		// RadioButtons For Questions

		que_02234 = new JLabel("1. The arrangement of an element according to the number of electron is called?");
		que_02234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));

		// Radio Question One
		que02_opt_01234 = new JRadioButton("Periodicity");
		que02_opt_01234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_02234 = new JRadioButton("Group");
		que02_opt_02234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_03234 = new JRadioButton("Period");
		que02_opt_03234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_04234 = new JRadioButton("All of the above");
		que02_opt_04234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_01_grp234 = new ButtonGroup();
		que_01_grp234.add(que02_opt_01234);
		que_01_grp234.add(que02_opt_02234);
		que_01_grp234.add(que02_opt_03234);
		que_01_grp234.add(que02_opt_04234);

		qtwo234.add(que_02234);
		qtwo234.add(que02_opt_01234);
		qtwo234.add(que02_opt_02234);
		qtwo234.add(que02_opt_03234);
		qtwo234.add(que02_opt_04234);

		// End of Question One

		que_03234 = new JLabel("2. Calcium belong to the group of ____ in the periodic table?");
		que_03234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qthree234.add(que_03234);

		// Radio Question two
		que03_opt_01234 = new JRadioButton("4");
		que03_opt_01234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_02234 = new JRadioButton("2");
		que03_opt_02234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_03234 = new JRadioButton("8");
		que03_opt_03234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_04234 = new JRadioButton("7");
		que03_opt_04234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_02_grp234 = new ButtonGroup();
		que_02_grp234.add(que03_opt_01234);
		que_02_grp234.add(que03_opt_02234);
		que_02_grp234.add(que03_opt_03234);
		que_02_grp234.add(que03_opt_04234);

		qthree234.add(que03_opt_01234);
		qthree234.add(que03_opt_02234);
		qthree234.add(que03_opt_03234);
		qthree234.add(que03_opt_04234);
		// End of Question two

		que_04234 = new JLabel("3. Calcium belongs to what period?");
		que_04234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qfour234.add(que_04234);

		// Radio Question three
		que04_opt_01234 = new JRadioButton("3");
		que04_opt_01234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_02234 = new JRadioButton("5");
		que04_opt_02234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_03234 = new JRadioButton("4");
		que04_opt_03234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_04234 = new JRadioButton("1");
		que04_opt_04234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_03_grp234 = new ButtonGroup();
		que_03_grp234.add(que04_opt_01234);
		que_03_grp234.add(que04_opt_02234);
		que_03_grp234.add(que04_opt_03234);
		que_03_grp234.add(que04_opt_04234);

		qfour234.add(que_04234);
		qfour234.add(que04_opt_01234);
		qfour234.add(que04_opt_02234);
		qfour234.add(que04_opt_03234);
		qfour234.add(que04_opt_04234);
		// End of Question three

		que_05234 = new JLabel("4. Element with Atomic number 5 in the periodic table is?");
		que_05234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qfive234.add(que_05234);

		// Radio Question four
		que05_opt_01234 = new JRadioButton("Boron");
		que05_opt_01234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_02234 = new JRadioButton("Carbon");
		que05_opt_02234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_03234 = new JRadioButton("Potassium");
		que05_opt_03234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_04234 = new JRadioButton("Silver");
		que05_opt_04234.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_04_grp234 = new ButtonGroup();
		que_04_grp234.add(que05_opt_01234);
		que_04_grp234.add(que05_opt_02234);
		que_04_grp234.add(que05_opt_03234);
		que_04_grp234.add(que05_opt_04234);

		qfive234.add(que_05234);
		qfive234.add(que05_opt_01234);
		qfive234.add(que05_opt_02234);
		qfive234.add(que05_opt_03234);
		qfive234.add(que05_opt_04234);
		// End of Question four

		que02_opt_01234.addItemListener(handler);
		que02_opt_02234.addItemListener(handler);
		que02_opt_03234.addItemListener(handler);
		que02_opt_04234.addItemListener(handler);

		// 2nd
		que03_opt_01234.addItemListener(handler);
		que03_opt_02234.addItemListener(handler);
		que03_opt_03234.addItemListener(handler);
		que03_opt_04234.addItemListener(handler);

		// 3rd
		que04_opt_01234.addItemListener(handler);
		que04_opt_02234.addItemListener(handler);
		que04_opt_03234.addItemListener(handler);
		que04_opt_04234.addItemListener(handler);

		// 4th
		que05_opt_01234.addItemListener(handler);
		que05_opt_02234.addItemListener(handler);
		que05_opt_03234.addItemListener(handler);
		que05_opt_04234.addItemListener(handler);

		pane5.add(qtwo234);
		pane5.add(qthree234);
		pane5.add(qfour234);
		pane5.add(qfive234);

	}

	// Biology Panel
	public void biology() {
		pane6 = new JPanel();
		pane6.setLayout(new GridLayout(0, 1));

		qtwo2345 = new JPanel();
		qtwo2345.setLayout(new GridLayout(0, 1));
		qtwo2345.setBorder(BorderFactory.createEtchedBorder());
		qtwo2345.setBackground(Color.cyan);

		qthree2345 = new JPanel();
		qthree2345.setLayout(new GridLayout(0, 1));
		qthree2345.setBorder(BorderFactory.createEtchedBorder());
		qthree2345.setBackground(Color.cyan);

		qfour2345 = new JPanel();
		qfour2345.setLayout(new GridLayout(0, 1));
		qfour2345.setBorder(BorderFactory.createEtchedBorder());
		qfour2345.setBackground(Color.cyan);

		qfive2345 = new JPanel();
		qfive2345.setLayout(new GridLayout(0, 1));
		qfive2345.setBorder(BorderFactory.createEtchedBorder());
		qfive2345.setBackground(Color.cyan);

		// RadioButtons For Questions

		que_022345 = new JLabel("1. The Cell is the _______ unit of life?");
		que_022345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));

		// Radio Question One
		que02_opt_012345 = new JRadioButton("Biggest");
		que02_opt_012345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_022345 = new JRadioButton("Largest");
		que02_opt_022345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_032345 = new JRadioButton("Basic");
		que02_opt_032345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que02_opt_042345 = new JRadioButton("Mightiest");
		que02_opt_042345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_01_grp2345 = new ButtonGroup();
		que_01_grp2345.add(que02_opt_012345);
		que_01_grp2345.add(que02_opt_022345);
		que_01_grp2345.add(que02_opt_032345);
		que_01_grp2345.add(que02_opt_042345);

		qtwo2345.add(que_022345);
		qtwo2345.add(que02_opt_012345);
		qtwo2345.add(que02_opt_022345);
		qtwo2345.add(que02_opt_032345);
		qtwo2345.add(que02_opt_042345);

		// End of Question One

		que_032345 = new JLabel("2. Cell can exist as ____________ unit?");
		que_032345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qthree2345.add(que_032345);

		// Radio Question two
		que03_opt_012345 = new JRadioButton("Simple Independent");
		que03_opt_012345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_022345 = new JRadioButton("Simple & Independent");
		que03_opt_022345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_032345 = new JRadioButton("Simple and Dependent");
		que03_opt_032345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que03_opt_042345 = new JRadioButton("Single Independent");
		que03_opt_042345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_02_grp2345 = new ButtonGroup();
		que_02_grp2345.add(que03_opt_012345);
		que_02_grp2345.add(que03_opt_022345);
		que_02_grp2345.add(que03_opt_032345);
		que_02_grp2345.add(que03_opt_042345);

		qthree2345.add(que03_opt_012345);
		qthree2345.add(que03_opt_022345);
		qthree2345.add(que03_opt_032345);
		qthree2345.add(que03_opt_042345);
		// End of Question two

		que_042345 = new JLabel("3. _________ is one of the scientists that contributed to the history of cell ?");
		que_042345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qfour2345.add(que_042345);

		// Radio Question three
		que04_opt_012345 = new JRadioButton("Robert Hooke");
		que04_opt_012345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_022345 = new JRadioButton("Abraham Lincolin");
		que04_opt_022345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_032345 = new JRadioButton("Nelson Mandela");
		que04_opt_032345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que04_opt_042345 = new JRadioButton("Godwin Obaseki");
		que04_opt_042345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_03_grp2345 = new ButtonGroup();
		que_03_grp2345.add(que04_opt_012345);
		que_03_grp2345.add(que04_opt_022345);
		que_03_grp2345.add(que04_opt_032345);
		que_03_grp2345.add(que04_opt_042345);

		qfour2345.add(que_042345);
		qfour2345.add(que04_opt_012345);
		qfour2345.add(que04_opt_022345);
		qfour2345.add(que04_opt_032345);
		qfour2345.add(que04_opt_042345);
		// End of Question three

		que_052345 = new JLabel("4. Cell exists in these forms except ?");
		que_052345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 14));
		qfive2345.add(que_052345);

		// Radio Question four
		que05_opt_012345 = new JRadioButton("Part of a multi-national organization");
		que05_opt_012345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_022345 = new JRadioButton("Single");
		que05_opt_022345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_032345 = new JRadioButton("Colony");
		que05_opt_032345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));
		que05_opt_042345 = new JRadioButton("Filament");
		que05_opt_042345.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 12));

		ButtonGroup que_04_grp2345 = new ButtonGroup();
		que_04_grp2345.add(que05_opt_012345);
		que_04_grp2345.add(que05_opt_022345);
		que_04_grp2345.add(que05_opt_032345);
		que_04_grp2345.add(que05_opt_042345);

		qfive2345.add(que_052345);
		qfive2345.add(que05_opt_012345);
		qfive2345.add(que05_opt_022345);
		qfive2345.add(que05_opt_032345);
		qfive2345.add(que05_opt_042345);
		// End of Question four

		que02_opt_012345.addItemListener(handler);
		que02_opt_022345.addItemListener(handler);
		que02_opt_032345.addItemListener(handler);
		que02_opt_042345.addItemListener(handler);

		// 2nd
		que03_opt_012345.addItemListener(handler);
		que03_opt_022345.addItemListener(handler);
		que03_opt_032345.addItemListener(handler);
		que03_opt_042345.addItemListener(handler);

		// 3rd
		que04_opt_012345.addItemListener(handler);
		que04_opt_022345.addItemListener(handler);
		que04_opt_032345.addItemListener(handler);
		que04_opt_042345.addItemListener(handler);

		// 4th
		que05_opt_012345.addItemListener(handler);
		que05_opt_022345.addItemListener(handler);
		que05_opt_032345.addItemListener(handler);
		que05_opt_042345.addItemListener(handler);

		pane6.add(qtwo2345);
		pane6.add(qthree2345);
		pane6.add(qfour2345);
		pane6.add(qfive2345);

	}

	
	public class RadioButtonHandler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent ev) {
			if (ev.getSource() == que02_opt_01) {
				score += 1;
				scoreM += 1;
			} else if (ev.getSource() == que03_opt_04) {
				score += 1;
				scoreM += 1;
			} else if (ev.getSource() == que04_opt_03) {
				score += 1;
				scoreM += 1;
			} else if (ev.getSource() == que05_opt_02) {
				score += 1;
				scoreM += 1;
				// English
			} else if (ev.getSource() == que02_opt_032) {
				score += 1;
				scoreE += 1;
			} else if (ev.getSource() == que03_opt_042) {
				score += 1;
				scoreE += 1;
			} else if (ev.getSource() == que04_opt_032) {
				score += 1;
				scoreE += 1;
			} else if (ev.getSource() == que05_opt_042) {
				score += 1;
				scoreE += 1;
				// physics
			} else if (ev.getSource() == que02_opt_0223) {
				score += 1;
				scoreP += 1;
			} else if (ev.getSource() == que03_opt_0123) {
				score += 1;
				scoreP += 1;
			} else if (ev.getSource() == que04_opt_0323) {
				score += 1;
				scoreP += 1;
			} else if (ev.getSource() == que05_opt_0223) {
				score += 1;
				scoreP += 1;
				// chemistry
			} else if (ev.getSource() == que02_opt_01234) {
				score += 1;
				scoreC += 1;
			} else if (ev.getSource() == que03_opt_02234) {
				score += 1;
				scoreC += 1;
			} else if (ev.getSource() == que04_opt_03234) {
				score += 1;
				scoreC += 1;
			} else if (ev.getSource() == que05_opt_01234) {
				score += 1;
				scoreC += 1;
				// biology
			} else if (ev.getSource() == que02_opt_032345) {
				score += 1;
				scoreB += 1;
			} else if (ev.getSource() == que03_opt_012345) {
				score += 1;
				scoreB += 1;
			} else if (ev.getSource() == que04_opt_012345) {
				score += 1;
				scoreB += 1;
			} else if (ev.getSource() == que05_opt_012345) {
				score += 1;
				scoreB += 1;
			}
		}
	}

	private class BHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ev) {

			if (ev.getSource() == results) {
				testComplete();
				timer.stop();
		}

	}
	}
	//public static void main(String[] a) {
	//	seniorSec_01 sso = new seniorSec_01();
	//	sso.Class_01();
	//}
	
	}

