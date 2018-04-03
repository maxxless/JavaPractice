package chemicalsupplystore;

import chemicalsupplystore.goods.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Response;

@Path("/chemicals")
public class Json {
    private static Map<Integer, Goods> goodsMap = new HashMap<>();

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public final Goods getGood(final @PathParam("id") Integer id) {
        return goodsMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createGood(final Goods goods) {
        goodsMap.put(goods.getId(), goods);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response replaceGood(final @PathParam("id") Integer id) {
        goodsMap.remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Path("{id}/")
    public final Response deleteGood(final @PathParam("id") Integer id, final Goods goods) {
        goodsMap.replace(id, goods);
        return Response.status(200).entity("Good").build();
    }
}