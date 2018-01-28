package ru.binbank.efirdatahub.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class TableResponse {
    @JsonProperty("Columns")
    ArrayList<TableColumn> columns;

    @JsonProperty("Rows")
    ArrayList<TableRow> rows;
}
