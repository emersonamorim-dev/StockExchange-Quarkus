package org.StockExchange.Repository;

import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import java.util.List;

import org.StockExchange.Model.Stock;

@ApplicationScoped
public class StockRepository implements PanacheRepository<Stock> {

    public Stock findBySymbol(String symbol) {
        return find("symbol", symbol).firstResult();
    }

    public List<Stock> findAllStocks() {
        return listAll();
    }

    public void createStock(Stock stock) {
        persist(stock);
    }

    public void updateStock(Stock stock) {
        if (stock.getId() != null) {
            Stock existingStock = findById(stock.getId());
            if (existingStock != null) {
                existingStock.setSymbol(stock.getSymbol());
                existingStock.setPrice(stock.getPrice());
            }
        }
    }
    

    public void deleteStock(Long id) {
        deleteById(id);
    }
}


