package br.edu.fema.squidclient.service;

import br.edu.fema.squidclient.model.CacheSize;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class CacheSizeSquidService {

    private final String LINK_RAIZ;

    public CacheSizeSquidService(String servidor) {
        LINK_RAIZ = servidor;
    }

    public CacheSize status() {
        Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/cache/status").request();
        return request.buildGet().invoke().readEntity(CacheSize.class);
    }

    public boolean criar(CacheSize cacheSize) {
        Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/cache/criar").request();
        Entity<CacheSize> entity = Entity.entity(cacheSize, MediaType.APPLICATION_JSON);
        Response response = request.buildPost(entity).invoke();
        return response.getStatusInfo() == Status.ACCEPTED;
    }

    public boolean reset() {
        Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/cache/reset").request();
        return request.buildPost(Entity.text("")).invoke().getStatusInfo() == Status.OK;
    }

}
