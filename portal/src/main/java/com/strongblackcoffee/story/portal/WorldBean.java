package com.strongblackcoffee.story.portal;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 */
@ApplicationScoped
@Named
public class WorldBean implements Serializable {
    
    static final long serialVersionUID = 42L;

    public String getWorld() {
        return "Universe";
    }
    
    public void setWorld(String world) {
    }
}
