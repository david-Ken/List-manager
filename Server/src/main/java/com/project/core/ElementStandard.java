package com.project.core;

import com.project.core.interfaces.IElement;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author thmarcinia
 */
public class ElementStandard implements IElement {

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private UUID UUID;

    @Override
    public UUID getUUID() {
        return UUID;
    }

    private String title;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        if (!title.equals(getTitle())) {
            this.title = title;
        }
    }

    private String description;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        if (!description.equals(getDescription())) {
            this.description = description;
        }
    }

    private Date createdDate;

    @Override
    public Date getCreatedDate() {
        return createdDate;
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        if (!createdDate.equals(getCreatedDate())) {
            this.createdDate = createdDate;
        }
    }

    private Date modifiedDate;

    @Override
    public Date getModifiedDate() {
        return modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        if (!modifiedDate.equals(getModifiedDate())) {
            this.modifiedDate = modifiedDate;
        }
    }
}
