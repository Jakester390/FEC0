package ui;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import util.Statics;

public class CardButton extends JButton {
	private static final String CLASS_PATH_STRING = "/resources/pics/thumbs/";
	public CardButton() {
		this(Statics.getSleeve());
	}

	public CardButton(String arg0) {
		super();
		if (!arg0.contains("/resources/")) {
			arg0 = CLASS_PATH_STRING + arg0;
		}
		BufferedImage image = null;
		try {
			 image = ImageIO.read(CardButton.class.getResource(arg0));
		} catch (IOException e) {
		}
		this.setBounds(0, 0, 86, 120);
		if (image != null) {
			this.setIcon(new ImageIcon(image));
		}
		
	}

}
