package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

@SuppressWarnings("unused")
public class TestPlayer {

	@Test
	public void test() {
		try {
			String path = new File("./").getAbsolutePath()+"/src/resource/sound/";
			FileInputStream fis = new FileInputStream(path+"ÇÑ¿©¸§¹ãÀÇ²Þ.mp3");
			Player player = new Player(fis);
			new Thread(()->{
				try {
					player.play();
				} catch (JavaLayerException e) {
					e.printStackTrace();
				}
			}).start();
			while(true) {
				System.out.println(player.getPosition()/1000.0f);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
		
	}

}
