package org.paperless.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Document
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class DocumentDTO {

  private Integer id;

  private JsonNullable<Integer> correspondent = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> documentType = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> storagePath = JsonNullable.<Integer>undefined();

  private JsonNullable<String> title = JsonNullable.<String>undefined();

  private JsonNullable<String> content = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<Integer>> tags = JsonNullable.<List<Integer>>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modified;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime added;

  private JsonNullable<String> archiveSerialNumber = JsonNullable.<String>undefined();

  private JsonNullable<String> originalFileName = JsonNullable.<String>undefined();

  private JsonNullable<String> archivedFileName = JsonNullable.<String>undefined();

  public DocumentDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DocumentDTO correspondent(Integer correspondent) {
    this.correspondent = JsonNullable.of(correspondent);
    return this;
  }

  /**
   * Get correspondent
   * @return correspondent
  */
  
  @Schema(name = "correspondent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correspondent")
  public JsonNullable<Integer> getCorrespondent() {
    return correspondent;
  }

  public void setCorrespondent(JsonNullable<Integer> correspondent) {
    this.correspondent = correspondent;
  }

  public DocumentDTO documentType(Integer documentType) {
    this.documentType = JsonNullable.of(documentType);
    return this;
  }

  /**
   * Get documentType
   * @return documentType
  */
  
  @Schema(name = "document_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("document_type")
  public JsonNullable<Integer> getDocumentType() {
    return documentType;
  }

  public void setDocumentType(JsonNullable<Integer> documentType) {
    this.documentType = documentType;
  }

  public DocumentDTO storagePath(Integer storagePath) {
    this.storagePath = JsonNullable.of(storagePath);
    return this;
  }

  /**
   * Get storagePath
   * @return storagePath
  */
  
  @Schema(name = "storage_path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storage_path")
  public JsonNullable<Integer> getStoragePath() {
    return storagePath;
  }

  public void setStoragePath(JsonNullable<Integer> storagePath) {
    this.storagePath = storagePath;
  }

  public DocumentDTO title(String title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public JsonNullable<String> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<String> title) {
    this.title = title;
  }

  public DocumentDTO content(String content) {
    this.content = JsonNullable.of(content);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public JsonNullable<String> getContent() {
    return content;
  }

  public void setContent(JsonNullable<String> content) {
    this.content = content;
  }

  public DocumentDTO tags(List<Integer> tags) {
    this.tags = JsonNullable.of(tags);
    return this;
  }

  public DocumentDTO addTagsItem(Integer tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.of(new ArrayList<>());
    }
    this.tags.get().add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public JsonNullable<List<Integer>> getTags() {
    return tags;
  }

  public void setTags(JsonNullable<List<Integer>> tags) {
    this.tags = tags;
  }

  public DocumentDTO created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @Valid 
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public DocumentDTO createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 
  @Schema(name = "created_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_date")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public DocumentDTO modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
  */
  @Valid 
  @Schema(name = "modified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modified")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public DocumentDTO added(OffsetDateTime added) {
    this.added = added;
    return this;
  }

  /**
   * Get added
   * @return added
  */
  @Valid 
  @Schema(name = "added", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("added")
  public OffsetDateTime getAdded() {
    return added;
  }

  public void setAdded(OffsetDateTime added) {
    this.added = added;
  }

  public DocumentDTO archiveSerialNumber(String archiveSerialNumber) {
    this.archiveSerialNumber = JsonNullable.of(archiveSerialNumber);
    return this;
  }

  /**
   * Get archiveSerialNumber
   * @return archiveSerialNumber
  */
  
  @Schema(name = "archive_serial_number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archive_serial_number")
  public JsonNullable<String> getArchiveSerialNumber() {
    return archiveSerialNumber;
  }

  public void setArchiveSerialNumber(JsonNullable<String> archiveSerialNumber) {
    this.archiveSerialNumber = archiveSerialNumber;
  }

  public DocumentDTO originalFileName(String originalFileName) {
    this.originalFileName = JsonNullable.of(originalFileName);
    return this;
  }

  /**
   * Get originalFileName
   * @return originalFileName
  */
  
  @Schema(name = "original_file_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("original_file_name")
  public JsonNullable<String> getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(JsonNullable<String> originalFileName) {
    this.originalFileName = originalFileName;
  }

  public DocumentDTO archivedFileName(String archivedFileName) {
    this.archivedFileName = JsonNullable.of(archivedFileName);
    return this;
  }

  /**
   * Get archivedFileName
   * @return archivedFileName
  */
  
  @Schema(name = "archived_file_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived_file_name")
  public JsonNullable<String> getArchivedFileName() {
    return archivedFileName;
  }

  public void setArchivedFileName(JsonNullable<String> archivedFileName) {
    this.archivedFileName = archivedFileName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentDTO documentDTO = (DocumentDTO) o;
    return Objects.equals(this.id, documentDTO.id) &&
        equalsNullable(this.correspondent, documentDTO.correspondent) &&
        equalsNullable(this.documentType, documentDTO.documentType) &&
        equalsNullable(this.storagePath, documentDTO.storagePath) &&
        equalsNullable(this.title, documentDTO.title) &&
        equalsNullable(this.content, documentDTO.content) &&
        equalsNullable(this.tags, documentDTO.tags) &&
        Objects.equals(this.created, documentDTO.created) &&
        Objects.equals(this.createdDate, documentDTO.createdDate) &&
        Objects.equals(this.modified, documentDTO.modified) &&
        Objects.equals(this.added, documentDTO.added) &&
        equalsNullable(this.archiveSerialNumber, documentDTO.archiveSerialNumber) &&
        equalsNullable(this.originalFileName, documentDTO.originalFileName) &&
        equalsNullable(this.archivedFileName, documentDTO.archivedFileName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(correspondent), hashCodeNullable(documentType), hashCodeNullable(storagePath), hashCodeNullable(title), hashCodeNullable(content), hashCodeNullable(tags), created, createdDate, modified, added, hashCodeNullable(archiveSerialNumber), hashCodeNullable(originalFileName), hashCodeNullable(archivedFileName));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correspondent: ").append(toIndentedString(correspondent)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    storagePath: ").append(toIndentedString(storagePath)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    archiveSerialNumber: ").append(toIndentedString(archiveSerialNumber)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
    sb.append("    archivedFileName: ").append(toIndentedString(archivedFileName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

