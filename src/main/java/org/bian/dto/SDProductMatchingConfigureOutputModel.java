package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingConfigureOutputModelProductMatchingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductMatchingConfigureOutputModel
 */
public class SDProductMatchingConfigureOutputModel   {
  private String productMatchingConfigurationActionTaskReference = null;

  private Object productMatchingConfigurationActionTaskRecord = null;

  private SDProductMatchingConfigureOutputModelProductMatchingServiceConfigurationRecord productMatchingServiceConfigurationRecord = null;

  private String productMatchingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return productMatchingConfigurationActionTaskReference
  **/

  public String getProductMatchingConfigurationActionTaskReference() {
    return productMatchingConfigurationActionTaskReference;
  }

  public void setProductMatchingConfigurationActionTaskReference(String productMatchingConfigurationActionTaskReference) {
    this.productMatchingConfigurationActionTaskReference = productMatchingConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return productMatchingConfigurationActionTaskRecord
  **/

  public Object getProductMatchingConfigurationActionTaskRecord() {
    return productMatchingConfigurationActionTaskRecord;
  }

  public void setProductMatchingConfigurationActionTaskRecord(Object productMatchingConfigurationActionTaskRecord) {
    this.productMatchingConfigurationActionTaskRecord = productMatchingConfigurationActionTaskRecord;
  }


  /**
   * Get productMatchingServiceConfigurationRecord
   * @return productMatchingServiceConfigurationRecord
  **/

  public SDProductMatchingConfigureOutputModelProductMatchingServiceConfigurationRecord getProductMatchingServiceConfigurationRecord() {
    return productMatchingServiceConfigurationRecord;
  }

  public void setProductMatchingServiceConfigurationRecord(SDProductMatchingConfigureOutputModelProductMatchingServiceConfigurationRecord productMatchingServiceConfigurationRecord) {
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

