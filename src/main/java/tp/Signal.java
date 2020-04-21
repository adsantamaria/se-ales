package tp;

import flanagan.integration.IntegralFunction;

public class Signal implements IntegralFunction{

	public double function(double x) {
		return 2 * (Math.cos(2 * Math.PI  * x));
	}

}
