package resource.number;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ResNum {
	private final static String MAIN_RESOURCE = "resource.number.main";
	private static final ResourceBundle RESOURCE_BUNDLE_MAIN = ResourceBundle.getBundle(MAIN_RESOURCE);

	public static float getMain(String key) {
		try {
			return Float.parseFloat(RESOURCE_BUNDLE_MAIN.getString(key));
		} catch (MissingResourceException e) {
			return 0;
		}
	}
}
