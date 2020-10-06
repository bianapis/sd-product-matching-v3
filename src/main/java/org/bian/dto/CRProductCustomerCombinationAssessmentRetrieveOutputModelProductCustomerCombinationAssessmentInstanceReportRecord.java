package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceReportRecord
 */
public class CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceReportRecord   {
  private String productCustomerCombinationAssessmentInstanceReportData = null;

  private String productCustomerCombinationAssessmentInstanceReportType = null;

  private Object productCustomerCombinationAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productCustomerCombinationAssessmentInstanceReportData
  **/

  public String getProductCustomerCombinationAssessmentInstanceReportData() {
    return productCustomerCombinationAssessmentInstanceReportData;
  }

  public void setProductCustomerCombinationAssessmentInstanceReportData(String productCustomerCombinationAssessmentInstanceReportData) {
    this.productCustomerCombinationAssessmentInstanceReportData = productCustomerCombinationAssessmentInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productCustomerCombinationAssessmentInstanceReport
  **/

  public Object getProductCustomerCombinationAssessmentInstanceReport() {
    return productCustomerCombinationAssessmentInstanceReport;
  }

  public void setProductCustomerCombinationAssessmentInstanceReport(Object productCustomerCombinationAssessmentInstanceReport) {
    this.productCustomerCombinationAssessmentInstanceReport = productCustomerCombinationAssessmentInstanceReport;
  }


}

