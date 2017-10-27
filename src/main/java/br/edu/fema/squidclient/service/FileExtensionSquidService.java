package br.edu.fema.squidclient.service;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

public class FileExtensionSquidService {

    private final String LINK_RAIZ;

    public FileExtensionSquidService(String servidor) {
        LINK_RAIZ = servidor;
    }


    public boolean extensao(String extensao) {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/ext/add").request().accept(MediaType.APPLICATION_JSON);
        Entity<String> entity = Entity.entity(extensao, MediaType.TEXT_PLAIN);
        Response response = request.buildPost(entity).invoke();
        return response.getStatusInfo() == Response.Status.OK;
    }

    public boolean excluir(String extensao) {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/ext/remove/").request();
        return request.buildPost(Entity.text(extensao)).invoke().getStatusInfo() == Response.Status.OK;
    }

    public List<String> listar() {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/ext/list").request();
        return Arrays.asList(request.buildGet().invoke().readEntity(String[].class));
    }

    public void flush() {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/ext/flush").request();
        request.buildDelete().invoke();
    }
}
