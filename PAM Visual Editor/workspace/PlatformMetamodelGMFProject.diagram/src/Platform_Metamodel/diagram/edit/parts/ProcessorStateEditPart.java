/*
 * 
 */
package Platform_Metamodel.diagram.edit.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ProcessorStateEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ProcessorStateEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new Platform_Metamodel.diagram.edit.policies.ProcessorStateItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
						.getVisualID(childView)) {
				case Platform_Metamodel.diagram.edit.parts.ProcessorStateIdentifierEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						protected List createSelectionHandles() {
							MoveHandle mh = new MoveHandle(
									(GraphicalEditPart) getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ProcessorStateFigure();
	}

	/**
	 * @generated
	 */
	public ProcessorStateFigure getPrimaryShape() {
		return (ProcessorStateFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Platform_Metamodel.diagram.edit.parts.ProcessorStateIsWorkingEditPart) {
			((Platform_Metamodel.diagram.edit.parts.ProcessorStateIsWorkingEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureProcessorStateIsWorkingLabelFigure());
			return true;
		}
		if (childEditPart instanceof Platform_Metamodel.diagram.edit.parts.ProcessorStateFrequencyEditPart) {
			((Platform_Metamodel.diagram.edit.parts.ProcessorStateFrequencyEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureProcessorStateFrequencyLabelFigure());
			return true;
		}
		if (childEditPart instanceof Platform_Metamodel.diagram.edit.parts.ProcessorStatePowerConsumptionEditPart) {
			((Platform_Metamodel.diagram.edit.parts.ProcessorStatePowerConsumptionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureProcessorStatePowerConsumptionLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Platform_Metamodel.diagram.edit.parts.ProcessorStateIsWorkingEditPart) {
			return true;
		}
		if (childEditPart instanceof Platform_Metamodel.diagram.edit.parts.ProcessorStateFrequencyEditPart) {
			return true;
		}
		if (childEditPart instanceof Platform_Metamodel.diagram.edit.parts.ProcessorStatePowerConsumptionEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof Platform_Metamodel.diagram.edit.parts.ProcessorStateIdentifierEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(Platform_Metamodel.diagram.part.Platform_MetamodelVisualIDRegistry
				.getType(Platform_Metamodel.diagram.edit.parts.ProcessorStateIdentifierEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ProcessorStateFigure extends Ellipse {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessorStateIsWorkingLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessorStateFrequencyLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessorStatePowerConsumptionLabelFigure;

		/**
		 * @generated
		 */
		public ProcessorStateFigure() {
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureProcessorStateIsWorkingLabelFigure = new WrappingLabel();

			fFigureProcessorStateIsWorkingLabelFigure.setText("");

			this.add(fFigureProcessorStateIsWorkingLabelFigure);

			fFigureProcessorStateFrequencyLabelFigure = new WrappingLabel();

			fFigureProcessorStateFrequencyLabelFigure.setText("");

			this.add(fFigureProcessorStateFrequencyLabelFigure);

			fFigureProcessorStatePowerConsumptionLabelFigure = new WrappingLabel();

			fFigureProcessorStatePowerConsumptionLabelFigure.setText("");

			this.add(fFigureProcessorStatePowerConsumptionLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessorStateIsWorkingLabelFigure() {
			return fFigureProcessorStateIsWorkingLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessorStateFrequencyLabelFigure() {
			return fFigureProcessorStateFrequencyLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessorStatePowerConsumptionLabelFigure() {
			return fFigureProcessorStatePowerConsumptionLabelFigure;
		}

	}

}
