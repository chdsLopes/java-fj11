
public class TestMain {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.setTitular("Hugo");
		c1.setConta(123);
		c1.setAgencia("45678-9");
		c1.setSaldo(50.0);
		c1.setDataAbertura("04/06/2015");
		
		c1.deposita(100.0);
		
		System.out.println("Saldo atual: " + c1.getSaldo());
		System.out.println("Rendimento mensal:" + c1.calculaRendimento());

	}

}
