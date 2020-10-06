package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductTypeSelectionRetrieveOutputModelProductTypeSelectionInstanceAnalysis
 */
public class BQProductTypeSelectionRetrieveOutputModelProductTypeSelectionInstanceAnalysis   {
  private Object productTypeSelectionInstanceAnalysisRecord = null;

  private String productTypeSelectionInstanceAnalysisReportType = null;

  private String productTypeSelectionInstanceAnalysisParameters = null;

  private Object productTypeSelectionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productTypeSelectionInstanceAnalysisRecord
  **/

  public Object getProductTypeSelectionInstanceAnalysisRecord() {
    return productTypeSelectionInstanceAnalysisRecord;
  }

  public void setProductTypeSelectionInstanceAnalysisRecord(Object productTypeSelectionInstanceAnalysisRecord) {
    this.productTypeSelectionInstanceAnalysisRecord = productTypeSelectionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productTypeSelectionInstanceAnalysisReportType
  **/

  public String getProductTypeSelectionInstanceAnalysisReportType() {
    return productTypeSelectionInstanceAnalysisReportType;
  }

  public void setProductTypeSelectionInstanceAnalysisReportType(String productTypeSelectionInstanceAnalysisReportType) {
    this.productTypeSelectionInstanceAnalysisReportType = productTypeSelectionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productTypeSelectionInstanceAnalysisParameters
  **/

  public String getProductTypeSelectionInstanceAnalysisParameters() {
    return productTypeSelectionInstanceAnalysisParameters;
  }

  public void setProductTypeSelectionInstanceAnalysisParameters(String productTypeSelectionInstanceAnalysisParameters) {
    this.productTypeSelectionInstanceAnalysisParameters = productTypeSelectionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productTypeSelectionInstanceAnalysisReport
  **/

  public Object getProductTypeSelectionInstanceAnalysisReport() {
    return productTypeSelectionInstanceAnalysisReport;
  }

  public void setProductTypeSelectionInstanceAnalysisReport(Object productTypeSelectionInstanceAnalysisReport) {
    this.productTypeSelectionInstanceAnalysisReport = productTypeSelectionInstanceAnalysisReport;
  }


}

