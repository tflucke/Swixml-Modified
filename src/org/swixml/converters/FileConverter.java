package org.swixml.converters;

import java.io.File;

import org.swixml.Attribute;
import org.swixml.Converter;
import org.swixml.Localizer;

public class FileConverter extends Converter<File>
{
	/**
	  * Returns a <code>java.io.File</code> runtime object
	  * @param attr <code>Attribute</code> value needs to provide a String
	  * @return runtime type is subclass of <code>java.io.File</code>
	  */
	@Override
	public File convert(Attribute attr, Localizer localizer) throws Exception
	{
		return new File(localizer.getClassLoader().getResource(attr.getValue()).getPath());
	}

	/**
	 * A <code>Converters</code> conversTo method informs about the Class<?> type the converter
	 * is returning when its <code>convert</code> method is called
	 * @return <code>Class</code> - the Class<?> the converter is returning when its convert method is called
	 */
	public Class<File> convertsTo()
	{
		return File.class;
	}
}
