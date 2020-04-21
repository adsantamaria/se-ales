package tp;

public class Output1 implements Output{

	@Override
	public double process(Input input, double t) {
		return 3 * input.function(t);
	}

}
