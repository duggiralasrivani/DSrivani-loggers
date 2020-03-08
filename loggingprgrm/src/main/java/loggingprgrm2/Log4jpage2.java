package loggingprgrm2;


	import org.apache.log4j.Logger;
	import org.apache.log4j.PropertyConfigurator;
	 
	public class Log4jpage2 {
	
	    static Logger log = Logger.getLogger(Log4jpage2.class);
	 
	    public static void main(String[] args)
	    {
	        PropertyConfigurator.configure("log4j.properties");
	 
	        log.debug("This is debug of House construction calculation ");
	        log.info("This is info of House construction calculation");
	        log.warn("This is warn of House construction calculation");
	        log.error("This is error of House construction calculation");
	        log.fatal("This is fatal  of House construction calculation");
	    }
	}
	
	
	
	
	
	

