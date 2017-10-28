package main;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class MainContentPane extends JPanel {
	private static MainContentPane instance = new MainContentPane();
	private static LeftPanel leftPanel;
	private static RightPanel rightPanel;
	private static TopPanel topPanel;

	{
		leftPanel = LeftPanel.getInstance();
		rightPanel = RightPanel.getInstance();
		topPanel = TopPanel.getInstance();
	}

	private static final long serialVersionUID = -7921939804782429978L;

	private MainContentPane() {
		super();
		this.setLayout(new BorderLayout());
		this.add(topPanel, BorderLayout.NORTH);
		this.add(leftPanel, BorderLayout.WEST);
		this.add(rightPanel, BorderLayout.CENTER);
	}

	public static MainContentPane getInstance() {
		return instance;
	}
}
