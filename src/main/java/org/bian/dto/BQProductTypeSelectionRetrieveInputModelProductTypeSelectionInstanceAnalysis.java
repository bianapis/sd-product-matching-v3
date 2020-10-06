package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceAnalysis
 */
public class BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceAnalysis   {
  private String productTypeSelectionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productTypeSelectionInstanceAnalysisReference
  **/

  public String getProductTypeSelectionInstanceAnalysisReference() {
    return productTypeSelectionInstanceAnalysisReference;
  }

  public void setProductTypeSelectionInstanceAnalysisReference(String productTypeSelectionInstanceAnalysisReference) {
    this.productTypeSelectionInstanceAnalysisReference = productTypeSelectionInstanceAnalysisReference;
  }


}

