/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.util.List;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import models.Equipo;
 
/**
 * Jersey REST client generated for REST resource:EquiposResource [equipos]<br>
 * USAGE:
 * <pre>
 *        ClienteEquipos client = new ClienteEquipos();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author alsorc
 */
public class ClienteEquipos {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://35.222.188.8:8080/ApiRestMyKepp-1.0/webresources/";

    public ClienteEquipos() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("equipos");
    }

    public List<Equipo>   getAll() throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(new GenericType<List<Equipo>>(){});
    }

    public String deleteOne(Object requestEntity, int id) throws ClientErrorException {
        return webTarget.path(java.text.MessageFormat.format("{0}", new Object[]{id})).request().delete(String.class);
    }

    public <T> T getOneByID(Class<T> responseType, String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public String update(Object requestEntity) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), String.class);
    }

    public String insert(Object requestEntity) throws ClientErrorException {
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), String.class);
    }

    public void close() {
        client.close();
    }
    
}
