package br.com.caelum.vraptor.sandbox;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

import javax.inject.Inject;

import java.util.Optional;

import static br.com.caelum.vraptor.view.Results.http;

@Controller
public class IndexController {

	@Inject
	private Result result;

	@Get("/")
	public void foo(Optional<String> x) {
		System.out.println("blalba");
		System.out.println(x);
		result.use(http()).body("lala");
	}
}
