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

package com.chenglian.aischool.ratelimit.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author Marcos Barbero
 */
@Validated
@ConfigurationProperties(RateLimitProperties.PREFIX)
public class RateLimitProperties {

    public static final String PREFIX = "zuul.ratelimit";

    private Policy defaultPolicy;
    @NotNull
    private Map<String, Policy> policies = new HashMap<>();
    private boolean behindProxy;
    private boolean enabled;
    @NotNull
    @Value("${spring.application.name:rate-limit-application}")
    private String keyPrefix;
    @NotNull
    private Repository repository = Repository.IN_MEMORY;

    public enum Repository {
        REDIS, CONSUL, JPA, IN_MEMORY
    }

    public Optional<Policy> getPolicy(String key) {
        return Optional.ofNullable(policies.getOrDefault(key, defaultPolicy));
    }
    
    

    /**
	 * @return defaultPolicy
	 */
	public Policy getDefaultPolicy() {
		return defaultPolicy;
	}



	/**
	 * @param defaultPolicy 要设置的 defaultPolicy
	 */
	public void setDefaultPolicy(Policy defaultPolicy) {
		this.defaultPolicy = defaultPolicy;
	}



	/**
	 * @return policies
	 */
	public Map<String, Policy> getPolicies() {
		return policies;
	}



	/**
	 * @param policies 要设置的 policies
	 */
	public void setPolicies(Map<String, Policy> policies) {
		this.policies = policies;
	}



	/**
	 * @return behindProxy
	 */
	public boolean isBehindProxy() {
		return behindProxy;
	}



	/**
	 * @param behindProxy 要设置的 behindProxy
	 */
	public void setBehindProxy(boolean behindProxy) {
		this.behindProxy = behindProxy;
	}



	/**
	 * @return enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}



	/**
	 * @param enabled 要设置的 enabled
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}



	/**
	 * @return keyPrefix
	 */
	public String getKeyPrefix() {
		return keyPrefix;
	}



	/**
	 * @param keyPrefix 要设置的 keyPrefix
	 */
	public void setKeyPrefix(String keyPrefix) {
		this.keyPrefix = keyPrefix;
	}



	/**
	 * @return repository
	 */
	public Repository getRepository() {
		return repository;
	}



	/**
	 * @param repository 要设置的 repository
	 */
	public void setRepository(Repository repository) {
		this.repository = repository;
	}



	/**
	 * @return prefix
	 */
	public static String getPrefix() {
		return PREFIX;
	}



	/**
	 * 
	 */
	public RateLimitProperties() {
		super();
	}



	public static class Policy {

        @NotNull
        private Long refreshInterval = TimeUnit.MINUTES.toSeconds(1L);
        @NotNull
        private Long limit;
        @NotNull
        private List<Type> type = new ArrayList<>();

        public enum Type {
            ORIGIN, USER, URL
        }

		/**
		 * @return refreshInterval
		 */
		public Long getRefreshInterval() {
			return refreshInterval;
		}

		/**
		 * @param refreshInterval 要设置的 refreshInterval
		 */
		public void setRefreshInterval(Long refreshInterval) {
			this.refreshInterval = refreshInterval;
		}

		/**
		 * @return limit
		 */
		public Long getLimit() {
			return limit;
		}

		/**
		 * @param limit 要设置的 limit
		 */
		public void setLimit(Long limit) {
			this.limit = limit;
		}

		/**
		 * @return type
		 */
		public List<Type> getType() {
			return type;
		}

		/**
		 * @param type 要设置的 type
		 */
		public void setType(List<Type> type) {
			this.type = type;
		}

		/**
		 * 
		 */
		public Policy() {
			super();
		}
        
        
    }
}