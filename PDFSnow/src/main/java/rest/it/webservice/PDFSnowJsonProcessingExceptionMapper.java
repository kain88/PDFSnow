package it.webservice;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.JsonProcessingException;

@Provider
public class PDFSnowJsonProcessingExceptionMapper implements ExceptionMapper<JsonProcessingException> {

    /**
     * {@inheritDoc}
     */
    @Override
    public Response toResponse(JsonProcessingException e) {
        String message = e.getMessage();
        return Response.status(Status.BAD_REQUEST).type(MediaType.TEXT_PLAIN).entity("The supplied JSON was not well formed: " + message).build();
    }
}
