package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup
 */
public class SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecordProductMatchingServiceConfigurationSetup   {
  private String productMatchingServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return productMatchingServiceConfigurationParameter
  **/

  public String getProductMatchingServiceConfigurationParameter() {
    return productMatchingServiceConfigurationParameter;
  }

  public void setProductMatchingServiceConfigurationParameter(String productMatchingServiceConfigurationParameter) {
    this.productMatchingServiceConfigurationParameter = productMatchingServiceConfigurationParameter;
  }


}

