package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductEligibilityRetrieveInputModelProductEligibilityInstanceAnalysis
 */
public class BQProductEligibilityRetrieveInputModelProductEligibilityInstanceAnalysis   {
  private String productEligibilityInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productEligibilityInstanceAnalysisReference
  **/

  public String getProductEligibilityInstanceAnalysisReference() {
    return productEligibilityInstanceAnalysisReference;
  }

  public void setProductEligibilityInstanceAnalysisReference(String productEligibilityInstanceAnalysisReference) {
    this.productEligibilityInstanceAnalysisReference = productEligibilityInstanceAnalysisReference;
  }


}

