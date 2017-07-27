package core;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CLA_M_Sub {

	public static void main(String[] args) {
		
		if (args.length < 2) {
			System.out.println("At least 2 params needed"); System.exit(0);
		}
		
		Double result = Double.valueOf(args[0]);
		for (int i = 1; i < args.length; i++) {
			result -= Double.valueOf(args[i]);
		}
		System.err.println(new BigDecimal(result).setScale(2,  RoundingMode.HALF_UP));

		
	}

}
