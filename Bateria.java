package UCB.Atividade.EscolaMusica;

public class Bateria extends InstrumentoMusical {
    int numPecas;
    
   public Bateria (String nome, String material, int NumPecas){
       super(nome, material);
       this.numPecas = numPecas;
   }

    @Override
    public void tocar() {
        System.out.println("Tocando notas fortes no " + nome + " usando " + numPecas + " peças...");
        System.out.println("Dedilhando uma melodia animada");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a posição de " + numPecas + " peças... ");
    }
    
    @Override 
    public void MostrarInformacoes() {
        super.MostrarInformacoes();
        System.out.println("Numero de Peças: "+ numPecas);
    }
    
    public int getNumCordas(){ return numPecas ;}
}
