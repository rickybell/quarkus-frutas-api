package dev.rickybell.application.service;

import dev.rickybell.infrastructure.entity.relational.Category;
import dev.rickybell.infrastructure.entity.relational.Fruta;
import dev.rickybell.application.exception.FrutaException;
import dev.rickybell.application.exception.FrutaExceptionCode;
import dev.rickybell.infrastructure.entity.relational.Validate;
import dev.rickybell.infrastructure.repository.relational.FrutaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class FrutaService {

    @Inject
    FrutaRepository frutaRepository;
    public Optional<Fruta> getFrutaById(Long id){
        Optional<Fruta> fruta = frutaRepository.findByIdentity(id);

        if (fruta.isEmpty()){
            throw new FrutaException(FrutaExceptionCode.FRUTA_NOT_FOUND);
        }
        return fruta;
    }

    public int validatePeriod(Fruta fruta, List<Validate> validates){
        System.out.println(validates);
        return 1000;
    }
}
