package com.example.testrest.model;

/**
 * @author nihsaxen
 * @since 20B
 */
public class DbSchemaDetails {
    public DbSchemaDetails() {

    }

    public DbSchemaDetails(String dbURL, String dbPassword, DbSchema dbName, String dbUser) {
        this.dbURL = dbURL;
        this.dbPassword = dbPassword;
        this.dbName = dbName;
        this.dbUser = dbUser;
    }

    private String dbUser;
    private String dbURL;
    private String dbPassword;
    private DbSchema dbName;

    public String getDbURL() {
        return dbURL;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public DbSchema getDbName() {
        return dbName;
    }

    public String getDbUser() {
        return dbUser;
    }


}
