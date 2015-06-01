package com.kyrioslab.vkplistsaver.client.widgets;

/**
 * Created by Ivan Kirilyuk on 01.06.15.
 * Defines widget table column constraints.
 */
public class ColumnConstraint {

    private int index;
    private String name;
    private boolean editable;

    public ColumnConstraint(int index, String name, boolean editable) {
        this.index = index;
        this.name = name;
        this.editable = editable;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public boolean isEditable() {
        return editable;
    }
}
