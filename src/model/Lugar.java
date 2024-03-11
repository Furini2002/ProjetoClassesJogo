package model;
public class Lugar {
    
    private String descricao;
    private Lugar norte;
    private Lugar leste;
    private Lugar oeste;
    private Lugar sul;
    private Personagem personagens;
    private String mensagens;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lugar getNorte() {
        return norte;
    }

    public void setNorte(Lugar norte) {
        this.norte = norte;
    }

    public Lugar getLeste() {
        return leste;
    }

    public void setLeste(Lugar leste) {
        this.leste = leste;
    }

    public Lugar getOeste() {
        return oeste;
    }

    public void setOeste(Lugar oeste) {
        this.oeste = oeste;
    }

    public Lugar getSul() {
        return sul;
    }

    public void setSul(Lugar sul) {
        this.sul = sul;
    }

    public Personagem getPersonagens() {
        return personagens;
    }

    public void setPersonagens(Personagem personagens) {
        this.personagens = personagens;
    }

    public String getMensagens() {
        return mensagens;
    }

    public void setMensagens(String mensagens) {
        this.mensagens = mensagens;
    }
    
    @Override
    public String toString() {
        return "Lugar{" + "descricao=" + descricao + ", norte=" + norte + ", leste=" + leste + ", oeste=" + oeste + ", sul=" + sul + ", personagens=" + personagens + ", mensagens=" + mensagens + '}';
    }
}
