package com.haulmont.vaadin.sample.client.ui;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.FocusEvent;
import com.vaadin.client.ui.VTree;

public class FocusTreeWidget extends VTree {

    @Override
    public void onFocus(FocusEvent event) {
        super.onFocus(event);

        addStyleDependentName("focus");
    }

    @Override
    public void onBlur(BlurEvent event) {
        super.onBlur(event);

        removeStyleDependentName("focus");
    }
}