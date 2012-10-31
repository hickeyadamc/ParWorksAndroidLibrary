package com.parworks.androidlibrary.response;

/**
 * Used to deserialize the response from the Initiate base Image Processing Endpoint
 * @author Adam Hickey
 *
 */

public class InitiateBaseImageProcessingResponse {
	
	private boolean mSuccess;
	private String mJobId;
	
	public void setSuccess(boolean success) {
		mSuccess = success;
	}
	public boolean getSuccess() {
		return mSuccess;
	}
	public void setJobId(String jobId) {
		mJobId = jobId;
	}
	public String getJobId() {
		return mJobId;
	}
	

}