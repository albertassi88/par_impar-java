import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();

		String parimpar_antigo = "";
		for (int x = 1; x <= 2; x++) {
			System.out.println("Jogador " + x + " - Você escolhe 'par' ou 'impar'?");
			String parimpar = sc.nextLine();
			while (!parimpar.equalsIgnoreCase("par") & !parimpar.equalsIgnoreCase("impar")) {
				System.out.println("Favor escrever 'par' ou 'impar'!");
				parimpar = sc.nextLine();
			}
			while (parimpar.equalsIgnoreCase(parimpar_antigo)) {
				System.out.println("O Jogador 1 ja escolheu " + parimpar.toUpperCase() + ". Escolha a outra opção!");
				parimpar = sc.nextLine();
				while (!parimpar.equalsIgnoreCase("par") & !parimpar.equalsIgnoreCase("impar")) {
					System.out.println("Favor escrever 'par' ou 'impar'!");
					parimpar = sc.nextLine();
				}
			}
			map.put(parimpar, x);
			parimpar_antigo = parimpar;
		}

		int quantidade = 11;
		int numeros = random.nextInt(quantidade);
		for (String key : map.keySet()) {
			if (key.equals("par") & numeros % 2 == 0) {
				System.out.println(numeros + " é par. O jogador " + map.get(key) + " Ganhou!");
			} else if (key.equals("impar") & numeros % 2 == 1) {
				System.out.println(numeros + " é impar. O jogador " + map.get(key) + " Ganhou!");
			}
		}
	}
}
