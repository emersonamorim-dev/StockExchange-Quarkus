package org.StockExchange.Controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import org.StockExchange.Model.Stock;
import org.StockExchange.Service.StockService;

import com.azure.core.annotation.PathParam;

@Path("/stocks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StockController {

    @Inject
    StockService stockService;

    @GET
    @Path("/{symbol}")
    public Stock getStock(@PathParam("symbol") String symbol) {
        return stockService.getStockBySymbol(symbol);
    }

    @GET
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    @POST
    public void addStock(Stock stock) {
        stockService.addStock(stock);
    }

    @PUT
    public void modifyStock(Stock stock) {
        stockService.modifyStock(stock);
    }

    @DELETE
    @Path("/{id}")
    public void removeStock(@PathParam("id") Long id) {
        stockService.removeStock(id);
    }
}
