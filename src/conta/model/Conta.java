package conta.model;

public abstract class Conta {
	
// Atributos / Características
// Encapsulamento: Encapsular/Proteger algo
// Private / Protected / Public / Friendly
	
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
// Método Construtor
	public Conta(int numeroConta, int agencia, int tipo, String titular, float saldo) {
		numero = numeroConta;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
// Métodos de acesso (Método Get/Getter - Método Set/Setter)
	public int getNumero() { // Pega o número
		return numero;
	}
	
	public int setNumero(int numeroConta) { // Atualiza o número
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
// Métodos / Ações
	
	public boolean sacar(float valor) {
		if(this.getSaldo() < valor) {
			System.out.println("\n  Saldo Insuficiente!");
			System.out.println("\n  Valor informado: " + valor);
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public void visualizar() {
		String tipo = "";
		
		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("\nNumero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo atual: " + this.saldo);
	}

}
