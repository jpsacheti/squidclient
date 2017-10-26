package br.edu.fema.squidclient.service;

import br.edu.fema.squidclient.model.AuthUser;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

public class AuthUserSquidService {
    private final String LINK_RAIZ;

    public AuthUserSquidService(String servidor) {
        LINK_RAIZ = servidor;
    }

    public boolean novoUsuario(AuthUser authUser) {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/user/new").request().accept(MediaType.APPLICATION_JSON);
        Entity<AuthUser> entity = Entity.entity(authUser, MediaType.APPLICATION_JSON);
        Response response = request.buildPost(entity).invoke();
        return response.getStatusInfo() == Response.Status.OK;
    }

    public boolean excluir(Integer codigo) {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/user/remove/" + codigo.toString()).request();
        return request.buildPost(Entity.text("")).invoke().getStatusInfo() == Response.Status.OK;
    }

    public List<AuthUser> listar() {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/user/list").request();
        return Arrays.asList(request.buildGet().invoke().readEntity(AuthUser[].class));
    }

    public void flush() {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/user/flush").request();
        request.buildDelete().invoke();
    }
}
