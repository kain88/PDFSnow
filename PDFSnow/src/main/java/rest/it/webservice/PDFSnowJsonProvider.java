package it.webservice;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class PDFSnowJsonProvider extends JacksonJaxbJsonProvider {

		private static ObjectMapper commonMapper = null;

		public PDFSnowJsonProvider() {
			if (commonMapper == null) {
				ObjectMapper mapper = new ObjectMapper();
				mapper.getSerializationConfig().setSerializationInclusion(Inclusion.NON_NULL);
				mapper.getSerializationConfig().setSerializationInclusion(Inclusion.NON_NULL);
				mapper.configure(Feature.FAIL_ON_EMPTY_BEANS, false);
				mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				commonMapper = mapper;
			}
			super.setMapper(commonMapper);
		}
}
