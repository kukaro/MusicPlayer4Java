package main;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class RightPanel extends JPanel {
	private static final long serialVersionUID = 54600546698178691L;
	private static RightPanel getInstance = new RightPanel();
	private static MusicList musicList;

	{
		musicList = MusicList.getInstance();
	}

	private RightPanel() {
		this.setLayout(new GridLayout(1, 1));
		this.setBackground(Color.CYAN);
		this.add(musicList);
	}

	public static RightPanel getInstance() {
		return getInstance;
	}
}
