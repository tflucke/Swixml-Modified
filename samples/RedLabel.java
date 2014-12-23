import javax.swing.*;
import java.awt.*;
import java.util.TimeZone;

public class RedLabel extends JLabel
{
	private static final long serialVersionUID = -1820263121666745141L;

	public RedLabel()
	{
		this.setForeground(Color.red);
		this.setFont(Font.decode("VERDANA-BOLD-24"));
	}
	
	public void setTimeZone(TimeZone tz)
	{
		
		this.setText(tz.getDisplayName());
	}
}
