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
 * SDProductMatchingConfigureOutputModelProductMatchingServiceConfigurationRecord
 */
public class SDProductMatchingConfigureOutputModelProductMatchingServiceConfigurationRecord   {
  private String productMatchingServiceConfigurationSettingDescription = null;

  private SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup productMatchingServiceConfigurationSetup = null;

  private SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceSubscription productMatchingServiceSubscription = null;

  private SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceAgreement productMatchingServiceAgreement = null;

  private String productMatchingServiceStatus = null;


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

