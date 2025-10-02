package UCB.Atividade.EscolaMusica;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AtividadeMusica {

    public static void main(String[] args) {
        System.out.println("--- Iniciar Orquestra ---");

        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        banda[0] = new Violao("Violão Clássico", "madeira", 6);
        banda[1] = new Bateria("Bateria Rock", "madeira e metal", 5);
        banda[2] = new Piano("Piano de Cauda", "madeira e metal", 88);
        banda[3] = new Saxofone("Saxofone Alto", "latão", "Alto");

        apresentar(banda);
    }

    public static void apresentar(InstrumentoMusical[] banda) {
        System.out.println("\n*** A orquestra vai começar! ***");

        System.out.println("\n--- Afinando os instrumentos ---");
        for (InstrumentoMusical instrumento : banda) {
            if (instrumento != null) {
                instrumento.afinar();
            }
        }
        
        System.out.println("\n--- Apresentação Musical ---");
        for (InstrumentoMusical instrumento : banda) {
            if (instrumento != null) {
                instrumento.MostrarInformacoes();
                instrumento.tocar();
                System.out.println("---");
            }
        }
        
        System.out.println("\n*** Fim da apresentação ***");
    }
}