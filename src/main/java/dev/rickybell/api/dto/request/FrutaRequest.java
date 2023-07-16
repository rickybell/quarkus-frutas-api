package dev.rickybell.api.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public class FrutaRequest {

    private @NotEmpty @Valid Long id ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
