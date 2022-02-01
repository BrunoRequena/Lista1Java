package testesPOO;

public class TestAutomovel {

	public static void main(String[] args) {
		
		Automovel auto1 = new Automovel("Pedro","Fiat 147","VDR0191",1965);
		
		auto1.imprimirInfo();
		System.out.println("\nTransferência de Proprietário");
		auto1.setNomeProprietario("Denise Silva");
		auto1.setPlaca("CXX4007");
		
		System.out.println("\n*************************************************");
		auto1.imprimirInfo();

	}

}
