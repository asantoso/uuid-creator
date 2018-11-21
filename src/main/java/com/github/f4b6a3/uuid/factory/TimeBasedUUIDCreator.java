/**
 * Copyright 2018 Fabio Lima <br/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); <br/>
 * you may not use this file except in compliance with the License. <br/>
 * You may obtain a copy of the License at <br/>
 *
 * http://www.apache.org/licenses/LICENSE-2.0 <br/>
 *
 * Unless required by applicable law or agreed to in writing, software <br/>
 * distributed under the License is distributed on an "AS IS" BASIS, <br/>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. <br/>
 * See the License for the specific language governing permissions and <br/>
 * limitations under the License. <br/>
 *
 */

package com.github.f4b6a3.uuid.factory;

import com.github.f4b6a3.uuid.factory.abst.AbstractTimeBasedUUIDCreator;
import com.github.f4b6a3.uuid.util.UUIDUtil;

/**
 * Factory that creates time-based UUIDs 1 of the RFC-4122.
 */
public class TimeBasedUUIDCreator extends AbstractTimeBasedUUIDCreator {

	public TimeBasedUUIDCreator() {
		super(VERSION_1);
	}
	
	protected TimeBasedUUIDCreator(int version) {
		super(version);
	}
	
	/**
	 * 
	 * {@link UUIDUtil#formatTimebasedMostSignificantBits(long)}
	 * 
	 * @param timestamp
	 */
	@Override
	public long formatMostSignificantBits(long timestamp) {
		return UUIDUtil.formatTimeBasedMostSignificantBits(timestamp);
	}
}