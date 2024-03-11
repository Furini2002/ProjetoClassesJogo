package model;
public class Npc extends Personagem implements interfaces.INpc{
    
    private Skin skin;

    @Override
    public void falar() {
    }

    @Override
    public void matar() {
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    @Override
    public String toString() {
        return "Npc{" + "skin=" + skin + '}';
    } 
     
}
