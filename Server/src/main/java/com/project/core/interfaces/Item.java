/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.core.interfaces;

import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author thmarcinia
 */
public interface Item {

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
     * Get the value of ID
     *
     * @return the value of ID
     */
    public UUID getUUID();

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle();

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title);

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription();

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description);

    /**
     * Get the value of createdDate
     *
     * @return the value of createdDate
     */
    public Date getCreatedDate();

    /**
     * Set the value of createdDate
     *
     * @param createdDate new value of createdDate
     */
    public void setCreatedDate(Date createdDate);

    /**
     * Get the value of modifiedDate
     *
     * @return the value of modifiedDate
     */
    public Date getModifiedDate();

    /**
     * Set the value of modifiedDate
     *
     * @param modifiedDate new value of modifiedDate
     */
    public void setModifiedDate(Date modifiedDate);

}
