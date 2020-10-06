package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceAnalysis
 */
public class BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceAnalysis   {
  private Object productEligibilityInstanceAnalysisRecord = null;

  private String productEligibilityInstanceAnalysisReportType = null;

  private String productEligibilityInstanceAnalysisParameters = null;

  private Object productEligibilityInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productEligibilityInstanceAnalysisRecord
  **/

  public Object getProductEligibilityInstanceAnalysisRecord() {
    return productEligibilityInstanceAnalysisRecord;
  }

  public void setProductEligibilityInstanceAnalysisRecord(Object productEligibilityInstanceAnalysisRecord) {
    this.productEligibilityInstanceAnalysisRecord = productEligibilityInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productEligibilityInstanceAnalysisReportType
  **/

  public String getProductEligibilityInstanceAnalysisReportType() {
    return productEligibilityInstanceAnalysisReportType;
  }

  public void setProductEligibilityInstanceAnalysisReportType(String productEligibilityInstanceAnalysisReportType) {
    this.productEligibilityInstanceAnalysisReportType = productEligibilityInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productEligibilityInstanceAnalysisParameters
  **/

  public String getProductEligibilityInstanceAnalysisParameters() {
    return productEligibilityInstanceAnalysisParameters;
  }

  public void setProductEligibilityInstanceAnalysisParameters(String productEligibilityInstanceAnalysisParameters) {
    this.productEligibilityInstanceAnalysisParameters = productEligibilityInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productEligibilityInstanceAnalysisReport
  **/

  public Object getProductEligibilityInstanceAnalysisReport() {
    return productEligibilityInstanceAnalysisReport;
  }

  public void setProductEligibilityInstanceAnalysisReport(Object productEligibilityInstanceAnalysisReport) {
    this.productEligibilityInstanceAnalysisReport = productEligibilityInstanceAnalysisReport;
  }


}

