public class Boletim{
    
    private Nota Nota1;
    private Nota Nota2;

    public double getMedia(){

        return (Nota1.getValor() + Nota2.getValor()) / 2; 
        
    }
    

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
    
}
