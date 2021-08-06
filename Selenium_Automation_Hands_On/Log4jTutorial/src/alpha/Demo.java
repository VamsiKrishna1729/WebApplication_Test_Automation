package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	private static Logger Log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Log.debug("i am debugging");
		Log.info("object is present");
		Log.error("object is not found");
		Log.fatal("this is fatal");
		
	}

}
