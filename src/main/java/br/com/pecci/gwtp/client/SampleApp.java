package br.com.pecci.gwtp.client;

import br.com.pecci.gwtp.client.paperelements.PaperInput;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SampleApp implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	@Override
	public void onModuleLoad() {
		// PaperButton button = new PaperButton();
		// button.setLabel("Button!");
		// button.setRaisedButton(true);

		PaperInput input = new PaperInput();
		input.setLabel("Input!");
		// input.setValue("Input value...");

		// Use RootPanel.get() to get the entire body element
		RootPanel.get().add(input);
	}
}
