
public class Soma {

	public static void main(String[] args) {
		double notaProva1 = 8;
		double notaProva2 = 4.5;
		double notaProva3 = 6;

		double media = (notaProva1 + notaProva2 + notaProva3) / 3;

		if (media > 6.5 && media < 7) {
			media = Math.ceil(media);
			System.out.println(Math.ceil(media));
			System.out.println("Aluno passou com nota arredondada")
		} else if (media > 7.1 && media <= 9{
			System.out.println(media);
			System.out.println("Aluno passou com boa nota")
		} else if (media > 9) {
			System.out.println("Aluno passou com excelência")
		} else {
			System.out.println("Aluno foi reprovado")
		}
	}

}
