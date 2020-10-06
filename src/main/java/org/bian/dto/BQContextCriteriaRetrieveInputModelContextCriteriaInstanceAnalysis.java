package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContextCriteriaRetrieveInputModelContextCriteriaInstanceAnalysis
 */
public class BQContextCriteriaRetrieveInputModelContextCriteriaInstanceAnalysis   {
  private String contextCriteriaInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return contextCriteriaInstanceAnalysisReference
  **/

  public String getContextCriteriaInstanceAnalysisReference() {
    return contextCriteriaInstanceAnalysisReference;
  }

  public void setContextCriteriaInstanceAnalysisReference(String contextCriteriaInstanceAnalysisReference) {
    this.contextCriteriaInstanceAnalysisReference = contextCriteriaInstanceAnalysisReference;
  }


}

