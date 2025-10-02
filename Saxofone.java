package UCB.Atividade.EscolaMusica;

public class Saxofone extends InstrumentoMusical{
    private String tipo;
    
    public Saxofone(String nome, String material, String tipo){
        super(nome, material);
        this.tipo = tipo;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando uma bela melodia no " + nome + " com " + tipo + " cordas...");
        System.out.println("Dedilhando uma melodia romantica");
    }
    
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a tensão das " + tipo + "cordas... ");
    }
    
    @Override 
    public void MostrarInformacoes() {
        super.MostrarInformacoes();
        System.out.println("Tipo: "+ tipo);
    }
}
