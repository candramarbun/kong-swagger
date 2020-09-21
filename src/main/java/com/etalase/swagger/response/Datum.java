
package com.etalase.swagger.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "host",
    "id",
    "protocol",
    "read_timeout",
    "tls_verify_depth",
    "port",
    "updated_at",
    "ca_certificates",
    "created_at",
    "connect_timeout",
    "write_timeout",
    "name",
    "retries",
    "path",
    "tls_verify",
    "tags",
    "client_certificate"
})
public class Datum {

    @JsonProperty("host")
    private String host;
    @JsonProperty("id")
    private String id;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("read_timeout")
    private Integer readTimeout;
    @JsonProperty("tls_verify_depth")
    private Object tlsVerifyDepth;
    @JsonProperty("port")
    private Integer port;
    @JsonProperty("updated_at")
    private Integer updatedAt;
    @JsonProperty("ca_certificates")
    private Object caCertificates;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("connect_timeout")
    private Integer connectTimeout;
    @JsonProperty("write_timeout")
    private Integer writeTimeout;
    @JsonProperty("name")
    private String name;
    @JsonProperty("retries")
    private Integer retries;
    @JsonProperty("path")
    private String path;
    @JsonProperty("tls_verify")
    private Object tlsVerify;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("client_certificate")
    private Object clientCertificate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @JsonProperty("read_timeout")
    public Integer getReadTimeout() {
        return readTimeout;
    }

    @JsonProperty("read_timeout")
    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    @JsonProperty("tls_verify_depth")
    public Object getTlsVerifyDepth() {
        return tlsVerifyDepth;
    }

    @JsonProperty("tls_verify_depth")
    public void setTlsVerifyDepth(Object tlsVerifyDepth) {
        this.tlsVerifyDepth = tlsVerifyDepth;
    }

    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    @JsonProperty("updated_at")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("ca_certificates")
    public Object getCaCertificates() {
        return caCertificates;
    }

    @JsonProperty("ca_certificates")
    public void setCaCertificates(Object caCertificates) {
        this.caCertificates = caCertificates;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("connect_timeout")
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    @JsonProperty("connect_timeout")
    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    @JsonProperty("write_timeout")
    public Integer getWriteTimeout() {
        return writeTimeout;
    }

    @JsonProperty("write_timeout")
    public void setWriteTimeout(Integer writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("tls_verify")
    public Object getTlsVerify() {
        return tlsVerify;
    }

    @JsonProperty("tls_verify")
    public void setTlsVerify(Object tlsVerify) {
        this.tlsVerify = tlsVerify;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("client_certificate")
    public Object getClientCertificate() {
        return clientCertificate;
    }

    @JsonProperty("client_certificate")
    public void setClientCertificate(Object clientCertificate) {
        this.clientCertificate = clientCertificate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
