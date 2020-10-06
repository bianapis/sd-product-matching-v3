package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup;
import org.bian.dto.SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecordProductMatchingServiceAgreement;
import org.bian.dto.SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecordProductMatchingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecord
 */
public class SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecord   {
  private String productMatchingServiceConfigurationSettingReference = null;

  private String productMatchingServiceConfigurationSettingDescription = null;

  private SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup productMatchingServiceConfigurationSetup = null;

  private SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecordProductMatchingServiceSubscription productMatchingServiceSubscription = null;

  private SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecordProductMatchingServiceAgreement productMatchingServiceAgreement = null;

  private String productMatchingServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return productMatchingServiceConfigurationSettingDescription
  **/

  public String getProductMatchingServiceConfigurationSettingDescription() {
    return productMatchingServiceConfigurationSettingDescription;
  }

  public void setProductMatchingServiceConfigurationSettingDescription(String productMatchingServiceConfigurationSettingDescription) {
    this.productMatchingServiceConfigurationSettingDescription = productMatchingServiceConfigurationSettingDescription;
  }


  /**
   * Get productMatchingServiceConfigurationSetup
   * @return productMatchingServiceConfigurationSetup
  **/

  public SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup getProductMatchingServiceConfigurationSetup() {
    return productMatchingServiceConfigurationSetup;
  }

  public void setProductMatchingServiceConfigurationSetup(SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup productMatchingServiceConfigurationSetup) {
    this.productMatchingServiceConfigurationSetup = productMatchingServiceConfigurationSetup;
  }


  /**
   * Get productMatchingServiceSubscription
   * @return productMatchingServiceSubscription
  **/

  public SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecordProductMatchingServiceSubscription getProductMatchingServiceSubscription() {
    return productMatchingServiceSubscription;
  }

  public void setProductMatchingServiceSubscription(SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecordProductMatchingServiceSubscription productMatchingServiceSubscription) {
    this.productMatchingServiceSubscription = productMatchingServiceSubscription;
  }


  /**
   * Get productMatchingServiceAgreement
   * @return productMatchingServiceAgreement
  **/

  public SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecordProductMatchingServiceAgreement getProductMatchingServiceAgreement() {
    return productMatchingServiceAgreement;
  }

  public void setProductMatchingServiceAgreement(SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecordProductMatchingServiceAgreement productMatchingServiceAgreement) {
    this.productMatchingServiceAgreement = productMatchingServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return productMatchingServiceStatus
  **/

  public String getProductMatchingServiceStatus() {
    return productMatchingServiceStatus;
  }

  public void setProductMatchingServiceStatus(String productMatchingServiceStatus) {
    this.productMatchingServiceStatus = productMatchingServiceStatus;
  }


}

