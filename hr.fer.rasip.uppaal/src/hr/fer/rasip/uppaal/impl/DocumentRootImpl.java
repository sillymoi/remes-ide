/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaal.impl;

import hr.fer.rasip.uppaal.CommittedType;
import hr.fer.rasip.uppaal.DocumentRoot;
import hr.fer.rasip.uppaal.InitType;
import hr.fer.rasip.uppaal.LabelType;
import hr.fer.rasip.uppaal.LocationType;
import hr.fer.rasip.uppaal.NailType;
import hr.fer.rasip.uppaal.NameType;
import hr.fer.rasip.uppaal.NtaType;
import hr.fer.rasip.uppaal.ParameterType;
import hr.fer.rasip.uppaal.SourceType;
import hr.fer.rasip.uppaal.TargetType;
import hr.fer.rasip.uppaal.TemplateType;
import hr.fer.rasip.uppaal.TransitionType;
import hr.fer.rasip.uppaal.UppaalPackage;
import hr.fer.rasip.uppaal.UrgentType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getCommitted <em>Committed</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getInit <em>Init</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getNail <em>Nail</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getNta <em>Nta</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getSystem <em>System</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.DocumentRootImpl#getUrgent <em>Urgent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap xSISchemaLocation;

	/**
	 * The default value of the '{@link #getDeclaration() <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImports() <em>Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInstantiation() <em>Instantiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiation()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANTIATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UppaalPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, UppaalPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UppaalPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UppaalPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommittedType getCommitted() {
		return (CommittedType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__COMMITTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommitted(CommittedType newCommitted, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__COMMITTED, newCommitted, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitted(CommittedType newCommitted) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__COMMITTED, newCommitted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeclaration() {
		return (String)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__DECLARATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(String newDeclaration) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__DECLARATION, newDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImports() {
		return (String)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__IMPORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImports(String newImports) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__IMPORTS, newImports);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitType getInit() {
		return (InitType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__INIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(InitType newInit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__INIT, newInit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(InitType newInit) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__INIT, newInit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstantiation() {
		return (String)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__INSTANTIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiation(String newInstantiation) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__INSTANTIATION, newInstantiation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelType getLabel() {
		return (LabelType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType newLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__LABEL, newLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(LabelType newLabel) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType getLocation() {
		return (LocationType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationType newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__LOCATION, newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationType newLocation) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NailType getNail() {
		return (NailType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__NAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNail(NailType newNail, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__NAIL, newNail, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNail(NailType newNail) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__NAIL, newNail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType getName() {
		return (NameType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType newName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__NAME, newName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameType newName) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NtaType getNta() {
		return (NtaType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__NTA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNta(NtaType newNta, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__NTA, newNta, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNta(NtaType newNta) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__NTA, newNta);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getParameter() {
		return (ParameterType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(ParameterType newParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__PARAMETER, newParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(ParameterType newParameter) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__PARAMETER, newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType getSource() {
		return (SourceType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SourceType newSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SourceType newSource) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystem() {
		return (String)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(String newSystem) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__SYSTEM, newSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType getTarget() {
		return (TargetType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TargetType newTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__TARGET, newTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TargetType newTarget) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateType getTemplate() {
		return (TemplateType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(TemplateType newTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__TEMPLATE, newTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateType newTemplate) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getTransition() {
		return (TransitionType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__TRANSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(TransitionType newTransition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__TRANSITION, newTransition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(TransitionType newTransition) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__TRANSITION, newTransition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrgentType getUrgent() {
		return (UrgentType)getMixed().get(UppaalPackage.Literals.DOCUMENT_ROOT__URGENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrgent(UrgentType newUrgent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UppaalPackage.Literals.DOCUMENT_ROOT__URGENT, newUrgent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrgent(UrgentType newUrgent) {
		((FeatureMap.Internal)getMixed()).set(UppaalPackage.Literals.DOCUMENT_ROOT__URGENT, newUrgent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaalPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
			case UppaalPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case UppaalPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case UppaalPackage.DOCUMENT_ROOT__COMMITTED:
				return basicSetCommitted(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__INIT:
				return basicSetInit(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__LABEL:
				return basicSetLabel(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__NAIL:
				return basicSetNail(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__NAME:
				return basicSetName(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__NTA:
				return basicSetNta(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__PARAMETER:
				return basicSetParameter(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__SOURCE:
				return basicSetSource(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__TARGET:
				return basicSetTarget(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__TRANSITION:
				return basicSetTransition(null, msgs);
			case UppaalPackage.DOCUMENT_ROOT__URGENT:
				return basicSetUrgent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UppaalPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case UppaalPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case UppaalPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case UppaalPackage.DOCUMENT_ROOT__COMMITTED:
				return getCommitted();
			case UppaalPackage.DOCUMENT_ROOT__DECLARATION:
				return getDeclaration();
			case UppaalPackage.DOCUMENT_ROOT__IMPORTS:
				return getImports();
			case UppaalPackage.DOCUMENT_ROOT__INIT:
				return getInit();
			case UppaalPackage.DOCUMENT_ROOT__INSTANTIATION:
				return getInstantiation();
			case UppaalPackage.DOCUMENT_ROOT__LABEL:
				return getLabel();
			case UppaalPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case UppaalPackage.DOCUMENT_ROOT__NAIL:
				return getNail();
			case UppaalPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case UppaalPackage.DOCUMENT_ROOT__NTA:
				return getNta();
			case UppaalPackage.DOCUMENT_ROOT__PARAMETER:
				return getParameter();
			case UppaalPackage.DOCUMENT_ROOT__SOURCE:
				return getSource();
			case UppaalPackage.DOCUMENT_ROOT__SYSTEM:
				return getSystem();
			case UppaalPackage.DOCUMENT_ROOT__TARGET:
				return getTarget();
			case UppaalPackage.DOCUMENT_ROOT__TEMPLATE:
				return getTemplate();
			case UppaalPackage.DOCUMENT_ROOT__TRANSITION:
				return getTransition();
			case UppaalPackage.DOCUMENT_ROOT__URGENT:
				return getUrgent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UppaalPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__COMMITTED:
				setCommitted((CommittedType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__DECLARATION:
				setDeclaration((String)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__IMPORTS:
				setImports((String)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__INIT:
				setInit((InitType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__INSTANTIATION:
				setInstantiation((String)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__LABEL:
				setLabel((LabelType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__NAIL:
				setNail((NailType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__NAME:
				setName((NameType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__NTA:
				setNta((NtaType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__PARAMETER:
				setParameter((ParameterType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__SOURCE:
				setSource((SourceType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__SYSTEM:
				setSystem((String)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__TARGET:
				setTarget((TargetType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__TEMPLATE:
				setTemplate((TemplateType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__TRANSITION:
				setTransition((TransitionType)newValue);
				return;
			case UppaalPackage.DOCUMENT_ROOT__URGENT:
				setUrgent((UrgentType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UppaalPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case UppaalPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case UppaalPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case UppaalPackage.DOCUMENT_ROOT__COMMITTED:
				setCommitted((CommittedType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__DECLARATION:
				setDeclaration(DECLARATION_EDEFAULT);
				return;
			case UppaalPackage.DOCUMENT_ROOT__IMPORTS:
				setImports(IMPORTS_EDEFAULT);
				return;
			case UppaalPackage.DOCUMENT_ROOT__INIT:
				setInit((InitType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__INSTANTIATION:
				setInstantiation(INSTANTIATION_EDEFAULT);
				return;
			case UppaalPackage.DOCUMENT_ROOT__LABEL:
				setLabel((LabelType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__NAIL:
				setNail((NailType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__NAME:
				setName((NameType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__NTA:
				setNta((NtaType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__PARAMETER:
				setParameter((ParameterType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__SOURCE:
				setSource((SourceType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case UppaalPackage.DOCUMENT_ROOT__TARGET:
				setTarget((TargetType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__TEMPLATE:
				setTemplate((TemplateType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__TRANSITION:
				setTransition((TransitionType)null);
				return;
			case UppaalPackage.DOCUMENT_ROOT__URGENT:
				setUrgent((UrgentType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UppaalPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case UppaalPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case UppaalPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case UppaalPackage.DOCUMENT_ROOT__COMMITTED:
				return getCommitted() != null;
			case UppaalPackage.DOCUMENT_ROOT__DECLARATION:
				return DECLARATION_EDEFAULT == null ? getDeclaration() != null : !DECLARATION_EDEFAULT.equals(getDeclaration());
			case UppaalPackage.DOCUMENT_ROOT__IMPORTS:
				return IMPORTS_EDEFAULT == null ? getImports() != null : !IMPORTS_EDEFAULT.equals(getImports());
			case UppaalPackage.DOCUMENT_ROOT__INIT:
				return getInit() != null;
			case UppaalPackage.DOCUMENT_ROOT__INSTANTIATION:
				return INSTANTIATION_EDEFAULT == null ? getInstantiation() != null : !INSTANTIATION_EDEFAULT.equals(getInstantiation());
			case UppaalPackage.DOCUMENT_ROOT__LABEL:
				return getLabel() != null;
			case UppaalPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case UppaalPackage.DOCUMENT_ROOT__NAIL:
				return getNail() != null;
			case UppaalPackage.DOCUMENT_ROOT__NAME:
				return getName() != null;
			case UppaalPackage.DOCUMENT_ROOT__NTA:
				return getNta() != null;
			case UppaalPackage.DOCUMENT_ROOT__PARAMETER:
				return getParameter() != null;
			case UppaalPackage.DOCUMENT_ROOT__SOURCE:
				return getSource() != null;
			case UppaalPackage.DOCUMENT_ROOT__SYSTEM:
				return SYSTEM_EDEFAULT == null ? getSystem() != null : !SYSTEM_EDEFAULT.equals(getSystem());
			case UppaalPackage.DOCUMENT_ROOT__TARGET:
				return getTarget() != null;
			case UppaalPackage.DOCUMENT_ROOT__TEMPLATE:
				return getTemplate() != null;
			case UppaalPackage.DOCUMENT_ROOT__TRANSITION:
				return getTransition() != null;
			case UppaalPackage.DOCUMENT_ROOT__URGENT:
				return getUrgent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
