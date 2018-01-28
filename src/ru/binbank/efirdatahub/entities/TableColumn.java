package ru.binbank.efirdatahub.entities;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class TableColumn {
    private String name;
    private TableColumnType type;
    private boolean canBeNull;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TableColumnType getType() {
        return type;
    }

    public void setType(TableColumnType type) {
        this.type = type;
    }

    public boolean isCanBeNull() {
        return canBeNull;
    }

    public void setCanBeNull(boolean canBeNull) {
        this.canBeNull = canBeNull;
    }

    @JsonAnySetter
    public void set(String name, Object value) {
        this.name = name;
        String stringValue = (String)value;
        this.canBeNull = stringValue.endsWith("?");
        if (this.canBeNull)
            stringValue = stringValue.substring(0, stringValue.length() - 1);
        this.type = TableColumnType.valueOf(stringValue.toUpperCase());
     }
}
