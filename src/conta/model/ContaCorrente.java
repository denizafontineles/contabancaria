package conta.model;

//ContaCorrente herda de Conta
public class ContaCorrente extends Conta{

	private float limite;
	
	public ContaCorrente(int numeroConta, int agencia, int tipo, String titular, float saldo, float limite) {
//      super = método construtor da classe Conta
		super(numeroConta, agencia, tipo, titular, saldo);
//		Atributo da classe
		this.limite = limite;
	}
	
//	Métodos de Acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

// 	Metodos Específicos	
	@Override
	public boolean sacar(float valor) { 
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	@Override // Override = sobrescrever
	public void visualizar() {
//		Super = chamada da superclasse => Conta.visualizar()
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
}
