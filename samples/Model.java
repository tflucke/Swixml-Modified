import javax.swing.DefaultListModel;

public class Model extends DefaultListModel<String>
{
	private static final long serialVersionUID = 3911569954833731973L;

	/**
	 * Constructs a DefaultComboBoxModel object.
	 */
	public Model()
	{
		for (String s : new String[] { "Bird", "Cat", "Dog", "Rabbit", "Pig" })
		{
			this.addElement(s);
		}
	}
}