/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.menu.DefaultMenuColumn;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author Wittakarn
 */
@Getter
@Setter
@ViewScoped
@ManagedBean
public class MegaMenuBean {

    private MenuModel model;

    public MegaMenuBean() {
        model = new DefaultMenuModel();

        DefaultSubMenu voidSubmenu = new DefaultSubMenu("Void Submenu");

//First submenu
        DefaultSubMenu firstSubmenu = new DefaultSubMenu("Dynamic Submenu");

        DefaultMenuColumn column = new DefaultMenuColumn();

        DefaultMenuItem item = new DefaultMenuItem("External");
        item.setUrl("http://www.primefaces.org");
        item.setIcon("ui-icon-home");
        firstSubmenu.addElement(item);

        column.addElement(firstSubmenu);

//Second submenu
        DefaultSubMenu secondSubmenu = new DefaultSubMenu("Dynamic Actions");

        item = new DefaultMenuItem("Save");
        item.setIcon("ui-icon-disk");
        item.setCommand("#{mantClienteMB.save}");
        secondSubmenu.addElement(item);

        item = new DefaultMenuItem("Delete");
        item.setIcon("ui-icon-close");
        item.setCommand("#{menuBean.delete}");
        item.setAjax(false);
        secondSubmenu.addElement(item);

        item = new DefaultMenuItem("Redirect");
        item.setIcon("ui-icon-search");
        item.setCommand("#{menuBean.redirect}");
        secondSubmenu.addElement(item);

        column.addElement(secondSubmenu);

        voidSubmenu.addElement(column);

        model.addElement(voidSubmenu);
    }
}
