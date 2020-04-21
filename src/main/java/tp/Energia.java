package tp;

import flanagan.integration.IntegralFunction;
import flanagan.integration.Integration;

public class Energia {
	
	public double getPotencia(IntegralFunction signal, Double lowerLimit, Double upperLimit, int frecuncia) {
		return Math.round(Integration.gaussQuad(new FunctionSquare(signal), lowerLimit, upperLimit, frecuncia));
	}

}
