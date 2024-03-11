package model;
public class Skin implements interfaces.ISkin{
    private String nome;
    private String valor;

    @Override
    public boolean salvar() {
        return true;
    }

    @Override
    public boolean atualizar() {
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Skin{" + "nome=" + nome + ", valor=" + valor + '}';
    }  
}
