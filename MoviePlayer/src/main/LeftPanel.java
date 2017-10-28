package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import resource.number.ResNum;

public class LeftPanel extends JPanel {
	private static final long serialVersionUID = 8524701770076078614L;
	private static LeftPanel getInstance = new LeftPanel();
	private String selectImage;

	private LeftPanel() {
		this.setPreferredSize(new Dimension((int) ResNum.getMain("FrameWidth") / 3, 0));
		this.setBackground(Color.DARK_GRAY);
	}

	public static LeftPanel getInstance() {
		return getInstance;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (selectImage != null) {
			ImageIcon ii = new ImageIcon(new File("./").getAbsolutePath() + "/src/resource/image/" + selectImage);
			Image img = ii.getImage();
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public void setMusic(String name) {
		String tmp = name.substring(0, name.length() - 4) + ".jpg";
		if (!tmp.equals(selectImage)) {
			selectImage = tmp;
		}
		repaint();
	}
}
