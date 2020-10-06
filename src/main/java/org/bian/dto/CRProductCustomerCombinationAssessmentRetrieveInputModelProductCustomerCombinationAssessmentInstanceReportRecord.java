package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceReportRecord
 */
public class CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceReportRecord   {
  private String productCustomerCombinationAssessmentInstanceReportReference = null;

  private String productCustomerCombinationAssessmentInstanceReportType = null;

  private String productCustomerCombinationAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productCustomerCombinationAssessmentInstanceReportReference
  **/

  public String getProductCustomerCombinationAssessmentInstanceReportReference() {
    return productCustomerCombinationAssessmentInstanceReportReference;
  }

  public void setProductCustomerCombinationAssessmentInstanceReportReference(String productCustomerCombinationAssessmentInstanceReportReference) {
    this.productCustomerCombinationAssessmentInstanceReportReference = productCustomerCombinationAssessmentInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productCustomerCombinationAssessmentInstanceReportType
  **/

  public String getProductCustomerCombinationAssessmentInstanceReportType() {
    return productCustomerCombinationAssessmentInstanceReportType;
  }

  public void setProductCustomerCombinationAssessmentInstanceReportType(String productCustomerCombinationAssessmentInstanceReportType) {
    this.productCustomerCombinationAssessmentInstanceReportType = productCustomerCombinationAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productCustomerCombinationAssessmentInstanceReportParameters
  **/

  public String getProductCustomerCombinationAssessmentInstanceReportParameters() {
    return productCustomerCombinationAssessmentInstanceReportParameters;
  }

  public void setProductCustomerCombinationAssessmentInstanceReportParameters(String productCustomerCombinationAssessmentInstanceReportParameters) {
    this.productCustomerCombinationAssessmentInstanceReportParameters = productCustomerCombinationAssessmentInstanceReportParameters;
  }


}

