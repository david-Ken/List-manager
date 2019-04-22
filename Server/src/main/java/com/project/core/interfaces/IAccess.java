package com.project.core.interfaces;

import java.beans.PropertyChangeListener;
import java.util.UUID;

/**
 *
 * @author thmarcinia
 */
public interface IAccess {

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

    /**
     * Get the create access
     *
     * @return the create access
     */
    public UUID getUUID();

    /**
     * Get the create access
     *
     * @return the create access
     */
    public boolean getCreateAccess();

    /**
     * Set the create access
     *
     * @param value
     * @return the create access
     */
    public boolean setCreateAccess(boolean value);

    /**
     * Get the read access
     *
     * @return the read access
     */
    public boolean getReadAccess();

    /**
     * Set the read access
     *
     * @param value
     * @return the read access
     */
    public boolean setReadAccess(boolean value);

    /**
     * Get the update access
     *
     * @return the update access
     */
    public boolean getUpdateAccess();

    /**
     * Set the update access
     *
     * @param value
     * @return the update access
     */
    public boolean setUpdateAccess(boolean value);

    /**
     * Get the delete access
     *
     * @return the delete access
     */
    public boolean getDeleteAccess();

    /**
     * Set the delete access
     *
     * @param value
     * @return the delete access
     */
    public boolean setDeleteAccess(boolean value);

}
