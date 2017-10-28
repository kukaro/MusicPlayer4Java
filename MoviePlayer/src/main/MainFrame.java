package main;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import resource.text.ResTxt;

public class MainFrame extends JFrame {
	private static MainContentPane mainContentPane;
	
	static {
		mainContentPane = MainContentPane.getInstance();
	}

	private static final long serialVersionUID = 1L;

	public MainFrame(int width, int height) throws HeadlessException {
		super();
		this.setSize(width, height);
		this.setContentPane(mainContentPane);
		this.setTitle(ResTxt.getMainFrame("FrameTitle"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
