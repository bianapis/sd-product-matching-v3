package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContextCriteriaRetrieveOutputModelContextCriteriaInstanceAnalysis
 */
public class BQContextCriteriaRetrieveOutputModelContextCriteriaInstanceAnalysis   {
  private Object contextCriteriaInstanceAnalysisRecord = null;

  private String contextCriteriaInstanceAnalysisReportType = null;

  private String contextCriteriaInstanceAnalysisParameters = null;

  private Object contextCriteriaInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return contextCriteriaInstanceAnalysisRecord
  **/

  public Object getContextCriteriaInstanceAnalysisRecord() {
    return contextCriteriaInstanceAnalysisRecord;
  }

  public void setContextCriteriaInstanceAnalysisRecord(Object contextCriteriaInstanceAnalysisRecord) {
    this.contextCriteriaInstanceAnalysisRecord = contextCriteriaInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return contextCriteriaInstanceAnalysisReportType
  **/

  public String getContextCriteriaInstanceAnalysisReportType() {
    return contextCriteriaInstanceAnalysisReportType;
  }

  public void setContextCriteriaInstanceAnalysisReportType(String contextCriteriaInstanceAnalysisReportType) {
    this.contextCriteriaInstanceAnalysisReportType = contextCriteriaInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return contextCriteriaInstanceAnalysisParameters
  **/

  public String getContextCriteriaInstanceAnalysisParameters() {
    return contextCriteriaInstanceAnalysisParameters;
  }

  public void setContextCriteriaInstanceAnalysisParameters(String contextCriteriaInstanceAnalysisParameters) {
    this.contextCriteriaInstanceAnalysisParameters = contextCriteriaInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return contextCriteriaInstanceAnalysisReport
  **/

  public Object getContextCriteriaInstanceAnalysisReport() {
    return contextCriteriaInstanceAnalysisReport;
  }

  public void setContextCriteriaInstanceAnalysisReport(Object contextCriteriaInstanceAnalysisReport) {
    this.contextCriteriaInstanceAnalysisReport = contextCriteriaInstanceAnalysisReport;
  }


}

