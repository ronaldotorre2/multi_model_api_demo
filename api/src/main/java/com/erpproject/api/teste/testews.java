package com.erpproject.api.teste;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/teste")
public class testews {
	
	@GET
	@Produces({MediaType.TEXT_HTML + ";charset=utf-8"})
	public String hello() {
		return "Olá!, ERP está no ar.";
	}
	
	@GET
	@Path("/nome/{name}")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public String nome(@PathParam("name") String nome) throws Exception{
		if(!nome.equalsIgnoreCase("")){
			return "Olá "+nome+" este é o serviço do ERP! que está no ar.";
		}
		else{
			throw new Exception("Ocorreu erro");
		}
	}

}