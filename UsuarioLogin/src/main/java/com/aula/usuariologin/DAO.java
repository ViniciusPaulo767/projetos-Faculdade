package com.aula.usuariologin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    public boolean existe(Usuario usuario)throws Exception{
        String sql="SELECT*FROM tb_usuario WHERE nome=? AND senha=?";
        try(Connection conn=ConexaoBD.obterConexao();
               PreparedStatement ps=conn.prepareStatement(sql)){
            ps.setString(1, usuario.getNome());
            try(ResultSet rs=ps.executeQuery()){
                if(rs.next()){
                    String senhaArmazenada=rs.getString("senha");
                    return usuario.getSenha().equals(senhaArmazenada);
                }
                return false;
            }
        }
    }
}
