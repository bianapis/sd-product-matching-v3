package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceReport
 */
public class BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceReport   {
  private String productTypeSelectionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productTypeSelectionInstanceReportReference
  **/

  public String getProductTypeSelectionInstanceReportReference() {
    return productTypeSelectionInstanceReportReference;
  }

  public void setProductTypeSelectionInstanceReportReference(String productTypeSelectionInstanceReportReference) {
    this.productTypeSelectionInstanceReportReference = productTypeSelectionInstanceReportReference;
  }


}

