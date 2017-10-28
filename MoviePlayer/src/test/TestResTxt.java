package test;

import static org.junit.Assert.*;

import org.junit.Test;

import resource.text.ResTxt;

@SuppressWarnings("unused")
public class TestResTxt {

	@Test
	public void test() {
		System.out.println(ResTxt.getMain("AppName"));
	}

}
