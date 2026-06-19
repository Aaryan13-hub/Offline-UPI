package com.demo.offline_upi.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class MeshPacket {

    @NotBlank
    private String  packetId;

    @Min(0)
    private int ttl;

    @NotNull
    private long createdAt;

    @NotBlank
    private String ciphertext;

    public MeshPacket() {
    }

    public MeshPacket(String packetId, int ttl, long createdAt, String ciphertext) {
        this.packetId = packetId;
        this.ttl = ttl;
        this.createdAt = createdAt;
        this.ciphertext = ciphertext;
    }

    public void setPacketId(String packetId) {
        this.packetId = packetId;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
    }

    public String getPacketId() {
        return packetId;
    }

    public int getTtl() {
        return ttl;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public String getCiphertext() {
        return ciphertext;
    }
}
