package com.demo.offline_upi.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class MeshPacket {

    @NotBlank
    private String  packetId;

    @Min(0)
    private String ttl;

    @NotNull
    private String createdAt;

    @NotBlank
    private String ciphertext;

    public MeshPacket() {
    }

    public MeshPacket(String packetId, String ttl, String createdAt, String ciphertext) {
        this.packetId = packetId;
        this.ttl = ttl;
        this.createdAt = createdAt;
        this.ciphertext = ciphertext;
    }

    public String getPacketId() {
        return packetId;
    }

    public String getTtl() {
        return ttl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getCiphertext() {
        return ciphertext;
    }
}
