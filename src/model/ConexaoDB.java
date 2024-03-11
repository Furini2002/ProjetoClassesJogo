package model;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConexaoDB {
    
    private static String mysqlSenha = "";
    private static String mysqlUsuario = "root";
    private static String mysqlDatabase = "dbgame";
    
    private static Connection mysqlConnection = null;
    
    private static Statement mysqlStatement = null;
    
    private static String caminhoDoBanco = ""
            + "jdbc:mysql://localhost:3306/"+mysqlDatabase;
    
    public static Statement getStatement(){
        try {
            //cria a conexao
            mysqlConnection = DriverManager.getConnection(
                    caminhoDoBanco,mysqlUsuario,mysqlSenha);
            //cria o statement(ponte) para o banco
            mysqlStatement = mysqlConnection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mysqlStatement;
    }
    
}
