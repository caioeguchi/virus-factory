package com.caionilson.core.tema11;

import java.util.Scanner;

public class Main {
    private static final int BUBONIC_PLAGUE = 1;
    private static final int CORONA_VIRUS = 2;
    private static final int HIV = 3;

	private static Scanner sc = new Scanner(System.in);
	private static VirusFactory virusFactory = new VirusFactory();

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("\nIn case of:\n");
			System.out.println("1-Bubonic plague");
			System.out.println("2-Corona virus");
			System.out.println("3-HIV\n");

			int op = sc.nextInt();
			sc.hasNextLine();

			switch (op) {
			case BUBONIC_PLAGUE:
				Virus bubonic = virusFactory.getVirus("Bubonic");
				bubonic.prophylaxy();
				break;

			case CORONA_VIRUS:
				Virus corona = virusFactory.getVirus("Corona");
				corona.prophylaxy();
				break;

			case HIV:
				Virus hiv = virusFactory.getVirus("HIV");
				hiv.prophylaxy();
				break;

			default:
				run = false;
			}
		}
	}
}
