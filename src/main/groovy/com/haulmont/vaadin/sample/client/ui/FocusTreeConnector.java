package com.haulmont.vaadin.sample.client.ui;

import com.haulmont.vaadin.sample.ui.FocusTree;
import com.vaadin.client.ui.tree.TreeConnector;
import com.vaadin.shared.ui.Connect;

@Connect(FocusTree.class)
public class FocusTreeConnector extends TreeConnector {

    @Override
    public FocusTreeWidget getWidget() {
        return (FocusTreeWidget) super.getWidget();
    }
}