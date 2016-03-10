package it.webservice;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

import it.webservice.impl.TestWS;





/**
 * @author michele di mauro
 */
public class PDFSnowRESTApplication extends ResourceConfig  {
	
	public PDFSnowRESTApplication() {
		register(TestWS.class);
		register(PDFSnowJsonProvider.class);
		register(PDFSnowJsonProcessingExceptionMapper.class);
		register(PDFSnowExceptionMapper.class);
		packages("org.glassfish.jersey.examples.multipart")
		.register(MultiPartFeature.class);
		
		
	}
	
}
