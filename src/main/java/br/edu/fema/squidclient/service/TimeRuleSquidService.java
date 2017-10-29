package br.edu.fema.squidclient.service;

import br.edu.fema.squidclient.model.TimeRule;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

public class TimeRuleSquidService {
    private final String LINK_RAIZ;

    public TimeRuleSquidService(String LINK_RAIZ) {
        this.LINK_RAIZ = LINK_RAIZ;
    }

    public boolean novaRegra(TimeRule rule) {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/time/add").request();
        Entity<TimeRule> entity = Entity.entity(rule, MediaType.APPLICATION_JSON);
        Response response = request.buildPost(entity).invoke();
        return response.getStatusInfo() == Response.Status.OK;
    }

    public boolean excluir(String nome) {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/time/remove/" + nome).request();
        return request.buildPost(Entity.text("")).invoke().getStatusInfo() == Response.Status.OK;
    }

    public List<TimeRule> listar() {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/time/list").request();
        return Arrays.asList(request.buildGet().invoke().readEntity(TimeRule[].class));
    }

    public void flush() {
        Invocation.Builder request = ClientBuilder.newClient().target(LINK_RAIZ + "/time/flush").request();
        request.buildDelete().invoke();
    }

}
