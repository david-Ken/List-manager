package com.project.core.interfaces;

import java.beans.PropertyChangeListener;

/**
 *
 * @author thmarcinia
 */
public interface IDataManager {

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener);

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener);

}
