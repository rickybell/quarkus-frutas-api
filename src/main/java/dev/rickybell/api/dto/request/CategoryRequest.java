package dev.rickybell.api.dto.request;

import dev.rickybell.infrastructure.entity.relational.Category;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class CategoryRequest {

    private @NotEmpty @Valid List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
