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
import com.konfigthis.client.model.SearchMembersListMembers200Response;
import com.konfigthis.client.model.SearchMembersListMembersResponse;
import com.konfigthis.client.model.SearchMembersListMembersdefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchMembersApi
 */
@Disabled
public class SearchMembersApiTest {

    private static SearchMembersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SearchMembersApi(apiClient);
    }

    /**
     * Search members
     *
     * Search for list members. This search can be restricted to a specific list, or can be used to search across all lists in an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMembersTest() throws ApiException {
        String query = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        String listId = null;
        SearchMembersListMembersResponse response = api.listMembers(query)
                .fields(fields)
                .excludeFields(excludeFields)
                .listId(listId)
                .execute();
        // TODO: test validations
    }

}
