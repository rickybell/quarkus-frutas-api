package dev.rickybell.api.resource;

import java.util.List;
import java.util.Optional;

import dev.rickybell.api.dto.request.ValidateRequest;
import dev.rickybell.infrastructure.entity.relational.Fruta;
import dev.rickybell.application.service.FrutaService;
import io.smallrye.common.constraint.NotNull;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/frutas")
public class FrutasResource {

    @Inject
    FrutaService frutaService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> list() {
        return Fruta.listAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Fruta create(Fruta fruta){
        fruta.persist();
        return fruta;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    @Path("find/{frutaId}")
    public Response find(
            @PathParam("frutaId") long frutaId,
            @Valid @NotNull ValidateRequest validateRequest
    ){
        Optional<Fruta> optionalFruta = frutaService.getFrutaById(frutaId);

        Fruta fruta = optionalFruta.get();

        return Response.status(Response.Status.OK)
                .entity(frutaService.validatePeriod(fruta, validateRequest.getValidates())).build();
    }
}
