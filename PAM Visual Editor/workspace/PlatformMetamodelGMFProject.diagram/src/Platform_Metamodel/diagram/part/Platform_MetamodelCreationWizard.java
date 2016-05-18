/*
 * 
 */
package Platform_Metamodel.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class Platform_MetamodelCreationWizard extends Wizard implements
		INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected Platform_Metamodel.diagram.part.Platform_MetamodelCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected Platform_Metamodel.diagram.part.Platform_MetamodelCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Platform_Metamodel.diagram.part.Messages.Platform_MetamodelCreationWizardTitle);
		setDefaultPageImageDescriptor(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewPlatform_MetamodelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new Platform_Metamodel.diagram.part.Platform_MetamodelCreationWizardPage(
				"DiagramModelFile", getSelection(), "platform_metamodel_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Platform_Metamodel.diagram.part.Messages.Platform_MetamodelCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Platform_Metamodel.diagram.part.Messages.Platform_MetamodelCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new Platform_Metamodel.diagram.part.Platform_MetamodelCreationWizardPage(
				"DomainModelFile", getSelection(), "platform_metamodel") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".platform_metamodel_diagram".length()); //$NON-NLS-1$
					setFileName(Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "platform_metamodel")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Platform_Metamodel.diagram.part.Messages.Platform_MetamodelCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Platform_Metamodel.diagram.part.Messages.Platform_MetamodelCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										Platform_Metamodel.diagram.part.Messages.Platform_MetamodelCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								Platform_Metamodel.diagram.part.Messages.Platform_MetamodelCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
