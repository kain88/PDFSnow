package it.webservice;
import javax.ejb.EJBException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


/**
 * @author michele di mauro
 */
@Provider
public class PDFSnowExceptionMapper implements ExceptionMapper<Throwable> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Response toResponse(Throwable e) {
		if (e instanceof EJBException && e.getCause() != null) {
			e = e.getCause();
		}
		return Response.status(Status.BAD_REQUEST).type(MediaType.TEXT_PLAIN).entity(e.toString()).build();
	}
}

