package com.project.core.interfaces;

import java.beans.PropertyChangeListener;
import java.util.Map;

/**
 *
 * @author thmarcinia
 */
public interface IAccessManager {

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
     * Get the map of Accesses
     *
     * @return the Item at specified index
     */
    public Map<IUser, IAccess> getAccesses();

    /**
     * Add an Access
     *
     * @param user
     * @param access
     * @return the Item at specified index
     */
    public boolean addAccess(IUser user, IAccess access);

    //Update Access
    /**
     * Remove an Access for a specific User
     *
     * @param user
     * @return the Item at specified index
     */
    public boolean removeAccess(IUser user);
}
