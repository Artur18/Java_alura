
public class TesteValores {
	public static void main(String[] args) {
		int primeiro =5;
		int segundo =7;
		segundo = primeiro;
		primeiro = segundo;
		primeiro = 10;
		System.out.println(segundo);
	}
}
