import org.swixml.Attribute;
import org.swixml.Converter;
import org.swixml.Localizer;

import java.util.SimpleTimeZone;

public class TimeZoneConverter extends Converter<SimpleTimeZone>
{	
	/**
	 * A <code>Converters</code> conversTo method informs about the Class type
	 * the converter
	 * is returning when its <code>convert</code> method is called
	 * 
	 * @return <code>Class</code> - the Class the converter is returning when
	 *         its convert method is called
	 */
	public Class<SimpleTimeZone> convertsTo()
	{
		return SimpleTimeZone.class;
	}
	

	/**
	 * Convert the value of the given <code>Attribute</code> object into an
	 * output object of the
	 * specified type.
	 *
	 * @param attr
	 *            <code>Attribute</code> the attribute, providing the value to
	 *            be converted.
	 */
	@Override
	public SimpleTimeZone convert(Attribute attr, Localizer localizer)
	        throws Exception
	{
		SimpleTimeZone tz = null;
		if (attr != null && attr.getValue() != null)
		{
			tz = new SimpleTimeZone(0, attr.getValue());
		}
		return tz;
	}
}
