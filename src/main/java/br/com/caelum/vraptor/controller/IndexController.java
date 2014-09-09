package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.modelform.ModelForm;

import javax.inject.Inject;

@Controller
public class IndexController {

	@Inject
	private Result result;

	@Inject
	private ModelForm<User> modelForm;

	@Get("/")
	public void index() {
		result.include("variable", "VRaptor!");
		result.include("form", modelForm);
	}
	@Post("/")
	public void index(User user) {
		result.include("user", user);
		result.include("form", modelForm);
	}
}