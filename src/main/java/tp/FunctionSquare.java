package tp;

import flanagan.integration.IntegralFunction;

public class FunctionSquare implements IntegralFunction {
	
	private IntegralFunction function;
	public FunctionSquare (IntegralFunction function) {
		this.function = function;
	}

	public double function(double x) {
		return Math.pow( function.function(x),2);
	}
}
