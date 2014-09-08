package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.*;
import br.com.caelum.vraptor.form.modelform.ModelForm;

@Controller
public class IndexController {

	@Inject
	private Result result;

	@Get("/")
	public void index() {
		result.include("variable", "VRaptor!");
	}
	@Post("/")
	public void index(User user) {
		result.include("user", user);
	}
}