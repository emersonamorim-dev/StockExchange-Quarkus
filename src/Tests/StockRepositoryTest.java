package org.StockExchange.Tests;

import com.oracle.svm.core.annotate.Inject;

import Model.Stock;
import Repository.StockRepository;

@QuarkusTest
public class StockRepositoryTest {

    @Inject
    StockRepository stockRepository;

    @Test
    public void testFindBySymbol() {
        Stock stock = stockRepository.findBySymbol("AAPL");
        assertNotNull(stock);
        assertEquals("AAPL", stock.getSymbol());
    }

}
