package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceAnalysis
 */
public class CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceAnalysis   {
  private String productCustomerCombinationAssessmentInstanceAnalysisReference = null;

  private String productCustomerCombinationAssessmentInstanceAnalysisReportType = null;

  private String productCustomerCombinationAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productCustomerCombinationAssessmentInstanceAnalysisReference
  **/

  public String getProductCustomerCombinationAssessmentInstanceAnalysisReference() {
    return productCustomerCombinationAssessmentInstanceAnalysisReference;
  }

  public void setProductCustomerCombinationAssessmentInstanceAnalysisReference(String productCustomerCombinationAssessmentInstanceAnalysisReference) {
    this.productCustomerCombinationAssessmentInstanceAnalysisReference = productCustomerCombinationAssessmentInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productCustomerCombinationAssessmentInstanceAnalysisParameters
  **/

  public String getProductCustomerCombinationAssessmentInstanceAnalysisParameters() {
    return productCustomerCombinationAssessmentInstanceAnalysisParameters;
  }

  public void setProductCustomerCombinationAssessmentInstanceAnalysisParameters(String productCustomerCombinationAssessmentInstanceAnalysisParameters) {
    this.productCustomerCombinationAssessmentInstanceAnalysisParameters = productCustomerCombinationAssessmentInstanceAnalysisParameters;
  }


}

