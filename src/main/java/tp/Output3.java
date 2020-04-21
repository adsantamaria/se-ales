package tp;

public class Output3 implements Output{

	@Override
	public double process(Input input, double t) {
		return Math.exp(input.function(t));
	}

}
