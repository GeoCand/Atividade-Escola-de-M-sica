package UCB.Atividade.EscolaMusica;

public class Violao extends InstrumentoMusical {
    int numCordas;
    
   public Violao (String nome, String material, int NumCordas){
       super(nome, material);
       this.numCordas = numCordas;
   }

    @Override
    public void tocar() {
        System.out.println("Tocando notas suave no " + nome + " com " + numCordas + " cordas...");
        System.out.println("Dedilhando uma melodia romantica");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a tensão das " + numCordas + "cordas... ");
    }
    
    @Override 
    public void MostrarInformacoes() {
        super.MostrarInformacoes();
        System.out.println("Numero de cordas: "+ numCordas);
    }
    
    public int getNumCordas(){ return numCordas ;}
}
