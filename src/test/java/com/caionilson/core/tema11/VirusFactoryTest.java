package com.caionilson.core.tema11;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class VirusFactoryTest {
	private VirusFactory virusFactory;

	@Before
	public void before() {
		this.virusFactory = new VirusFactory();
	}

	@Test
	public void bubonicTest() {
		Virus bubonic = virusFactory.getVirus("Bubonic");

		Assert.assertTrue(bubonic instanceof Virus);
		Assert.assertEquals("Clean your stuffs and stay away from rodents", bubonic.prophylaxy());
	}

	@Test
	public void coronaTest() {
		Virus corona = virusFactory.getVirus("Corona");

		Assert.assertTrue(corona instanceof Virus);
		Assert.assertEquals("Stay home and avoid agglomerations", corona.prophylaxy());
	}

	@Test
	public void hivTest() {
		Virus HIV = virusFactory.getVirus("HIV");

		Assert.assertTrue(HIV instanceof Virus);
		Assert.assertEquals("Protect yourself in sexual relationships and be carefull when donating blood", HIV.prophylaxy());
	}

}
