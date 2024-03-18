/*
 * Mailchimp Marketing API
 * Mailchimp is a marketing platform for small businesses. It offers an all-in-one marketing solution that includes email marketing, ads, landing pages, and automation. With Mailchimp, businesses can design and send targeted campaigns, analyze their performance, and grow their audience.
 *
 * The version of the OpenAPI document: 3.0.55
 * Contact: apihelp@mailchimp.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ReportingFacebookAdReport200Response;
import com.konfigthis.client.model.ReportingFacebookAdReportResponse;
import com.konfigthis.client.model.ReportingFacebookAdReportdefaultResponse;
import com.konfigthis.client.model.ReportingGetLandingPageReport200Response;
import com.konfigthis.client.model.ReportingGetLandingPageReportResponse;
import com.konfigthis.client.model.ReportingGetLandingPageReportdefaultResponse;
import com.konfigthis.client.model.ReportingGetSurveyReport200Response;
import com.konfigthis.client.model.ReportingGetSurveyReportResponse;
import com.konfigthis.client.model.ReportingGetSurveyReportdefaultResponse;
import com.konfigthis.client.model.ReportingListFacebookAdsReports200Response;
import com.konfigthis.client.model.ReportingListFacebookAdsReportsResponse;
import com.konfigthis.client.model.ReportingListFacebookAdsReportsdefaultResponse;
import com.konfigthis.client.model.ReportingListFacebookEcommerceReport200Response;
import com.konfigthis.client.model.ReportingListFacebookEcommerceReportResponse;
import com.konfigthis.client.model.ReportingListFacebookEcommerceReportdefaultResponse;
import com.konfigthis.client.model.ReportingListLandingPagesReports200Response;
import com.konfigthis.client.model.ReportingListLandingPagesReportsResponse;
import com.konfigthis.client.model.ReportingListLandingPagesReportsdefaultResponse;
import com.konfigthis.client.model.ReportingListSurveyQuestionsReports200Response;
import com.konfigthis.client.model.ReportingListSurveyQuestionsReportsResponse;
import com.konfigthis.client.model.ReportingListSurveyQuestionsReportsdefaultResponse;
import com.konfigthis.client.model.ReportingListSurveyReports200Response;
import com.konfigthis.client.model.ReportingListSurveyReportsResponse;
import com.konfigthis.client.model.ReportingListSurveyReportsdefaultResponse;
import com.konfigthis.client.model.ReportingSingleSurveyResponse200Response;
import com.konfigthis.client.model.ReportingSingleSurveyResponseResponse;
import com.konfigthis.client.model.ReportingSingleSurveyResponsedefaultResponse;
import com.konfigthis.client.model.ReportingSurveyQuestionAnswersList200Response;
import com.konfigthis.client.model.ReportingSurveyQuestionAnswersListResponse;
import com.konfigthis.client.model.ReportingSurveyQuestionAnswersListdefaultResponse;
import com.konfigthis.client.model.ReportingSurveyQuestionReport200Response;
import com.konfigthis.client.model.ReportingSurveyQuestionReportResponse;
import com.konfigthis.client.model.ReportingSurveyQuestionReportdefaultResponse;
import com.konfigthis.client.model.ReportingSurveyResponsesList200Response;
import com.konfigthis.client.model.ReportingSurveyResponsesListResponse;
import com.konfigthis.client.model.ReportingSurveyResponsesListdefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingApi
 */
@Disabled
public class ReportingApiTest {

