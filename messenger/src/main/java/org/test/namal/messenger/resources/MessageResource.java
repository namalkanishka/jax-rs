package org.test.namal.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.test.namal.messenger.model.Messege;
import org.test.namal.messenger.service.MessegeService;;

@Path("/messeges")
public class MessageResource {
	
	MessegeService messegeservice = new MessegeService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Messege> getMessege() {
		//return("hellow world namal");
		return messegeservice.getAllMesseges();
	}
}
