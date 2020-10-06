package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductEligibilityRetrieveInputModelProductEligibilityInstanceReport
 */
public class BQProductEligibilityRetrieveInputModelProductEligibilityInstanceReport   {
  private String productEligibilityInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productEligibilityInstanceReportReference
  **/

  public String getProductEligibilityInstanceReportReference() {
    return productEligibilityInstanceReportReference;
  }

  public void setProductEligibilityInstanceReportReference(String productEligibilityInstanceReportReference) {
    this.productEligibilityInstanceReportReference = productEligibilityInstanceReportReference;
  }


}

