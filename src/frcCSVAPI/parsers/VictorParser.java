 /*
 * Copyright (c) 2012 theNerd247 (Noah Harvey)
 *
 * This product is licensed under the BSD 2-clause license
 * See LICENSE.txt for more details
 */

package frcCSVAPI.parsers;

import frcCSVAPI.RobotDevice;
import edu.wpi.first.wpilibj.Victor;
import java.util.Vector;

/**
 *
 * @author theNerd247 (Noah Harvey)
 */
public class VictorParser extends DeviceParser
{
	private  String name = "VictorParser";

	public  String getName()
	{
		return name;
	}

	public  RobotDevice createDevice(Vector data)
	{
		String name = (String)data.elementAt(0);
		int slot = ((Integer)data.elementAt(2)).intValue();
		int channel = ((Integer)data.elementAt(3)).intValue();
		Victor newDev = new Victor(slot,channel);
		return new RobotDevice(name,newDev);
	}
}	
