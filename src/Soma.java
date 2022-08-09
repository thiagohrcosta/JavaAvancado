
public class Soma {

	public static void main(String[] args) {


		double notaProva1 = 8;
		double notaProva2 = 4.5;
		double notaProva3 = 6;

		double media = (notaProva1 + notaProva2 + notaProva3) / 3;

		if (media < 7) {
			media = Math.ceil(media);
			System.out.println(Math.ceil(media));
		} else {
			System.out.println(media);
		}
	}

}
