package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingFeedbackOutputModelProductMatchingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductMatchingFeedbackOutputModel
 */
public class SDProductMatchingFeedbackOutputModel   {
  private String productMatchingFeedbackActionTaskReference = null;

  private Object productMatchingFeedbackActionTaskRecord = null;

  private SDProductMatchingFeedbackOutputModelProductMatchingFeedbackActionRecord productMatchingFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return productMatchingFeedbackActionTaskReference
  **/

  public String getProductMatchingFeedbackActionTaskReference() {
    return productMatchingFeedbackActionTaskReference;
  }

  public void setProductMatchingFeedbackActionTaskReference(String productMatchingFeedbackActionTaskReference) {
    this.productMatchingFeedbackActionTaskReference = productMatchingFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return productMatchingFeedbackActionTaskRecord
  **/

  public Object getProductMatchingFeedbackActionTaskRecord() {
    return productMatchingFeedbackActionTaskRecord;
  }

  public void setProductMatchingFeedbackActionTaskRecord(Object productMatchingFeedbackActionTaskRecord) {
    this.productMatchingFeedbackActionTaskRecord = productMatchingFeedbackActionTaskRecord;
  }


  /**
   * Get productMatchingFeedbackActionRecord
   * @return productMatchingFeedbackActionRecord
  **/

  public SDProductMatchingFeedbackOutputModelProductMatchingFeedbackActionRecord getProductMatchingFeedbackActionRecord() {
    return productMatchingFeedbackActionRecord;
  }

  public void setProductMatchingFeedbackActionRecord(SDProductMatchingFeedbackOutputModelProductMatchingFeedbackActionRecord productMatchingFeedbackActionRecord) {
    this.productMatchingFeedbackActionRecord = productMatchingFeedbackActionRecord;
  }


}

