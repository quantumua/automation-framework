package com.betamedia.automation.framework.pages.common;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public interface PageOperation<T> extends Location {
    T goTo();
}
