package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecordProductMatchingServiceSubscription
 */
public class SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecordProductMatchingServiceSubscription   {
  private String productMatchingServiceSubscriberReference = null;

  private String productMatchingServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return productMatchingServiceSubscriberReference
  **/

  public String getProductMatchingServiceSubscriberReference() {
    return productMatchingServiceSubscriberReference;
  }

  public void setProductMatchingServiceSubscriberReference(String productMatchingServiceSubscriberReference) {
    this.productMatchingServiceSubscriberReference = productMatchingServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return productMatchingServiceSubscriberAccessProfile
  **/

  public String getProductMatchingServiceSubscriberAccessProfile() {
    return productMatchingServiceSubscriberAccessProfile;
  }

  public void setProductMatchingServiceSubscriberAccessProfile(String productMatchingServiceSubscriberAccessProfile) {
    this.productMatchingServiceSubscriberAccessProfile = productMatchingServiceSubscriberAccessProfile;
  }


}

