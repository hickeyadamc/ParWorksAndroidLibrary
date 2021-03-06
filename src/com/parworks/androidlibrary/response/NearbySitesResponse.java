/*
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.parworks.androidlibrary.response;

import java.util.List;
/**
 * Used to deserialize the server response from the Nearby Sites endpoint
 * @author Adam hickey
 *
 */
public class NearbySitesResponse {
	
	List<SiteInfo> mSites;
	boolean mSuccess;
	
	public void setSites(List<SiteInfo> sites) {
		mSites = sites;
	}
	public void setSuccess(boolean success) {
		mSuccess = success;
	}
	
	public List<SiteInfo> getSites() {
		return mSites;
	}
	
	public boolean getSuccess() {
		return mSuccess;
	}

}
