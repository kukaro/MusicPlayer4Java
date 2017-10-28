package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import resource.number.ResNum;
import resource.text.ResTxt;

public class TopPanel extends JPanel {
	private static final long serialVersionUID = 8827322042635311432L;
	private static TopPanel getInstance = new TopPanel();
	private static JLabel timeLabel;

	{
		timeLabel = new JLabel(ResTxt.getTopPanel("DefaultLable"));
	}

	private TopPanel() {
		this.setLayout(new GridLayout(1, 1));
		this.setPreferredSize(new Dimension(0, (int) ResNum.getMain("FrameHeight") / 7));
		this.setBackground(Color.CYAN);
		this.add(timeLabel);
	}

	public static TopPanel getInstance() {
		return getInstance;
	}

	public void setTime(int m, int s) {
		timeLabel.setText(ResTxt.getTopPanel("DefaultLable") + m + "Ка " + s + "УЪ");
	}
}
