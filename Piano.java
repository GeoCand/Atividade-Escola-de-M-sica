package UCB.Atividade.EscolaMusica;

public class Piano extends InstrumentoMusical{
    private int numTeclas;
   
    public Piano(String nome, String material, int numTeclas){
        super(nome, material);
        this.numTeclas = numTeclas;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando uma bela melodia no " + nome + " com " + numTeclas + " teclas...");
        System.out.println("Dedilhando uma melodia romantica");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a tensão nas cordas de " + numTeclas + " Teclas... ");
    }
    
    @Override 
    public void MostrarInformacoes() {
        super.MostrarInformacoes();
        System.out.println("Numero de teclas: "+ numTeclas);
    }
}
  
