package com.caionilson.core.tema11;

public class VirusFactory {
	public Virus getVirus(String virusType) {

		switch (virusType) {
		case "Bubonic":
			return new Bubonic();
		case "Corona":
			return new Corona();
		case "HIV":
			return new HIV();
		default:
			throw new RuntimeException("Invalid virus type");
		}
	}
}
