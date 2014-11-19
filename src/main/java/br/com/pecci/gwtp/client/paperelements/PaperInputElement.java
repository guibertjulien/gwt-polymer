package br.com.pecci.gwtp.client.paperelements;

import br.com.pecci.gwtp.client.coreelements.CoreInputElement;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(PaperInputElement.TAG)
public class PaperInputElement extends CoreInputElement {

	public static final String TAG = "paper-input";

	/**
	 * Assert that the given {@link Element} is compatible with this class and
	 * automatically typecast it.
	 */
	public static PaperInputElement as(Element elem) {
		assert elem.getTagName().equalsIgnoreCase(TAG);
		return (PaperInputElement) elem;
	}

	protected PaperInputElement(){}

	public final native String getLabel() /*-{
		return this.label;
	}-*/;

	public final native void setLabel(String lbl) /*-{
		this.label = lbl;
	}-*/;

	public final native int getMaxRows() /*-{
		return this.maxRows;
	}-*/;

	public final native void setMaxRows(int rows) /*-{
		this.maxRows = rows;
	}-*/;

	public final native boolean isFloatingLabel() /*-{
		return this.floatingLabel;
	}-*/;

	public final native void setFloatingLabel(boolean status) /*-{
		this.floatingLabel = status;
	}-*/;

}
