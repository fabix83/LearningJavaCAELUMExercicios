
public class Teste {

	public static void main(String[] args) {
		Circulo b = new Circulo(3);
		AreaCalculavel a = new Circulo(4);
		System.out.println(a.calculaArea());
		System.out.printf("A area �: %.2f", a.calculaArea());
		
		//aqui eu consigo pegar getRaio, j� no a eu n�o consigo pois como ele � Tributavel ele apenas conhece calculaArea
		
		int i;
		i = b.getRaio();
		System.out.println(i);
	}

}
