package dev.rickybell.api.dto.request;

import dev.rickybell.infrastructure.entity.relational.Category;
import dev.rickybell.infrastructure.entity.relational.Validate;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class ValidateRequest {

    private @NotEmpty @Valid List<Validate> validates;

    public List<Validate> getValidates() {
        return validates;
    }

    public void setValidates(List<Validate> validates) {
        this.validates = validates;
    }
}
