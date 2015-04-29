package org.controlsfx.control;

import impl.org.controlsfx.tools.PrefixSelectionCustomizer;
import javafx.scene.control.ComboBox;

/**
 * A simple extension of the {@link ComboBox} which selects an entry of
 * its item list based on keyboard input. The user can  type letters or 
 * digits on the keyboard and die ChoiceBox will attempt to
 * select the first item it can find with a matching prefix.
 * 
 * This will only be enabled, when the {@link ComboBox} is not editable, so
 * this class will be setup as noneditable by default.
 *
 * This feature has been available on the Windows ComboBox control, so many
 * users have asked for it. There is a feature request to include this feature
 * into JavaFX directly. The class is published as part of ContorlsFX to
 * allow testing and feedback.
 * 
 * See: https://javafx-jira.kenai.com/browse/RT-18064
 * 
 * If you want to modify an existing {@link ComboBox} you can use the
 * {@link PrefixSelectionCustomizer} directly to do this.
 */
public class PrefixSelectionComboBox<T> extends ComboBox<T> {

    public PrefixSelectionComboBox() {
        setEditable(false);
        PrefixSelectionCustomizer.customize(this);
    }
    
}
