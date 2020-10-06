package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecord
 */
public class SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecord   {
  private String productMatchingServiceConfigurationSettingReference = null;

  private String productMatchingServiceConfigurationSettingType = null;

  private SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup productMatchingServiceConfigurationSetup = null;


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

  public SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup getProductMatchingServiceConfigurationSetup() {
    return productMatchingServiceConfigurationSetup;
  }

  public void setProductMatchingServiceConfigurationSetup(SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup productMatchingServiceConfigurationSetup) {
    this.productMatchingServiceConfigurationSetup = productMatchingServiceConfigurationSetup;
  }


}

