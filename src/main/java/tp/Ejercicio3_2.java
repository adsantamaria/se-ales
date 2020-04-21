package tp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.github.sh0nk.matplotlib4j.Plot;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import com.github.sh0nk.matplotlib4j.builder.ScaleBuilder;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		Input input = new Input();
		
		Output1 output1 = new Output1();
		Output2 output2 = new Output2();
		Output3 output3 = new Output3();
		
		List<Double> inputs =  new ArrayList<Double>();
		for (double i = -10; i < 11; i++) {
			inputs.add(i);
		}
		List<Double> outputs1 = new ArrayList<Double>();
		for (double cadaNro : inputs) {
			outputs1.add(output1.process(input, cadaNro));
			System.out.println((output1.process(input, cadaNro)));
		}
		
		List<Double> outputs2 = new ArrayList<Double>();
		for (double cadaNro : inputs) {
			outputs2.add(output2.process(input, cadaNro));
		}
		
		List<Double> outputs3 = new ArrayList<Double>();
		for (double cadaNro : inputs) {
			outputs3.add(output3.process(input, cadaNro));
		}
		
		Plot plt1 =  Plot.create();
		plt1.plot()
		.add(inputs, outputs1)
		.linestyle("--");
		plt1.xscale(ScaleBuilder.Scale.linear);
		plt1.yscale(ScaleBuilder.Scale.linear);
		plt1.xlabel("x");
		plt1.ylabel("y");
		plt1.title("y(t) = 3 * x(t)");
		plt1.legend();
		try {
			plt1.show();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PythonExecutionException e) {
			e.printStackTrace();
		}
		
		Plot plt2 =  Plot.create();
		plt2.plot()
		.add(inputs, outputs2)
		.linestyle("--");
		plt2.xscale(ScaleBuilder.Scale.linear);
		plt2.yscale(ScaleBuilder.Scale.linear);
		plt2.xlabel("x");
		plt2.ylabel("y");
		plt2.title("y(t) = -1 - x(t)");
		plt2.legend();
		try {
			plt2.show();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PythonExecutionException e) {
			e.printStackTrace();
		}
		
		Plot plt3 =  Plot.create();
		plt3.plot()
		.add(inputs, outputs3)
		.linestyle("--");
		plt3.xscale(ScaleBuilder.Scale.linear);
		plt3.yscale(ScaleBuilder.Scale.linear);
		plt3.xlabel("x");
		plt3.ylabel("y");
		plt3.title("y(t) = e exp x(t)");
		plt3.legend();
		try {
			plt3.show();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PythonExecutionException e) {
			e.printStackTrace();
		}
	}

}
