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
import com.konfigthis.client.model.AccountExportInfo200Response;
import com.konfigthis.client.model.AccountExportInfoResponse;
import com.konfigthis.client.model.AccountExportInfodefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountExportApi
 */
@Disabled
public class AccountExportApiTest {

    private static AccountExportApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AccountExportApi(apiClient);
    }

    /**
     * Get account export info
     *
     * Get information about a specific account export.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void infoTest() throws ApiException {
        String exportId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        AccountExportInfoResponse response = api.info(exportId)
                .fields(fields)
                .excludeFields(excludeFields)
                .execute();
        // TODO: test validations
    }

}
