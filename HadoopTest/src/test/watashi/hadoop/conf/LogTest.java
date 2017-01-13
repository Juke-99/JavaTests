package test.watashi.hadoop.conf;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogTest{
	
	public static void main(String[] args){
		
		String really;
		Log LOG = LogFactory.getLog(String.class);
		
		really = "3";
		
		if(!"2".equals(really))
		{
			LOG.trace("fotter");
			//LOG.warn("Deffer value.");
			//LOG.fatal("Deffer value.");
		}
	}
}
