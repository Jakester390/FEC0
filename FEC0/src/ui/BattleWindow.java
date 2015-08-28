package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import java.awt.Component;
import javax.swing.JLayeredPane;

public class BattleWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleWindow window = new BattleWindow();
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
	public BattleWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1400, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		splitPane.setDividerLocation(215);
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel gamePane = new JPanel();
		splitPane.setRightComponent(gamePane);
		gamePane.setLayout(null);
		
		JLabel lblDeckOpp = new JLabel("Opponent's Deck");
		lblDeckOpp.setBackground(Color.LIGHT_GRAY);
		lblDeckOpp.setBounds(10, 7, 86, 120);
		gamePane.add(lblDeckOpp);
		
		JPanel oppHandPane = new JPanel();
		oppHandPane.setBounds(106, 0, 909, 134);
		gamePane.add(oppHandPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(127, 625, 909, 134);
		gamePane.add(panel);
		
		JLabel lblYourDeck = new JLabel("Your Deck");
		lblYourDeck.setBackground(Color.LIGHT_GRAY);
		lblYourDeck.setBounds(1046, 632, 86, 120);
		gamePane.add(lblYourDeck);
		
		JLabel lblOpponentsRetreat = new JLabel("Opponent's Retreat");
		lblOpponentsRetreat.setBackground(Color.LIGHT_GRAY);
		lblOpponentsRetreat.setBounds(10, 132, 86, 120);
		gamePane.add(lblOpponentsRetreat);
		
		JLabel lblYourRetreat = new JLabel("Your Retreat");
		lblYourRetreat.setBackground(Color.LIGHT_GRAY);
		lblYourRetreat.setBounds(1046, 507, 86, 120);
		gamePane.add(lblYourRetreat);
		
		JLabel lblOpponentsOrbs = new JLabel("");
		lblOpponentsOrbs.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpponentsOrbs.setHorizontalTextPosition(SwingConstants.CENTER);
		lblOpponentsOrbs.setIcon(new ImageIcon(BattleWindow.class.getResource("/ui/Sleeve.jpg")));
		lblOpponentsOrbs.setForeground(Color.CYAN);
		lblOpponentsOrbs.setBackground(Color.WHITE);
		lblOpponentsOrbs.setBounds(10, 257, 90, 120);
		lblOpponentsOrbs.setIconTextGap(0);
		gamePane.add(lblOpponentsOrbs);
		
		JLabel lblYourOrbs = new JLabel("Your Orbs");
		lblYourOrbs.setBackground(Color.LIGHT_GRAY);
		lblYourOrbs.setBounds(1046, 382, 86, 120);
		gamePane.add(lblYourOrbs);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 381, 1000, 2);
		gamePane.add(separator);
		
		JPanel descPane = new JPanel();
		splitPane.setLeftComponent(descPane);
		descPane.setLayout(null);
	}
}
