package com.project.core;

import com.project.core.interfaces.IList;
import com.project.core.interfaces.Item;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thmarcinia
 */
public class ListStandard implements IList {

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private List<Item> data;

    @Override
    public boolean initList() {
        //Ghost Method
        return true;
    }

    @Override
    public boolean clearList() {
        try {
            data.clear();
            return data.isEmpty();
        } catch (UnsupportedOperationException e) {
            Logger.getGlobal().log(Level.SEVERE, e.getCause().toString());
            return false;
        }
    }

    //ToDo Exceptions
    @Override
    public List<Item> getItems() {
        return Collections.unmodifiableList(data);
    }

    @Override
    public Item getItemByIndex(int index) {
        try {
            return data.get(index);
        } catch (IndexOutOfBoundsException e) {
            Logger.getGlobal().log(Level.SEVERE, e.getCause().toString());
            return null;
        }
    }

    @Override
    public boolean addItem(Item item) {
        try {
            return data.add(item);
        } catch (UnsupportedOperationException | ClassCastException | NullPointerException | IllegalArgumentException e) {
            Logger.getGlobal().log(Level.SEVERE, e.getCause().toString());
            return false;
        }
    }

    @Override
    public boolean removeItem(Item item) {
        try {
            return data.remove(item);
        } catch (ClassCastException | NullPointerException | UnsupportedOperationException e) {
            Logger.getGlobal().log(Level.SEVERE, e.getCause().toString());
            return false;
        }
    }

    @Override
    public boolean removeItemByIndex(int index) {
        try {
            data.remove(index);
        } catch (IndexOutOfBoundsException e) {
            Logger.getGlobal().log(Level.SEVERE, e.getCause().toString());
            return false;
        }
        return true;
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
