package br.com.pecci.gwtp.client.paperelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(PaperIconButtonElement.TAG)
public class PaperFabElement extends PaperIconButtonElement{

	public static final String TAG = "paper-fab";

	/**
	 * Assert that the given {@link Element} is compatible with this class and
	 * automatically typecast it.
	 */
	public static PaperFabElement as(Element elem) {
		assert elem.getTagName().equalsIgnoreCase(TAG);
		return (PaperFabElement) elem;
	}

	protected PaperFabElement(){}

}
