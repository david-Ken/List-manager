/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.core.interfaces;

import java.beans.PropertyChangeListener;
import java.util.UUID;

/**
 *
 * @author thmarcinia
 */
public interface IUser {

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
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName();

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name);

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail();

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email);

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword();

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password);
}
