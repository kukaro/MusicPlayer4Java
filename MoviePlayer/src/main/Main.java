package main;

import resource.number.ResNum;

public class Main {
	private static MainFrame mainFrame;

	static {
		mainFrame = new MainFrame((int)ResNum.getMain("FrameWidth"), (int)ResNum.getMain("FrameHeight"));
	}

	public static void main(String[] args) {
		mainFrame.setVisible(true);
	}
}
