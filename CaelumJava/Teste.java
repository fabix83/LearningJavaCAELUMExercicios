
public class Teste {

	public static void main(String[] args) {
		Circulo b = new Circulo(3);
		AreaCalculavel a = new Circulo(4);
		System.out.println(a.calculaArea());
		System.out.printf("A area é: %.2f", a.calculaArea());
		
		//aqui eu consigo pegar getRaio, já no a eu não consigo pois como ele é Tributavel ele apenas conhece calculaArea
		
		int i;
		i = b.getRaio();
		System.out.println(i);
	}

}
