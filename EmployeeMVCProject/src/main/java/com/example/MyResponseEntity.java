package com.example;

import org.springframework.lang.Nullable;
import org.springframework.http.HttpStatusCode;

public class MyResponseEntity<T> {
    private T body;
    private HttpStatusCode status;

    public MyResponseEntity(@Nullable T body, HttpStatusCode status) {
        this.body = body;
        this.status = status;
    }

    // Getters and Setters
    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public HttpStatusCode getStatus() {
        return status;
    }

    public void setStatus(HttpStatusCode status) {
        this.status = status;
    }
}
