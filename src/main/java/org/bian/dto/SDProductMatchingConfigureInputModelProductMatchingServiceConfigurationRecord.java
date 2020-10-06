package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceAgreement;
import org.bian.dto.SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup;
import org.bian.dto.SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecord
 */
public class SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecord   {
  private String productMatchingServiceConfigurationSettingReference = null;

  private String productMatchingServiceConfigurationSettingType = null;

  private SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup productMatchingServiceConfigurationSetup = null;

  private SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceSubscription productMatchingServiceSubscription = null;

  private SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceAgreement productMatchingServiceAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return productMatchingServiceConfigurationSettingReference
  **/

  public String getProductMatchingServiceConfigurationSettingReference() {
    return productMatchingServiceConfigurationSettingReference;
  }

  public void setProductMatchingServiceConfigurationSettingReference(String productMatchingServiceConfigurationSettingReference) {
    this.productMatchingServiceConfigurationSettingReference = productMatchingServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return productMatchingServiceConfigurationSettingType
  **/

  public String getProductMatchingServiceConfigurationSettingType() {
    return productMatchingServiceConfigurationSettingType;
  }

  public void setProductMatchingServiceConfigurationSettingType(String productMatchingServiceConfigurationSettingType) {
    this.productMatchingServiceConfigurationSettingType = productMatchingServiceConfigurationSettingType;
  }


  /**
   * Get productMatchingServiceConfigurationSetup
   * @return productMatchingServiceConfigurationSetup
  **/

  public SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup getProductMatchingServiceConfigurationSetup() {
    return productMatchingServiceConfigurationSetup;
  }

  public void setProductMatchingServiceConfigurationSetup(SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup productMatchingServiceConfigurationSetup) {
    this.productMatchingServiceConfigurationSetup = productMatchingServiceConfigurationSetup;
  }


  /**
   * Get productMatchingServiceSubscription
   * @return productMatchingServiceSubscription
  **/

  public SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceSubscription getProductMatchingServiceSubscription() {
    return productMatchingServiceSubscription;
  }

  public void setProductMatchingServiceSubscription(SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceSubscription productMatchingServiceSubscription) {
    this.productMatchingServiceSubscription = productMatchingServiceSubscription;
  }


  /**
   * Get productMatchingServiceAgreement
   * @return productMatchingServiceAgreement
  **/

  public SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceAgreement getProductMatchingServiceAgreement() {
    return productMatchingServiceAgreement;
  }

  public void setProductMatchingServiceAgreement(SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceAgreement productMatchingServiceAgreement) {
    this.productMatchingServiceAgreement = productMatchingServiceAgreement;
  }


}

