package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.quartzjob.CronTask;

/**
 * Created by csokol on 9/15/14.
 */
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
