package autogen.webDriverSystemObject;
import org.jsystem.webdriver_so.WebDriverSystemObject;
import junit.framework.SystemTestCase;
/**
 * Auto generate management object.
 * Managed object class: org.jsystem.webdriver_so.WebDriverSystemObject
 * This file <b>shouldn't</b> be changed, to overwrite methods behavier
 * change: WebDriverSystemObjectManager.java
 */
public abstract class WebDriverSystemObjectManagerBase extends SystemTestCase{
	protected WebDriverSystemObject webDriverSystemObject = null;
	public void setUp() throws Exception {
		webDriverSystemObject = (WebDriverSystemObject)system.getSystemObject("webDriverSystemObject");
	}
}
