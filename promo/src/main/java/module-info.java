import com.redhat.coolstore.promo.PromoService;

module com.redhat.coolstore.promo {
  exports com.redhat.coolstore.promo;
  requires cdi;
  requires beta.jboss.ejb.api_3_2;
  requires com.redhat.coolstore.model;
  provides PromoService with PromoService;
}