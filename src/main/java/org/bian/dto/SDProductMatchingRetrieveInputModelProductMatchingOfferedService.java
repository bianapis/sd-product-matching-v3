package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingRetrieveInputModelProductMatchingOfferedServiceProductMatchingServiceRecord;

import javax.validation.Valid;
  
/**
 * SDProductMatchingRetrieveInputModelProductMatchingOfferedService
 */
public class SDProductMatchingRetrieveInputModelProductMatchingOfferedService   {
  private String productMatchingServiceReference = null;

  private SDProductMatchingRetrieveInputModelProductMatchingOfferedServiceProductMatchingServiceRecord productMatchingServiceRecord = null;


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
   * Get productMatchingServiceRecord
   * @return productMatchingServiceRecord
  **/

  public SDProductMatchingRetrieveInputModelProductMatchingOfferedServiceProductMatchingServiceRecord getProductMatchingServiceRecord() {
    return productMatchingServiceRecord;
  }

  public void setProductMatchingServiceRecord(SDProductMatchingRetrieveInputModelProductMatchingOfferedServiceProductMatchingServiceRecord productMatchingServiceRecord) {
    this.productMatchingServiceRecord = productMatchingServiceRecord;
  }


}

