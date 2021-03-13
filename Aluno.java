
public class Aluno extends Pessoa {

    private Boletim boletim = new Boletim();

    public Nota getNota1(){
        return Nota1;
    }

    public Nota getNota2(){
        return Nota2;
    }

    public void setNota1(Nota aNota){
        this.Nota1 = aNota;
    }

    public void setNota2(Nota aNota){
        this.Nota2 = aNota;
    }

    @Override
    public void setNota1(Double aNota){
        this.Nota1 = aNota;
    }

    public void setNota2(Double aNota){
        this.Nota2 = aNota;
    }

    public void relatorio(){
        System.out.println("Classe Aluno")
        System.out.println("Nome: "+this.getNome());
        System.out.println("Id: "+this.getId());
        System.out.println("NP1: %f NP2: %f"+this.getNota1(), this.getNota2());
        if((Nota1.getValor() + Nota2.getValor()) / 2 => 7);
        System.out.println("Você passoou boa")
        this.getMedia
    }

    
    


}
