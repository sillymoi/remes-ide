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
		
		initDefaultCompositeMode(mode);
		
		return mode;
	}

	/**
	 * Initializes an existing composite mode with init, entry, exit and composite entry and exit points.
	 * @param mode CompositeMode to be initialized
	 */
	public void initDefaultCompositeMode(CompositeMode mode) {
		if(mode == null) return;
		
		if(mode.getInitPoint() == null) {
			InitPoint init = RemesFactory.eINSTANCE.createInitPoint();
			mode.setInitPoint(init);
		}
		
		if(mode.getEntryPoint() == null) {
			EntryPoint entry = RemesFactory.eINSTANCE.createEntryPoint();
			mode.setEntryPoint(entry);
		}
		
		if(mode.getExitPoint() == null) {
			ExitPoint exit = RemesFactory.eINSTANCE.createExitPoint();
			mode.setExitPoint(exit);
		}
		
		if(mode.getCompositeEntryPoint() == null) {
			CompositeEntryPoint centry = RemesFactory.eINSTANCE.createCompositeEntryPoint();
			mode.setCompositeEntryPoint(centry);
		}
		
		if(mode.getCompositeExitPoint() == null) {
			CompositeExitPoint cexit = RemesFactory.eINSTANCE.createCompositeExitPoint();
			mode.setCompositeExitPoint(cexit);		
		}
	}
	
	/**
	 * Creates a mode with init, entry, exit points.
	 * @return initialized SubMode
	 */
	public SubMode createDefaultSubMode() {
		SubMode mode = RemesFactory.eINSTANCE.createSubMode();
				
		initDefaultSubMode(mode);
		
		return mode;
	}

	/**
	 * Initializes an existing mode with init, entry, exit points.
	 * @param mode
	 */
	public void initDefaultSubMode(SubMode mode) {
		if(mode == null) return;
		
		if(mode.getEntryPoint() == null) {
			EntryPoint entry = RemesFactory.eINSTANCE.createEntryPoint();
			mode.setEntryPoint(entry);
		}

		if(mode.getExitPoint() == null) {
			ExitPoint exit = RemesFactory.eINSTANCE.createExitPoint();
			mode.setExitPoint(exit);		
		}
	}

}
