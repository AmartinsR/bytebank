public class Conta {
	double saldo;
	int agencia;
	int conta;
	String titular;

	public void deposita(double valor) {
		this.saldo +=valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -=valor;
			// return palavra chave que cessa a execução do método
			return true;
		} else {
			return false;
		}
		// quando um método tem mais de um argumento, dentro dos (), separe-os com,

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

}