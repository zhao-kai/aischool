/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chenglian.aischool.ratelimit.config;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Represents a view of rate limit in a giving time for a user.
 * <p>
 * limit - How many requests can be executed by the user. Maps to X-RateLimit-Limit header
 * remaining - How many requests are still left on the current window. Maps to X-RateLimit-Remaining header
 * reset - Epoch when the rate is replenished by limit. Maps to X-RateLimit-Reset header
 *
 * @author Marcos Barbero
 */
@Entity
public class Rate {

    @Id
    private String key;
    private Long remaining;
    private Long reset;
    private Date expiration;
	/**
	 * @return key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key 要设置的 key
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return remaining
	 */
	public Long getRemaining() {
		return remaining;
	}
	/**
	 * @param remaining 要设置的 remaining
	 */
	public void setRemaining(Long remaining) {
		this.remaining = remaining;
	}
	/**
	 * @return reset
	 */
	public Long getReset() {
		return reset;
	}
	/**
	 * @param reset 要设置的 reset
	 */
	public void setReset(Long reset) {
		this.reset = reset;
	}
	/**
	 * @return expiration
	 */
	public Date getExpiration() {
		return expiration;
	}
	/**
	 * @param expiration 要设置的 expiration
	 */
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	/**
	 * @param key
	 * @param remaining
	 * @param reset
	 * @param expiration
	 */
	public Rate(String key, Long remaining, Long reset, Date expiration) {
		super();
		this.key = key;
		this.remaining = remaining;
		this.reset = reset;
		this.expiration = expiration;
	}
	/**
	 * 
	 */
	public Rate() {
		super();
	}
	
	

}
