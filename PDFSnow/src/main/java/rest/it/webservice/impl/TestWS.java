package it.webservice.impl;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import it.webservice.dto.DataPost;
import it.webservice.utils.GenericResponse;

@Path("testws")
@Stateless
public class TestWS {
	@Context
	private HttpServletRequest request;
	
	@POST
	@Path("/getTest")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getTest(DataPost p) {
		GenericResponse resp = new GenericResponse();
		DataPost pp = new DataPost();
		
		pp.setNome(p.getNome());
		pp.setCognome(p.getCognome());
		pp.setDescrizione(p.getDescrizione());
		
		resp.setEsitoOk(Boolean.TRUE);
		resp.setRet(pp);
		
		return Response.ok(resp).build();
	}
	
	@GET
	@Path("/getPDF")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTPDF() {
		GenericResponse resp = new GenericResponse();
		resp.setRet("Prova");
		return Response.ok(resp).build();
	}
}
