
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author logan
 */
public class Warehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStocks;
    
    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
        productStocks.put(product, stock);
    }
    
    public int price(String product) {
        if (!productPrices.containsKey(product)) {
            return -99;
        }
        return productPrices.get(product);
    }
    
    public int stock(String product) {
        if (!productStocks.containsKey(product)) {
            return 0;
        }
        return productStocks.get(product);
    }
    
    public boolean take(String product) {
        if (this.stock(product) == 0) {
            return false;
        }
        int currentStock = productStocks.get(product);
        productStocks.replace(product, currentStock - 1);
        return true;
    }
    
    public Set<String> products() {
        return this.productStocks.keySet();
    }
}
