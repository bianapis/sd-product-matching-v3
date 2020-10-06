package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductMatchingRetrieveOutputModelProductMatchingOfferedServiceProductMatchingServiceRecordProductMatchingServicePoliciesandGuidelines
 */
public class SDProductMatchingRetrieveOutputModelProductMatchingOfferedServiceProductMatchingServiceRecordProductMatchingServicePoliciesandGuidelines   {
  private String productMatchingServiceEligibility = null;

  private String productMatchingServiceIntendedUses = null;

  private String productMatchingServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return productMatchingServiceEligibility
  **/

  public String getProductMatchingServiceEligibility() {
    return productMatchingServiceEligibility;
  }

  public void setProductMatchingServiceEligibility(String productMatchingServiceEligibility) {
    this.productMatchingServiceEligibility = productMatchingServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return productMatchingServiceIntendedUses
  **/

  public String getProductMatchingServiceIntendedUses() {
    return productMatchingServiceIntendedUses;
  }

  public void setProductMatchingServiceIntendedUses(String productMatchingServiceIntendedUses) {
    this.productMatchingServiceIntendedUses = productMatchingServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return productMatchingServicePricingandTerms
  **/

  public String getProductMatchingServicePricingandTerms() {
    return productMatchingServicePricingandTerms;
  }

  public void setProductMatchingServicePricingandTerms(String productMatchingServicePricingandTerms) {
    this.productMatchingServicePricingandTerms = productMatchingServicePricingandTerms;
  }


}

