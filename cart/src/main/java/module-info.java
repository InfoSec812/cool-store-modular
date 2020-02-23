import com.redhat.coolstore.cart.ShoppingCartService;
import com.redhat.coolstore.cart.ShoppingCartServiceImpl;

module com.redhat.coolstore.cart {
  requires cdi;
  requires beta.jboss.ejb.api_3_2;
  exports com.redhat.coolstore.cart;
  requires com.redhat.coolstore.model;
  requires com.redhat.coolstore.product;
  requires com.redhat.coolstore.promo;
  requires com.redhat.coolstore.shipping;
  requires jakarta.inject.api;
  requires jakarta.enterprise.cdi.api;
  provides ShoppingCartService with ShoppingCartServiceImpl;
}