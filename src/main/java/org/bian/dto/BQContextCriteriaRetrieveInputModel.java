package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContextCriteriaRetrieveInputModelContextCriteriaInstanceAnalysis;
import org.bian.dto.BQContextCriteriaRetrieveInputModelContextCriteriaInstanceReport;

import javax.validation.Valid;
  
/**
 * BQContextCriteriaRetrieveInputModel
 */
public class BQContextCriteriaRetrieveInputModel   {
  private Object contextCriteriaRetrieveActionTaskRecord = null;

  private String contextCriteriaRetrieveActionRequest = null;

  private BQContextCriteriaRetrieveInputModelContextCriteriaInstanceReport contextCriteriaInstanceReport = null;

  private BQContextCriteriaRetrieveInputModelContextCriteriaInstanceAnalysis contextCriteriaInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return contextCriteriaRetrieveActionTaskRecord
  **/

  public Object getContextCriteriaRetrieveActionTaskRecord() {
    return contextCriteriaRetrieveActionTaskRecord;
  }

  public void setContextCriteriaRetrieveActionTaskRecord(Object contextCriteriaRetrieveActionTaskRecord) {
    this.contextCriteriaRetrieveActionTaskRecord = contextCriteriaRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return contextCriteriaRetrieveActionRequest
  **/

  public String getContextCriteriaRetrieveActionRequest() {
    return contextCriteriaRetrieveActionRequest;
  }

  public void setContextCriteriaRetrieveActionRequest(String contextCriteriaRetrieveActionRequest) {
    this.contextCriteriaRetrieveActionRequest = contextCriteriaRetrieveActionRequest;
  }


  /**
   * Get contextCriteriaInstanceReport
   * @return contextCriteriaInstanceReport
  **/

  public BQContextCriteriaRetrieveInputModelContextCriteriaInstanceReport getContextCriteriaInstanceReport() {
    return contextCriteriaInstanceReport;
  }

  public void setContextCriteriaInstanceReport(BQContextCriteriaRetrieveInputModelContextCriteriaInstanceReport contextCriteriaInstanceReport) {
    this.contextCriteriaInstanceReport = contextCriteriaInstanceReport;
  }


  /**
   * Get contextCriteriaInstanceAnalysis
   * @return contextCriteriaInstanceAnalysis
  **/

  public BQContextCriteriaRetrieveInputModelContextCriteriaInstanceAnalysis getContextCriteriaInstanceAnalysis() {
    return contextCriteriaInstanceAnalysis;
  }

  public void setContextCriteriaInstanceAnalysis(BQContextCriteriaRetrieveInputModelContextCriteriaInstanceAnalysis contextCriteriaInstanceAnalysis) {
    this.contextCriteriaInstanceAnalysis = contextCriteriaInstanceAnalysis;
  }


}

