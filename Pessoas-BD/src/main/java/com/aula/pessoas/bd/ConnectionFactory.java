package com.aula.pessoas.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public Connection obtemConexao(){
        try{
            //Configuração Básicas
            String url="jdbc:mysql://localhost:33306/db_pessoas";
            String usuario="root";
            String senha="@Vipp0703";

            //Cria e retorna a conexão
            return DriverManager.getConnection(url, usuario, senha);
        }
        catch (SQLException e){
            //Transforma em RuntimeException para não precisar declarar throws
            throw new RuntimeException("Erro ao conectar ao banco",e);
        }
    }
}
