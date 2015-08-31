package devTools;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JScrollPane;

import util.stringList;

import java.awt.Font;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class CardDataWindow {
	private static final String INSIGNIA = "INSIGNIA_";
	private static final String WEAPON = "WEAPON_";
	private static final String FLAG = "FLAG_";

	private JFrame frame;
	private JTextField tfID;
	private JTextField tfName;
	private JTextField tfFull;
	private JTextField tfClass;
	private ButtonGroup gender;
	private stringList insignias;
	private stringList weapons;
	private stringList flags;
	private JComboBox<String> cbInsignia;
	private JComboBox<String> cbWeapon;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		Scanner fileScanner = new Scanner(CardDataWindow.class.getResourceAsStream("Data.txt"));
		insignias = new stringList();
		weapons = new stringList();
		flags = new stringList();
		String holder = "";
		while(fileScanner.hasNext()) {
			holder = fileScanner.nextLine();
			if(holder.startsWith(INSIGNIA)) {
				insignias.add(holder.substring(INSIGNIA.length()));
			} else if (holder.startsWith(WEAPON)) {
				weapons.add(holder.substring(WEAPON.length()));
			} else if (holder.startsWith(FLAG)) {
				flags.add(holder.substring(FLAG.length()));
			}
		}
		fileScanner.close();
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
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setSelected(true);
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnMale.setBounds(6, 61, 50, 23);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnFemale.setBounds(58, 61, 59, 23);
		frame.getContentPane().add(rdbtnFemale);
		
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
		gender.add(rdbtnFemale);
		gender.add(rdbtnMale);
		
		
		JLabel lblFlags = new JLabel("Flags:");
		lblFlags.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFlags.setBounds(147, 112, 153, 14);
		frame.getContentPane().add(lblFlags);
		
		cbInsignia = new JComboBox<String>();
		cbInsignia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbInsignia.setBounds(192, 62, 108, 20);
		cbInsignia.setModel(insignias);
		frame.getContentPane().add(cbInsignia);
		
		cbWeapon = new JComboBox<String>();
		cbWeapon.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbWeapon.setBounds(192, 84, 107, 20);
		cbWeapon.setModel(weapons);
		frame.getContentPane().add(cbWeapon);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(147, 128, 152, 88);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 11));
		list.setModel(flags);
		scrollPane.setViewportView(list);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCost.setBounds(10, 231, 29, 14);
		frame.getContentPane().add(lblCost);
		
		textField = new JTextField();
		textField.setBounds(40, 228, 20, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPromotionCost = new JLabel("Promotion Cost*:");
		lblPromotionCost.setToolTipText("If the Card is not a promoted card, make this zero");
		lblPromotionCost.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPromotionCost.setBounds(10, 112, 83, 14);
		frame.getContentPane().add(lblPromotionCost);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 228, 20, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAttack = new JLabel("Attack:");
		lblAttack.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAttack.setBounds(65, 231, 40, 14);
		frame.getContentPane().add(lblAttack);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setColumns(10);
		textField_2.setBounds(97, 109, 40, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblSupport = new JLabel("Support:");
		lblSupport.setBounds(130, 231, 46, 14);
		frame.getContentPane().add(lblSupport);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(175, 228, 20, 20);
		frame.getContentPane().add(textField_3);
		
		JButton btnQuote = new JButton("Quote");
		btnQuote.setBounds(10, 137, 127, 20);
		frame.getContentPane().add(btnQuote);
		
		JButton btnSkillText = new JButton("Skill Text");
		btnSkillText.setBounds(10, 163, 127, 23);
		frame.getContentPane().add(btnSkillText);
		
		JCheckBox chckbxCanBeUsed = new JCheckBox("Can be used as bond");
		chckbxCanBeUsed.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxCanBeUsed.setSelected(true);
		chckbxCanBeUsed.setBounds(10, 193, 127, 23);
		frame.getContentPane().add(chckbxCanBeUsed);
	}
}
