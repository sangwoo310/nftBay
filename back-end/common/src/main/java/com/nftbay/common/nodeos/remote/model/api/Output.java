/*
 * Copyright (c) 2017 Mithril coin.
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.nftbay.common.nodeos.remote.model.api;

/**
 * Created by swapnibble on 2017-09-11.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Output {

    @SerializedName("notify")
    @Expose
    private List<Object> notify = null;
    @SerializedName("sync_transactions")
    @Expose
    private List<Object> syncTransactions = null;
    @SerializedName("async_transactions")
    @Expose
    private List<Object> asyncTransactions = null;

    public List<Object> getNotify() {
        return notify;
    }

    public void setNotify(List<Object> notify) {
        this.notify = notify;
    }

    public List<Object> getSyncTransactions() {
        return syncTransactions;
    }

    public void setSyncTransactions(List<Object> syncTransactions) {
        this.syncTransactions = syncTransactions;
    }

    public List<Object> getAsyncTransactions() {
        return asyncTransactions;
    }

    public void setAsyncTransactions(List<Object> asyncTransactions) {
        this.asyncTransactions = asyncTransactions;
    }

}
