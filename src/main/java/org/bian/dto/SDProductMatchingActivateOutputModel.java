package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductMatchingActivateOutputModel
 */
public class SDProductMatchingActivateOutputModel   {
  private String productMatchingActivationActionTaskReference = null;

  private Object productMatchingActivationActionTaskRecord = null;

  private String productMatchingServicingSessionReference = null;

  private Object productMatchingServicingSessionRecord = null;

  private SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecord productMatchingServiceConfigurationRecord = null;

  private String productMatchingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return productMatchingActivationActionTaskReference
  **/

  public String getProductMatchingActivationActionTaskReference() {
    return productMatchingActivationActionTaskReference;
  }

  public void setProductMatchingActivationActionTaskReference(String productMatchingActivationActionTaskReference) {
    this.productMatchingActivationActionTaskReference = productMatchingActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return productMatchingActivationActionTaskRecord
  **/

  public Object getProductMatchingActivationActionTaskRecord() {
    return productMatchingActivationActionTaskRecord;
  }

  public void setProductMatchingActivationActionTaskRecord(Object productMatchingActivationActionTaskRecord) {
    this.productMatchingActivationActionTaskRecord = productMatchingActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productMatchingServicingSessionReference
  **/

  public String getProductMatchingServicingSessionReference() {
    return productMatchingServicingSessionReference;
  }

  public void setProductMatchingServicingSessionReference(String productMatchingServicingSessionReference) {
    this.productMatchingServicingSessionReference = productMatchingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return productMatchingServicingSessionRecord
  **/

  public Object getProductMatchingServicingSessionRecord() {
    return productMatchingServicingSessionRecord;
  }

  public void setProductMatchingServicingSessionRecord(Object productMatchingServicingSessionRecord) {
    this.productMatchingServicingSessionRecord = productMatchingServicingSessionRecord;
  }


  /**
   * Get productMatchingServiceConfigurationRecord
   * @return productMatchingServiceConfigurationRecord
  **/

  public SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecord getProductMatchingServiceConfigurationRecord() {
    return productMatchingServiceConfigurationRecord;
  }

  public void setProductMatchingServiceConfigurationRecord(SDProductMatchingActivateOutputModelProductMatchingServiceConfigurationRecord productMatchingServiceConfigurationRecord) {
    this.productMatchingServiceConfigurationRecord = productMatchingServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return productMatchingServicingSessionStatus
  **/

  public String getProductMatchingServicingSessionStatus() {
    return productMatchingServicingSessionStatus;
  }

  public void setProductMatchingServicingSessionStatus(String productMatchingServicingSessionStatus) {
    this.productMatchingServicingSessionStatus = productMatchingServicingSessionStatus;
  }


}

