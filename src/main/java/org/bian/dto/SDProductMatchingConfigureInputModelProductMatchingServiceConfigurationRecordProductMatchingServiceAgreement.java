package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceAgreement
 */
public class SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceAgreement   {
  private String productMatchingServiceAgreementReference = null;

  private String productMatchingServiceUserReference = null;

  private String productMatchingServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return productMatchingServiceAgreementReference
  **/

  public String getProductMatchingServiceAgreementReference() {
    return productMatchingServiceAgreementReference;
  }

  public void setProductMatchingServiceAgreementReference(String productMatchingServiceAgreementReference) {
    this.productMatchingServiceAgreementReference = productMatchingServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return productMatchingServiceUserReference
  **/

  public String getProductMatchingServiceUserReference() {
    return productMatchingServiceUserReference;
  }

  public void setProductMatchingServiceUserReference(String productMatchingServiceUserReference) {
    this.productMatchingServiceUserReference = productMatchingServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return productMatchingServiceAgreementTermsandConditions
  **/

  public String getProductMatchingServiceAgreementTermsandConditions() {
    return productMatchingServiceAgreementTermsandConditions;
  }

  public void setProductMatchingServiceAgreementTermsandConditions(String productMatchingServiceAgreementTermsandConditions) {
    this.productMatchingServiceAgreementTermsandConditions = productMatchingServiceAgreementTermsandConditions;
  }


}

