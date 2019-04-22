/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.core.interfaces;

import java.util.List;

/**
 *
 * @author thmarcinia
 */
public interface IList extends Item {

    /**
     * Initialization List of Items
     *
     * @return the state of the initialization of the List of Items
     */
    public boolean initList();

    /**
     * Clear List of Items
     *
     * @return the state of the clearing of the List of Items
     */
    public boolean clearList();

    /**
     * Get the list of Items
     *
     * @return the list of Items
     */
    public List<Item> getItems();

    /**
     * Get an Item by Index
     *
     * @param index Index of the item
     * @return the Item at specified index
     */
    public Item getItemByIndex(int index);

    //GetByTitle(Containing Title)
    /**
     * Add an Item to the List
     *
     * @param item Item to add
     * @return the state of the adding of item
     */
    public boolean addItem(Item item);

    /**
     * Remove an Item of the List
     *
     * @param item Item to remove
     * @return the state of the deletion of item
     */
    public boolean removeItem(Item item);

    //Remove by Title  
    /**
     * Remove an Item at a specific index of the List
     *
     * @param index Index of the Item to remove
     * @return the state of the initialization of the List of Items
     */
    public boolean removeItemByIndex(int index);
}
