package com.interface21.webmvc.servlet.mvc.tobe;

import jakarta.servlet.http.HttpServletRequest;

public interface HandlerMapping {
    void initialize();

    HandlerAdaptor getHandler(final HttpServletRequest request);
}
