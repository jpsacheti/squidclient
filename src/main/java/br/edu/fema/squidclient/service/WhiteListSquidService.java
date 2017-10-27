package br.edu.fema.squidclient.service;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

public class WhiteListSquidService {
    private final String LINK_RAIZ;

    private WhiteListSquidService(String url) {
        this.LINK_RAIZ = url;
    }

    public boolean addIp(String ip) {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/ip/whitelist/add").request();
        Entity<String> entity = Entity.entity(ip, MediaType.TEXT_PLAIN);
        Response response = request.buildPost(entity).invoke();
        return response.getStatusInfo() == Response.Status.OK;
    }

    public boolean removeIp(String ip) {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/ip/whitelist/remove").request();
        return request.buildPost(Entity.text(ip)).invoke().getStatusInfo() == Response.Status.OK;
    }

    public void flushIp() {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/ip/whitelist/flush").request();
        request.buildDelete().invoke();
    }

    public List<String> listIp() {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/ip/whitelist/list").request();
        return Arrays.asList(request.buildGet().invoke().readEntity(String[].class));
    }

    public boolean addUrl(String url) {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/url/whitelist/add").request();
        Entity<String> entity = Entity.entity(url, MediaType.TEXT_PLAIN);
        Response response = request.buildPost(entity).invoke();
        return response.getStatusInfo() == Response.Status.OK;
    }

    public boolean removeUrl(String url) {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/url/whitelist/remove").request();
        return request.buildPost(Entity.text(url)).invoke().getStatusInfo() == Response.Status.OK;
    }

    public void flushUrl() {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/url/whitelist/flush").request();
        request.buildDelete().invoke();
    }

    public List<String> listUrl() {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/url/whitelist/list").request();
        return Arrays.asList(request.buildGet().invoke().readEntity(String[].class));
    }
}
