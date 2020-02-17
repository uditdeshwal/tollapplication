package com.example.testrest.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author nihsaxen
 * @since 20B
 */
public class DataSource {

    public Set<DbSchemaDetails> getDatasource() {
        return datasource;
    }
    private Set<DbSchemaDetails> datasource = new HashSet<>();

}
