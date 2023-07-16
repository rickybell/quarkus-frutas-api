package dev.rickybell.infrastructure.repository.relational;

import dev.rickybell.infrastructure.entity.relational.Fruta;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Optional;

@ApplicationScoped
public class FrutaRepository implements PanacheRepository<Fruta> {
    public Optional<Fruta> findByIdentity(long id){
        return find("from Fruta fruta where fruta.id = ?1", id).list().stream().findFirst();
    }
}
