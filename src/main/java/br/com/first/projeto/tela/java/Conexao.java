package br.com.first.projeto.tela.java;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexao {
    private BasicDataSource banco;
    
    public Conexao() {
        this.banco = new BasicDataSource();
        banco.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        banco.setUrl("jdbc:sqlserver://ac3-franklin.database.windows.net;" +
                    "databaseName=franklin-ac3;");  
        banco.setUsername("franklin");
        banco.setPassword("Pohavailogo41+");
    }

    public BasicDataSource getBanco() {
        return banco;
    }
}
