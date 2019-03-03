
public class atividadeCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario = 3300.0;
		
		if (salario < 2600) {
			System.out.println("A sua aliquota é de 15% ");
			System.out.println("Voce pode deduzir até R$ 350 ");
			
		}
		if (salario < 3750.0) {
			System.out.println("A sua aliquota é de 22,5% ");
			System.out.println("Voce pode deduzir R$ 636");
		}
	}

}
