package model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class Skin implements interfaces.ISkin {

    private String nome;
    private String valor;
    private int id_skin;
    private Statement mysqStatement = null;

    @Override
    public boolean salvar() {
        String insert = "insert into skin(nome_skin, valor_skin) "
                + "values ('" + getNome() + "', '" + getValor() + "')";
        mysqStatement = ConexaoDB.getStatement();
        try {
            mysqStatement.executeUpdate(insert);
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
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

    public int getId_skin() {
        return id_skin;
    }

    public void setId_skin(int id_skin) {
        this.id_skin = id_skin;
    }    

    @Override
    public String toString() {
        return "Skin{" + "nome=" + nome + ", valor=" + valor + '}';
    }
    
    public List<Skin> getSkins(){
        List<Skin> skins = new ArrayList();
        String sql = "select * from";
        mysqStatement = ConexaoDB.getStatement();
        
        try {
            ResultSet rs = mysqStatement.executeQuery(sql);
            while(rs.next()){
                Skin sk = new Skin();
                sk.setId_skin(rs.getInt("id_skin"));
                sk.setNome(rs.getString("nome_skin"));
                sk.setValor(rs.getString("valor_skin"));
                skins.add(sk);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return skins;
    }
}
