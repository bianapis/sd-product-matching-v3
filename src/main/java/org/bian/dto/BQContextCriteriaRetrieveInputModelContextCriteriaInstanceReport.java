package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContextCriteriaRetrieveInputModelContextCriteriaInstanceReport
 */
public class BQContextCriteriaRetrieveInputModelContextCriteriaInstanceReport   {
  private String contextCriteriaInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return contextCriteriaInstanceReportReference
  **/

  public String getContextCriteriaInstanceReportReference() {
    return contextCriteriaInstanceReportReference;
  }

  public void setContextCriteriaInstanceReportReference(String contextCriteriaInstanceReportReference) {
    this.contextCriteriaInstanceReportReference = contextCriteriaInstanceReportReference;
  }


}

