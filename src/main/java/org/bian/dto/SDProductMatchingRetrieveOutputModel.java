package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingRetrieveOutputModelProductMatchingOfferedService;
import org.bian.dto.SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductMatchingRetrieveOutputModel
 */
public class SDProductMatchingRetrieveOutputModel   {
  private String productMatchingRetrieveActionTaskReference = null;

  private Object productMatchingRetrieveActionTaskRecord = null;

  private String productMatchingRetrieveActionResponse = null;

  private SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecord productMatchingRetrieveActionRecord = null;

  private SDProductMatchingRetrieveOutputModelProductMatchingOfferedService productMatchingOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return productMatchingRetrieveActionTaskReference
  **/

  public String getProductMatchingRetrieveActionTaskReference() {
    return productMatchingRetrieveActionTaskReference;
  }

  public void setProductMatchingRetrieveActionTaskReference(String productMatchingRetrieveActionTaskReference) {
    this.productMatchingRetrieveActionTaskReference = productMatchingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productMatchingRetrieveActionTaskRecord
  **/

  public Object getProductMatchingRetrieveActionTaskRecord() {
    return productMatchingRetrieveActionTaskRecord;
  }

  public void setProductMatchingRetrieveActionTaskRecord(Object productMatchingRetrieveActionTaskRecord) {
    this.productMatchingRetrieveActionTaskRecord = productMatchingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productMatchingRetrieveActionResponse
  **/

  public String getProductMatchingRetrieveActionResponse() {
    return productMatchingRetrieveActionResponse;
  }

  public void setProductMatchingRetrieveActionResponse(String productMatchingRetrieveActionResponse) {
    this.productMatchingRetrieveActionResponse = productMatchingRetrieveActionResponse;
  }


  /**
   * Get productMatchingRetrieveActionRecord
   * @return productMatchingRetrieveActionRecord
  **/

  public SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecord getProductMatchingRetrieveActionRecord() {
    return productMatchingRetrieveActionRecord;
  }

  public void setProductMatchingRetrieveActionRecord(SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecord productMatchingRetrieveActionRecord) {
    this.productMatchingRetrieveActionRecord = productMatchingRetrieveActionRecord;
  }


  /**
   * Get productMatchingOfferedService
   * @return productMatchingOfferedService
  **/

  public SDProductMatchingRetrieveOutputModelProductMatchingOfferedService getProductMatchingOfferedService() {
    return productMatchingOfferedService;
  }

  public void setProductMatchingOfferedService(SDProductMatchingRetrieveOutputModelProductMatchingOfferedService productMatchingOfferedService) {
    this.productMatchingOfferedService = productMatchingOfferedService;
  }


}

