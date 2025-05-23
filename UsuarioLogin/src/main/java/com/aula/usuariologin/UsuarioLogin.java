package com.aula.usuariologin;

import java.sql.Connection;

public class UsuarioLogin {

    public static void main(String[] args) {
        try {
        Connection conn = ConexaoBD.obterConexao();
        System.out.println("Conexão bem-sucedida!");
        conn.close();
        } catch (Exception e) {
        System.err.println("Erro na conexão: " + e.getMessage());
        }
    }
}