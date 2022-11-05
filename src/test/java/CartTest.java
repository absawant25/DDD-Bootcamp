import com.ddd.bootcamp.domain.Cart;
import com.ddd.bootcamp.domain.Product;
import java.util.Map;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

  @Test
  void shouldAddProductToCart() {
    Cart cart = new Cart();
    Product product = new Product("Some test product");
    cart.add(product);

    Map<Product, Long>  actual = cart.getProducts();

    assertEquals(1, actual.size());
    assertEquals("Some test product", actual.entrySet());

  }

}
