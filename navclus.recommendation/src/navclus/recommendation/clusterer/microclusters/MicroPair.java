/*******************************************************************************
Copyright (c) 2010, 2012 Seonah Lee, SA Lab, KAIST
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html *
Contributors:
Seonah Lee - initial implementation
*******************************************************************************/
package navclus.recommendation.clusterer.microclusters;

public class MicroPair {
	
	String key1;
	String key2;	
	double similarity;
	
	public MicroPair(String key1, String key2, double similarity) {
		this.key1 = key1;
		this.key2 = key2;
		this.similarity = similarity;
	}

	public String getKey1() {
		return key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}

	public String getKey2() {
		return key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}

	public double getSimilarity() {
		return similarity;
	}

	public void setSimilarity(double similarity) {
		this.similarity = similarity;
	}
	
	public void println() {
		System.out.print(key1); 
		System.out.print("---	" + key2);
		System.out.print(":	" + similarity);
		System.out.println();
	}
}
