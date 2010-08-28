package hr.fer.rasip.uppaallite.subdiagram.providers;

import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType2EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType3EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType4EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType5EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationType6EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariant2EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariant3EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariant4EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariant5EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariant6EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeInvariantEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName2EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName3EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName4EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName5EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeName6EditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.LocationTypeNameEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TemplateTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeAssignmentEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeGuardEditPart;
import hr.fer.rasip.uppaallite.subdiagram.edit.parts.TransitionTypeSyncEditPart;
import hr.fer.rasip.uppaallite.subdiagram.part.UppaalliteVisualIDRegistry;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

/**
 * @generated
 */
public class UppaalliteViewProvider extends AbstractProvider implements
		IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		 if (op.getViewKind() == Node.class)
		 return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 if (op.getViewKind() == Edge.class)
		 return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 */
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return TemplateTypeEditPart.MODEL_ID.equals(op.getSemanticHint())
				&& UppaalliteVisualIDRegistry
						.getDiagramVisualID(getSemanticElement(op
								.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = UppaalliteVisualIDRegistry.getNodeVisualID(op
					.getContainerView(), domainElement);
		} else {
			visualID = UppaalliteVisualIDRegistry.getVisualID(op
					.getSemanticHint());
			if (elementType != null) {
				if (!UppaalliteElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != UppaalliteVisualIDRegistry
								.getNodeVisualID(op.getContainerView(),
										domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!TemplateTypeEditPart.MODEL_ID
						.equals(UppaalliteVisualIDRegistry.getModelID(op
								.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case LocationTypeEditPart.VISUAL_ID:
				case LocationType2EditPart.VISUAL_ID:
				case LocationType3EditPart.VISUAL_ID:
				case LocationType4EditPart.VISUAL_ID:
				case LocationType5EditPart.VISUAL_ID:
				case LocationType6EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != UppaalliteVisualIDRegistry
									.getNodeVisualID(op.getContainerView(),
											domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return LocationTypeEditPart.VISUAL_ID == visualID
				|| LocationType2EditPart.VISUAL_ID == visualID
				|| LocationType3EditPart.VISUAL_ID == visualID
				|| LocationType4EditPart.VISUAL_ID == visualID
				|| LocationType5EditPart.VISUAL_ID == visualID
				|| LocationType6EditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		if (!UppaalliteElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op
						.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = UppaalliteVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null
				&& visualID != UppaalliteVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	public Diagram createDiagram(IAdaptable semanticAdapter,
			String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(TemplateTypeEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	public Node createNode(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = UppaalliteVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		} else {
			visualID = UppaalliteVisualIDRegistry.getVisualID(semanticHint);
		}
		switch (visualID) {
		case LocationTypeEditPart.VISUAL_ID:
			return createLocationType_2007(domainElement, containerView, index,
					persisted, preferencesHint);
		case LocationType2EditPart.VISUAL_ID:
			return createLocationType_2008(domainElement, containerView, index,
					persisted, preferencesHint);
		case LocationType3EditPart.VISUAL_ID:
			return createLocationType_2009(domainElement, containerView, index,
					persisted, preferencesHint);
		case LocationType4EditPart.VISUAL_ID:
			return createLocationType_2010(domainElement, containerView, index,
					persisted, preferencesHint);
		case LocationType5EditPart.VISUAL_ID:
			return createLocationType_2011(domainElement, containerView, index,
					persisted, preferencesHint);
		case LocationType6EditPart.VISUAL_ID:
			return createLocationType_2012(domainElement, containerView, index,
					persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Edge createEdge(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (UppaalliteVisualIDRegistry.getVisualID(elementTypeHint)) {
		case TransitionTypeEditPart.VISUAL_ID:
			return createTransitionType_4002(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createLocationType_2007(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UppaalliteVisualIDRegistry
				.getType(LocationTypeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5013 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeNameEditPart.VISUAL_ID));
		label5013.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5013 = (Location) label5013.getLayoutConstraint();
		location5013.setX(0);
		location5013.setY(5);
		Node label5014 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeInvariantEditPart.VISUAL_ID));
		label5014.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5014 = (Location) label5014.getLayoutConstraint();
		location5014.setX(0);
		location5014.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createLocationType_2008(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UppaalliteVisualIDRegistry
				.getType(LocationType2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5015 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeName2EditPart.VISUAL_ID));
		label5015.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5015 = (Location) label5015.getLayoutConstraint();
		location5015.setX(0);
		location5015.setY(5);
		Node label5016 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeInvariant2EditPart.VISUAL_ID));
		label5016.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5016 = (Location) label5016.getLayoutConstraint();
		location5016.setX(0);
		location5016.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createLocationType_2009(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UppaalliteVisualIDRegistry
				.getType(LocationType3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5017 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeName3EditPart.VISUAL_ID));
		label5017.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5017 = (Location) label5017.getLayoutConstraint();
		location5017.setX(0);
		location5017.setY(5);
		Node label5018 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeInvariant3EditPart.VISUAL_ID));
		label5018.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5018 = (Location) label5018.getLayoutConstraint();
		location5018.setX(0);
		location5018.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createLocationType_2010(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UppaalliteVisualIDRegistry
				.getType(LocationType4EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5019 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeName4EditPart.VISUAL_ID));
		label5019.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5019 = (Location) label5019.getLayoutConstraint();
		location5019.setX(0);
		location5019.setY(5);
		Node label5020 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeInvariant4EditPart.VISUAL_ID));
		label5020.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5020 = (Location) label5020.getLayoutConstraint();
		location5020.setX(0);
		location5020.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createLocationType_2011(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UppaalliteVisualIDRegistry
				.getType(LocationType5EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5021 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeName5EditPart.VISUAL_ID));
		label5021.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5021 = (Location) label5021.getLayoutConstraint();
		location5021.setX(0);
		location5021.setY(5);
		Node label5022 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeInvariant5EditPart.VISUAL_ID));
		label5022.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5022 = (Location) label5022.getLayoutConstraint();
		location5022.setX(0);
		location5022.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createLocationType_2012(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(UppaalliteVisualIDRegistry
				.getType(LocationType6EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5023 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeName6EditPart.VISUAL_ID));
		label5023.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5023 = (Location) label5023.getLayoutConstraint();
		location5023.setX(0);
		location5023.setY(5);
		Node label5024 = createLabel(node, UppaalliteVisualIDRegistry
				.getType(LocationTypeInvariant6EditPart.VISUAL_ID));
		label5024.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location5024 = (Location) label5024.getLayoutConstraint();
		location5024.setX(0);
		location5024.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Edge createTransitionType_4002(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList points = new ArrayList(2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(UppaalliteVisualIDRegistry
				.getType(TransitionTypeEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge, NotationPackage.eINSTANCE
					.getRoutingStyle_Routing(), routing);
		}
		Node label6004 = createLabel(edge, UppaalliteVisualIDRegistry
				.getType(TransitionTypeAssignmentEditPart.VISUAL_ID));
		label6004.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6004 = (Location) label6004.getLayoutConstraint();
		location6004.setX(0);
		location6004.setY(40);
		Node label6005 = createLabel(edge, UppaalliteVisualIDRegistry
				.getType(TransitionTypeGuardEditPart.VISUAL_ID));
		label6005.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6005 = (Location) label6005.getLayoutConstraint();
		location6005.setX(0);
		location6005.setY(60);
		Node label6006 = createLabel(edge, UppaalliteVisualIDRegistry
				.getType(TransitionTypeSyncEditPart.VISUAL_ID));
		label6006.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6006 = (Location) label6006.getLayoutConstraint();
		location6006.setX(0);
		location6006.setY(80);
		return edge;
	}

	/**
	 * @generated
	 */
	private void stampShortcut(View containerView, Node target) {
		if (!TemplateTypeEditPart.MODEL_ID.equals(UppaalliteVisualIDRegistry
				.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put(
					"modelID", TemplateTypeEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * @generated
	 */
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(TransactionUtil
					.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
