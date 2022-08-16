
public class TesteReferencias {
	public static void main(String[] args) {
		//Tirar da folha de papel e criar o objeto
		//duas referencias para o mesmo objeto, vale o que estiver na ultima referencia
		//pois se referenciam ao mesmo objeto, existe um unico objeto
		//Existe apenas um objeto, as variáveis criadas utilizam as variáveis do objeto
		//Soma saldo 1 = 2, valerá esse saldo
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo =300;	
		
		System.out.println("saldo da primeira " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo +=100;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("sao as mesmissimas contas");
		}
	}
}
