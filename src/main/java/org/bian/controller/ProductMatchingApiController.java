/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class ProductMatchingApiController {

	@Autowired
	ProductMatchingApiService service;
	
	@Assess.Activate
	public BianResponse<SDProductMatchingActivateOutputModel> activate(@RequestBody BianRequest<SDProductMatchingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Assess.Configure
	public BianResponse<SDProductMatchingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductMatchingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Exchange
	public BianResponse<CRProductCustomerCombinationAssessmentExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductCustomerCombinationAssessmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Execute
	public BianResponse<CRProductCustomerCombinationAssessmentExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductCustomerCombinationAssessmentExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Feedback
	public BianResponse<SDProductMatchingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductMatchingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Grant
	public BianResponse<CRProductCustomerCombinationAssessmentGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductCustomerCombinationAssessmentGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Initiate
	public BianResponse<CRProductCustomerCombinationAssessmentInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRProductCustomerCombinationAssessmentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("bankandcampaignalignment")
	@Assess.Initiate
	public BianResponse<BQBankandCampaignAlignmentInitiateOutputModel> initiateBankandcampaignalignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQBankandCampaignAlignmentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateBankandcampaignalignment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contextcriteria")
	@Assess.Initiate
	public BianResponse<BQContextCriteriaInitiateOutputModel> initiateContextcriteria(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQContextCriteriaInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateContextcriteria(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("producteligibility")
	@Assess.Initiate
	public BianResponse<BQProductEligibilityInitiateOutputModel> initiateProducteligibility(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProductEligibilityInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateProducteligibility(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("producttypeselection")
	@Assess.Initiate
	public BianResponse<BQProductTypeSelectionInitiateOutputModel> initiateProducttypeselection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProductTypeSelectionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateProducttypeselection(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Request
	public BianResponse<CRProductCustomerCombinationAssessmentRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductCustomerCombinationAssessmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("bankandcampaignalignment")
	@Assess.Retrieve
	public BianResponse<BQBankandCampaignAlignmentRetrieveOutputModel> retrieveBankandcampaignalignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBankandcampaignalignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("contextcriteria")
	@Assess.Retrieve
	public BianResponse<BQContextCriteriaRetrieveOutputModel> retrieveContextcriteria(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveContextcriteria(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("producteligibility")
	@Assess.Retrieve
	public BianResponse<BQProductEligibilityRetrieveOutputModel> retrieveProducteligibility(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProducteligibility(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("producttypeselection")
	@Assess.Retrieve
	public BianResponse<BQProductTypeSelectionRetrieveOutputModel> retrieveProducttypeselection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProducttypeselection(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Assess.Retrieve
	public BianResponse<CRProductCustomerCombinationAssessmentRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Assess.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Assess.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Assess.RetrieveSD
	public BianResponse<SDProductMatchingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Assess.Update
	public BianResponse<CRProductCustomerCombinationAssessmentUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductCustomerCombinationAssessmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("bankandcampaignalignment")
	@Assess.Update
	public BianResponse<BQBankandCampaignAlignmentUpdateOutputModel> updateBankandcampaignalignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBankandCampaignAlignmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateBankandcampaignalignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("contextcriteria")
	@Assess.Update
	public BianResponse<BQContextCriteriaUpdateOutputModel> updateContextcriteria(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContextCriteriaUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateContextcriteria(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("producteligibility")
	@Assess.Update
	public BianResponse<BQProductEligibilityUpdateOutputModel> updateProducteligibility(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductEligibilityUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProducteligibility(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("producttypeselection")
	@Assess.Update
	public BianResponse<BQProductTypeSelectionUpdateOutputModel> updateProducttypeselection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductTypeSelectionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProducttypeselection(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
