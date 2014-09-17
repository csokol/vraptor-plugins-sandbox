package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.quartzjob.CronTask;

@Controller
public class TestJob implements CronTask {
	@Override
	public void execute() {
		throw new RuntimeException("haha");
	}

	@Override
	public String frequency() {
		return "0 * * * * ?";
	}
}
