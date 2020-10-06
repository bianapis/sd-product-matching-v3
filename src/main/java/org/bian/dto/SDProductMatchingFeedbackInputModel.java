package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingFeedbackInputModelProductMatchingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductMatchingFeedbackInputModel
 */
public class SDProductMatchingFeedbackInputModel   {
  private Object productMatchingFeedbackActionTaskRecord = null;

  private SDProductMatchingFeedbackInputModelProductMatchingFeedbackActionRecord productMatchingFeedbackActionRecord = null;


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

  public SDProductMatchingFeedbackInputModelProductMatchingFeedbackActionRecord getProductMatchingFeedbackActionRecord() {
    return productMatchingFeedbackActionRecord;
  }

  public void setProductMatchingFeedbackActionRecord(SDProductMatchingFeedbackInputModelProductMatchingFeedbackActionRecord productMatchingFeedbackActionRecord) {
    this.productMatchingFeedbackActionRecord = productMatchingFeedbackActionRecord;
  }


}

