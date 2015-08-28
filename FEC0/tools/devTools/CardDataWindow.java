package devTools;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import java.awt.Font;

public class CardDataWindow {

	private JFrame frame;
	private JTextField tfID;
	private JTextField tfName;
	private JTextField tfFull;
	private JTextField tfClass;
	private ButtonGroup gender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardDataWindow window = new CardDataWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CardDataWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gender = new ButtonGroup();
		frame = new JFrame();
		frame.setBounds(100, 100, 325, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID*:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblId.setToolTipText("Use the id number minus the dash and the trailing rarity value");
		lblId.setBounds(10, 13, 29, 14);
		frame.getContentPane().add(lblId);
		
		tfID = new JTextField();
		tfID.setBounds(36, 10, 101, 20);
		frame.getContentPane().add(tfID);
		tfID.setColumns(10);
		
		JLabel lblNameId = new JLabel("Name ID:");
		lblNameId.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNameId.setBounds(147, 13, 50, 14);
		frame.getContentPane().add(lblNameId);
		
		tfName = new JTextField();
		tfName.setBounds(199, 10, 101, 20);
		frame.getContentPane().add(tfName);
		tfName.setColumns(10);
		
		JLabel lblFullName = new JLabel("Full Name:");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFullName.setBounds(10, 38, 56, 14);
		frame.getContentPane().add(lblFullName);
		
		tfFull = new JTextField();
		tfFull.setBounds(64, 35, 236, 20);
		frame.getContentPane().add(tfFull);
		tfFull.setColumns(10);
		
		JButton btnWrite = new JButton("Write");
		btnWrite.setBounds(210, 227, 89, 23);
		frame.getContentPane().add(btnWrite);
		
		JButton btnFlags = new JButton("Flags");
		btnFlags.setBounds(111, 227, 89, 23);
		frame.getContentPane().add(btnFlags);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnMale.setBounds(6, 61, 50, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnFemale.setBounds(58, 61, 59, 23);
		frame.getContentPane().add(rdbtnFemale);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(182, 63, 117, 20);
		frame.getContentPane().add(scrollPane);
		
		JList lstWeapon = new JList();
		lstWeapon.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lstWeapon.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(lstWeapon);
		lstWeapon.setModel(new AbstractListModel() {
			String[] values = new String[] {"Sword", "Axe", "Lance", "Bow", "Tome", "Stone"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JLabel lblWeapon = new JLabel("Weapon:");
		lblWeapon.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblWeapon.setBounds(137, 63, 45, 19);
		frame.getContentPane().add(lblWeapon);
		
		JLabel lblClass = new JLabel("Class:");
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblClass.setBounds(10, 87, 29, 14);
		frame.getContentPane().add(lblClass);
		
		tfClass = new JTextField();
		tfClass.setBounds(40, 84, 101, 20);
		frame.getContentPane().add(tfClass);
		tfClass.setColumns(10);
		
		JLabel lblInsignia = new JLabel("Insignia:");
		lblInsignia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblInsignia.setBounds(147, 87, 45, 14);
		frame.getContentPane().add(lblInsignia);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(195, 87, 105, 20);
		frame.getContentPane().add(scrollPane_1);
		
		JList lstInsignia = new JList();
		lstInsignia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lstInsignia.setModel(new AbstractListModel() {
			String[] values = new String[] {"Awakening", "Shadow Dragon", "Hoshido", "Nohr"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(lstInsignia);
		lstInsignia.setToolTipText("");
		lstInsignia.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		gender.add(rdbtnFemale);
		gender.add(rdbtnMale);
	}
}
