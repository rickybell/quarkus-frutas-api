package dev.rickybell.infrastructure.entity.relational;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Category extends PanacheEntity {
    private String name;

    private int period;

    @ManyToOne
    private Fruta fruta;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int type) {
        this.period = type;
    }
}
