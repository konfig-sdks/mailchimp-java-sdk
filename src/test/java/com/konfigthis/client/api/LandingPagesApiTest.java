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
import com.konfigthis.client.model.LandingPagesCreateNewMailchimpLandingPage200Response;
import com.konfigthis.client.model.LandingPagesCreateNewMailchimpLandingPageRequest;
import com.konfigthis.client.model.LandingPagesCreateNewMailchimpLandingPageResponse;
import com.konfigthis.client.model.LandingPagesCreateNewMailchimpLandingPagedefaultResponse;
import com.konfigthis.client.model.LandingPagesDeletePageResponse;
import com.konfigthis.client.model.LandingPagesDeletePagedefaultResponse;
import com.konfigthis.client.model.LandingPagesGetContent200Response;
import com.konfigthis.client.model.LandingPagesGetContentResponse;
import com.konfigthis.client.model.LandingPagesGetContentdefaultResponse;
import com.konfigthis.client.model.LandingPagesGetPageInfo200Response;
import com.konfigthis.client.model.LandingPagesGetPageInfoResponse;
import com.konfigthis.client.model.LandingPagesGetPageInfodefaultResponse;
import com.konfigthis.client.model.LandingPagesList200Response;
import com.konfigthis.client.model.LandingPagesListResponse;
import com.konfigthis.client.model.LandingPagesListdefaultResponse;
import com.konfigthis.client.model.LandingPagesPublishActionResponse;
import com.konfigthis.client.model.LandingPagesPublishActiondefaultResponse;
import com.konfigthis.client.model.LandingPagesUnpublishActionResponse;
import com.konfigthis.client.model.LandingPagesUnpublishActiondefaultResponse;
import com.konfigthis.client.model.LandingPagesUpdatePageById200Response;
import com.konfigthis.client.model.LandingPagesUpdatePageByIdRequest;
import com.konfigthis.client.model.LandingPagesUpdatePageByIdResponse;
import com.konfigthis.client.model.LandingPagesUpdatePageByIddefaultResponse;
import com.konfigthis.client.model.TrackingSettingsProperty;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LandingPagesApi
 */
@Disabled
public class LandingPagesApiTest {

    private static LandingPagesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LandingPagesApi(apiClient);
    }

    /**
     * Add landing page
     *
     * Create a new Mailchimp landing page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewMailchimpLandingPageTest() throws ApiException {
        String title = null;
        String description = null;
        String name = null;
        String storeId = null;
        String listId = null;
        String type = null;
        Integer templateId = null;
        TrackingSettingsProperty tracking = null;
        Boolean useDefaultList = null;
        LandingPagesCreateNewMailchimpLandingPageResponse response = api.createNewMailchimpLandingPage()
                .title(title)
                .description(description)
                .name(name)
                .storeId(storeId)
                .listId(listId)
                .type(type)
                .templateId(templateId)
                .tracking(tracking)
                .useDefaultList(useDefaultList)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete landing page
     *
     * Delete a landing page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePageTest() throws ApiException {
        String pageId = null;
        api.deletePage(pageId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get landing page content
     *
     * Get the the HTML for your landing page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getContentTest() throws ApiException {
        String pageId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        LandingPagesGetContentResponse response = api.getContent(pageId)
                .fields(fields)
                .excludeFields(excludeFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get landing page info
     *
     * Get information about a specific page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPageInfoTest() throws ApiException {
        String pageId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        LandingPagesGetPageInfoResponse response = api.getPageInfo(pageId)
                .fields(fields)
                .excludeFields(excludeFields)
                .execute();
        // TODO: test validations
    }

    /**
     * List landing pages
     *
     * Get all landing pages.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String sortDir = null;
        String sortField = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer count = null;
        LandingPagesListResponse response = api.list()
                .sortDir(sortDir)
                .sortField(sortField)
                .fields(fields)
                .excludeFields(excludeFields)
                .count(count)
                .execute();
        // TODO: test validations
    }

    /**
     * Publish landing page
     *
     * Publish a landing page that is in draft, unpublished, or has been previously published and edited.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void publishActionTest() throws ApiException {
        String pageId = null;
        api.publishAction(pageId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unpublish landing page
     *
     * Unpublish a landing page that is in draft or has been published.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unpublishActionTest() throws ApiException {
        String pageId = null;
        api.unpublishAction(pageId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update landing page
     *
     * Update a landing page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePageByIdTest() throws ApiException {
        String pageId = null;
        String title = null;
        String description = null;
        String name = null;
        String storeId = null;
        String listId = null;
        TrackingSettingsProperty tracking = null;
        LandingPagesUpdatePageByIdResponse response = api.updatePageById(pageId)
                .title(title)
                .description(description)
                .name(name)
                .storeId(storeId)
                .listId(listId)
                .tracking(tracking)
                .execute();
        // TODO: test validations
    }

}
