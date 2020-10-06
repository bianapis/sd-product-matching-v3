package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductMatchingActivateInputModel
 */
public class SDProductMatchingActivateInputModel   {
  private Object productMatchingActivationActionTaskRecord = null;

  private String productMatchingCenterReference = null;

  private String productMatchingServiceReference = null;

  private SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecord productMatchingServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return productMatchingCenterReference
  **/

  public String getProductMatchingCenterReference() {
    return productMatchingCenterReference;
  }

  public void setProductMatchingCenterReference(String productMatchingCenterReference) {
    this.productMatchingCenterReference = productMatchingCenterReference;
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

  public SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecord getProductMatchingServiceConfigurationRecord() {
    return productMatchingServiceConfigurationRecord;
  }

  public void setProductMatchingServiceConfigurationRecord(SDProductMatchingActivateInputModelProductMatchingServiceConfigurationRecord productMatchingServiceConfigurationRecord) {
    this.productMatchingServiceConfigurationRecord = productMatchingServiceConfigurationRecord;
  }


}

