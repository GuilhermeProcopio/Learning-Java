
public class Funcionario extends Pessoa {
	
	private double salario;
	
	public double getSalario()
	{
		return salario;
	}
	public void setSalario(double aSalario)
	{
		this.salario = aSalario;
	}
	public double getPagamento()
	{
		return this.salario;
	}
	
	@Override
	public void relatorio()	{
		System.out.println("Classe funcionario");
		System.out.println("id: "+this.getId());
		System.out.println("Nome: "+this.getNome());
		System.out.println("Salario: "+this.salario);
		
	}
}
	