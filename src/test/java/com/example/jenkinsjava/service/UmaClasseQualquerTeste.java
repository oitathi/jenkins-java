package com.example.jenkinsjava.service;

import org.junit.Assert;
import org.junit.Test;


public class UmaClasseQualquerTeste {
	
	@Test
	public void testaSomaDoisNumeros() {
		UmaClasseQualquer qq = new UmaClasseQualquer();
		int result = qq.somaDoisNumeros(1, 2);
		
		Assert.assertEquals(3, result);
	}

}
