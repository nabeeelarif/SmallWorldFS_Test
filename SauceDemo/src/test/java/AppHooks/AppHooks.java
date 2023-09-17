package AppHooks;

import DriverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {

	private DriverFactory driverFactory;
	
	@Before
	public void launchBrowser() {
		driverFactory = new DriverFactory();
		driverFactory.init_driver();
	}
	
	@After
	public void quitBrowser() {
		DriverFactory.driver.close();
		DriverFactory.driver.quit();
	}
}
