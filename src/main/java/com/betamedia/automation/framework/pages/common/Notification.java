package com.betamedia.automation.framework.pages.common;

/**
 * Created by mbelyaev on 2/17/17.
 */
public interface Notification extends Location{
    default void waitFor(){
        while (!isAt()) ;
    }

}
