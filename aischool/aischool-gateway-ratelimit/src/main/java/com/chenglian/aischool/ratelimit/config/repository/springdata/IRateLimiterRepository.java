package com.chenglian.aischool.ratelimit.config.repository.springdata;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chenglian.aischool.ratelimit.config.Rate;

@Repository
public interface IRateLimiterRepository extends CrudRepository<Rate, String> {

}
