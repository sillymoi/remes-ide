package hr.fer.rasip.remes.profile.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hr.fer.rasip.remes.profile.profile.Constraint;
import hr.fer.rasip.remes.profile.profile.PlatformProfile;
import hr.fer.rasip.remes.profile.profile.ProfilePackage;
import hr.fer.rasip.remes.profile.profile.Resource;
import hr.fer.rasip.remes.profile.services.ProfileGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("restriction")
public class AbstractProfileSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected ProfileGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ProfilePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ProfilePackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case ProfilePackage.PLATFORM_PROFILE:
				if(context == grammarAccess.getPlatformProfileRule()) {
					sequence_PlatformProfile(context, (PlatformProfile) semanticObject); 
					return; 
				}
				else break;
			case ProfilePackage.RESOURCE:
				if(context == grammarAccess.getResourceRule()) {
					sequence_Resource(context, (Resource) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (type=ConstraintType references=[Resource|ID] isDerivation?='''? operation=ConstraintOperation bound=INT)
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (resources+=Resource resources+=Resource*)? (constraints+=Constraint constraints+=Constraint*)?)
	 */
	protected void sequence_PlatformProfile(EObject context, PlatformProfile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ResourceType weight=INT?)
	 */
	protected void sequence_Resource(EObject context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
