import com.redhat.coolstore.product.ProductService;

module com.redhat.coolstore.product {
  exports com.redhat.coolstore.product;
  requires cdi.api;
  requires beta.jboss.ejb.api_3_2;
  requires com.redhat.coolstore.model;
  provides ProductService with ProductService;
}