package se.mdh.progresside.remes.util;

import se.mdh.progresside.remes.CompositeEntryPoint;
import se.mdh.progresside.remes.CompositeExitPoint;
import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.EntryPoint;
import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.InitPoint;
import se.mdh.progresside.remes.RemesFactory;
import se.mdh.progresside.remes.SubMode;

/**
 * Creates default, initialized Remes elements.
 * 
 * @author Marin
 */
public class RemesDefaultElementFactory {
	public RemesDefaultElementFactory() {
		super();
	}
	
	/**
	 * Creates a composite mode with init, entry, exit and composite entry and exit points.
	 * @return initialized CompositeMode
	 */
	public CompositeMode createDefaultCompositeMode() {
		CompositeMode mode = RemesFactory.eINSTANCE.createCompositeMode();
		
		InitPoint init = RemesFactory.eINSTANCE.createInitPoint();
		mode.setInitPoint(init);
		
		EntryPoint entry = RemesFactory.eINSTANCE.createEntryPoint();
		mode.setEntryPoint(entry);
		
		ExitPoint exit = RemesFactory.eINSTANCE.createExitPoint();
		mode.setExitPoint(exit);
		
		CompositeEntryPoint centry = RemesFactory.eINSTANCE.createCompositeEntryPoint();
		mode.setCompositeEntryPoint(centry);
		
		CompositeExitPoint cexit = RemesFactory.eINSTANCE.createCompositeExitPoint();
		mode.setCompositeExitPoint(cexit);
		
		return mode;
	}

	/**
	 * Creates a mode with init, entry, exit points.
	 * @return initialized SubMode
	 */
	public SubMode createDefaultSubMode() {
		SubMode mode = RemesFactory.eINSTANCE.createSubMode();
				
		EntryPoint entry = RemesFactory.eINSTANCE.createEntryPoint();
		mode.setEntryPoint(entry);
		
		ExitPoint exit = RemesFactory.eINSTANCE.createExitPoint();
		mode.setExitPoint(exit);
		
		return mode;
	}

}
