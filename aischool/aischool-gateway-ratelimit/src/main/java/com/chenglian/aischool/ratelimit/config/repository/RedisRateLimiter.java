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

package com.chenglian.aischool.ratelimit.config.repository;

import static java.util.concurrent.TimeUnit.SECONDS;

import org.springframework.data.redis.core.RedisTemplate;

import com.chenglian.aischool.ratelimit.config.Rate;
import com.chenglian.aischool.ratelimit.config.RateLimiter;
import com.chenglian.aischool.ratelimit.config.properties.RateLimitProperties.Policy;

/**
 * @author Marcos Barbero
 */
public class RedisRateLimiter implements RateLimiter {
    private final RedisTemplate template;

    @Override
    @SuppressWarnings("unchecked")
    public Rate consume(final Policy policy, final String key) {
        final Long limit = policy.getLimit();
        final Long refreshInterval = policy.getRefreshInterval();
        final Long current = this.template.boundValueOps(key).increment(1L);
        Long expire = this.template.getExpire(key);
        if (expire == null || expire == -1) {
            this.template.expire(key, refreshInterval, SECONDS);
            expire = refreshInterval;
        }
        return new Rate(key, Math.max(-1, limit - current), SECONDS.toMillis(expire), null);
    }

	/**
	 * @param template
	 */
	public RedisRateLimiter(RedisTemplate template) {
		super();
		this.template = template;
	}
    
}