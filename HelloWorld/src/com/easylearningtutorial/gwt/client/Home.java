package com.easylearningtutorial.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {

	private LittleForm form = new LittleForm();

	@Override
	public void onModuleLoad() {
		form.setText("New text");
		RootPanel.get().add(form);
	}
}