    private static ReportingApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ReportingApi(apiClient);
    }

    /**
     * Get facebook ad report
     *
     * Get report of a Facebook ad.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void facebookAdReportTest() throws ApiException {
        String outreachId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        ReportingFacebookAdReportResponse response = api.facebookAdReport(outreachId)
                .fields(fields)
                .excludeFields(excludeFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get landing page report
     *
     * Get report of a landing page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLandingPageReportTest() throws ApiException {
        String outreachId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        ReportingGetLandingPageReportResponse response = api.getLandingPageReport(outreachId)
                .fields(fields)
                .excludeFields(excludeFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get survey report
     *
     * Get report for a survey.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSurveyReportTest() throws ApiException {
        String surveyId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        ReportingGetSurveyReportResponse response = api.getSurveyReport(surveyId)
                .fields(fields)
                .excludeFields(excludeFields)
                .execute();
        // TODO: test validations
    }

    /**
     * List facebook ads reports
     *
     * Get reports of Facebook ads.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFacebookAdsReportsTest() throws ApiException {
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer count = null;
        Integer offset = null;
        String sortField = null;
        String sortDir = null;
        ReportingListFacebookAdsReportsResponse response = api.listFacebookAdsReports()
                .fields(fields)
                .excludeFields(excludeFields)
                .count(count)
                .offset(offset)
                .sortField(sortField)
                .sortDir(sortDir)
                .execute();
        // TODO: test validations
    }

    /**
     * List facebook ecommerce report
     *
     * Get breakdown of product activity for an outreach.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFacebookEcommerceReportTest() throws ApiException {
        String outreachId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer count = null;
        Integer offset = null;
        String sortField = null;
        ReportingListFacebookEcommerceReportResponse response = api.listFacebookEcommerceReport(outreachId)
                .fields(fields)
                .excludeFields(excludeFields)
                .count(count)
                .offset(offset)
                .sortField(sortField)
                .execute();
        // TODO: test validations
    }

    /**
     * List landing pages reports
     *
     * Get reports of landing pages.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLandingPagesReportsTest() throws ApiException {
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer count = null;
        Integer offset = null;
        ReportingListLandingPagesReportsResponse response = api.listLandingPagesReports()
                .fields(fields)
                .excludeFields(excludeFields)
                .count(count)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * List survey question reports
     *
     * Get reports for survey questions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSurveyQuestionsReportsTest() throws ApiException {
        String surveyId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        ReportingListSurveyQuestionsReportsResponse response = api.listSurveyQuestionsReports(surveyId)
                .fields(fields)
                .excludeFields(excludeFields)
                .execute();
        // TODO: test validations
    }

    /**
     * List survey reports
     *
     * Get reports for surveys.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSurveyReportsTest() throws ApiException {
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer count = null;
        Integer offset = null;
        ReportingListSurveyReportsResponse response = api.listSurveyReports()
                .fields(fields)
                .excludeFields(excludeFields)
                .count(count)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Get survey response
     *
     * Get a single survey response.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void singleSurveyResponseTest() throws ApiException {
        String surveyId = null;
        String responseId = null;
        ReportingSingleSurveyResponseResponse response = api.singleSurveyResponse(surveyId, responseId)
                .execute();
        // TODO: test validations
    }

    /**
     * List answers for question
     *
     * Get answers for a survey question.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void surveyQuestionAnswersListTest() throws ApiException {
        String surveyId = null;
        String questionId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        String respondentFamiliarityIs = null;
        ReportingSurveyQuestionAnswersListResponse response = api.surveyQuestionAnswersList(surveyId, questionId)
                .fields(fields)
                .excludeFields(excludeFields)
                .respondentFamiliarityIs(respondentFamiliarityIs)
                .execute();
        // TODO: test validations
    }

    /**
     * Get survey question report
     *
     * Get report for a survey question.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void surveyQuestionReportTest() throws ApiException {
        String surveyId = null;
        String questionId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        ReportingSurveyQuestionReportResponse response = api.surveyQuestionReport(surveyId, questionId)
                .fields(fields)
                .excludeFields(excludeFields)
                .execute();
        // TODO: test validations
    }

    /**
     * List survey responses
     *
     * Get responses to a survey.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void surveyResponsesListTest() throws ApiException {
        String surveyId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer answeredQuestion = null;
        String choseAnswer = null;
        String respondentFamiliarityIs = null;
        ReportingSurveyResponsesListResponse response = api.surveyResponsesList(surveyId)
                .fields(fields)
                .excludeFields(excludeFields)
                .answeredQuestion(answeredQuestion)
                .choseAnswer(choseAnswer)
                .respondentFamiliarityIs(respondentFamiliarityIs)
                .execute();
        // TODO: test validations
    }

}