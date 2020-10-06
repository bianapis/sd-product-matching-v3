package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContextCriteriaRetrieveOutputModelContextCriteriaInstanceReport
 */
public class BQContextCriteriaRetrieveOutputModelContextCriteriaInstanceReport   {
  private Object contextCriteriaInstanceReportRecord = null;

  private String contextCriteriaInstanceReportType = null;

  private String contextCriteriaInstanceReportParameters = null;

  private Object contextCriteriaInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return contextCriteriaInstanceReportRecord
  **/

  public Object getContextCriteriaInstanceReportRecord() {
    return contextCriteriaInstanceReportRecord;
  }

  public void setContextCriteriaInstanceReportRecord(Object contextCriteriaInstanceReportRecord) {
    this.contextCriteriaInstanceReportRecord = contextCriteriaInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return contextCriteriaInstanceReportType
  **/

  public String getContextCriteriaInstanceReportType() {
    return contextCriteriaInstanceReportType;
  }

  public void setContextCriteriaInstanceReportType(String contextCriteriaInstanceReportType) {
    this.contextCriteriaInstanceReportType = contextCriteriaInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return contextCriteriaInstanceReportParameters
  **/

  public String getContextCriteriaInstanceReportParameters() {
    return contextCriteriaInstanceReportParameters;
  }

  public void setContextCriteriaInstanceReportParameters(String contextCriteriaInstanceReportParameters) {
    this.contextCriteriaInstanceReportParameters = contextCriteriaInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return contextCriteriaInstanceReport
  **/

  public Object getContextCriteriaInstanceReport() {
    return contextCriteriaInstanceReport;
  }

  public void setContextCriteriaInstanceReport(Object contextCriteriaInstanceReport) {
    this.contextCriteriaInstanceReport = contextCriteriaInstanceReport;
  }


}

