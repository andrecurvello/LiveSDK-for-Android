//------------------------------------------------------------------------------
// Copyright (c) 2012 Microsoft Corporation. All rights reserved.
//
// Description: See the class level JavaDoc comments.
//------------------------------------------------------------------------------

package com.microsoft.live;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/**
 * HttpCopy represents an HTTP COPY operation.
 * HTTP COPY is not a standard HTTP method and this adds it
 * to the HTTP library.
 */
class HttpCopy extends HttpEntityEnclosingRequestBase {

    public static final String METHOD_NAME = "COPY";

    /**
     * Constructs a new HttpCopy with the given uri and initializes its member variables.
     *
     * @param uri of the request
     */
    public HttpCopy(String uri) {
        try {
            this.setURI(new URI(uri));
        } catch (URISyntaxException e) {
            final String message = String.format(ErrorMessages.INVALID_URI, "uri");
            throw new IllegalArgumentException(message);
        }
    }

    /** @return the string "COPY" */
    @Override
    public String getMethod() {
        return METHOD_NAME;
    }
}
