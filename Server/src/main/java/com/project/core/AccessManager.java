package com.project.core;

import com.project.core.interfaces.IAccess;
import com.project.core.interfaces.IAccessManager;
import com.project.core.interfaces.IUser;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thmarcinia
 */
public class AccessManager implements IAccessManager {

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private Map<IUser, IAccess> data;
    @Override
    public Map<IUser, IAccess> getAccesses() {
        return Collections.unmodifiableMap(data);
    }

    //ToDo
    @Override
    public boolean addAccess(IUser user, IAccess access) {
        try {
            //data.put(user, access);
        } catch (UnsupportedOperationException | ClassCastException | NullPointerException | IllegalArgumentException e) {
            Logger.getGlobal().log(Level.SEVERE, e.getCause().toString());
            return false;
        }
    }

    @Override
    public boolean removeAccess(IUser user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
