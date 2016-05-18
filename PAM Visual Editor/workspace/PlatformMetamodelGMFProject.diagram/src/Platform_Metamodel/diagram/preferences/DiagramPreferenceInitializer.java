/*
 * 
 */
package Platform_Metamodel.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		Platform_Metamodel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		Platform_Metamodel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		Platform_Metamodel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		Platform_Metamodel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		Platform_Metamodel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Platform_Metamodel.diagram.part.Platform_MetamodelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
