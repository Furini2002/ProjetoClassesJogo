package controller;

import java.util.List;
import model.Skin;

public class SkinController implements interfaces.ISkin{
    
    private Skin skin;

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }    

    @Override
    public boolean salvar() {
        skin.salvar();
        return false;
    }

    @Override
    public boolean atualizar() {
         return false;
    }
    
    public List<Skin> getListaSkins(){
        return skin.getSkins();
    }
    
}
