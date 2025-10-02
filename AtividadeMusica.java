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
        
        AtividadeMusica em = new AtividadeMusica();

        em.apresentar(banda);
    }

    public static void apresentar(InstrumentoMusical[] banda) {
        System.out.println("\n*** A orquestra vai começar! ***");

        System.out.println("\n--- Afinando os instrumentos ---");
        for (InstrumentoMusical instrumento : banda) {
            if (instrumento != null) {
                instrumento.afinar();
            }
        }
        System.out.println();
        
        System.out.println("\n--- Instrumentos começando a tocar ---");
        for (InstrumentoMusical instrumento : banda) {
            if (instrumento != null) {
                instrumento.tocar();
            }
        }
        System.out.println();
        
        System.out.println("\n--- Mostrando informações dos instrumentos ---");
        for (int i = 0; i < banda.length ; i++) {
            System.out.println("Instrumento Musical " + (i + i) + " : ");
        }
    }
}
