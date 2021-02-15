
public class Conta {
	
	String titular;
	int conta;
	String agencia;
	double saldo;
	String dataAbertura;	
	

	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	
	public void saca(double saca) {
		if(this.getSaldo()>0) {
			this.setSaldo(this.getSaldo()-saca);
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void deposita(double deposita) {
		this.setSaldo(this.getSaldo()+deposita);
	}
	
	public double calculaRendimento() {
		return this.getSaldo()*0.1;
	}
	
	
	
	

}
