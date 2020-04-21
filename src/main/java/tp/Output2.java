package tp;

public class Output2 implements Output{

	@Override
	public double process(Input input, double t) {
		return -1 - input.function(t);
	}
}
