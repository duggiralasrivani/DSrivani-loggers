package loggingprgrm;


	import org.apache.log4j.Logger;
	import org.apache.log4j.PropertyConfigurator;
	 
	public class Log4Jpage {
	
	    static Logger log = Logger.getLogger(Log4Jpage.class);
	 
	    public static void main(String[] args)
	    {
	        PropertyConfigurator.configure("log4j.properties");
	 
	        log.debug("This is debug  of Simple Compund calculation ");
	        log.info("This is info of Simple Compund calculation");
	        log.warn("This is warn of Simple Compund calculation");
	        log.error("This is error of Simple Compund calculation");
	        log.fatal("This is fatal  of Simple Compund calculation");
	    }
	}
	
	
	
	
	
	

