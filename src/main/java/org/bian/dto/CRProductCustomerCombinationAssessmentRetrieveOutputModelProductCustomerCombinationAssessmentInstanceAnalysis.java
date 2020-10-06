package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceAnalysis
 */
public class CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceAnalysis   {
  private String productCustomerCombinationAssessmentInstanceAnalysisData = null;

  private String productCustomerCombinationAssessmentInstanceAnalysisReportType = null;

  private Object productCustomerCombinationAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productCustomerCombinationAssessmentInstanceAnalysisData
  **/

  public String getProductCustomerCombinationAssessmentInstanceAnalysisData() {
    return productCustomerCombinationAssessmentInstanceAnalysisData;
  }

  public void setProductCustomerCombinationAssessmentInstanceAnalysisData(String productCustomerCombinationAssessmentInstanceAnalysisData) {
    this.productCustomerCombinationAssessmentInstanceAnalysisData = productCustomerCombinationAssessmentInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productCustomerCombinationAssessmentInstanceAnalysisReportType
  **/

  public String getProductCustomerCombinationAssessmentInstanceAnalysisReportType() {
    return productCustomerCombinationAssessmentInstanceAnalysisReportType;
  }

  public void setProductCustomerCombinationAssessmentInstanceAnalysisReportType(String productCustomerCombinationAssessmentInstanceAnalysisReportType) {
    this.productCustomerCombinationAssessmentInstanceAnalysisReportType = productCustomerCombinationAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productCustomerCombinationAssessmentInstanceAnalysisReport
  **/

  public Object getProductCustomerCombinationAssessmentInstanceAnalysisReport() {
    return productCustomerCombinationAssessmentInstanceAnalysisReport;
  }

  public void setProductCustomerCombinationAssessmentInstanceAnalysisReport(Object productCustomerCombinationAssessmentInstanceAnalysisReport) {
    this.productCustomerCombinationAssessmentInstanceAnalysisReport = productCustomerCombinationAssessmentInstanceAnalysisReport;
  }


}

