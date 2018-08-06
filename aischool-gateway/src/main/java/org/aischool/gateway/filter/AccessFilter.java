package org.aischool.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class AccessFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO 自动生成的方法存根
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public String filterType() {
		// TODO 自动生成的方法存根
		return "pre";
	}

}
