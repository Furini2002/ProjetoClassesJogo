package model;
public class Personagem implements interfaces.IOperacao{
    
    private String nome;
    private Lugar lugar;
    private String acao;
    
    @Override
    public void correr() {
    }

    @Override
    public void morrer() {
    }

    @Override
    public void salvar() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    @Override
    public String toString() {
        return "Personagem{" + "nome=" + nome + ", lugar=" + lugar + ", acao=" + acao + '}';
    }
    
    
}
