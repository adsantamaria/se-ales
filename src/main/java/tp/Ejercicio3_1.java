package tp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.github.sh0nk.matplotlib4j.Plot;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import com.github.sh0nk.matplotlib4j.builder.ScaleBuilder;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		Signal signal = new Signal();
		double lowerLimit = 0;
		double upperLimit = 1;
		Energia p = new Energia();
		Integer frecuencia1 = 10;
		Integer frecuencia2 = 100;
		Integer frecuencia3 = 1000;
		System.out.println("La energía total para la frecuencia " + frecuencia1 + " entre los puntos " + lowerLimit + " y " + upperLimit + " es: " + p.getPotencia(signal, lowerLimit, upperLimit, frecuencia1));
		System.out.println("La energía total para la frecuencia " + frecuencia2 + " entre los puntos " + lowerLimit + " y " + upperLimit + " es: " + p.getPotencia(signal, lowerLimit, upperLimit, frecuencia2));
		System.out.println("La energía total para la frecuencia " + frecuencia3 + " entre los puntos " + lowerLimit + " y " + upperLimit + " es: " + p.getPotencia(signal, lowerLimit, upperLimit, frecuencia3));

		List<Double> entradas =  new ArrayList<Double>();
		for (double i = 0; i < 1;) {
			entradas.add(i);
			i+=0.01;
		}
		List<Double> salidas = new ArrayList<Double>();
		for (double cadaNro : entradas) {
			salidas.add(signal.function(cadaNro));
		}

		Plot plt =  Plot.create();
		plt.plot()
		.add(entradas, salidas)
		.linestyle("--");
		plt.xscale(ScaleBuilder.Scale.linear);
		plt.yscale(ScaleBuilder.Scale.linear);
		plt.xlabel("x");
		plt.ylabel("y");
		plt.title("Funcion 2cos(2 * PI * t) entre 0 y 1");
		plt.legend();
		try {
			plt.show();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PythonExecutionException e) {
			e.printStackTrace();
		}
	}

}
