import javax.swing.*;

/**
 * Combobox Model used in the InitClass sample.
 */
public class ComboModel extends DefaultComboBoxModel<String>
{
	private static final long serialVersionUID = -5159594818897779887L;

	/**
	 * Constructs a DefaultComboBoxModel object.
	 */
	public ComboModel()
	{
		super(new String[] { "Bird", "Cat", "Dog", "Rabbit", "Pig" });
	}
}
