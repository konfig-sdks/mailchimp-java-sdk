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
import com.konfigthis.client.model.TemplateFoldersAddNewFolder200Response;
import com.konfigthis.client.model.TemplateFoldersAddNewFolderRequest;
import com.konfigthis.client.model.TemplateFoldersAddNewFolderResponse;
import com.konfigthis.client.model.TemplateFoldersAddNewFolderdefaultResponse;
import com.konfigthis.client.model.TemplateFoldersDeleteSpecificFolderResponse;
import com.konfigthis.client.model.TemplateFoldersDeleteSpecificFolderdefaultResponse;
import com.konfigthis.client.model.TemplateFoldersGetInfo200Response;
import com.konfigthis.client.model.TemplateFoldersGetInfoResponse;
import com.konfigthis.client.model.TemplateFoldersGetInfodefaultResponse;
import com.konfigthis.client.model.TemplateFoldersListFolders200Response;
import com.konfigthis.client.model.TemplateFoldersListFoldersResponse;
import com.konfigthis.client.model.TemplateFoldersListFoldersdefaultResponse;
import com.konfigthis.client.model.TemplateFoldersUpdateSpecificFolder200Response;
import com.konfigthis.client.model.TemplateFoldersUpdateSpecificFolderResponse;
import com.konfigthis.client.model.TemplateFoldersUpdateSpecificFolderdefaultResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplateFoldersApi
 */
@Disabled
public class TemplateFoldersApiTest {

    private static TemplateFoldersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TemplateFoldersApi(apiClient);
    }

    /**
     * Add template folder
     *
     * Create a new template folder.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewFolderTest() throws ApiException {
        String name = null;
        TemplateFoldersAddNewFolderResponse response = api.addNewFolder(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete template folder
     *
     * Delete a specific template folder, and mark all the templates in the folder as &#39;unfiled&#39;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSpecificFolderTest() throws ApiException {
        String folderId = null;
        api.deleteSpecificFolder(folderId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get template folder
     *
     * Get information about a specific folder used to organize templates.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInfoTest() throws ApiException {
        String folderId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        TemplateFoldersGetInfoResponse response = api.getInfo(folderId)
                .fields(fields)
                .excludeFields(excludeFields)
                .execute();
        // TODO: test validations
    }

    /**
     * List template folders
     *
     * Get all folders used to organize templates.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFoldersTest() throws ApiException {
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer count = null;
        Integer offset = null;
        TemplateFoldersListFoldersResponse response = api.listFolders()
                .fields(fields)
                .excludeFields(excludeFields)
                .count(count)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

    /**
     * Update template folder
     *
     * Update a specific folder used to organize templates.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSpecificFolderTest() throws ApiException {
        String name = null;
        String folderId = null;
        TemplateFoldersUpdateSpecificFolderResponse response = api.updateSpecificFolder(name, folderId)
                .execute();
        // TODO: test validations
    }

}
