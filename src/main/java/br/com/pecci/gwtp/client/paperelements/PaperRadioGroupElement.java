package br.com.pecci.gwtp.client.paperelements;

import br.com.pecci.gwtp.client.coreelements.CoreSelectorElement;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(PaperRadioGroupElement.TAG)
public class PaperRadioGroupElement extends CoreSelectorElement {

	public static final String TAG = "paper-radio-group";

	/**
	 * Assert that the given {@link Element} is compatible with this class and
	 * automatically typecast it.
	 */
	public static PaperRadioGroupElement as(Element elem) {
		assert elem.getTagName().equalsIgnoreCase(TAG);
		return (PaperRadioGroupElement) elem;
	}

	protected PaperRadioGroupElement() {}

}
