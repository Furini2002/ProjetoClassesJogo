package model;
public class Jogador extends Personagem implements interfaces.IJogador{
    private int vida;
    private Skin skin;

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
    
       
}
