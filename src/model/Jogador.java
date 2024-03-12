package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

public class Jogador extends Personagem implements interfaces.IJogador{
    private int vida;
    private Skin skin;
    private Statement mysqStatement = null;       
       
    @Override
    public void chorar() {
    }

    @Override
    public String toString() {
        return "Jogador{" + "vida=" + vida + ", skin=" + skin + '}';
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }
    
    public void salvar(){
        String insert = "insert into jogador (nome_joogador, lugar_jogador, acao_jogador, skin_jogador) "
                + "values ('"+ getNome() +"', '" + getLugar() +"', '"+ getAcao() +"','"+ getSkin() +"')";
        mysqStatement = ConexaoDB.getStatement();
        try {
            mysqStatement.executeUpdate(insert);
            
        } catch (SQLException ex) {
            ex.printStackTrace();            
        }
    }
    
       
}
