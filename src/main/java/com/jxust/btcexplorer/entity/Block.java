package com.jxust.btcexplorer.entity;

public class Block {
    private String hash;
    private int confirmations;
    private int strippedsize;
    private int size;
    private int weight;
    private int height;
    private int version;
    private String versionHex;
    private String merkleroot;
    private String[] tx;
    private long time;
    private long mediantime;
    private long nonce;
    private String bits;
    private int difficulty;
    private String chainwork;
    private int nTx;
    private String nextblockhash;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getStrippedsize() {
        return strippedsize;
    }

    public void setStrippedsize(int strippedsize) {
        this.strippedsize = strippedsize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getVersionHex() {
        return versionHex;
    }

    public void setVersionHex(String versionHex) {
        this.versionHex = versionHex;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    public String[] getTx() {
        return tx;
    }

    public void setTx(String[] tx) {
        this.tx = tx;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getMediantime() {
        return mediantime;
    }

    public void setMediantime(long mediantime) {
        this.mediantime = mediantime;
    }

    public long getNonce() {
        return nonce;
    }

    public void setNonce(long nonce) {
        this.nonce = nonce;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public int getnTx() {
        return nTx;
    }

    public void setnTx(int nTx) {
        this.nTx = nTx;
    }

    public String getNextblockhash() {
        return nextblockhash;
    }

    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash;
    }
}
