/*
 * 
 */
package Platform_Metamodel.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class Platform_MetamodelNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public Platform_MetamodelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem> result = new ArrayList<Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup) {
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup group = (Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem) {
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem navigatorItem = (Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
				.getVisualID(view)) {

		case Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.VISUAL_ID: {
			LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem> result = new LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup links = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_PlatformApplicationModelRoot_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID: {
			LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem> result = new LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup incominglinks = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_VoltageFrequencyIsland_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID: {
			LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem> result = new LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup incominglinks = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_ProcessorType_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorTypeProcessorTypePossibleStatesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID: {
			LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem> result = new LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup outgoinglinks = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_Processor_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID: {
			LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem> result = new LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup incominglinks = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_ProcessorState_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup outgoinglinks = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_ProcessorState_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Platform_Metamodel.diagram.edit.parts.ProcessorStateChangeEditPart.VISUAL_ID: {
			LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem> result = new LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup target = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_ProcessorStateChange_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup source = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_ProcessorStateChange_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorStateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Platform_Metamodel.diagram.edit.parts.ProcessorPTypeEditPart.VISUAL_ID: {
			LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem> result = new LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup target = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_ProcessorPType_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup source = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_ProcessorPType_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorTypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Platform_Metamodel.diagram.edit.parts.ProcessorVfIslandEditPart.VISUAL_ID: {
			LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem> result = new LinkedList<Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup target = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_ProcessorVfIsland_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup source = new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorGroup(
					Platform_Metamodel.diagram.part.Messages.NavigatorGroupName_ProcessorVfIsland_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.VoltageFrequencyIslandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
							.getType(Platform_Metamodel.diagram.edit.parts.ProcessorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Platform_Metamodel.diagram.edit.parts.PlatformApplicationModelRootEditPart.MODEL_ID
				.equals(Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem> result = new ArrayList<Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<Platform_Metamodel.diagram.navigator.Platform_MetamodelNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem) {
			Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem abstractNavigatorItem = (Platform_Metamodel.diagram.navigator.Platform_MetamodelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
