package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceReport
 */
public class BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceReport   {
  private Object productEligibilityInstanceReportRecord = null;

  private String productEligibilityInstanceReportType = null;

  private String productEligibilityInstanceReportParameters = null;

  private Object productEligibilityInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productEligibilityInstanceReportRecord
  **/

  public Object getProductEligibilityInstanceReportRecord() {
    return productEligibilityInstanceReportRecord;
  }

  public void setProductEligibilityInstanceReportRecord(Object productEligibilityInstanceReportRecord) {
    this.productEligibilityInstanceReportRecord = productEligibilityInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productEligibilityInstanceReportType
  **/

  public String getProductEligibilityInstanceReportType() {
    return productEligibilityInstanceReportType;
  }

  public void setProductEligibilityInstanceReportType(String productEligibilityInstanceReportType) {
    this.productEligibilityInstanceReportType = productEligibilityInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productEligibilityInstanceReportParameters
  **/

  public String getProductEligibilityInstanceReportParameters() {
    return productEligibilityInstanceReportParameters;
  }

  public void setProductEligibilityInstanceReportParameters(String productEligibilityInstanceReportParameters) {
    this.productEligibilityInstanceReportParameters = productEligibilityInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productEligibilityInstanceReport
  **/

  public Object getProductEligibilityInstanceReport() {
    return productEligibilityInstanceReport;
  }

  public void setProductEligibilityInstanceReport(Object productEligibilityInstanceReport) {
    this.productEligibilityInstanceReport = productEligibilityInstanceReport;
  }


}

