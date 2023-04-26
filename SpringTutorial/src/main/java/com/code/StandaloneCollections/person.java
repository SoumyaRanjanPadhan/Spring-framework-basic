package com.code.StandaloneCollections;

import java.util.List;
import java.util.Map;

public class person {
	
	private List<String> frnds;
	private Map<String,Integer> fee;

	public List<String> getFrnds() {
		return frnds;
	}

	public void setFrnds(List<String> frnds) {
		this.frnds = frnds;
	}

	

	

	@Override
	public String toString() {
		return "person [frnds=" + frnds + ", fee=" + fee + "]";
	}

	public Map<String,Integer> getFee() {
		return fee;
	}

	public void setFee(Map<String,Integer> fee) {
		this.fee = fee;
	}
	

}
