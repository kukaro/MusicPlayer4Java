package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MusicList extends JList<String> {
	private static final long serialVersionUID = 2228692820453804667L;
	private static MusicList getInstance = new MusicList();
	private static ArrayList<MusicDto> list;
	private static Player player;

	{
		list = new ArrayList<>();
		File f = new File("./src/resource/sound");
		for (String str : f.list()) {
			list.add(new MusicDto(f.getAbsolutePath(), str));
		}
	}

	private MusicList() {
		this.setListData(getMusicList());
		this.addListSelectionListener((ListSelectionEvent e) -> {
			if (!getValueIsAdjusting()) {
				new Thread(() -> {
					try {
						if (player != null) {
							player.close();
						}
						player = new Player(new FileInputStream(searchFullPath(getSelectedValue())));
						LeftPanel.getInstance().setMusic(getSelectedValue());
						new Thread(() -> {
							int ms;
							int m;
							int s;
							while (true) {
								if(player.isComplete()) break;
								ms = player.getPosition() / 1000;
								m = ms / 60;
								s = ms % 60;
								TopPanel.getInstance().setTime(m, s);
							}
						}).start();
						player.play();
					} catch (FileNotFoundException | JavaLayerException e1) {
						e1.printStackTrace();
					} finally {
						if (player != null) {
							player.close();
						}
					}
				}).start();
			}
		});
	}

	public static MusicList getInstance() {
		return getInstance;
	}

	private Vector<String> getMusicList() {
		Vector<String> tmp = new Vector<>();
		for (MusicDto music : list) {
			tmp.add(music.getName());
		}
		return tmp;
	}

	private String searchFullPath(String name) {
		for (MusicDto dto : list) {
			if (dto.getName().equals(name)) {
				return dto.getFullPath();
			}
		}
		return null;
	}
}
