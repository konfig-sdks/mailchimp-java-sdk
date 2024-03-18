

# UploadArchiveProperty

Available when uploading an archive to create campaign content. The archive should include all campaign content and images. [Learn more](https://mailchimp.com/help/import-a-custom-html-template/).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**archiveContent** | **String** | The base64-encoded representation of the archive file. |  |
|**archiveType** | [**ArchiveTypeEnum**](#ArchiveTypeEnum) | The type of encoded file. Defaults to zip. |  [optional] |



## Enum: ArchiveTypeEnum

| Name | Value |
|---- | -----|
| ZIP | &quot;zip&quot; |
| TAR_GZ | &quot;tar.gz&quot; |
| TAR_BZ2 | &quot;tar.bz2&quot; |
| TAR | &quot;tar&quot; |
| TGZ | &quot;tgz&quot; |
| TBZ | &quot;tbz&quot; |



