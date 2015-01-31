package br.com.caelum.vraptor.sandbox;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import java.util.Optional;

import static br.com.caelum.vraptor.view.Results.http;

@Controller
public class IndexController {

	@Inject
	private Result result;

	@Path("/get")
	@GET
	public void get() {
		result.use(http()).body("get");
	}

	@Path("/get/{param}")
	@GET
	public void getWithParam(String param) {
		result.use(http()).body("param: " + param);
	}

	@Path("/post")
	@POST
	public void post() {
		result.use(http()).body("post");
	}

	@Path("/")
	public void all() {
		result.use(http()).body("all");
	}
}
