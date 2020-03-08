package loggingprgrm;

public class SimpleCompund extends AbstractClass {

       
		 public int simpleinterest(int p,int t,int r)
	{
		int si=(p*t*r)/100;
		return si;
	}
		public double compoundinterest(int p,int t,double r,int n)
	{
		//double r1=(r/100);
		double ci=p * Math.pow(1 + (r / n), n * t);
		//double ci1=ci-p;
		return ci;
	}
}	

/*
 * static final Logger logger=Logger.getLogger("SimpleCompund.class");
    logger.info(sp);
	logger.debug("Simplecompound messages);
	logger.warn("Simplecompound messages");
	logger.error("Simplecompound messages");
    logger.fatal("Simplecompound messages");

 * 
 * 
 * 
 */
