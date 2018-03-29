package chemicalsupplystore;

import chemicalsupplystore.goods.AirFresheners;
import chemicalsupplystore.goods.Cleaners;
import chemicalsupplystore.goods.Goods;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/chemicals")
public class JSON {
    private Map<Integer, Goods> goodsMap;

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public final Goods getGood(final @PathParam("id") Integer id) {
        goodsMap = new HashMap<>();
        goodsMap.put(1, new AirFresheners("afa", 5.0, 5, "faa", 5.1));
        goodsMap.put(2, new Cleaners("afa", 5.0, 5));
        return goodsMap.get(id);
    }

    @PUT
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public final void createGood(final @PathParam("id") Integer id, final Goods goods) {
        goodsMap.put(id, goods);
    }

    @POST
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public final void replaceGood(final @PathParam("id") Integer id, final Goods goods) {
        goodsMap.replace(id, goods);
    }

    @DELETE
    @Path("{id}/")
    public final void deleteGood(final @PathParam("id") Integer position) {
        goodsMap.remove(position);
    }
}