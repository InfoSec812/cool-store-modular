import com.redhat.coolstore.cart.ShoppingCartServiceImpl;
import com.redhat.coolstore.model.ShoppingCart;
import com.redhat.coolstore.product.ProductService;

module com.redhat.coolstore.web {
  exports com.redhat.coolstore.web;
  requires com.redhat.coolstore.shipping;
  requires com.redhat.coolstore.model;
  requires com.redhat.coolstore.promo;
  requires com.redhat.coolstore.product;
  requires com.redhat.coolstore.cart;
  requires vaadin.cdi;
  requires vaadin.sass.compiler;
  requires vaadin.themes;
  requires vaadin.client;
  requires vaadin.compatibility.server;
  requires vaadin.compatibility.shared;
  requires vaadin.server;
  requires vaadin.shared;
  requires java.annotation;
  requires confirmdialog;
  requires viritin;
  uses ShoppingCartServiceImpl;
  uses ProductService;
}