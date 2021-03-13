
public class Gerente extends Funcionario {
	
	private double bonus;
	
	public double getBonus(){
	
		return bonus;
		
	}
	
	public void setBonus(double bonus) {
		
		this.bonus = bonus;
		
	}
	
	public double getPagamento() {
		
		return this.getPagamento() + this.getBonus();
	
	}
	@Override
	public void relatorio()	{
		System.out.println("Classe Gerente");
		System.out.println("id: "+this.getId());
		System.out.println("Nome: "+this.getNome());
		System.out.println("Salario: "+this.getSalario());
		System.out.println("Pagamento: "+this.getPagamento());
		System.out.println("Bonus: "+this.getBonus());
	}
}
}
