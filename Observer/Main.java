public class Main{
	public static void main(String[] args) {
		Temperature t = new Temperature(10);
		t.addObserver(new TermometerCelsius ());
		t.addObserver(new TermometerFahrenheit ());
		System.out.println(">> Set value to 100 Celsius");
		t.setValue(100);
		System.out.println("\n>> Set value to 0 Celsius");
		t.setValue(0);
		System.out.println("\n>> Set value to -17.77777777777778 Celsius");
		t.setValue(-17.77777777777778);
	}
}
