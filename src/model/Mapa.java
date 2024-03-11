package model;
public class Mapa implements interfaces.IMapa{
    private Lugar lugarInicialJogador;
    private Lugar lugarInicialNpc;
    private String descricao;

    @Override
    public void criarLugares() {
    }

    public Lugar getLugarInicialJogador() {
        return lugarInicialJogador;
    }

    public void setLugarInicialJogador(Lugar lugarInicialJogador) {
        this.lugarInicialJogador = lugarInicialJogador;
    }

    public Lugar getLugarInicialNpc() {
        return lugarInicialNpc;
    }

    public void setLugarInicialNpc(Lugar lugarInicialNpc) {
        this.lugarInicialNpc = lugarInicialNpc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Mapa{" + "lugarInicialJogador=" + lugarInicialJogador + ", lugarInicialNpc=" + lugarInicialNpc + ", descricao=" + descricao + '}';
    }
              
}
