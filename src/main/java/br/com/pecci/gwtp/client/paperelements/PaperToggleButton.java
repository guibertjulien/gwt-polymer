package br.com.pecci.gwtp.client.paperelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;

public class PaperToggleButton extends CheckablePaperItem {

	public static final String STYLE = "";

	protected PaperToggleButton(Element elem) {
		super(elem);
	}

	public PaperToggleButton() {
		this(Document.get().createElement(PaperToggleButtonElement.TAG), STYLE);
	}

	public PaperToggleButton(Element element, String styleName) {
		this(element);
		if (styleName != null && !styleName.equalsIgnoreCase(STYLE)) {
			styleName = STYLE + " " + styleName;
		}
		setStyleName(styleName);
	}

	@Override
	protected PaperToggleButtonElement getPaperElement() {
		return getElement().cast();
	}

}
