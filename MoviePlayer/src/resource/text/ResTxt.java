package resource.text;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ResTxt {
	private final static String MAIN_RESOURCE = "resource.text.main";
	private final static String MAIN_FRAME_RESOURCE = "resource.text.mainFrame";
	private final static String TOP_PANEL_RESOURCE = "resource.text.topPanel";
	private static final ResourceBundle RESOURCE_BUNDLE_MAIN = ResourceBundle.getBundle(MAIN_RESOURCE);
	private static final ResourceBundle RESOURCE_BUNDLE_MAIN_FRAME = ResourceBundle.getBundle(MAIN_FRAME_RESOURCE);
	private static final ResourceBundle RESOURCE_BUNDLE_TOP_PANEL = ResourceBundle.getBundle(TOP_PANEL_RESOURCE);

	public static String getMain(String key) {
		try {
			return RESOURCE_BUNDLE_MAIN.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
	
	public static String getMainFrame(String key) {
		try {
			return RESOURCE_BUNDLE_MAIN_FRAME.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
	
	public static String getTopPanel(String key) {
		try {
			return RESOURCE_BUNDLE_TOP_PANEL.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
