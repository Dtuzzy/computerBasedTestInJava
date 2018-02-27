import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;



public class Class_Selection {
	DefaultTableModel model02;
	JTable table02;
	ImageIcon y, y2;
	JLabel wel, wel2, welz,studUsername,studClass;
	JTextArea dialog;
	private JTabbedPane mainpane;
	private JButton stud, cost_list, update_List;
	private JFrame frame;
	JEditorPane instruction;
	Container pane1, pane2;
	public void Class(){
		
		frame = new JFrame();
	pane2 = new Container();
	// pane1.setLayout(new GridLayout());

	//DialogHandler handler = new DialogHandler();
	
	JPanel headerPane = new JPanel();
	headerPane.setBounds(0,0,1350,100);
	ImageIcon yo = new ImageIcon(this.getClass().getResource("images/header.png"));
	wel = new JLabel(yo);
	wel.setBounds(0, 0, 1350, 100);
	headerPane.add(wel);

	//instruction Panel
	instruction = new JEditorPane();
	instruction.setBounds(900, 400, 500, 400);
	instruction.setBackground(Color.decode("#ffffff"));
	instruction.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 30));
	instruction.setText("Instructions...\n\n1. Wait for your instructor before you Start \n2. Do not click anything until you are asked to. \n Misbehave and you will be sent out!!! \n "
			+ "GoodLuck");
	frame.add(instruction);
	
	
	stud = new JButton("Senior Secondary School I");
	stud.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 30));
	stud.setBounds(60, 250, 400, 50);
	//stud.addMouseListener(handler);
	stud.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {

				String ObjButtons[] = { "Yes", "No" };
				int PromptResult = JOptionPane.showOptionDialog(null, "By Clicking YES button you are ready to start the SS One 20minutes test",
						"Uzea Text", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons,
						ObjButtons[1]);
				if (PromptResult == JOptionPane.YES_OPTION) {
					seniorSec_01 ss1 = new seniorSec_01();
					ss1.Class_01();
					ss1.studUsername02.setText(studUsername.getText());
					frame.dispose();
					ss1.playSound();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		
			
		}
	});

	cost_list = new JButton("Senior Secondary School II");
	cost_list.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 30));
	cost_list.setBounds(100, 320, 400, 50);
	//cost_list.addMouseListener(handler);
	cost_list.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {

				String ObjButtons[] = { "Yes", "No" };
				int PromptResult = JOptionPane.showOptionDialog(null, "By Clicking YES button you are ready to start the SS Two 20minutes test",
						"Uzea Text", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons,
						ObjButtons[1]);
				if (PromptResult == JOptionPane.YES_OPTION) {
					seniorSec_02 ss1 = new seniorSec_02();
					ss1.Class_01();
					ss1.studUsername02.setText(studUsername.getText());
					frame.dispose();
					ss1.playSound();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		
			
		}
	});

	update_List = new JButton("Senior Secondary School III");
	update_List.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 30));
	update_List.setBounds(140, 390, 400, 50);
	//update_List.addMouseListener(handler);
	update_List.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {

				String ObjButtons[] = { "Yes", "No" };
				int PromptResult = JOptionPane.showOptionDialog(null, "By Clicking YES button you are ready to start the SS Three 20minutes test",
						"Uzea Text", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons,
						ObjButtons[1]);
				if (PromptResult == JOptionPane.YES_OPTION) {
					seniorSec_03 ss1 = new seniorSec_03();
					ss1.Class_01();
					ss1.studUsername02.setText(studUsername.getText());
					frame.dispose();
					ss1.playSound();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		
			
		}
	});
	
	studUsername = new JLabel();
	studUsername.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 20));
	studUsername.setBounds(10, 20, 200, 30);
	studClass = new JLabel();
	studClass.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 18));
	studClass.setBounds(10, 65, 250, 30);
	
	
	
	pane2.add(stud);
	pane2.add(cost_list);
	pane2.add(update_List);
		
	y = new ImageIcon(this.getClass().getResource("images/highss.jpg"));
	wel = new JLabel(y);
	wel.setBounds(0, 0, 1350, 720);
	pane2.add(wel);
	
	
	frame.add(studUsername);
	frame.add(studClass);
	frame.add(headerPane);
	frame.add(pane2);
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
				int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to exit Uzea?",
						"Domiaye", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons,
						ObjButtons[1]);
				if (PromptResult == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});

}
	//public static void main(String[] a) {
		//	Class_Selection sso = new Class_Selection();
		//	sso.Class();;
		//}
		
}
