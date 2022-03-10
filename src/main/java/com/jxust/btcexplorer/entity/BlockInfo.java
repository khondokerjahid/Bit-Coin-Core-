package com.jxust.btcexplorer.entity;

public class BlockInfo {
    private long id;
    private Object error;
    private Block result;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public Block getResult() {
        return result;
    }

    public void setResult(Block result) {
        this.result = result;
    }
}
