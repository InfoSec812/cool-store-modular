import com.redhat.coolstore.shipping.ShippingService;

module com.redhat.coolstore.shipping {
  exports com.redhat.coolstore.shipping;
  requires cdi;
  requires beta.jboss.ejb.api_3_2;
  requires com.redhat.coolstore.model;
  provides ShippingService with ShippingService;
}