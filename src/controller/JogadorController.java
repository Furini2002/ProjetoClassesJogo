package controller;

import java.util.List;
import model.Jogador;
import model.Personagem;

public class JogadorController extends Personagem implements interfaces.IJogador{

    private Jogador jogador;
    
    @Override
    public void chorar() {
    }
    
    public void salvar(){
        jogador.salvar();
    }
    
    public List<Jogador> getListaJogadores(){
        return jogador.getJogadores();
    }
    
}
