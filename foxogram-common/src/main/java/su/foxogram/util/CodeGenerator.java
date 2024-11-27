package su.foxogram.util;

import java.util.Random;

public class CodeGenerator {
	public static String generateDigitCode() {
		Random random = new Random();
		int min = 1;
		int max = 999999;

		int generatedNumber = random.nextInt((max - min) + 1) + min;
		return String.format("%06d", generatedNumber);
	}
}
