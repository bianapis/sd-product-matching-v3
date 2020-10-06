package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingRetrieveOutputModelProductMatchingOfferedServiceProductMatchingServiceRecordProductMatchingServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDProductMatchingRetrieveOutputModelProductMatchingOfferedServiceProductMatchingServiceRecord
 */
public class SDProductMatchingRetrieveOutputModelProductMatchingOfferedServiceProductMatchingServiceRecord   {
  private String productMatchingServiceType = null;

  private String productMatchingServiceVersion = null;

  private String productMatchingServiceDescription = null;

  private SDProductMatchingRetrieveOutputModelProductMatchingOfferedServiceProductMatchingServiceRecordProductMatchingServicePoliciesandGuidelines productMatchingServicePoliciesandGuidelines = null;

  private String productMatchingServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return productMatchingServiceType
  **/

  public String getProductMatchingServiceType() {
    return productMatchingServiceType;
  }

  public void setProductMatchingServiceType(String productMatchingServiceType) {
    this.productMatchingServiceType = productMatchingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return productMatchingServiceVersion
  **/

  public String getProductMatchingServiceVersion() {
    return productMatchingServiceVersion;
  }

  public void setProductMatchingServiceVersion(String productMatchingServiceVersion) {
    this.productMatchingServiceVersion = productMatchingServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return productMatchingServiceDescription
  **/

  public String getProductMatchingServiceDescription() {
    return productMatchingServiceDescription;
  }

  public void setProductMatchingServiceDescription(String productMatchingServiceDescription) {
    this.productMatchingServiceDescription = productMatchingServiceDescription;
  }


  /**
   * Get productMatchingServicePoliciesandGuidelines
   * @return productMatchingServicePoliciesandGuidelines
  **/

  public SDProductMatchingRetrieveOutputModelProductMatchingOfferedServiceProductMatchingServiceRecordProductMatchingServicePoliciesandGuidelines getProductMatchingServicePoliciesandGuidelines() {
    return productMatchingServicePoliciesandGuidelines;
  }

  public void setProductMatchingServicePoliciesandGuidelines(SDProductMatchingRetrieveOutputModelProductMatchingOfferedServiceProductMatchingServiceRecordProductMatchingServicePoliciesandGuidelines productMatchingServicePoliciesandGuidelines) {
    this.productMatchingServicePoliciesandGuidelines = productMatchingServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return productMatchingServiceSchedule
  **/

  public String getProductMatchingServiceSchedule() {
    return productMatchingServiceSchedule;
  }

  public void setProductMatchingServiceSchedule(String productMatchingServiceSchedule) {
    this.productMatchingServiceSchedule = productMatchingServiceSchedule;
  }


}

