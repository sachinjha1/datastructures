
public class RotatingMatch {

	//"ABC" is rotating match of CAB. "JHA" is rotating match of "HAJ"
	public static void main(String[] args) {
		String input1 = "JHA";
		String input2 = "HAJ";
		//"JHA"+"JHA"  - contains "HAJ" (J'HAJ'HA)
		System.out.println((input1+input1).contains(input2));
	}

}
