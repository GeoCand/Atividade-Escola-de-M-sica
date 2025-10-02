package UCB.Atividade.EscolaMusica;

public abstract class InstrumentoMusical {
    protected String nome;
    protected String material;
    
    
    public InstrumentoMusical (String nome, String material){
        this.nome = nome;
        this.material = material;
    }
    
    public void tocar(){
    };
    
    public void afinar (){
        System.out.println("Afinando o " + nome + "...");
    }
    
    public void MostrarInformacoes() {
        System.out.println("Instrumanto: "+ nome);
        System.out.println("Material: "+ material);
    }
    
    public String getNome() { return nome; }
    public String getMaterial() { return material; }
}

