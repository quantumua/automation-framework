package com.betamedia.automation.framework.pages.tp.login;

import com.betamedia.automation.framework.pages.common.PageOperation;

/**
 * @author Maksym Tsybulskyy
 *         Date: 2/15/17.
 */
public interface LoginPage extends PageOperation{
    void login(String username, String password);
}
