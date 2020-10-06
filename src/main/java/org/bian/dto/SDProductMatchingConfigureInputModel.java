package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductMatchingConfigureInputModel
 */
public class SDProductMatchingConfigureInputModel   {
  private Object productMatchingConfigurationActionTaskRecord = null;

  private String productMatchingServicingSessionReference = null;

  private String productMatchingServiceReference = null;

  private SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecord productMatchingServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return productMatchingServiceReference
  **/

  public String getProductMatchingServiceReference() {
    return productMatchingServiceReference;
  }

  public void setProductMatchingServiceReference(String productMatchingServiceReference) {
    this.productMatchingServiceReference = productMatchingServiceReference;
  }


  /**
   * Get productMatchingServiceConfigurationRecord
   * @return productMatchingServiceConfigurationRecord
  **/

  public SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecord getProductMatchingServiceConfigurationRecord() {
    return productMatchingServiceConfigurationRecord;
  }

  public void setProductMatchingServiceConfigurationRecord(SDProductMatchingConfigureInputModelProductMatchingServiceConfigurationRecord productMatchingServiceConfigurationRecord) {
    this.productMatchingServiceConfigurationRecord = productMatchingServiceConfigurationRecord;
  }


}

