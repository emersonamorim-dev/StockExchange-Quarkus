package org.StockExchange.Service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

import org.StockExchange.Model.Stock;
import org.StockExchange.Repository.StockRepository;

@ApplicationScoped
public class StockService {

    @Inject
    StockRepository stockRepository;

    public Stock getStockBySymbol(String symbol) {
        return stockRepository.findBySymbol(symbol);
    }

    public List<Stock> getAllStocks() {
        return stockRepository.findAllStocks();
    }

    public void addStock(Stock stock) {
        stockRepository.createStock(stock);
    }

    public void modifyStock(Stock stock) {
        stockRepository.updateStock(stock);
    }

    public void removeStock(Long id) {
        stockRepository.deleteStock(id);
    }
}
