package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordProductMatchingActivityAnalysis;
import org.bian.dto.SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordProductMatchingPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecord
 */
public class SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecord   {
  private SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordProductMatchingActivityAnalysis productMatchingActivityAnalysis = null;

  private SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordProductMatchingPerformanceAnalysis productMatchingPerformanceAnalysis = null;

  private SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get productMatchingActivityAnalysis
   * @return productMatchingActivityAnalysis
  **/

  public SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordProductMatchingActivityAnalysis getProductMatchingActivityAnalysis() {
    return productMatchingActivityAnalysis;
  }

  public void setProductMatchingActivityAnalysis(SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordProductMatchingActivityAnalysis productMatchingActivityAnalysis) {
    this.productMatchingActivityAnalysis = productMatchingActivityAnalysis;
  }


  /**
   * Get productMatchingPerformanceAnalysis
   * @return productMatchingPerformanceAnalysis
  **/

  public SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordProductMatchingPerformanceAnalysis getProductMatchingPerformanceAnalysis() {
    return productMatchingPerformanceAnalysis;
  }

  public void setProductMatchingPerformanceAnalysis(SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordProductMatchingPerformanceAnalysis productMatchingPerformanceAnalysis) {
    this.productMatchingPerformanceAnalysis = productMatchingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDProductMatchingRetrieveOutputModelProductMatchingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

