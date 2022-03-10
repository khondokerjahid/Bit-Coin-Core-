package com.jxust.btcexplorer.entity;

public class BlockChainInfo {
    private String chain;
    private int blocks;
    private int headers;
    private String bestblockhash;
    private double difficulty;
    private long mediantime;
    private double verificationprogress;
    private boolean initialblockdownload;
    private String chainwork;
    private long size_on_disk;
    private boolean pruned;
    private Softforks softforks;
    private String warnings;

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getHeaders() {
        return headers;
    }

    public void setHeaders(int headers) {
        this.headers = headers;
    }

    public String getBestblockhash() {
        return bestblockhash;
    }

    public void setBestblockhash(String bestblockhash) {
        this.bestblockhash = bestblockhash;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public long getMediantime() {
        return mediantime;
    }

    public void setMediantime(long mediantime) {
        this.mediantime = mediantime;
    }

    public double getVerificationprogress() {
        return verificationprogress;
    }

    public void setVerificationprogress(double verificationprogress) {
        this.verificationprogress = verificationprogress;
    }

    public boolean isInitialblockdownload() {
        return initialblockdownload;
    }

    public void setInitialblockdownload(boolean initialblockdownload) {
        this.initialblockdownload = initialblockdownload;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public long getSize_on_disk() {
        return size_on_disk;
    }

    public void setSize_on_disk(long size_on_disk) {
        this.size_on_disk = size_on_disk;
    }

    public boolean isPruned() {
        return pruned;
    }

    public void setPruned(boolean pruned) {
        this.pruned = pruned;
    }

    public Softforks getSoftforks() {
        return softforks;
    }

    public void setSoftforks(Softforks softforks) {
        this.softforks = softforks;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }
}

class Softforks {
    private Bip bip34;
    private Bip bip66;
    private Bip bip65;
    private Bip csv;
    private Bip segwit;
    private TapRoot taproot;

    public Bip getBip34() {
        return bip34;
    }

    public void setBip34(Bip bip34) {
        this.bip34 = bip34;
    }

    public Bip getBip66() {
        return bip66;
    }

    public void setBip66(Bip bip66) {
        this.bip66 = bip66;
    }

    public Bip getBip65() {
        return bip65;
    }

    public void setBip65(Bip bip65) {
        this.bip65 = bip65;
    }

    public Bip getCsv() {
        return csv;
    }

    public void setCsv(Bip csv) {
        this.csv = csv;
    }

    public Bip getSegwit() {
        return segwit;
    }

    public void setSegwit(Bip segwit) {
        this.segwit = segwit;
    }

    public TapRoot getTaproot() {
        return taproot;
    }

    public void setTaproot(TapRoot taproot) {
        this.taproot = taproot;
    }
}

class TapRoot {
    private String type;
    private boolean active;
    private BipDetail bip9;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public BipDetail getBip9() {
        return bip9;
    }

    public void setBip9(BipDetail bip9) {
        this.bip9 = bip9;
    }
}

class BipDetail {
    private String status;
    private long start_time;
    private long timeout;
    private int since;
    private long min_activation_height;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getStart_time() {
        return start_time;
    }

    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public int getSince() {
        return since;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public long getMin_activation_height() {
        return min_activation_height;
    }

    public void setMin_activation_height(long min_activation_height) {
        this.min_activation_height = min_activation_height;
    }
}

class Bip {
    private String type;
    private boolean active;
    private long height;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }
}
