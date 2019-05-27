package org.zainmo.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.zainmo.messenger.model.ErrorMessage;

@Provider
public class DataNotFoundeExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404, "http://dallascowboys.com");
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
	}
	

}
